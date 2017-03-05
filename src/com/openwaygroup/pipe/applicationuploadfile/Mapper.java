package com.openwaygroup.pipe.applicationuploadfile;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;

import com.openwaygroup.application.pipe.ISourceCallback;
import com.openwaygroup.context.Context;
import com.openwaygroup.application.pipe.impl.stream.FileSkipException;
import com.openwaygroup.application.pipe.impl.stream.IWrappedInputStream;
import com.openwaygroup.application.process.registry.PRLogRecord;
import com.openwaygroup.application.server.ui.ShowDialogParameters;
import com.openwaygroup.owsysdb.process.registry.processlog.ProcessLogRecord;

public class Mapper extends com.openwaygroup.pipe.applicationuploadfile.autogen.Mapper {

  /**
   * This method will be called at the beginning of the pipe's execution, 
   * before any data is retrieved by source. Add your opening code here.
   */
  //Declare variable:
	String strDayOfYear;
	String strInstitution;
	String strFileNumber;
	String strCurrentDate1;	
	String product_prefix;	
	String liability_product;
	String issuing_suffix;
	String main_suffix;
	String sub_suffix;		
	int dayOfYear;
	int fileNumber;
	int count = 0;
	
	Hashtable<String,String> hashCountryCode;
	Hashtable<String,String> hashCountryName;
	Hashtable<String,String> hashGender;
	Hashtable<String,String> hashMaritalStatus;	
		
	//Get System Datetime:
	Calendar now = null;
	SimpleDateFormat currentDate = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat currentDate1 = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat currentDate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm:ss");
	
  protected void open() throws Exception {
	  try {
		  populateHashTable();
		//Get system date:
		  now = Calendar.getInstance();
		  strCurrentDate1 = currentDate1.format(now.getTime()).toString();
		  dayOfYear = now.get(Calendar.DAY_OF_YEAR);
		  strDayOfYear = ("000" + dayOfYear).substring(("" + dayOfYear).length());
		  getFileSeq.execute();
		  fileNumber = getFileSeq.getFilenumber().intValue();		  		 
		  strFileNumber = ("00000" + fileNumber).substring(("" + fileNumber).length());		  
		  
		  way4ApplicationInput.reset();
		  way4ApplicationInput.getFileParameters().setFileDirectory(Context.getMandatoryProperty(pipe.getContext(),"output_dir"));
		  strInstitution = Context.getMandatoryProperty(pipe.getContext(),"institution");
		  
		//Get pipe parameters
		  product_prefix = Context.getMandatoryProperty(pipe.getContext(),"product_prefix");		  
		  liability_product = Context.getMandatoryProperty(pipe.getContext(),"liability_product");
		  issuing_suffix = Context.getMandatoryProperty(pipe.getContext(),"issuing_suffix");
		  main_suffix = Context.getMandatoryProperty(pipe.getContext(),"main_suffix");
		  sub_suffix = Context.getMandatoryProperty(pipe.getContext(),"sub_suffix");
 		  
		  way4ApplicationInput.getFileParameters().setFileName("xadvapl" + strInstitution + "00" + "_" + strFileNumber + "." + strDayOfYear);		  
		  
		  //Code for header
		  way4ApplicationInput.addStartElement("ApplicationFile");
		  way4ApplicationInput.addStartElement("FileHeader");	  
		  way4ApplicationInput.addElement("FormatVersion", "2.0");
		  way4ApplicationInput.addElement("Sender", strInstitution + "00");
		  way4ApplicationInput.addElement("CreationDate", currentDate.format(now.getTime()));
		  way4ApplicationInput.addElement("CreationTime", currentTime.format(now.getTime()));
		  way4ApplicationInput.addElement("Number",strFileNumber);
		  way4ApplicationInput.addElement("Institution", strInstitution);
		  way4ApplicationInput.addFinishElement("FileHeader");
		  way4ApplicationInput.addStartElement("ApplicationsList");
	  }
	  catch (Exception ex) {
		  ex.printStackTrace();
		  way4ApplicationInput.update();
	  }
  }

  private void populateHashTable() {
	// TODO Auto-generated method stub
	  try{
		hashCountryCode = new Hashtable<String,String>();
		hashCountryName = new Hashtable<String,String>();		
		getCountry.select(new SQLGetOrder());
		
		hashGender = new Hashtable<String,String>();
		hashGender.put("M", "Male");
		hashGender.put("F", "Female");
		
		hashMaritalStatus = new Hashtable<String,String>();
		hashMaritalStatus.put("1", "S");
		hashMaritalStatus.put("2", "M");
	  }
	  catch(Exception ex){
		  ex.printStackTrace();
	  }
  }
  
  public class SQLGetOrder implements ISourceCallback{
	  public void processRow() throws Exception {
		  hashCountryCode.put(getCountry.getNCode(), getCountry.getCode());
		  hashCountryName.put(getCountry.getNCode(), getCountry.getName());
	  }
  }

/**
   * This method will be called for each record (table row, record in flat file, xml element) retrieved 
   * by the pipe's source. Add your code to handle incoming data here.
   */
  protected void execute() throws Exception {
	  try{
		  //Get Data from source pipe:
	  	  String strRegNumber;
	  	  String prefixCode;
	  	  			  			  
	  	  //String institutionCode = ((source.getInstitutionCode() == null) ? "" : source.getInstitutionCode().trim());
	  	  String applicationNo = ((source.getApplicationNo() == null) ? "" : source.getApplicationNo().trim());
	  	  String productCode = ((source.getProductCode() == null) ? "" : source.getProductCode().trim());
	  	  String socialStatus = ((source.getSocialStatus() == null) ? "" : source.getSocialStatus().trim());
	  	  String basicCardFlag = ((source.getBasicCardFlag() == null) ? "" : source.getBasicCardFlag().trim());
	  	  String primaryCardNumber = ((source.getPrimaryCardNumber() == null) ? "" : source.getPrimaryCardNumber().trim());
	  	  String clientIdOfCompany = ((source.getClientIdOfCompany() == null) ? "" : source.getClientIdOfCompany().trim());
	  	  String title = ((source.getTitle() == null) ? "" : source.getTitle().trim());
		  String familyName = ((source.getFamilyName() == null) ? "" : source.getFamilyName().trim());
		  String firstName = ((source.getFirstName() == null) ? "" : source.getFirstName().trim());
		  String embossedName = ((source.getEmbossedName() == null) ? "" : source.getEmbossedName().trim());
		  if(embossedName.equals(""))
			  embossedName = familyName + " " + firstName.charAt(0);
		  String birthdate = ((source.getBirthdate() == null) ? "" : source.getBirthdate().trim());
		  String birthCity = ((source.getBirthCity() == null) ? "" : source.getBirthCity().trim());
		  String birthCountry = ((source.getBirthCountry() == null) ? "" : hashCountryName.get(source.getBirthCountry().trim()));
		  String gender = ((source.getGender() == null) ? "" : hashGender.get(source.getGender().trim()));
		  //String vipCode = ((source.getVipCode() == null) ? "" : source.getVipCode().trim());
		  String nationality = ((source.getNationality() == null) ? "" : hashCountryCode.get(source.getNationality().trim()));
		  String maritalStatus = ((source.getMaritalStatus() == null) ? "" : hashMaritalStatus.get(source.getMaritalStatus().trim()));
		  String noOfDependents = ((source.getNoOfDependents() == null) ? "" : source.getNoOfDependents().trim());
		  String education = ((source.getEducation() == null) ? "" : source.getEducation().trim());
		  String residenceStatus = ((source.getResidenceStatus() == null) ? "" : source.getResidenceStatus().trim());
		  String permanentAddress1 = ((source.getPermanentAddress1() == null) ? "" : source.getPermanentAddress1().trim());
		  String permanentAddress2 = ((source.getPermanentAddress2() == null) ? "" : source.getPermanentAddress2().trim());
		  String permanentAddress3 = ((source.getPermanentAddress3() == null) ? "" : source.getPermanentAddress3().trim());
		  String permanentAddress4 = ((source.getPermanentAddress4() == null) ? "" : source.getPermanentAddress4().trim());
		  String permanentCityCode = ((source.getPermanentCityCode() == null) ? "" : source.getPermanentCityCode().trim());
		  String permanentZipCode = ((source.getPermanentZipCode() == null) ? "" : source.getPermanentZipCode().trim());
		  String permanentCountryCode = ((source.getPermanentCountryCode() == null) ? "" : hashCountryCode.get(source.getPermanentCountryCode().trim()));
		  String currentAddress1 = ((source.getCurrentAddress1() == null) ? "" : source.getCurrentAddress1().trim());
		  String currentAddress2 = ((source.getCurrentAddress2() == null) ? "" : source.getCurrentAddress2().trim());
		  String currentAddress3 = ((source.getCurrentAddress3() == null) ? "" : source.getCurrentAddress3().trim());
		  String currentAddress4 = ((source.getCurrentAddress4() == null) ? "" : source.getCurrentAddress4().trim());
		  String currentCityCode = ((source.getCurrentCityCode() == null) ? "" : source.getCurrentCityCode().trim());
		  String currentZipCode = ((source.getCurrentZipCode() == null) ? "" : source.getCurrentZipCode().trim());
		  String currentCountryCode = ((source.getCurrentCountryCode() == null) ? "" : hashCountryCode.get(source.getCurrentCountryCode().trim()));
		  String homePhoneNumber = ((source.getHomePhoneNumber() == null) ? "" : source.getHomePhoneNumber().trim());
		  String mobileNumber = ((source.getMobileNumber() == null) ? "" : source.getMobileNumber().trim());
		  String emailID = ((source.getEmailID() == null) ? "" : source.getEmailID().trim());
		  if(emailID.equals("0"))
			  emailID = "";
		  String employmentStatus = ((source.getEmploymentStatus() == null) ? "0" : source.getEmploymentStatus().trim());
		  String employerType = ((source.getEmployerType() == null) ? "" : source.getEmployerType().trim());
		  String applicationProfession = ((source.getApplicationProfession() == null) ? "" : source.getApplicationProfession().trim());
		  String employerName = ((source.getEmployerName() == null) ? "" : source.getEmployerName().trim());
		  String emplAddress1 = ((source.getEmplAddress1() == null) ? "" : source.getEmplAddress1().trim());
		  String emplAddress2 = ((source.getEmplAddress2() == null) ? "" : source.getEmplAddress2().trim());
		  String emplAddress3 = ((source.getEmplAddress3() == null) ? "" : source.getEmplAddress3().trim());
		  String emplAddress4 = ((source.getEmplAddress4() == null) ? "" : source.getEmplAddress4().trim());
		  String emplCityCode = ((source.getEmplCityCode() == null) ? "" : source.getEmplCityCode().trim());
		  String emplZipCode = ((source.getEmplZipCode() == null) ? "" : source.getEmplZipCode().trim());
		  String emplCountryCode = ((source.getEmplCountryCode() == null) ? "" : hashCountryCode.get(source.getEmplCountryCode().trim()));
		  String officePhoneNumber = ((source.getOfficePhoneNumber() == null) ? "" : source.getOfficePhoneNumber().trim());
		  String annualIncome = ((source.getAnnualIncome() == null) ? "" : source.getAnnualIncome().trim());
		  String legalID = ((source.getLegalID() == null) ? "" : source.getLegalID().trim());
		  String secondaryCardName = ((source.getSecondaryCardName() == null) ? "" : source.getSecondaryCardName().trim());
		  String secondaryCardEmbossName = ((source.getSecondaryCardEmbossName() == null) ? "" : source.getSecondaryCardEmbossName().trim());		  
		  //String secondaryCardRelation = ((source.getSecondaryCardRelation() == null) ? "" : source.getSecondaryCardRelation().trim());
		  //String additionalBirthDate = ((source.getAdditionalBirthdate() == null) ? "" : source.getAdditionalBirthdate().trim());
		  String motherMaidenName = ((source.getMotherMaidenName() == null) ? "" : source.getMotherMaidenName().trim());
		  String branchCode = ((source.getBranchCode() == null) ? "" : source.getBranchCode().trim());
		  String creditLimit = ((source.getCreditLimit() == null) ? "" : source.getCreditLimit().trim());		  
		  if(!creditLimit.equals(""))
			  creditLimit = String.valueOf(Integer.parseInt(creditLimit));
		  String embossedLine4 = ((source.getEmbossedLine4() == null) ? "" : source.getEmbossedLine4().trim());
		  //String cashLimit = ((source.getCashLimit() == null) ? "" : source.getCashLimit().trim());
		  String emplID = ((source.getEmplID() == null) ? "" : source.getEmplID().trim());
		  String ref1Name = ((source.getRef1Name() == null) ? "" : source.getRef1Name().trim());
		  String ref1Address1 = ((source.getRef1Address1() == null) ? "" : source.getRef1Address1().trim());
		  String ref1Address2 = ((source.getRef1Address2() == null) ? "" : source.getRef1Address2().trim());
		  String ref1Address3 = ((source.getRef1Address3() == null) ? "" : source.getRef1Address3().trim());
		  String ref1Address4 = ((source.getRef1Address4() == null) ? "" : source.getRef1Address4().trim());
		  String ref1ZipCode = ((source.getRef1ZipCode() == null) ? "" : source.getRef1ZipCode().trim());
		  String ref1CityCode = ((source.getRef1CityCode() == null) ? "" : source.getRef1CityCode().trim());
		  String ref1CountryCode = ((source.getRef1CountryCode() == null) ? "" : hashCountryCode.get(source.getRef1CountryCode().trim()));
		  String ref1PhoneNumber = ((source.getRef1PhoneNumber() == null) ? "" : source.getRef1PhoneNumber().trim());
		  String sourceApplicationNumber = ((source.getSourceApplicationNo() == null) ? "" : source.getSourceApplicationNo().trim());			  
		  String clientCode = ((source.getClientCode() == null) ? "" : source.getClientCode().trim());
		  //String preferences = ((source.getPreferences() == null) ? "" : source.getPreferences().trim());
		  String directDebitFlag = ((source.getDirectDebitFlag() == null) ? "" : source.getDirectDebitFlag().trim());
	      String directDebitBranch = ((source.getDirectDebitBranch() == null) ? "" : source.getDirectDebitBranch().trim());
	      String directDebitAccountName = ((source.getDirectDebitAccountName() == null) ? "" : source.getDirectDebitAccountName().trim());
	      String directDebitAmountType = ((source.getDirectDebitAmountType() == null) ? "" : source.getDirectDebitAmountType().trim());
	      String directDebitAccountNumber = ((source.getDirectDebitAccountNumber() == null) ? "" : source.getDirectDebitAccountNumber().trim());
	      String directDebitAmountFlag = ((source.getDirectDebitAmountFlag() == null) ? "" : source.getDirectDebitAmountFlag().trim());
	      String directDebitPercentage = ((source.getDirectDebitPercentage() == null) ? "" : source.getDirectDebitPercentage().trim());
	      String deliveryAddress1 = ((source.getDeliveryAddress1() == null) ? "" : source.getDeliveryAddress1().trim());
		  String deliveryAddress2 = ((source.getDeliveryAddress2() == null) ? "" : source.getDeliveryAddress2().trim());
		  String deliveryAddress3 = ((source.getDeliveryAddress3() == null) ? "" : source.getDeliveryAddress3().trim());
		  String deliveryAddress4 = ((source.getDeliveryAddress4() == null) ? "" : source.getDeliveryAddress4().trim());
		  String deliveryZipCode = ((source.getDeliveryZipCode() == null) ? "" : source.getDeliveryZipCode().trim());
		  String deliveryCityCode = ((source.getDeliveryCityCode() == null) ? "" : source.getDeliveryCityCode().trim());
		  String statementPrintingRegister = ((source.getStatementPrintingRegister() == null) ? "" : source.getStatementPrintingRegister().trim());
		  
		  getProductInfo(productCode);		  
		  String productGroup = getProductInfo.getProductGroup();
		  if(productGroup == null)
			  throw new Exception();
		  			  
		  checkExistClient.setClient_code(clientCode);
		  checkExistClient.execute();		  
		  String existClientShortName = ((checkExistClient.getShortname() == null) ? "" : checkExistClient.getShortname().trim());
		  String existClientNumber = ((checkExistClient.getClientnumber() == null) ? "" : checkExistClient.getClientnumber().trim());
		  
		  checkExistLiability.setClient_number(clientCode);
		  checkExistLiability.setLiability_product(liability_product);
		  checkExistLiability.execute();
		  String liabilityContract = checkExistLiability.getContractNumber().trim();

		  if(basicCardFlag.equals("0") || basicCardFlag.equals("2"))
		  {
			  if(existClientNumber.equals("Empty")) //no existing client
			  {
				//Generate Reg number			  
				  prefixCode = "CLI"; //Client
				  strRegNumber = generateRegNo(prefixCode);
				  way4ApplicationInput.addStartElement("Application"); //start of application of client
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("OrderDprt",branchCode);		  		 
				  way4ApplicationInput.addElement("ObjectType","Client");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addElement("ProductGroup",productGroup);
				  
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Client");
				  //way4ApplicationInput.addElement("Institution",institutionCode);
				  way4ApplicationInput.addElement("ClientType","PR");
				  
				  if(socialStatus.equals("0"))
					  way4ApplicationInput.addElement("ClientCategory","P");
				  else if(socialStatus.equals("1"))
					  way4ApplicationInput.addElement("ClientCategory","C");
				  else
					  way4ApplicationInput.addElement("ClientCategory","");				  				
				  
				  way4ApplicationInput.addStartElement("ClientInfo");
				  way4ApplicationInput.addElement("ClientNumber",clientCode);
				  way4ApplicationInput.addElement("RegNumber",legalID);				  				  
				  way4ApplicationInput.addElement("ShortName",firstName + " " + familyName);
				  way4ApplicationInput.addElement("TaxPosition",annualIncome);
				  way4ApplicationInput.addElement("Title",title);
				  way4ApplicationInput.addElement("FirstName",firstName);				  
				  way4ApplicationInput.addElement("LastName",familyName);				  
				  way4ApplicationInput.addElement("Country",currentCountryCode);
				  way4ApplicationInput.addElement("Citizenship",nationality);
				  way4ApplicationInput.addElement("MaritalStatus",maritalStatus);
				  way4ApplicationInput.addElement("Position",education);
				  way4ApplicationInput.addElement("CompanyName","");
				  way4ApplicationInput.addElement("CompanyTradeName",clientIdOfCompany);
				  way4ApplicationInput.addElement("BirthDate",convertFormatDate(birthdate));				  
				  
				  String birthPlace;
				  if(birthCity.equals("") && birthCountry.equals(""))
					  birthPlace = "";
				  else
					  birthPlace = birthCity  + " " + birthCountry;
				  
				  way4ApplicationInput.addElement("BirthPlace", birthPlace.trim());
				  way4ApplicationInput.addElement("Gender",gender);
				  
				  way4ApplicationInput.addFinishElement("ClientInfo");
				  			  
				  way4ApplicationInput.addStartElement("PlasticInfo");
				  way4ApplicationInput.addElement("FirstName",firstName);
				  way4ApplicationInput.addElement("LastName",familyName);
				  way4ApplicationInput.addElement("CompanyName","");
				  way4ApplicationInput.addFinishElement("PlasticInfo");
				  
				  way4ApplicationInput.addStartElement("PhoneList");			 
				  way4ApplicationInput.addStartElement("Phone");
				  way4ApplicationInput.addElement("PhoneType","Home");
				  way4ApplicationInput.addElement("PhoneNumber",homePhoneNumber);			  
				  way4ApplicationInput.addFinishElement("Phone");
				  way4ApplicationInput.addStartElement("Phone");
				  way4ApplicationInput.addElement("PhoneType","Mobile");
				  way4ApplicationInput.addElement("PhoneNumber",mobileNumber);			  
				  way4ApplicationInput.addFinishElement("Phone");			  
				  way4ApplicationInput.addFinishElement("PhoneList");
				  
				  //way4ApplicationInput.addElement("DateOpen","");
				  
				  way4ApplicationInput.addStartElement("BaseAddress");				  
				  way4ApplicationInput.addElement("EMail",emailID);
				  way4ApplicationInput.addElement("City",currentCityCode);
				  way4ApplicationInput.addElement("PostalCode",currentZipCode);
				  way4ApplicationInput.addElement("AddressLine1",currentAddress1);
				  way4ApplicationInput.addElement("AddressLine2",currentAddress2);
				  way4ApplicationInput.addElement("AddressLine3",currentAddress3);
				  way4ApplicationInput.addElement("AddressLine4",currentAddress4);				  
				  way4ApplicationInput.addFinishElement("BaseAddress");
				  				  				 
				  /*way4ApplicationInput.addStartElement("AddInfo");
				  way4ApplicationInput.addElement("ADDINFO01","");
				  way4ApplicationInput.addElement("ADDINFO02","");
				  way4ApplicationInput.addElement("ADDINFO04","");
				  way4ApplicationInput.addFinishElement("AddInfo");*/
				  
				  way4ApplicationInput.addFinishElement("Client");
				  way4ApplicationInput.addFinishElement("Data");
				  
				  way4ApplicationInput.addStartElement("SubApplList");
				  
				  //Add address type PER_ADDR
				  way4ApplicationInput.addStartElement("Application");
				  prefixCode = "ADDR";
				  strRegNumber = generateRegNo(prefixCode);			  
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("ObjectType","ClientAddress");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Address");
				  way4ApplicationInput.addElement("AddressType","PER_ADDR");
				  way4ApplicationInput.addElement("LastName",noOfDependents);
				  way4ApplicationInput.addElement("BirthName",motherMaidenName);
				  way4ApplicationInput.addElement("EMail","email@acb.com");
				  way4ApplicationInput.addElement("Country",permanentCountryCode);				  
				  way4ApplicationInput.addElement("City",permanentCityCode);
				  way4ApplicationInput.addElement("PostalCode",permanentZipCode);
				  way4ApplicationInput.addElement("MunicipalityCode",residenceStatus);
				  way4ApplicationInput.addElement("AddressLine1",permanentAddress1);
				  way4ApplicationInput.addElement("AddressLine2",permanentAddress2);
				  way4ApplicationInput.addElement("AddressLine3",permanentAddress3);
				  way4ApplicationInput.addElement("AddressLine4",permanentAddress4);				  				  				  				  		
				  way4ApplicationInput.addFinishElement("Address");
				  way4ApplicationInput.addFinishElement("Data");
				  way4ApplicationInput.addFinishElement("Application");
				  
				  //Add address type EMPL_ADDR
				  way4ApplicationInput.addStartElement("Application");				  
				  strRegNumber = generateRegNo(prefixCode);
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("ObjectType","ClientAddress");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Address");
				  way4ApplicationInput.addElement("AddressType","EMPL_ADDR");
				  way4ApplicationInput.addElement("FirstName",employerName);
				  way4ApplicationInput.addElement("LastName",applicationProfession);
				  way4ApplicationInput.addElement("BirthName",employmentStatus);				  
				  
				  way4ApplicationInput.addStartElement("PhoneList");
				  way4ApplicationInput.addStartElement("Phone");
				  way4ApplicationInput.addElement("PhoneType","Work");
				  way4ApplicationInput.addElement("PhoneNumber",officePhoneNumber);			  
				  way4ApplicationInput.addFinishElement("Phone");	   
				  way4ApplicationInput.addFinishElement("PhoneList");
				  
				  way4ApplicationInput.addElement("EMail","email@acb.com");
				  way4ApplicationInput.addElement("Country",emplCountryCode);
				  way4ApplicationInput.addElement("City",emplCityCode); 
				  way4ApplicationInput.addElement("PostalCode",emplZipCode);
				  way4ApplicationInput.addElement("MunicipalityCode",employerType);
				  				  
				  way4ApplicationInput.addElement("AddressLine1",emplAddress1);
				  way4ApplicationInput.addElement("AddressLine2",emplAddress2);
				  way4ApplicationInput.addElement("AddressLine3",emplAddress3);
				  way4ApplicationInput.addElement("AddressLine4",emplAddress4);
				  				  				  		  				 
				  way4ApplicationInput.addFinishElement("Address");
				  way4ApplicationInput.addFinishElement("Data");
				  way4ApplicationInput.addFinishElement("Application");
				  
				  //Add address type DELIVERY_ADDR
				  way4ApplicationInput.addStartElement("Application");				  
				  strRegNumber = generateRegNo(prefixCode);
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("ObjectType","ClientAddress");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Address");
				  way4ApplicationInput.addElement("AddressType","DELIVERY_ADDR");
				  way4ApplicationInput.addElement("FirstName",emplID);
				  way4ApplicationInput.addElement("EMail","email@acb.com");
				  way4ApplicationInput.addElement("City",deliveryCityCode);
				  way4ApplicationInput.addElement("PostalCode",deliveryZipCode);
				  way4ApplicationInput.addElement("AddressLine1",deliveryAddress1);
				  way4ApplicationInput.addElement("AddressLine2",deliveryAddress2);
				  way4ApplicationInput.addElement("AddressLine3",deliveryAddress3);
				  way4ApplicationInput.addElement("AddressLine4",deliveryAddress4);				  				  
				  way4ApplicationInput.addFinishElement("Address");
				  way4ApplicationInput.addFinishElement("Data");
				  way4ApplicationInput.addFinishElement("Application");		  	
				  
				  //Add address type REF1_ADDR
				  way4ApplicationInput.addStartElement("Application");				  
				  strRegNumber = generateRegNo(prefixCode);			  
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("ObjectType","ClientAddress");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Address");
				  way4ApplicationInput.addElement("AddressType","REF1_ADDR");		  
				  way4ApplicationInput.addElement("FirstName",ref1Name);
				  
				  way4ApplicationInput.addStartElement("PhoneList");
				  way4ApplicationInput.addStartElement("Phone");
				  way4ApplicationInput.addElement("PhoneType","Home");
				  way4ApplicationInput.addElement("PhoneNumber",ref1PhoneNumber);			  
				  way4ApplicationInput.addFinishElement("Phone");	   
				  way4ApplicationInput.addFinishElement("PhoneList");	
				  
				  way4ApplicationInput.addElement("EMail","email@acb.com");
				  way4ApplicationInput.addElement("Country",ref1CountryCode);
				  way4ApplicationInput.addElement("City",ref1CityCode);
				  way4ApplicationInput.addElement("PostalCode",ref1ZipCode);
				  
				  way4ApplicationInput.addElement("AddressLine1",ref1Address1);
				  way4ApplicationInput.addElement("AddressLine2",ref1Address2);
				  way4ApplicationInput.addElement("AddressLine3",ref1Address3);
				  way4ApplicationInput.addElement("AddressLine4",ref1Address4);
				  				  				  				  	  
				  way4ApplicationInput.addFinishElement("Address");
				  way4ApplicationInput.addFinishElement("Data");
				  way4ApplicationInput.addFinishElement("Application");
				  
				//Add address type REF2_ADDR
				  way4ApplicationInput.addStartElement("Application");				  
				  strRegNumber = generateRegNo(prefixCode);			  
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("ObjectType","ClientAddress");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Address");
				  way4ApplicationInput.addElement("AddressType","REF2_ADDR");				  
				  way4ApplicationInput.addElement("FirstName",directDebitBranch);
				  way4ApplicationInput.addElement("LastName",statementPrintingRegister);
				  way4ApplicationInput.addElement("EMail","email@acb.com");
				  way4ApplicationInput.addElement("MunicipalityCode",directDebitFlag);
				  way4ApplicationInput.addElement("AddressLocation",directDebitPercentage);
				  way4ApplicationInput.addElement("AddressLine1",directDebitAccountName);
				  way4ApplicationInput.addElement("AddressLine2",directDebitAmountType);
				  way4ApplicationInput.addElement("AddressLine3",directDebitAccountNumber);
				  way4ApplicationInput.addElement("AddressLine4",directDebitAmountFlag);
				  		  	 
				  way4ApplicationInput.addFinishElement("Address");
				  way4ApplicationInput.addFinishElement("Data");
				  way4ApplicationInput.addFinishElement("Application");
				  
				  //Create Liability Issuing contract
				  way4ApplicationInput.addStartElement("Application"); //start of application of liability contract
				  
				  prefixCode = "LIB";
				  strRegNumber = generateRegNo(prefixCode);			  
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);			  
				  way4ApplicationInput.addElement("OrderDprt",branchCode);
				  way4ApplicationInput.addElement("ObjectType","Contract");
				  way4ApplicationInput.addElement("ActionType","Add");
				  
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Contract");
				  way4ApplicationInput.addStartElement("Product");
				  way4ApplicationInput.addElement("ProductCode1", liability_product);
				  way4ApplicationInput.addFinishElement("Product");				  		  
				  			  
				  way4ApplicationInput.addStartElement("CreditLimit");
				  way4ApplicationInput.addStartElement("FinanceLimit");
				  way4ApplicationInput.addElement("Amount",creditLimit);
				  way4ApplicationInput.addElement("Currency","VND");
				  way4ApplicationInput.addFinishElement("FinanceLimit");
				  way4ApplicationInput.addElement("ReasonDetails","Credit limit for Liability Contract");
				  way4ApplicationInput.addFinishElement("CreditLimit");
				  
				  way4ApplicationInput.addStartElement("AddContractInfo");
				  way4ApplicationInput.addElement("ADDINFO01","For Liability account contract");
				  way4ApplicationInput.addFinishElement("AddContractInfo");
				  
				  way4ApplicationInput.addFinishElement("Contract");
				  way4ApplicationInput.addFinishElement("Data");
				  
				  way4ApplicationInput.addStartElement("SubApplList");
				  way4ApplicationInput.addStartElement("Application"); //Start of issuing contract
				  prefixCode = "ISS";
				  strRegNumber = generateRegNo(prefixCode);			  
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("OrderDprt",branchCode);
				  way4ApplicationInput.addElement("ObjectType","Contract");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Contract");
				  way4ApplicationInput.addStartElement("Product");
				  way4ApplicationInput.addElement("ProductCode1", product_prefix + productCode + issuing_suffix);
				  way4ApplicationInput.addFinishElement("Product");			  			  
				  
				  way4ApplicationInput.addStartElement("CreditLimit");
				  way4ApplicationInput.addStartElement("FinanceLimit");
				  way4ApplicationInput.addElement("Amount",creditLimit);
				  way4ApplicationInput.addElement("Currency","VND");
				  way4ApplicationInput.addFinishElement("FinanceLimit");
				  way4ApplicationInput.addElement("ReasonDetails","Credit limit for Issuing Contract");
				  way4ApplicationInput.addFinishElement("CreditLimit");
				  
				  way4ApplicationInput.addStartElement("AddContractInfo");
				  way4ApplicationInput.addElement("ADDINFO01", primaryCardNumber); //Thay bang so the chinh
				  way4ApplicationInput.addElement("ADDINFO03", "");//Payment Min/Full
				  way4ApplicationInput.addFinishElement("AddContractInfo");
				  
				  way4ApplicationInput.addFinishElement("Contract");			  			 
				  way4ApplicationInput.addFinishElement("Data");
				  way4ApplicationInput.addStartElement("SubApplList");
				  
				  //Create primary card application
				  if(basicCardFlag.equals("0"))
					  createCardApplication(productCode, branchCode, "", title, embossedName, embossedLine4, "0", applicationNo, clientIdOfCompany);
				  else //basicCardFlag = 2
				  {
					  //Create main card application
					  createCardApplication(productCode, branchCode, "", title, embossedName, embossedLine4, "0", applicationNo, clientIdOfCompany);
					  //Create sub card application
					  createCardApplication(productCode, branchCode, secondaryCardName, title, secondaryCardEmbossName, embossedLine4, "2", sourceApplicationNumber, clientIdOfCompany);
				  }
				  
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of issuing contract	
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of Liability contract
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of Client
			  }
			  
			  else if(!existClientNumber.equals("Empty") && liabilityContract.equals("Empty"))
			  {
				  way4ApplicationInput.addStartElement("Application"); //start of application of liability contract				  
				  prefixCode = "LIB";
				  strRegNumber = generateRegNo(prefixCode);			  
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);			  
				  way4ApplicationInput.addElement("OrderDprt",branchCode);
				  way4ApplicationInput.addElement("ObjectType","Contract");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addElement("ProductGroup",productGroup);
				  way4ApplicationInput.addStartElement("ObjectFor");				  
				  way4ApplicationInput.addStartElement("ClientIDT");
				  way4ApplicationInput.addStartElement("ClientInfo");
				  way4ApplicationInput.addElement("ClientNumber",clientCode);
				  way4ApplicationInput.addElement("ShortName",existClientShortName);
				  way4ApplicationInput.addFinishElement("ClientInfo");
				  way4ApplicationInput.addFinishElement("ClientIDT");	  
				  way4ApplicationInput.addFinishElement("ObjectFor");
				  
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Contract");
				  way4ApplicationInput.addStartElement("Product");
				  way4ApplicationInput.addElement("ProductCode1", liability_product);
				  way4ApplicationInput.addFinishElement("Product");				  			  
				  way4ApplicationInput.addStartElement("CreditLimit");
				  way4ApplicationInput.addStartElement("FinanceLimit");
				  way4ApplicationInput.addElement("Amount",creditLimit);
				  way4ApplicationInput.addElement("Currency","VND");
				  way4ApplicationInput.addFinishElement("FinanceLimit");
				  way4ApplicationInput.addElement("ReasonDetails","Credit limit for Liability Contract");
				  way4ApplicationInput.addFinishElement("CreditLimit");				  
				  way4ApplicationInput.addStartElement("AddContractInfo");
				  way4ApplicationInput.addElement("ADDINFO01","For Liability account contract");
				  way4ApplicationInput.addFinishElement("AddContractInfo");				  
				  way4ApplicationInput.addFinishElement("Contract");
				  way4ApplicationInput.addFinishElement("Data");
				  
				  way4ApplicationInput.addStartElement("SubApplList");
				  
				  way4ApplicationInput.addStartElement("Application"); //Start of issuing contract
				  prefixCode = "ISS";
				  strRegNumber = generateRegNo(prefixCode);			  
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("OrderDprt",branchCode);
				  way4ApplicationInput.addElement("ObjectType","Contract");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Contract");
				  way4ApplicationInput.addStartElement("Product");
				  way4ApplicationInput.addElement("ProductCode1", product_prefix + productCode + issuing_suffix);
				  way4ApplicationInput.addFinishElement("Product");			  			  
				  
				  way4ApplicationInput.addStartElement("CreditLimit");
				  way4ApplicationInput.addStartElement("FinanceLimit");
				  way4ApplicationInput.addElement("Amount",creditLimit);
				  way4ApplicationInput.addElement("Currency","VND");
				  way4ApplicationInput.addFinishElement("FinanceLimit");
				  way4ApplicationInput.addElement("ReasonDetails","Credit limit for Issuing Contract");
				  way4ApplicationInput.addFinishElement("CreditLimit");
				  
				  way4ApplicationInput.addStartElement("AddContractInfo");
				  way4ApplicationInput.addElement("ADDINFO01", primaryCardNumber); //Thay bang so the chinh
				  way4ApplicationInput.addElement("ADDINFO03", "");//Payment Min/Full
				  way4ApplicationInput.addFinishElement("AddContractInfo");
				  
				  way4ApplicationInput.addFinishElement("Contract");			  			 
				  way4ApplicationInput.addFinishElement("Data");
				  way4ApplicationInput.addStartElement("SubApplList");
				  
				  //Create primary card application
				  if(basicCardFlag.equals("0"))
					  createCardApplication(productCode, branchCode, "", title, embossedName, embossedLine4, "0", applicationNo, clientIdOfCompany);
				  else //basicCardFlag = 2
				  {
					  //Create main card application
					  createCardApplication(productCode, branchCode, "", title, embossedName, embossedLine4, "0", applicationNo, clientIdOfCompany);
					  //Create sub card application
					  createCardApplication(productCode, branchCode, secondaryCardName, title, secondaryCardEmbossName, embossedLine4, "2", sourceApplicationNumber, clientIdOfCompany);
				  }
				  
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of issuing contract	
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of Liability Contract
			  }
			  			  			 
			  else if(!liabilityContract.equals("Empty"))
			  {
				  way4ApplicationInput.addStartElement("Application"); //start of application of credit account contract
				  prefixCode = "ISS";
				  strRegNumber = generateRegNo(prefixCode);			  
				  way4ApplicationInput.addElement("RegNumber",strRegNumber);
				  way4ApplicationInput.addElement("OrderDprt",branchCode);
				  way4ApplicationInput.addElement("ObjectType","Contract");
				  way4ApplicationInput.addElement("ActionType","Add");
				  way4ApplicationInput.addElement("ProductGroup",productGroup);
				  way4ApplicationInput.addStartElement("ObjectFor");				  
				  way4ApplicationInput.addStartElement("ContractIDT");
				  way4ApplicationInput.addElement("ContractNumber",liabilityContract);
				  way4ApplicationInput.addStartElement("Client");
				  way4ApplicationInput.addStartElement("ClientInfo");
				  way4ApplicationInput.addElement("ClientNumber",clientCode);
				  way4ApplicationInput.addElement("ShortName",existClientShortName);
				  way4ApplicationInput.addFinishElement("ClientInfo");
				  way4ApplicationInput.addFinishElement("Client");
				  way4ApplicationInput.addFinishElement("ContractIDT");	  
				  way4ApplicationInput.addFinishElement("ObjectFor");
				  
				  way4ApplicationInput.addStartElement("Data");
				  way4ApplicationInput.addStartElement("Contract");
				  way4ApplicationInput.addStartElement("Product");
				  way4ApplicationInput.addElement("ProductCode1", product_prefix + productCode + issuing_suffix);
				  way4ApplicationInput.addFinishElement("Product");			  			  
				  
				  way4ApplicationInput.addStartElement("CreditLimit");
				  way4ApplicationInput.addStartElement("FinanceLimit");
				  way4ApplicationInput.addElement("Amount",creditLimit);
				  way4ApplicationInput.addElement("Currency","VND");
				  way4ApplicationInput.addFinishElement("FinanceLimit");
				  way4ApplicationInput.addElement("ReasonDetails","Credit limit for Issuing Contract");
				  way4ApplicationInput.addFinishElement("CreditLimit");
				  
				  way4ApplicationInput.addStartElement("AddContractInfo");
				  way4ApplicationInput.addElement("ADDINFO01", primaryCardNumber); //Thay bang so the chinh
				  way4ApplicationInput.addElement("ADDINFO03", "");//Payment Min/Full
				  way4ApplicationInput.addFinishElement("AddContractInfo");
				  
				  way4ApplicationInput.addFinishElement("Contract");			  			 
				  way4ApplicationInput.addFinishElement("Data");
				  way4ApplicationInput.addStartElement("SubApplList");
				  
				  //Create primary card application
				  if(basicCardFlag.equals("0"))
					  createCardApplication(productCode, branchCode, "", title, embossedName, embossedLine4, "0", applicationNo, clientIdOfCompany);
				  else //basicCardFlag = 2
				  {
					  //Create main card application
					  createCardApplication(productCode, branchCode, "", title, embossedName, embossedLine4, "0", applicationNo, clientIdOfCompany);
					  //Create sub card application
					  createCardApplication(productCode, branchCode, secondaryCardName, title, secondaryCardEmbossName, embossedLine4, "2", sourceApplicationNumber, clientIdOfCompany);
				  }
				  
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of issuing contract
			  }			  			  		
			  
			  /*if(!existClientNumber.equals("Empty") && liabilityContract.equals("Empty"))
			  {
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of Liability contract
			  }
			  
			  if(existClientNumber.equals("Empty"))
			  {
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of Liability contract
				  way4ApplicationInput.addFinishElement("SubApplList");
				  way4ApplicationInput.addFinishElement("Application"); //End of Client application
			  }*/
		  }
		  else //Add sub card to existing main card
		  {
			  createSubCardApplicationIssContractExist(productCode, productGroup, branchCode, primaryCardNumber, secondaryCardName, title, secondaryCardEmbossName, embossedLine4, basicCardFlag, sourceApplicationNumber, clientIdOfCompany);
		  }
		  		  		 		
	  }
	  catch (Exception ex) {
		  ex.printStackTrace();
		  way4ApplicationInput.update();
	  }
  }
  
  private void getProductInfo(String productCode) {
	// TODO Auto-generated method stub
	try{
		getProductInfo.setProduct_code(productCode);
		getProductInfo.execute();
	}
	catch (Exception ex)
	{		
		processMessage(PRLogRecord.ERROR, "error in getProductInfo service, no data found with product code: " + productCode);
		way4ApplicationInput.reset();
		ex.printStackTrace();
	}
}

private void createSubCardApplicationIssContractExist(String productCode,
		String productGroup, String branchCode, String primaryCardNumber, 
		String secondaryCardName, String title,	String secondaryCardEmbossName, 
		String embossedLine4, String basicCardFlag, String sourceApplicationNumber, 
		String clientIdOfCompany) {
	// TODO Auto-generated method stub
	  try
	  {
		  way4ApplicationInput.addStartElement("Application"); //start of application of sub card contract
		  String prefixCode = "CARD";
		  String strRegNumber = generateRegNo(prefixCode);			  
		  way4ApplicationInput.addElement("RegNumber",strRegNumber);		  
		  way4ApplicationInput.addElement("OrderDprt",branchCode);
		  way4ApplicationInput.addElement("ObjectType","Contract");
		  way4ApplicationInput.addElement("ActionType","Add");
		  way4ApplicationInput.addElement("ProductGroup",productGroup);
		  
		  //Get clientCode, reg number and iss contract no
		  getInfoFromPrimaryCard(primaryCardNumber);		  
		  String clientCode = getInfoFromPrimaryCard.getClientNumber();
		  if(clientCode == null)		 
			  throw new Exception();
		  
		  //String shortName = getInfoFromPrimaryCard.getShortName();
		  String issContractNo = getInfoFromPrimaryCard.getIssContractNum();		  
		  
		  way4ApplicationInput.addStartElement("ObjectFor");		  
		  way4ApplicationInput.addStartElement("ContractIDT");
		  way4ApplicationInput.addElement("ContractNumber",issContractNo);
		  way4ApplicationInput.addStartElement("Client");
		  way4ApplicationInput.addStartElement("ClientInfo");
		  way4ApplicationInput.addElement("ClientNumber",clientCode);
		  //way4ApplicationInput.addElement("ShortName",shortName);
		  way4ApplicationInput.addFinishElement("ClientInfo");
		  way4ApplicationInput.addFinishElement("Client");		 
		  way4ApplicationInput.addFinishElement("ContractIDT");		  
		  way4ApplicationInput.addFinishElement("ObjectFor");
		  
		  way4ApplicationInput.addStartElement("Data");
		  way4ApplicationInput.addStartElement("Contract");
		  
		  way4ApplicationInput.addElement("ContractName",secondaryCardName);

		  way4ApplicationInput.addStartElement("Product");		  
		  way4ApplicationInput.addElement("ProductCode1",product_prefix + productCode + sub_suffix);		  
		  way4ApplicationInput.addFinishElement("Product");
		  
		  String subEmbossFirstName = secondaryCardEmbossName.substring(0, secondaryCardEmbossName.lastIndexOf(' ')).trim();
		  String subEmbossedLastName = secondaryCardEmbossName.substring(secondaryCardEmbossName.lastIndexOf(' ') + 1).trim();
		  
		  way4ApplicationInput.addStartElement("PlasticInfo");
		  way4ApplicationInput.addElement("Title",title);	  
		  way4ApplicationInput.addElement("FirstName",subEmbossFirstName);
		  way4ApplicationInput.addElement("LastName",subEmbossedLastName);
		  way4ApplicationInput.addElement("CompanyName", embossedLine4);
		  way4ApplicationInput.addFinishElement("PlasticInfo");
		  
		  way4ApplicationInput.addStartElement("AddContractInfo");
		  way4ApplicationInput.addElement("ADDINFO01","For Sub Card");
		  way4ApplicationInput.addElement("ADDINFO02", "");//Client no cua the phu
		  way4ApplicationInput.addElement("ADDINFO03", clientIdOfCompany);		  
		  way4ApplicationInput.addElement("ADDINFO04", basicCardFlag + sourceApplicationNumber);	 
		  way4ApplicationInput.addFinishElement("AddContractInfo");		  
		  
		  way4ApplicationInput.addFinishElement("Contract");
		  way4ApplicationInput.addFinishElement("Data");
		  
		  way4ApplicationInput.addStartElement("SubApplList");
		  way4ApplicationInput.addStartElement("Application"); //Start application of card plastic
		  prefixCode = "PLASTIC";
		  strRegNumber = generateRegNo(prefixCode);
		  way4ApplicationInput.addElement("RegNumber",strRegNumber);
		  way4ApplicationInput.addElement("ObjectType","Card");
		  way4ApplicationInput.addElement("ActionType","Add");		  
		  way4ApplicationInput.addStartElement("Data");
		  way4ApplicationInput.addStartElement("ProduceCard");
		  //way4ApplicationInput.addStartElement("ProductionParms");		  
		  way4ApplicationInput.addElement("ProductionType","PlasticAndPIN");
		  way4ApplicationInput.addElement("ProductionEvent","NCRD");
		  way4ApplicationInput.addElement("CommentText","");
		  //way4ApplicationInput.addFinishElement("ProductionParms");
		  way4ApplicationInput.addFinishElement("ProduceCard");
		  way4ApplicationInput.addFinishElement("Data");
		  way4ApplicationInput.addFinishElement("Application"); //End application of card plastic
		  way4ApplicationInput.addFinishElement("SubApplList");
		  	  
		  way4ApplicationInput.addFinishElement("Application"); //End application of card
	  }
	  catch (Exception ex) {
		  ex.printStackTrace();		  
	  }
}

  private void getInfoFromPrimaryCard(String primaryCardNumber) {
	try{
		getInfoFromPrimaryCard.setPrimary_card_no(primaryCardNumber);
		getInfoFromPrimaryCard.execute();		
	}
	catch (Exception ex) {
		processMessage(PRLogRecord.ERROR, "error in getInfoFromPrimaryCard service, no data found with card: " + primaryCardNumber);
		way4ApplicationInput.reset();
		ex.printStackTrace();
	}	
  }

  private void createCardApplication(String productCode, String branchCode, String secondaryCardName, String title, String embossedName, String embossedLine4, String basicCardFlag, String applicationNo, String clientIdOfCompany) {
		// TODO Auto-generated method stub
		  way4ApplicationInput.addStartElement("Application"); //start of application of card contract
		  String prefixCode = "CARD";
		  String strRegNumber = generateRegNo(prefixCode);			  
		  way4ApplicationInput.addElement("RegNumber",strRegNumber);
		  way4ApplicationInput.addElement("OrderDprt",branchCode);
		  way4ApplicationInput.addElement("ObjectType","Contract");
		  way4ApplicationInput.addElement("ActionType","Add");
		  
		  way4ApplicationInput.addStartElement("Data");
		  way4ApplicationInput.addStartElement("Contract");
		  if(!secondaryCardName.equals(""))
		  way4ApplicationInput.addElement("ContractName",secondaryCardName);
		  
		  way4ApplicationInput.addStartElement("Product");		  
		  if(basicCardFlag.equals("0"))
			  way4ApplicationInput.addElement("ProductCode1",product_prefix + productCode + main_suffix);
		  else
			  way4ApplicationInput.addElement("ProductCode1",product_prefix + productCode + sub_suffix);		  
		  way4ApplicationInput.addFinishElement("Product");
		  
		  String embossedFirstName = embossedName.substring(0, embossedName.lastIndexOf(' ')).trim();
		  String embossedLastName = embossedName.substring(embossedName.lastIndexOf(' ') + 1).trim();
		  
		  way4ApplicationInput.addStartElement("PlasticInfo");
		  way4ApplicationInput.addElement("Title",title);	  	  
		  way4ApplicationInput.addElement("FirstName",embossedFirstName);		  
		  way4ApplicationInput.addElement("LastName",embossedLastName);
		  way4ApplicationInput.addElement("CompanyName", embossedLine4);
		  way4ApplicationInput.addFinishElement("PlasticInfo");
		  
		  way4ApplicationInput.addStartElement("AddContractInfo");
		  if(basicCardFlag.equals("0"))
			  way4ApplicationInput.addElement("ADDINFO01","For Main Card");				  
		  else
		  {
			  way4ApplicationInput.addElement("ADDINFO01","For Sub Card");
			  way4ApplicationInput.addElement("ADDINFO02", ""); //client code the phu
		  }
		  way4ApplicationInput.addElement("ADDINFO03",clientIdOfCompany);	
		  way4ApplicationInput.addElement("ADDINFO04",basicCardFlag + applicationNo);	  
		  way4ApplicationInput.addFinishElement("AddContractInfo");		  		 
		  
		  way4ApplicationInput.addFinishElement("Contract");
		  way4ApplicationInput.addFinishElement("Data");
		  
		  way4ApplicationInput.addStartElement("SubApplList");
		  way4ApplicationInput.addStartElement("Application"); //Start application of card plastic		  
		  prefixCode = "PLASTIC";
		  strRegNumber = generateRegNo(prefixCode);
		  way4ApplicationInput.addElement("RegNumber",strRegNumber);
		  way4ApplicationInput.addElement("ObjectType","Card");
		  way4ApplicationInput.addElement("ActionType","Add");
		  way4ApplicationInput.addStartElement("Data");
		  way4ApplicationInput.addStartElement("ProduceCard");
		  //way4ApplicationInput.addStartElement("ProductionParms");		  
		  way4ApplicationInput.addElement("ProductionType","PlasticAndPIN");
		  way4ApplicationInput.addElement("ProductionEvent","NCRD");
		  way4ApplicationInput.addElement("CommentText","");
		  //way4ApplicationInput.addFinishElement("ProductionParms");
		  way4ApplicationInput.addFinishElement("ProduceCard");
		  way4ApplicationInput.addFinishElement("Data");
		  way4ApplicationInput.addFinishElement("Application"); //End application of card plastic
		  way4ApplicationInput.addFinishElement("SubApplList");
		  	  
		  way4ApplicationInput.addFinishElement("Application"); //End application of card	
  }
  
  private String generateRegNo(String prefixCode) {
		// TODO Auto-generated method stub
		  count++;
		  String strRecordNo = ("000000000" + count).substring(("" + count).length());		 
		  return (prefixCode + strCurrentDate1 + strFileNumber + strRecordNo);	
  }
  
  private String convertFormatDate(String date) {
		// TODO Auto-generated method stub
		return date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6);
  }
  
  /**
   * This method will be called at the end of the pipe's execution.
   * Add your closing code here.
   */
  protected void close() throws Exception {
	  try{		  
		  way4ApplicationInput.addFinishElement("ApplicationsList");		  
		  way4ApplicationInput.addFinishElement("ApplicationFile");
		  
		  way4ApplicationInput.update();
		  way4ApplicationInput.close();
	  }
	  catch (Exception ex) {
		  ex.printStackTrace();
		  way4ApplicationInput.update();
	  }
  }
  
  /**
	 * Log to Trace
	 * 
	 * @param msg
	 * @throws Exception
	 */
	protected void processMessage(String msg) {
		processMessage(PRLogRecord.TRACE, msg);
	}
	
	/**
	 * Logger w/o MsgBox
	 * 
	 * @param type
	 * @param msg
	 * @throws Exception
	 */
	protected void processMessage(String type, String msg) {
		processMessage(type, msg, false, 0, null);
	}
	
	/**
	 * Logger
	 * 
	 * @param type
	 * @param msg
	 * @param isMsgBox
	 * @param boxType
	 * @param docId
	 * @throws Exception
	 */
	protected void processMessage(String type, String msg, boolean isMsgBox,
			int boxType, Long docId) {
		msg = "[Application Upload]:"+msg;
		ProcessLogRecord logRecord = new ProcessLogRecord(type, msg, docId);
	
		try {
			pipe.log(logRecord);
		} catch (Exception e) {
			pipe.cancel();
		}
	
		if (isMsgBox) {
			pipe.showMessageDialog(new ShowDialogParameters(
					"Application Upload", msg, boxType));
		}
	}
	
	protected void skipFile(String errText) throws FileSkipException
	{
		processMessage(PRLogRecord.ERROR, errText, true, ShowDialogParameters.ERROR_MESSAGE, null);
		throw new FileSkipException(IWrappedInputStream.CLOSE_ACTION_REJECT);		
	}
}