package com.openwaygroup.pipe.applicationuploadfile.autogen;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileSourceBuffer;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileSourceBufferRecord;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileBufferFieldString;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileBufferFieldNumber;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileBufferFieldDatetime;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileBufferFieldLong;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileBufferFieldBool;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileBufferFieldBytes;
import com.openwaygroup.application.pipe.impl.filer.source.FlatFileBufferField;
import com.openwaygroup.application.pipe.impl.filer.source.IConditionCalculation;
import com.openwaygroup.application.pipe.util.DataConverter;
import java.math.BigDecimal;
import java.sql.Timestamp;


public class Source extends FlatFileSourceBuffer {

  FlatFileBufferFieldString institutionCode;
  FlatFileBufferFieldString applicationNo;
  FlatFileBufferFieldString productCode;
  FlatFileBufferFieldString socialStatus;
  FlatFileBufferFieldString basicCardFlag;
  FlatFileBufferFieldString primaryCardNumber;
  FlatFileBufferFieldString clientIdOfCompany;
  FlatFileBufferFieldString title;
  FlatFileBufferFieldString familyName;
  FlatFileBufferFieldString firstName;
  FlatFileBufferFieldString embossedName;
  FlatFileBufferFieldString birthdate;
  FlatFileBufferFieldString birthCity;
  FlatFileBufferFieldString birthCountry;
  FlatFileBufferFieldString gender;
  FlatFileBufferFieldString vipCode;
  FlatFileBufferFieldString nationality;
  FlatFileBufferFieldString maritalStatus;
  FlatFileBufferFieldString noOfDependents;
  FlatFileBufferFieldString education;
  FlatFileBufferFieldString residenceStatus;
  FlatFileBufferFieldString permanentAddress1;
  FlatFileBufferFieldString permanentAddress2;
  FlatFileBufferFieldString permanentAddress3;
  FlatFileBufferFieldString permanentAddress4;
  FlatFileBufferFieldString permanentCityCode;
  FlatFileBufferFieldString permanentZipCode;
  FlatFileBufferFieldString permanentCountryCode;
  FlatFileBufferFieldString currentAddress1;
  FlatFileBufferFieldString currentAddress2;
  FlatFileBufferFieldString currentAddress3;
  FlatFileBufferFieldString currentAddress4;
  FlatFileBufferFieldString currentCityCode;
  FlatFileBufferFieldString currentZipCode;
  FlatFileBufferFieldString currentCountryCode;
  FlatFileBufferFieldString homePhoneNumber;
  FlatFileBufferFieldString mobileNumber;
  FlatFileBufferFieldString emailID;
  FlatFileBufferFieldString employmentStatus;
  FlatFileBufferFieldString employerType;
  FlatFileBufferFieldString applicationProfession;
  FlatFileBufferFieldString employerName;
  FlatFileBufferFieldString emplAddress1;
  FlatFileBufferFieldString emplAddress2;
  FlatFileBufferFieldString emplAddress3;
  FlatFileBufferFieldString emplAddress4;
  FlatFileBufferFieldString emplZipCode;
  FlatFileBufferFieldString emplCityCode;
  FlatFileBufferFieldString emplCountryCode;
  FlatFileBufferFieldString officePhoneNumber;
  FlatFileBufferFieldString annualIncome;
  FlatFileBufferFieldString legalID;
  FlatFileBufferFieldString ownedVehicleType;
  FlatFileBufferFieldString drivingLicenseNumber;
  FlatFileBufferFieldString passportNumber;
  FlatFileBufferFieldString placeOfIssueOfPassport;
  FlatFileBufferFieldString existingCardNumber;
  FlatFileBufferFieldString accountInBank;
  FlatFileBufferFieldString accountBranch;
  FlatFileBufferFieldString accountNumber;
  FlatFileBufferFieldString additionalFamilyName;
  FlatFileBufferFieldString secondaryCardName;
  FlatFileBufferFieldString secondaryCardEmbossName;
  FlatFileBufferFieldString secondaryCardRelation;
  FlatFileBufferFieldString additionalBirthdate;
  FlatFileBufferFieldString insuranceNomineeName;
  FlatFileBufferFieldString insuranceNominationRelation;
  FlatFileBufferFieldString applicationStatus;
  FlatFileBufferFieldString remarks;
  FlatFileBufferFieldString motherMaidenName;
  FlatFileBufferFieldString sourceType;
  FlatFileBufferFieldString branchCode;
  FlatFileBufferFieldString issuanceOfAPSSBook;
  FlatFileBufferFieldString creditLimit;
  FlatFileBufferFieldString photocardAppInd;
  FlatFileBufferFieldString embossedLine4;
  FlatFileBufferFieldString cashLimit;
  FlatFileBufferFieldString crAccount;
  FlatFileBufferFieldString applicationType;
  FlatFileBufferFieldString emplDesignation;
  FlatFileBufferFieldString emplDepartment;
  FlatFileBufferFieldString emplCurrentPosition;
  FlatFileBufferFieldString spouseWorkingStatus;
  FlatFileBufferFieldString dematAccountNumber;
  FlatFileBufferFieldString existingCreditCardLimit;
  FlatFileBufferFieldString creditAsPercentOfIncome;
  FlatFileBufferFieldString middleName;
  FlatFileBufferFieldString additionalCardMiddleName;
  FlatFileBufferFieldString additionalGender;
  FlatFileBufferFieldString witnessedBy;
  FlatFileBufferFieldString birthdateNominee;
  FlatFileBufferFieldString referenceEmployeeId;
  FlatFileBufferFieldString referenceMailingAddress;
  FlatFileBufferFieldString emplID;
  FlatFileBufferFieldString cycOffCode;
  FlatFileBufferFieldString tariffCode;
  FlatFileBufferFieldString profileCode;
  FlatFileBufferFieldString ourAccountTenure;
  FlatFileBufferFieldString otherBankName;
  FlatFileBufferFieldString otherAccountType;
  FlatFileBufferFieldString otherAccountNumber;
  FlatFileBufferFieldString otherCreditCardsCount;
  FlatFileBufferFieldString ref1Name;
  FlatFileBufferFieldString ref1Address1;
  FlatFileBufferFieldString ref1Address2;
  FlatFileBufferFieldString ref1Address3;
  FlatFileBufferFieldString ref1Address4;
  FlatFileBufferFieldString ref1ZipCode;
  FlatFileBufferFieldString ref1CityCode;
  FlatFileBufferFieldString ref1CountryCode;
  FlatFileBufferFieldString ref1PhoneNumber;
  FlatFileBufferFieldString otherBankBranch;
  FlatFileBufferFieldString sourceApplicationNo;
  FlatFileBufferFieldString panGirNo;
  FlatFileBufferFieldString clientCode;
  FlatFileBufferFieldString cardNumber;
  FlatFileBufferFieldString age;
  FlatFileBufferFieldString preferences;
  FlatFileBufferFieldString mailingAddressTenure;
  FlatFileBufferFieldString currentJobTenure;
  FlatFileBufferFieldString directDebitFlag;
  FlatFileBufferFieldString directDebitBranch;
  FlatFileBufferFieldString directDebitAccountName;
  FlatFileBufferFieldString directDebitAmountType;
  FlatFileBufferFieldString directDebitAccountNumber;
  FlatFileBufferFieldString directDebitAmountFlag;
  FlatFileBufferFieldString directDebitPercentage;
  FlatFileBufferFieldString deliveryAddress1;
  FlatFileBufferFieldString deliveryAddress2;
  FlatFileBufferFieldString deliveryAddress3;
  FlatFileBufferFieldString deliveryAddress4;
  FlatFileBufferFieldString deliveryZipCode;
  FlatFileBufferFieldString deliveryCityCode;
  FlatFileBufferFieldString statementPrintingRegister;

  public String getInstitutionCode() {return institutionCode.getValue();}
  public String getApplicationNo() {return applicationNo.getValue();}
  public String getProductCode() {return productCode.getValue();}
  public String getSocialStatus() {return socialStatus.getValue();}
  public String getBasicCardFlag() {return basicCardFlag.getValue();}
  public String getPrimaryCardNumber() {return primaryCardNumber.getValue();}
  public String getClientIdOfCompany() {return clientIdOfCompany.getValue();}
  public String getTitle() {return title.getValue();}
  public String getFamilyName() {return familyName.getValue();}
  public String getFirstName() {return firstName.getValue();}
  public String getEmbossedName() {return embossedName.getValue();}
  public String getBirthdate() {return birthdate.getValue();}
  public String getBirthCity() {return birthCity.getValue();}
  public String getBirthCountry() {return birthCountry.getValue();}
  public String getGender() {return gender.getValue();}
  public String getVipCode() {return vipCode.getValue();}
  public String getNationality() {return nationality.getValue();}
  public String getMaritalStatus() {return maritalStatus.getValue();}
  public String getNoOfDependents() {return noOfDependents.getValue();}
  public String getEducation() {return education.getValue();}
  public String getResidenceStatus() {return residenceStatus.getValue();}
  public String getPermanentAddress1() {return permanentAddress1.getValue();}
  public String getPermanentAddress2() {return permanentAddress2.getValue();}
  public String getPermanentAddress3() {return permanentAddress3.getValue();}
  public String getPermanentAddress4() {return permanentAddress4.getValue();}
  public String getPermanentCityCode() {return permanentCityCode.getValue();}
  public String getPermanentZipCode() {return permanentZipCode.getValue();}
  public String getPermanentCountryCode() {return permanentCountryCode.getValue();}
  public String getCurrentAddress1() {return currentAddress1.getValue();}
  public String getCurrentAddress2() {return currentAddress2.getValue();}
  public String getCurrentAddress3() {return currentAddress3.getValue();}
  public String getCurrentAddress4() {return currentAddress4.getValue();}
  public String getCurrentCityCode() {return currentCityCode.getValue();}
  public String getCurrentZipCode() {return currentZipCode.getValue();}
  public String getCurrentCountryCode() {return currentCountryCode.getValue();}
  public String getHomePhoneNumber() {return homePhoneNumber.getValue();}
  public String getMobileNumber() {return mobileNumber.getValue();}
  public String getEmailID() {return emailID.getValue();}
  public String getEmploymentStatus() {return employmentStatus.getValue();}
  public String getEmployerType() {return employerType.getValue();}
  public String getApplicationProfession() {return applicationProfession.getValue();}
  public String getEmployerName() {return employerName.getValue();}
  public String getEmplAddress1() {return emplAddress1.getValue();}
  public String getEmplAddress2() {return emplAddress2.getValue();}
  public String getEmplAddress3() {return emplAddress3.getValue();}
  public String getEmplAddress4() {return emplAddress4.getValue();}
  public String getEmplZipCode() {return emplZipCode.getValue();}
  public String getEmplCityCode() {return emplCityCode.getValue();}
  public String getEmplCountryCode() {return emplCountryCode.getValue();}
  public String getOfficePhoneNumber() {return officePhoneNumber.getValue();}
  public String getAnnualIncome() {return annualIncome.getValue();}
  public String getLegalID() {return legalID.getValue();}
  public String getOwnedVehicleType() {return ownedVehicleType.getValue();}
  public String getDrivingLicenseNumber() {return drivingLicenseNumber.getValue();}
  public String getPassportNumber() {return passportNumber.getValue();}
  public String getPlaceOfIssueOfPassport() {return placeOfIssueOfPassport.getValue();}
  public String getExistingCardNumber() {return existingCardNumber.getValue();}
  public String getAccountInBank() {return accountInBank.getValue();}
  public String getAccountBranch() {return accountBranch.getValue();}
  public String getAccountNumber() {return accountNumber.getValue();}
  public String getAdditionalFamilyName() {return additionalFamilyName.getValue();}
  public String getSecondaryCardName() {return secondaryCardName.getValue();}
  public String getSecondaryCardEmbossName() {return secondaryCardEmbossName.getValue();}
  public String getSecondaryCardRelation() {return secondaryCardRelation.getValue();}
  public String getAdditionalBirthdate() {return additionalBirthdate.getValue();}
  public String getInsuranceNomineeName() {return insuranceNomineeName.getValue();}
  public String getInsuranceNominationRelation() {return insuranceNominationRelation.getValue();}
  public String getApplicationStatus() {return applicationStatus.getValue();}
  public String getRemarks() {return remarks.getValue();}
  public String getMotherMaidenName() {return motherMaidenName.getValue();}
  public String getSourceType() {return sourceType.getValue();}
  public String getBranchCode() {return branchCode.getValue();}
  public String getIssuanceOfAPSSBook() {return issuanceOfAPSSBook.getValue();}
  public String getCreditLimit() {return creditLimit.getValue();}
  public String getPhotocardAppInd() {return photocardAppInd.getValue();}
  public String getEmbossedLine4() {return embossedLine4.getValue();}
  public String getCashLimit() {return cashLimit.getValue();}
  public String getCrAccount() {return crAccount.getValue();}
  public String getApplicationType() {return applicationType.getValue();}
  public String getEmplDesignation() {return emplDesignation.getValue();}
  public String getEmplDepartment() {return emplDepartment.getValue();}
  public String getEmplCurrentPosition() {return emplCurrentPosition.getValue();}
  public String getSpouseWorkingStatus() {return spouseWorkingStatus.getValue();}
  public String getDematAccountNumber() {return dematAccountNumber.getValue();}
  public String getExistingCreditCardLimit() {return existingCreditCardLimit.getValue();}
  public String getCreditAsPercentOfIncome() {return creditAsPercentOfIncome.getValue();}
  public String getMiddleName() {return middleName.getValue();}
  public String getAdditionalCardMiddleName() {return additionalCardMiddleName.getValue();}
  public String getAdditionalGender() {return additionalGender.getValue();}
  public String getWitnessedBy() {return witnessedBy.getValue();}
  public String getBirthdateNominee() {return birthdateNominee.getValue();}
  public String getReferenceEmployeeId() {return referenceEmployeeId.getValue();}
  public String getReferenceMailingAddress() {return referenceMailingAddress.getValue();}
  public String getEmplID() {return emplID.getValue();}
  public String getCycOffCode() {return cycOffCode.getValue();}
  public String getTariffCode() {return tariffCode.getValue();}
  public String getProfileCode() {return profileCode.getValue();}
  public String getOurAccountTenure() {return ourAccountTenure.getValue();}
  public String getOtherBankName() {return otherBankName.getValue();}
  public String getOtherAccountType() {return otherAccountType.getValue();}
  public String getOtherAccountNumber() {return otherAccountNumber.getValue();}
  public String getOtherCreditCardsCount() {return otherCreditCardsCount.getValue();}
  public String getRef1Name() {return ref1Name.getValue();}
  public String getRef1Address1() {return ref1Address1.getValue();}
  public String getRef1Address2() {return ref1Address2.getValue();}
  public String getRef1Address3() {return ref1Address3.getValue();}
  public String getRef1Address4() {return ref1Address4.getValue();}
  public String getRef1ZipCode() {return ref1ZipCode.getValue();}
  public String getRef1CityCode() {return ref1CityCode.getValue();}
  public String getRef1CountryCode() {return ref1CountryCode.getValue();}
  public String getRef1PhoneNumber() {return ref1PhoneNumber.getValue();}
  public String getOtherBankBranch() {return otherBankBranch.getValue();}
  public String getSourceApplicationNo() {return sourceApplicationNo.getValue();}
  public String getPanGirNo() {return panGirNo.getValue();}
  public String getClientCode() {return clientCode.getValue();}
  public String getCardNumber() {return cardNumber.getValue();}
  public String getAge() {return age.getValue();}
  public String getPreferences() {return preferences.getValue();}
  public String getMailingAddressTenure() {return mailingAddressTenure.getValue();}
  public String getCurrentJobTenure() {return currentJobTenure.getValue();}
  public String getDirectDebitFlag() {return directDebitFlag.getValue();}
  public String getDirectDebitBranch() {return directDebitBranch.getValue();}
  public String getDirectDebitAccountName() {return directDebitAccountName.getValue();}
  public String getDirectDebitAmountType() {return directDebitAmountType.getValue();}
  public String getDirectDebitAccountNumber() {return directDebitAccountNumber.getValue();}
  public String getDirectDebitAmountFlag() {return directDebitAmountFlag.getValue();}
  public String getDirectDebitPercentage() {return directDebitPercentage.getValue();}
  public String getDeliveryAddress1() {return deliveryAddress1.getValue();}
  public String getDeliveryAddress2() {return deliveryAddress2.getValue();}
  public String getDeliveryAddress3() {return deliveryAddress3.getValue();}
  public String getDeliveryAddress4() {return deliveryAddress4.getValue();}
  public String getDeliveryZipCode() {return deliveryZipCode.getValue();}
  public String getDeliveryCityCode() {return deliveryCityCode.getValue();}
  public String getStatementPrintingRegister() {return statementPrintingRegister.getValue();}

  public void setInstitutionCode(String val) {institutionCode.setValue(val);}
  public void setApplicationNo(String val) {applicationNo.setValue(val);}
  public void setProductCode(String val) {productCode.setValue(val);}
  public void setSocialStatus(String val) {socialStatus.setValue(val);}
  public void setBasicCardFlag(String val) {basicCardFlag.setValue(val);}
  public void setPrimaryCardNumber(String val) {primaryCardNumber.setValue(val);}
  public void setClientIdOfCompany(String val) {clientIdOfCompany.setValue(val);}
  public void setTitle(String val) {title.setValue(val);}
  public void setFamilyName(String val) {familyName.setValue(val);}
  public void setFirstName(String val) {firstName.setValue(val);}
  public void setEmbossedName(String val) {embossedName.setValue(val);}
  public void setBirthdate(String val) {birthdate.setValue(val);}
  public void setBirthCity(String val) {birthCity.setValue(val);}
  public void setBirthCountry(String val) {birthCountry.setValue(val);}
  public void setGender(String val) {gender.setValue(val);}
  public void setVipCode(String val) {vipCode.setValue(val);}
  public void setNationality(String val) {nationality.setValue(val);}
  public void setMaritalStatus(String val) {maritalStatus.setValue(val);}
  public void setNoOfDependents(String val) {noOfDependents.setValue(val);}
  public void setEducation(String val) {education.setValue(val);}
  public void setResidenceStatus(String val) {residenceStatus.setValue(val);}
  public void setPermanentAddress1(String val) {permanentAddress1.setValue(val);}
  public void setPermanentAddress2(String val) {permanentAddress2.setValue(val);}
  public void setPermanentAddress3(String val) {permanentAddress3.setValue(val);}
  public void setPermanentAddress4(String val) {permanentAddress4.setValue(val);}
  public void setPermanentCityCode(String val) {permanentCityCode.setValue(val);}
  public void setPermanentZipCode(String val) {permanentZipCode.setValue(val);}
  public void setPermanentCountryCode(String val) {permanentCountryCode.setValue(val);}
  public void setCurrentAddress1(String val) {currentAddress1.setValue(val);}
  public void setCurrentAddress2(String val) {currentAddress2.setValue(val);}
  public void setCurrentAddress3(String val) {currentAddress3.setValue(val);}
  public void setCurrentAddress4(String val) {currentAddress4.setValue(val);}
  public void setCurrentCityCode(String val) {currentCityCode.setValue(val);}
  public void setCurrentZipCode(String val) {currentZipCode.setValue(val);}
  public void setCurrentCountryCode(String val) {currentCountryCode.setValue(val);}
  public void setHomePhoneNumber(String val) {homePhoneNumber.setValue(val);}
  public void setMobileNumber(String val) {mobileNumber.setValue(val);}
  public void setEmailID(String val) {emailID.setValue(val);}
  public void setEmploymentStatus(String val) {employmentStatus.setValue(val);}
  public void setEmployerType(String val) {employerType.setValue(val);}
  public void setApplicationProfession(String val) {applicationProfession.setValue(val);}
  public void setEmployerName(String val) {employerName.setValue(val);}
  public void setEmplAddress1(String val) {emplAddress1.setValue(val);}
  public void setEmplAddress2(String val) {emplAddress2.setValue(val);}
  public void setEmplAddress3(String val) {emplAddress3.setValue(val);}
  public void setEmplAddress4(String val) {emplAddress4.setValue(val);}
  public void setEmplZipCode(String val) {emplZipCode.setValue(val);}
  public void setEmplCityCode(String val) {emplCityCode.setValue(val);}
  public void setEmplCountryCode(String val) {emplCountryCode.setValue(val);}
  public void setOfficePhoneNumber(String val) {officePhoneNumber.setValue(val);}
  public void setAnnualIncome(String val) {annualIncome.setValue(val);}
  public void setLegalID(String val) {legalID.setValue(val);}
  public void setOwnedVehicleType(String val) {ownedVehicleType.setValue(val);}
  public void setDrivingLicenseNumber(String val) {drivingLicenseNumber.setValue(val);}
  public void setPassportNumber(String val) {passportNumber.setValue(val);}
  public void setPlaceOfIssueOfPassport(String val) {placeOfIssueOfPassport.setValue(val);}
  public void setExistingCardNumber(String val) {existingCardNumber.setValue(val);}
  public void setAccountInBank(String val) {accountInBank.setValue(val);}
  public void setAccountBranch(String val) {accountBranch.setValue(val);}
  public void setAccountNumber(String val) {accountNumber.setValue(val);}
  public void setAdditionalFamilyName(String val) {additionalFamilyName.setValue(val);}
  public void setSecondaryCardName(String val) {secondaryCardName.setValue(val);}
  public void setSecondaryCardEmbossName(String val) {secondaryCardEmbossName.setValue(val);}
  public void setSecondaryCardRelation(String val) {secondaryCardRelation.setValue(val);}
  public void setAdditionalBirthdate(String val) {additionalBirthdate.setValue(val);}
  public void setInsuranceNomineeName(String val) {insuranceNomineeName.setValue(val);}
  public void setInsuranceNominationRelation(String val) {insuranceNominationRelation.setValue(val);}
  public void setApplicationStatus(String val) {applicationStatus.setValue(val);}
  public void setRemarks(String val) {remarks.setValue(val);}
  public void setMotherMaidenName(String val) {motherMaidenName.setValue(val);}
  public void setSourceType(String val) {sourceType.setValue(val);}
  public void setBranchCode(String val) {branchCode.setValue(val);}
  public void setIssuanceOfAPSSBook(String val) {issuanceOfAPSSBook.setValue(val);}
  public void setCreditLimit(String val) {creditLimit.setValue(val);}
  public void setPhotocardAppInd(String val) {photocardAppInd.setValue(val);}
  public void setEmbossedLine4(String val) {embossedLine4.setValue(val);}
  public void setCashLimit(String val) {cashLimit.setValue(val);}
  public void setCrAccount(String val) {crAccount.setValue(val);}
  public void setApplicationType(String val) {applicationType.setValue(val);}
  public void setEmplDesignation(String val) {emplDesignation.setValue(val);}
  public void setEmplDepartment(String val) {emplDepartment.setValue(val);}
  public void setEmplCurrentPosition(String val) {emplCurrentPosition.setValue(val);}
  public void setSpouseWorkingStatus(String val) {spouseWorkingStatus.setValue(val);}
  public void setDematAccountNumber(String val) {dematAccountNumber.setValue(val);}
  public void setExistingCreditCardLimit(String val) {existingCreditCardLimit.setValue(val);}
  public void setCreditAsPercentOfIncome(String val) {creditAsPercentOfIncome.setValue(val);}
  public void setMiddleName(String val) {middleName.setValue(val);}
  public void setAdditionalCardMiddleName(String val) {additionalCardMiddleName.setValue(val);}
  public void setAdditionalGender(String val) {additionalGender.setValue(val);}
  public void setWitnessedBy(String val) {witnessedBy.setValue(val);}
  public void setBirthdateNominee(String val) {birthdateNominee.setValue(val);}
  public void setReferenceEmployeeId(String val) {referenceEmployeeId.setValue(val);}
  public void setReferenceMailingAddress(String val) {referenceMailingAddress.setValue(val);}
  public void setEmplID(String val) {emplID.setValue(val);}
  public void setCycOffCode(String val) {cycOffCode.setValue(val);}
  public void setTariffCode(String val) {tariffCode.setValue(val);}
  public void setProfileCode(String val) {profileCode.setValue(val);}
  public void setOurAccountTenure(String val) {ourAccountTenure.setValue(val);}
  public void setOtherBankName(String val) {otherBankName.setValue(val);}
  public void setOtherAccountType(String val) {otherAccountType.setValue(val);}
  public void setOtherAccountNumber(String val) {otherAccountNumber.setValue(val);}
  public void setOtherCreditCardsCount(String val) {otherCreditCardsCount.setValue(val);}
  public void setRef1Name(String val) {ref1Name.setValue(val);}
  public void setRef1Address1(String val) {ref1Address1.setValue(val);}
  public void setRef1Address2(String val) {ref1Address2.setValue(val);}
  public void setRef1Address3(String val) {ref1Address3.setValue(val);}
  public void setRef1Address4(String val) {ref1Address4.setValue(val);}
  public void setRef1ZipCode(String val) {ref1ZipCode.setValue(val);}
  public void setRef1CityCode(String val) {ref1CityCode.setValue(val);}
  public void setRef1CountryCode(String val) {ref1CountryCode.setValue(val);}
  public void setRef1PhoneNumber(String val) {ref1PhoneNumber.setValue(val);}
  public void setOtherBankBranch(String val) {otherBankBranch.setValue(val);}
  public void setSourceApplicationNo(String val) {sourceApplicationNo.setValue(val);}
  public void setPanGirNo(String val) {panGirNo.setValue(val);}
  public void setClientCode(String val) {clientCode.setValue(val);}
  public void setCardNumber(String val) {cardNumber.setValue(val);}
  public void setAge(String val) {age.setValue(val);}
  public void setPreferences(String val) {preferences.setValue(val);}
  public void setMailingAddressTenure(String val) {mailingAddressTenure.setValue(val);}
  public void setCurrentJobTenure(String val) {currentJobTenure.setValue(val);}
  public void setDirectDebitFlag(String val) {directDebitFlag.setValue(val);}
  public void setDirectDebitBranch(String val) {directDebitBranch.setValue(val);}
  public void setDirectDebitAccountName(String val) {directDebitAccountName.setValue(val);}
  public void setDirectDebitAmountType(String val) {directDebitAmountType.setValue(val);}
  public void setDirectDebitAccountNumber(String val) {directDebitAccountNumber.setValue(val);}
  public void setDirectDebitAmountFlag(String val) {directDebitAmountFlag.setValue(val);}
  public void setDirectDebitPercentage(String val) {directDebitPercentage.setValue(val);}
  public void setDeliveryAddress1(String val) {deliveryAddress1.setValue(val);}
  public void setDeliveryAddress2(String val) {deliveryAddress2.setValue(val);}
  public void setDeliveryAddress3(String val) {deliveryAddress3.setValue(val);}
  public void setDeliveryAddress4(String val) {deliveryAddress4.setValue(val);}
  public void setDeliveryZipCode(String val) {deliveryZipCode.setValue(val);}
  public void setDeliveryCityCode(String val) {deliveryCityCode.setValue(val);}
  public void setStatementPrintingRegister(String val) {statementPrintingRegister.setValue(val);}

  public class FileNameRecord extends FlatFileSourceBufferRecord {
  }
  public class FileHeaderRecord extends FlatFileSourceBufferRecord {
  }
  public class FileTrailerRecord extends FlatFileSourceBufferRecord {
  }
  public class FileDataRecord extends FlatFileSourceBufferRecord {
    public String getInstitutionCode() {return institutionCode.getValue();}
    public void setInstitutionCode(String val) {institutionCode.setValue(val);}
    public String getApplicationNo() {return applicationNo.getValue();}
    public void setApplicationNo(String val) {applicationNo.setValue(val);}
    public String getProductCode() {return productCode.getValue();}
    public void setProductCode(String val) {productCode.setValue(val);}
    public String getSocialStatus() {return socialStatus.getValue();}
    public void setSocialStatus(String val) {socialStatus.setValue(val);}
    public String getBasicCardFlag() {return basicCardFlag.getValue();}
    public void setBasicCardFlag(String val) {basicCardFlag.setValue(val);}
    public String getPrimaryCardNumber() {return primaryCardNumber.getValue();}
    public void setPrimaryCardNumber(String val) {primaryCardNumber.setValue(val);}
    public String getClientIdOfCompany() {return clientIdOfCompany.getValue();}
    public void setClientIdOfCompany(String val) {clientIdOfCompany.setValue(val);}
    public String getTitle() {return title.getValue();}
    public void setTitle(String val) {title.setValue(val);}
    public String getFamilyName() {return familyName.getValue();}
    public void setFamilyName(String val) {familyName.setValue(val);}
    public String getFirstName() {return firstName.getValue();}
    public void setFirstName(String val) {firstName.setValue(val);}
    public String getEmbossedName() {return embossedName.getValue();}
    public void setEmbossedName(String val) {embossedName.setValue(val);}
    public String getBirthdate() {return birthdate.getValue();}
    public void setBirthdate(String val) {birthdate.setValue(val);}
    public String getBirthCity() {return birthCity.getValue();}
    public void setBirthCity(String val) {birthCity.setValue(val);}
    public String getBirthCountry() {return birthCountry.getValue();}
    public void setBirthCountry(String val) {birthCountry.setValue(val);}
    public String getGender() {return gender.getValue();}
    public void setGender(String val) {gender.setValue(val);}
    public String getVipCode() {return vipCode.getValue();}
    public void setVipCode(String val) {vipCode.setValue(val);}
    public String getNationality() {return nationality.getValue();}
    public void setNationality(String val) {nationality.setValue(val);}
    public String getMaritalStatus() {return maritalStatus.getValue();}
    public void setMaritalStatus(String val) {maritalStatus.setValue(val);}
    public String getNoOfDependents() {return noOfDependents.getValue();}
    public void setNoOfDependents(String val) {noOfDependents.setValue(val);}
    public String getEducation() {return education.getValue();}
    public void setEducation(String val) {education.setValue(val);}
    public String getResidenceStatus() {return residenceStatus.getValue();}
    public void setResidenceStatus(String val) {residenceStatus.setValue(val);}
    public String getPermanentAddress1() {return permanentAddress1.getValue();}
    public void setPermanentAddress1(String val) {permanentAddress1.setValue(val);}
    public String getPermanentAddress2() {return permanentAddress2.getValue();}
    public void setPermanentAddress2(String val) {permanentAddress2.setValue(val);}
    public String getPermanentAddress3() {return permanentAddress3.getValue();}
    public void setPermanentAddress3(String val) {permanentAddress3.setValue(val);}
    public String getPermanentAddress4() {return permanentAddress4.getValue();}
    public void setPermanentAddress4(String val) {permanentAddress4.setValue(val);}
    public String getPermanentCityCode() {return permanentCityCode.getValue();}
    public void setPermanentCityCode(String val) {permanentCityCode.setValue(val);}
    public String getPermanentZipCode() {return permanentZipCode.getValue();}
    public void setPermanentZipCode(String val) {permanentZipCode.setValue(val);}
    public String getPermanentCountryCode() {return permanentCountryCode.getValue();}
    public void setPermanentCountryCode(String val) {permanentCountryCode.setValue(val);}
    public String getCurrentAddress1() {return currentAddress1.getValue();}
    public void setCurrentAddress1(String val) {currentAddress1.setValue(val);}
    public String getCurrentAddress2() {return currentAddress2.getValue();}
    public void setCurrentAddress2(String val) {currentAddress2.setValue(val);}
    public String getCurrentAddress3() {return currentAddress3.getValue();}
    public void setCurrentAddress3(String val) {currentAddress3.setValue(val);}
    public String getCurrentAddress4() {return currentAddress4.getValue();}
    public void setCurrentAddress4(String val) {currentAddress4.setValue(val);}
    public String getCurrentCityCode() {return currentCityCode.getValue();}
    public void setCurrentCityCode(String val) {currentCityCode.setValue(val);}
    public String getCurrentZipCode() {return currentZipCode.getValue();}
    public void setCurrentZipCode(String val) {currentZipCode.setValue(val);}
    public String getCurrentCountryCode() {return currentCountryCode.getValue();}
    public void setCurrentCountryCode(String val) {currentCountryCode.setValue(val);}
    public String getHomePhoneNumber() {return homePhoneNumber.getValue();}
    public void setHomePhoneNumber(String val) {homePhoneNumber.setValue(val);}
    public String getMobileNumber() {return mobileNumber.getValue();}
    public void setMobileNumber(String val) {mobileNumber.setValue(val);}
    public String getEmailID() {return emailID.getValue();}
    public void setEmailID(String val) {emailID.setValue(val);}
    public String getEmploymentStatus() {return employmentStatus.getValue();}
    public void setEmploymentStatus(String val) {employmentStatus.setValue(val);}
    public String getEmployerType() {return employerType.getValue();}
    public void setEmployerType(String val) {employerType.setValue(val);}
    public String getApplicationProfession() {return applicationProfession.getValue();}
    public void setApplicationProfession(String val) {applicationProfession.setValue(val);}
    public String getEmployerName() {return employerName.getValue();}
    public void setEmployerName(String val) {employerName.setValue(val);}
    public String getEmplAddress1() {return emplAddress1.getValue();}
    public void setEmplAddress1(String val) {emplAddress1.setValue(val);}
    public String getEmplAddress2() {return emplAddress2.getValue();}
    public void setEmplAddress2(String val) {emplAddress2.setValue(val);}
    public String getEmplAddress3() {return emplAddress3.getValue();}
    public void setEmplAddress3(String val) {emplAddress3.setValue(val);}
    public String getEmplAddress4() {return emplAddress4.getValue();}
    public void setEmplAddress4(String val) {emplAddress4.setValue(val);}
    public String getEmplZipCode() {return emplZipCode.getValue();}
    public void setEmplZipCode(String val) {emplZipCode.setValue(val);}
    public String getEmplCityCode() {return emplCityCode.getValue();}
    public void setEmplCityCode(String val) {emplCityCode.setValue(val);}
    public String getEmplCountryCode() {return emplCountryCode.getValue();}
    public void setEmplCountryCode(String val) {emplCountryCode.setValue(val);}
    public String getOfficePhoneNumber() {return officePhoneNumber.getValue();}
    public void setOfficePhoneNumber(String val) {officePhoneNumber.setValue(val);}
    public String getAnnualIncome() {return annualIncome.getValue();}
    public void setAnnualIncome(String val) {annualIncome.setValue(val);}
    public String getLegalID() {return legalID.getValue();}
    public void setLegalID(String val) {legalID.setValue(val);}
    public String getOwnedVehicleType() {return ownedVehicleType.getValue();}
    public void setOwnedVehicleType(String val) {ownedVehicleType.setValue(val);}
    public String getDrivingLicenseNumber() {return drivingLicenseNumber.getValue();}
    public void setDrivingLicenseNumber(String val) {drivingLicenseNumber.setValue(val);}
    public String getPassportNumber() {return passportNumber.getValue();}
    public void setPassportNumber(String val) {passportNumber.setValue(val);}
    public String getPlaceOfIssueOfPassport() {return placeOfIssueOfPassport.getValue();}
    public void setPlaceOfIssueOfPassport(String val) {placeOfIssueOfPassport.setValue(val);}
    public String getExistingCardNumber() {return existingCardNumber.getValue();}
    public void setExistingCardNumber(String val) {existingCardNumber.setValue(val);}
    public String getAccountInBank() {return accountInBank.getValue();}
    public void setAccountInBank(String val) {accountInBank.setValue(val);}
    public String getAccountBranch() {return accountBranch.getValue();}
    public void setAccountBranch(String val) {accountBranch.setValue(val);}
    public String getAccountNumber() {return accountNumber.getValue();}
    public void setAccountNumber(String val) {accountNumber.setValue(val);}
    public String getAdditionalFamilyName() {return additionalFamilyName.getValue();}
    public void setAdditionalFamilyName(String val) {additionalFamilyName.setValue(val);}
    public String getSecondaryCardName() {return secondaryCardName.getValue();}
    public void setSecondaryCardName(String val) {secondaryCardName.setValue(val);}
    public String getSecondaryCardEmbossName() {return secondaryCardEmbossName.getValue();}
    public void setSecondaryCardEmbossName(String val) {secondaryCardEmbossName.setValue(val);}
    public String getSecondaryCardRelation() {return secondaryCardRelation.getValue();}
    public void setSecondaryCardRelation(String val) {secondaryCardRelation.setValue(val);}
    public String getAdditionalBirthdate() {return additionalBirthdate.getValue();}
    public void setAdditionalBirthdate(String val) {additionalBirthdate.setValue(val);}
    public String getInsuranceNomineeName() {return insuranceNomineeName.getValue();}
    public void setInsuranceNomineeName(String val) {insuranceNomineeName.setValue(val);}
    public String getInsuranceNominationRelation() {return insuranceNominationRelation.getValue();}
    public void setInsuranceNominationRelation(String val) {insuranceNominationRelation.setValue(val);}
    public String getApplicationStatus() {return applicationStatus.getValue();}
    public void setApplicationStatus(String val) {applicationStatus.setValue(val);}
    public String getRemarks() {return remarks.getValue();}
    public void setRemarks(String val) {remarks.setValue(val);}
    public String getMotherMaidenName() {return motherMaidenName.getValue();}
    public void setMotherMaidenName(String val) {motherMaidenName.setValue(val);}
    public String getSourceType() {return sourceType.getValue();}
    public void setSourceType(String val) {sourceType.setValue(val);}
    public String getBranchCode() {return branchCode.getValue();}
    public void setBranchCode(String val) {branchCode.setValue(val);}
    public String getIssuanceOfAPSSBook() {return issuanceOfAPSSBook.getValue();}
    public void setIssuanceOfAPSSBook(String val) {issuanceOfAPSSBook.setValue(val);}
    public String getCreditLimit() {return creditLimit.getValue();}
    public void setCreditLimit(String val) {creditLimit.setValue(val);}
    public String getPhotocardAppInd() {return photocardAppInd.getValue();}
    public void setPhotocardAppInd(String val) {photocardAppInd.setValue(val);}
    public String getEmbossedLine4() {return embossedLine4.getValue();}
    public void setEmbossedLine4(String val) {embossedLine4.setValue(val);}
    public String getCashLimit() {return cashLimit.getValue();}
    public void setCashLimit(String val) {cashLimit.setValue(val);}
    public String getCrAccount() {return crAccount.getValue();}
    public void setCrAccount(String val) {crAccount.setValue(val);}
    public String getApplicationType() {return applicationType.getValue();}
    public void setApplicationType(String val) {applicationType.setValue(val);}
    public String getEmplDesignation() {return emplDesignation.getValue();}
    public void setEmplDesignation(String val) {emplDesignation.setValue(val);}
    public String getEmplDepartment() {return emplDepartment.getValue();}
    public void setEmplDepartment(String val) {emplDepartment.setValue(val);}
    public String getEmplCurrentPosition() {return emplCurrentPosition.getValue();}
    public void setEmplCurrentPosition(String val) {emplCurrentPosition.setValue(val);}
    public String getSpouseWorkingStatus() {return spouseWorkingStatus.getValue();}
    public void setSpouseWorkingStatus(String val) {spouseWorkingStatus.setValue(val);}
    public String getDematAccountNumber() {return dematAccountNumber.getValue();}
    public void setDematAccountNumber(String val) {dematAccountNumber.setValue(val);}
    public String getExistingCreditCardLimit() {return existingCreditCardLimit.getValue();}
    public void setExistingCreditCardLimit(String val) {existingCreditCardLimit.setValue(val);}
    public String getCreditAsPercentOfIncome() {return creditAsPercentOfIncome.getValue();}
    public void setCreditAsPercentOfIncome(String val) {creditAsPercentOfIncome.setValue(val);}
    public String getMiddleName() {return middleName.getValue();}
    public void setMiddleName(String val) {middleName.setValue(val);}
    public String getAdditionalCardMiddleName() {return additionalCardMiddleName.getValue();}
    public void setAdditionalCardMiddleName(String val) {additionalCardMiddleName.setValue(val);}
    public String getAdditionalGender() {return additionalGender.getValue();}
    public void setAdditionalGender(String val) {additionalGender.setValue(val);}
    public String getWitnessedBy() {return witnessedBy.getValue();}
    public void setWitnessedBy(String val) {witnessedBy.setValue(val);}
    public String getBirthdateNominee() {return birthdateNominee.getValue();}
    public void setBirthdateNominee(String val) {birthdateNominee.setValue(val);}
    public String getReferenceEmployeeId() {return referenceEmployeeId.getValue();}
    public void setReferenceEmployeeId(String val) {referenceEmployeeId.setValue(val);}
    public String getReferenceMailingAddress() {return referenceMailingAddress.getValue();}
    public void setReferenceMailingAddress(String val) {referenceMailingAddress.setValue(val);}
    public String getEmplID() {return emplID.getValue();}
    public void setEmplID(String val) {emplID.setValue(val);}
    public String getCycOffCode() {return cycOffCode.getValue();}
    public void setCycOffCode(String val) {cycOffCode.setValue(val);}
    public String getTariffCode() {return tariffCode.getValue();}
    public void setTariffCode(String val) {tariffCode.setValue(val);}
    public String getProfileCode() {return profileCode.getValue();}
    public void setProfileCode(String val) {profileCode.setValue(val);}
    public String getOurAccountTenure() {return ourAccountTenure.getValue();}
    public void setOurAccountTenure(String val) {ourAccountTenure.setValue(val);}
    public String getOtherBankName() {return otherBankName.getValue();}
    public void setOtherBankName(String val) {otherBankName.setValue(val);}
    public String getOtherAccountType() {return otherAccountType.getValue();}
    public void setOtherAccountType(String val) {otherAccountType.setValue(val);}
    public String getOtherAccountNumber() {return otherAccountNumber.getValue();}
    public void setOtherAccountNumber(String val) {otherAccountNumber.setValue(val);}
    public String getOtherCreditCardsCount() {return otherCreditCardsCount.getValue();}
    public void setOtherCreditCardsCount(String val) {otherCreditCardsCount.setValue(val);}
    public String getRef1Name() {return ref1Name.getValue();}
    public void setRef1Name(String val) {ref1Name.setValue(val);}
    public String getRef1Address1() {return ref1Address1.getValue();}
    public void setRef1Address1(String val) {ref1Address1.setValue(val);}
    public String getRef1Address2() {return ref1Address2.getValue();}
    public void setRef1Address2(String val) {ref1Address2.setValue(val);}
    public String getRef1Address3() {return ref1Address3.getValue();}
    public void setRef1Address3(String val) {ref1Address3.setValue(val);}
    public String getRef1Address4() {return ref1Address4.getValue();}
    public void setRef1Address4(String val) {ref1Address4.setValue(val);}
    public String getRef1ZipCode() {return ref1ZipCode.getValue();}
    public void setRef1ZipCode(String val) {ref1ZipCode.setValue(val);}
    public String getRef1CityCode() {return ref1CityCode.getValue();}
    public void setRef1CityCode(String val) {ref1CityCode.setValue(val);}
    public String getRef1CountryCode() {return ref1CountryCode.getValue();}
    public void setRef1CountryCode(String val) {ref1CountryCode.setValue(val);}
    public String getRef1PhoneNumber() {return ref1PhoneNumber.getValue();}
    public void setRef1PhoneNumber(String val) {ref1PhoneNumber.setValue(val);}
    public String getOtherBankBranch() {return otherBankBranch.getValue();}
    public void setOtherBankBranch(String val) {otherBankBranch.setValue(val);}
    public String getSourceApplicationNo() {return sourceApplicationNo.getValue();}
    public void setSourceApplicationNo(String val) {sourceApplicationNo.setValue(val);}
    public String getPanGirNo() {return panGirNo.getValue();}
    public void setPanGirNo(String val) {panGirNo.setValue(val);}
    public String getClientCode() {return clientCode.getValue();}
    public void setClientCode(String val) {clientCode.setValue(val);}
    public String getCardNumber() {return cardNumber.getValue();}
    public void setCardNumber(String val) {cardNumber.setValue(val);}
    public String getAge() {return age.getValue();}
    public void setAge(String val) {age.setValue(val);}
    public String getPreferences() {return preferences.getValue();}
    public void setPreferences(String val) {preferences.setValue(val);}
    public String getMailingAddressTenure() {return mailingAddressTenure.getValue();}
    public void setMailingAddressTenure(String val) {mailingAddressTenure.setValue(val);}
    public String getCurrentJobTenure() {return currentJobTenure.getValue();}
    public void setCurrentJobTenure(String val) {currentJobTenure.setValue(val);}
    public String getDirectDebitFlag() {return directDebitFlag.getValue();}
    public void setDirectDebitFlag(String val) {directDebitFlag.setValue(val);}
    public String getDirectDebitBranch() {return directDebitBranch.getValue();}
    public void setDirectDebitBranch(String val) {directDebitBranch.setValue(val);}
    public String getDirectDebitAccountName() {return directDebitAccountName.getValue();}
    public void setDirectDebitAccountName(String val) {directDebitAccountName.setValue(val);}
    public String getDirectDebitAmountType() {return directDebitAmountType.getValue();}
    public void setDirectDebitAmountType(String val) {directDebitAmountType.setValue(val);}
    public String getDirectDebitAccountNumber() {return directDebitAccountNumber.getValue();}
    public void setDirectDebitAccountNumber(String val) {directDebitAccountNumber.setValue(val);}
    public String getDirectDebitAmountFlag() {return directDebitAmountFlag.getValue();}
    public void setDirectDebitAmountFlag(String val) {directDebitAmountFlag.setValue(val);}
    public String getDirectDebitPercentage() {return directDebitPercentage.getValue();}
    public void setDirectDebitPercentage(String val) {directDebitPercentage.setValue(val);}
    public String getDeliveryAddress1() {return deliveryAddress1.getValue();}
    public void setDeliveryAddress1(String val) {deliveryAddress1.setValue(val);}
    public String getDeliveryAddress2() {return deliveryAddress2.getValue();}
    public void setDeliveryAddress2(String val) {deliveryAddress2.setValue(val);}
    public String getDeliveryAddress3() {return deliveryAddress3.getValue();}
    public void setDeliveryAddress3(String val) {deliveryAddress3.setValue(val);}
    public String getDeliveryAddress4() {return deliveryAddress4.getValue();}
    public void setDeliveryAddress4(String val) {deliveryAddress4.setValue(val);}
    public String getDeliveryZipCode() {return deliveryZipCode.getValue();}
    public void setDeliveryZipCode(String val) {deliveryZipCode.setValue(val);}
    public String getDeliveryCityCode() {return deliveryCityCode.getValue();}
    public void setDeliveryCityCode(String val) {deliveryCityCode.setValue(val);}
    public String getStatementPrintingRegister() {return statementPrintingRegister.getValue();}
    public void setStatementPrintingRegister(String val) {statementPrintingRegister.setValue(val);}
  }
  public class System extends FlatFileSourceBufferRecord {
  }


  public FileNameRecord getFileNameRecord() {return (FileNameRecord)records[0];}
  public FileHeaderRecord getFileHeaderRecord() {return (FileHeaderRecord)records[1];}
  public FileTrailerRecord getFileTrailerRecord() {return (FileTrailerRecord)records[2];}
  public FileDataRecord getFileDataRecord() {return (FileDataRecord)records[3];}
  public System getSystem() {return (System)records[4];}

  public Source() {
    records = new FlatFileSourceBufferRecord[5];
    records[0] = new FileNameRecord();
    records[0].setName("FileNameRecord");
    records[1] = new FileHeaderRecord();
    records[1].setName("FileHeaderRecord");
    records[2] = new FileTrailerRecord();
    records[2].setName("FileTrailerRecord");
    records[3] = new FileDataRecord();
    records[3].setName("FileDataRecord");
    records[4] = new System();
    records[4].setName("System");
    nOfRecords = 5;

    institutionCode = new FlatFileBufferFieldString("institutionCode");
    applicationNo = new FlatFileBufferFieldString("applicationNo");
    productCode = new FlatFileBufferFieldString("productCode");
    socialStatus = new FlatFileBufferFieldString("socialStatus");
    basicCardFlag = new FlatFileBufferFieldString("basicCardFlag");
    primaryCardNumber = new FlatFileBufferFieldString("primaryCardNumber");
    clientIdOfCompany = new FlatFileBufferFieldString("clientIdOfCompany");
    title = new FlatFileBufferFieldString("title");
    familyName = new FlatFileBufferFieldString("familyName");
    firstName = new FlatFileBufferFieldString("firstName");
    embossedName = new FlatFileBufferFieldString("embossedName");
    birthdate = new FlatFileBufferFieldString("birthdate");
    birthCity = new FlatFileBufferFieldString("birthCity");
    birthCountry = new FlatFileBufferFieldString("birthCountry");
    gender = new FlatFileBufferFieldString("gender");
    vipCode = new FlatFileBufferFieldString("vipCode");
    nationality = new FlatFileBufferFieldString("nationality");
    maritalStatus = new FlatFileBufferFieldString("maritalStatus");
    noOfDependents = new FlatFileBufferFieldString("noOfDependents");
    education = new FlatFileBufferFieldString("education");
    residenceStatus = new FlatFileBufferFieldString("residenceStatus");
    permanentAddress1 = new FlatFileBufferFieldString("permanentAddress1");
    permanentAddress2 = new FlatFileBufferFieldString("permanentAddress2");
    permanentAddress3 = new FlatFileBufferFieldString("permanentAddress3");
    permanentAddress4 = new FlatFileBufferFieldString("permanentAddress4");
    permanentCityCode = new FlatFileBufferFieldString("permanentCityCode");
    permanentZipCode = new FlatFileBufferFieldString("permanentZipCode");
    permanentCountryCode = new FlatFileBufferFieldString("permanentCountryCode");
    currentAddress1 = new FlatFileBufferFieldString("currentAddress1");
    currentAddress2 = new FlatFileBufferFieldString("currentAddress2");
    currentAddress3 = new FlatFileBufferFieldString("currentAddress3");
    currentAddress4 = new FlatFileBufferFieldString("currentAddress4");
    currentCityCode = new FlatFileBufferFieldString("currentCityCode");
    currentZipCode = new FlatFileBufferFieldString("currentZipCode");
    currentCountryCode = new FlatFileBufferFieldString("currentCountryCode");
    homePhoneNumber = new FlatFileBufferFieldString("homePhoneNumber");
    mobileNumber = new FlatFileBufferFieldString("mobileNumber");
    emailID = new FlatFileBufferFieldString("emailID");
    employmentStatus = new FlatFileBufferFieldString("employmentStatus");
    employerType = new FlatFileBufferFieldString("employerType");
    applicationProfession = new FlatFileBufferFieldString("applicationProfession");
    employerName = new FlatFileBufferFieldString("employerName");
    emplAddress1 = new FlatFileBufferFieldString("emplAddress1");
    emplAddress2 = new FlatFileBufferFieldString("emplAddress2");
    emplAddress3 = new FlatFileBufferFieldString("emplAddress3");
    emplAddress4 = new FlatFileBufferFieldString("emplAddress4");
    emplZipCode = new FlatFileBufferFieldString("emplZipCode");
    emplCityCode = new FlatFileBufferFieldString("emplCityCode");
    emplCountryCode = new FlatFileBufferFieldString("emplCountryCode");
    officePhoneNumber = new FlatFileBufferFieldString("officePhoneNumber");
    annualIncome = new FlatFileBufferFieldString("annualIncome");
    legalID = new FlatFileBufferFieldString("legalID");
    ownedVehicleType = new FlatFileBufferFieldString("ownedVehicleType");
    drivingLicenseNumber = new FlatFileBufferFieldString("drivingLicenseNumber");
    passportNumber = new FlatFileBufferFieldString("passportNumber");
    placeOfIssueOfPassport = new FlatFileBufferFieldString("placeOfIssueOfPassport");
    existingCardNumber = new FlatFileBufferFieldString("existingCardNumber");
    accountInBank = new FlatFileBufferFieldString("accountInBank");
    accountBranch = new FlatFileBufferFieldString("accountBranch");
    accountNumber = new FlatFileBufferFieldString("accountNumber");
    additionalFamilyName = new FlatFileBufferFieldString("additionalFamilyName");
    secondaryCardName = new FlatFileBufferFieldString("secondaryCardName");
    secondaryCardEmbossName = new FlatFileBufferFieldString("secondaryCardEmbossName");
    secondaryCardRelation = new FlatFileBufferFieldString("secondaryCardRelation");
    additionalBirthdate = new FlatFileBufferFieldString("additionalBirthdate");
    insuranceNomineeName = new FlatFileBufferFieldString("insuranceNomineeName");
    insuranceNominationRelation = new FlatFileBufferFieldString("insuranceNominationRelation");
    applicationStatus = new FlatFileBufferFieldString("applicationStatus");
    remarks = new FlatFileBufferFieldString("remarks");
    motherMaidenName = new FlatFileBufferFieldString("motherMaidenName");
    sourceType = new FlatFileBufferFieldString("sourceType");
    branchCode = new FlatFileBufferFieldString("branchCode");
    issuanceOfAPSSBook = new FlatFileBufferFieldString("issuanceOfAPSSBook");
    creditLimit = new FlatFileBufferFieldString("creditLimit");
    photocardAppInd = new FlatFileBufferFieldString("photocardAppInd");
    embossedLine4 = new FlatFileBufferFieldString("embossedLine4");
    cashLimit = new FlatFileBufferFieldString("cashLimit");
    crAccount = new FlatFileBufferFieldString("crAccount");
    applicationType = new FlatFileBufferFieldString("applicationType");
    emplDesignation = new FlatFileBufferFieldString("emplDesignation");
    emplDepartment = new FlatFileBufferFieldString("emplDepartment");
    emplCurrentPosition = new FlatFileBufferFieldString("emplCurrentPosition");
    spouseWorkingStatus = new FlatFileBufferFieldString("spouseWorkingStatus");
    dematAccountNumber = new FlatFileBufferFieldString("dematAccountNumber");
    existingCreditCardLimit = new FlatFileBufferFieldString("existingCreditCardLimit");
    creditAsPercentOfIncome = new FlatFileBufferFieldString("creditAsPercentOfIncome");
    middleName = new FlatFileBufferFieldString("middleName");
    additionalCardMiddleName = new FlatFileBufferFieldString("additionalCardMiddleName");
    additionalGender = new FlatFileBufferFieldString("additionalGender");
    witnessedBy = new FlatFileBufferFieldString("witnessedBy");
    birthdateNominee = new FlatFileBufferFieldString("birthdateNominee");
    referenceEmployeeId = new FlatFileBufferFieldString("referenceEmployeeId");
    referenceMailingAddress = new FlatFileBufferFieldString("referenceMailingAddress");
    emplID = new FlatFileBufferFieldString("emplID");
    cycOffCode = new FlatFileBufferFieldString("cycOffCode");
    tariffCode = new FlatFileBufferFieldString("tariffCode");
    profileCode = new FlatFileBufferFieldString("profileCode");
    ourAccountTenure = new FlatFileBufferFieldString("ourAccountTenure");
    otherBankName = new FlatFileBufferFieldString("otherBankName");
    otherAccountType = new FlatFileBufferFieldString("otherAccountType");
    otherAccountNumber = new FlatFileBufferFieldString("otherAccountNumber");
    otherCreditCardsCount = new FlatFileBufferFieldString("otherCreditCardsCount");
    ref1Name = new FlatFileBufferFieldString("ref1Name");
    ref1Address1 = new FlatFileBufferFieldString("ref1Address1");
    ref1Address2 = new FlatFileBufferFieldString("ref1Address2");
    ref1Address3 = new FlatFileBufferFieldString("ref1Address3");
    ref1Address4 = new FlatFileBufferFieldString("ref1Address4");
    ref1ZipCode = new FlatFileBufferFieldString("ref1ZipCode");
    ref1CityCode = new FlatFileBufferFieldString("ref1CityCode");
    ref1CountryCode = new FlatFileBufferFieldString("ref1CountryCode");
    ref1PhoneNumber = new FlatFileBufferFieldString("ref1PhoneNumber");
    otherBankBranch = new FlatFileBufferFieldString("otherBankBranch");
    sourceApplicationNo = new FlatFileBufferFieldString("sourceApplicationNo");
    panGirNo = new FlatFileBufferFieldString("panGirNo");
    clientCode = new FlatFileBufferFieldString("clientCode");
    cardNumber = new FlatFileBufferFieldString("cardNumber");
    age = new FlatFileBufferFieldString("age");
    preferences = new FlatFileBufferFieldString("preferences");
    mailingAddressTenure = new FlatFileBufferFieldString("mailingAddressTenure");
    currentJobTenure = new FlatFileBufferFieldString("currentJobTenure");
    directDebitFlag = new FlatFileBufferFieldString("directDebitFlag");
    directDebitBranch = new FlatFileBufferFieldString("directDebitBranch");
    directDebitAccountName = new FlatFileBufferFieldString("directDebitAccountName");
    directDebitAmountType = new FlatFileBufferFieldString("directDebitAmountType");
    directDebitAccountNumber = new FlatFileBufferFieldString("directDebitAccountNumber");
    directDebitAmountFlag = new FlatFileBufferFieldString("directDebitAmountFlag");
    directDebitPercentage = new FlatFileBufferFieldString("directDebitPercentage");
    deliveryAddress1 = new FlatFileBufferFieldString("deliveryAddress1");
    deliveryAddress2 = new FlatFileBufferFieldString("deliveryAddress2");
    deliveryAddress3 = new FlatFileBufferFieldString("deliveryAddress3");
    deliveryAddress4 = new FlatFileBufferFieldString("deliveryAddress4");
    deliveryZipCode = new FlatFileBufferFieldString("deliveryZipCode");
    deliveryCityCode = new FlatFileBufferFieldString("deliveryCityCode");
    statementPrintingRegister = new FlatFileBufferFieldString("statementPrintingRegister");

  initStandardVariables();
    records[0].fields = new FlatFileBufferField.RecordAdapter[0];
    records[0].nOfFields = 0;
    records[0].setSimple(true);
    records[1].fields = new FlatFileBufferField.RecordAdapter[0];
    records[1].nOfFields = 0;
    records[1].setSimple(true);
    records[2].fields = new FlatFileBufferField.RecordAdapter[0];
    records[2].nOfFields = 0;
    records[2].setSimple(true);
    records[3].fields = new FlatFileBufferField.RecordAdapter[134];
    records[3].fields[0] = new FlatFileBufferField.RecordAdapter(institutionCode,null,null);
    records[3].fields[1] = new FlatFileBufferField.RecordAdapter(applicationNo,null,null);
    records[3].fields[2] = new FlatFileBufferField.RecordAdapter(productCode,null,null);
    records[3].fields[3] = new FlatFileBufferField.RecordAdapter(socialStatus,null,null);
    records[3].fields[4] = new FlatFileBufferField.RecordAdapter(basicCardFlag,null,null);
    records[3].fields[5] = new FlatFileBufferField.RecordAdapter(primaryCardNumber,null,null);
    records[3].fields[6] = new FlatFileBufferField.RecordAdapter(clientIdOfCompany,null,null);
    records[3].fields[7] = new FlatFileBufferField.RecordAdapter(title,null,null);
    records[3].fields[8] = new FlatFileBufferField.RecordAdapter(familyName,null,null);
    records[3].fields[9] = new FlatFileBufferField.RecordAdapter(firstName,null,null);
    records[3].fields[10] = new FlatFileBufferField.RecordAdapter(embossedName,null,null);
    records[3].fields[11] = new FlatFileBufferField.RecordAdapter(birthdate,null,null);
    records[3].fields[12] = new FlatFileBufferField.RecordAdapter(birthCity,null,null);
    records[3].fields[13] = new FlatFileBufferField.RecordAdapter(birthCountry,null,null);
    records[3].fields[14] = new FlatFileBufferField.RecordAdapter(gender,null,null);
    records[3].fields[15] = new FlatFileBufferField.RecordAdapter(vipCode,null,null);
    records[3].fields[16] = new FlatFileBufferField.RecordAdapter(nationality,null,null);
    records[3].fields[17] = new FlatFileBufferField.RecordAdapter(maritalStatus,null,null);
    records[3].fields[18] = new FlatFileBufferField.RecordAdapter(noOfDependents,null,null);
    records[3].fields[19] = new FlatFileBufferField.RecordAdapter(education,null,null);
    records[3].fields[20] = new FlatFileBufferField.RecordAdapter(residenceStatus,null,null);
    records[3].fields[21] = new FlatFileBufferField.RecordAdapter(permanentAddress1,null,null);
    records[3].fields[22] = new FlatFileBufferField.RecordAdapter(permanentAddress2,null,null);
    records[3].fields[23] = new FlatFileBufferField.RecordAdapter(permanentAddress3,null,null);
    records[3].fields[24] = new FlatFileBufferField.RecordAdapter(permanentAddress4,null,null);
    records[3].fields[25] = new FlatFileBufferField.RecordAdapter(permanentCityCode,null,null);
    records[3].fields[26] = new FlatFileBufferField.RecordAdapter(permanentZipCode,null,null);
    records[3].fields[27] = new FlatFileBufferField.RecordAdapter(permanentCountryCode,null,null);
    records[3].fields[28] = new FlatFileBufferField.RecordAdapter(currentAddress1,null,null);
    records[3].fields[29] = new FlatFileBufferField.RecordAdapter(currentAddress2,null,null);
    records[3].fields[30] = new FlatFileBufferField.RecordAdapter(currentAddress3,null,null);
    records[3].fields[31] = new FlatFileBufferField.RecordAdapter(currentAddress4,null,null);
    records[3].fields[32] = new FlatFileBufferField.RecordAdapter(currentCityCode,null,null);
    records[3].fields[33] = new FlatFileBufferField.RecordAdapter(currentZipCode,null,null);
    records[3].fields[34] = new FlatFileBufferField.RecordAdapter(currentCountryCode,null,null);
    records[3].fields[35] = new FlatFileBufferField.RecordAdapter(homePhoneNumber,null,null);
    records[3].fields[36] = new FlatFileBufferField.RecordAdapter(mobileNumber,null,null);
    records[3].fields[37] = new FlatFileBufferField.RecordAdapter(emailID,null,null);
    records[3].fields[38] = new FlatFileBufferField.RecordAdapter(employmentStatus,null,null);
    records[3].fields[39] = new FlatFileBufferField.RecordAdapter(employerType,null,null);
    records[3].fields[40] = new FlatFileBufferField.RecordAdapter(applicationProfession,null,null);
    records[3].fields[41] = new FlatFileBufferField.RecordAdapter(employerName,null,null);
    records[3].fields[42] = new FlatFileBufferField.RecordAdapter(emplAddress1,null,null);
    records[3].fields[43] = new FlatFileBufferField.RecordAdapter(emplAddress2,null,null);
    records[3].fields[44] = new FlatFileBufferField.RecordAdapter(emplAddress3,null,null);
    records[3].fields[45] = new FlatFileBufferField.RecordAdapter(emplAddress4,null,null);
    records[3].fields[46] = new FlatFileBufferField.RecordAdapter(emplZipCode,null,null);
    records[3].fields[47] = new FlatFileBufferField.RecordAdapter(emplCityCode,null,null);
    records[3].fields[48] = new FlatFileBufferField.RecordAdapter(emplCountryCode,null,null);
    records[3].fields[49] = new FlatFileBufferField.RecordAdapter(officePhoneNumber,null,null);
    records[3].fields[50] = new FlatFileBufferField.RecordAdapter(annualIncome,null,null);
    records[3].fields[51] = new FlatFileBufferField.RecordAdapter(legalID,null,null);
    records[3].fields[52] = new FlatFileBufferField.RecordAdapter(ownedVehicleType,null,null);
    records[3].fields[53] = new FlatFileBufferField.RecordAdapter(drivingLicenseNumber,null,null);
    records[3].fields[54] = new FlatFileBufferField.RecordAdapter(passportNumber,null,null);
    records[3].fields[55] = new FlatFileBufferField.RecordAdapter(placeOfIssueOfPassport,null,null);
    records[3].fields[56] = new FlatFileBufferField.RecordAdapter(existingCardNumber,null,null);
    records[3].fields[57] = new FlatFileBufferField.RecordAdapter(accountInBank,null,null);
    records[3].fields[58] = new FlatFileBufferField.RecordAdapter(accountBranch,null,null);
    records[3].fields[59] = new FlatFileBufferField.RecordAdapter(accountNumber,null,null);
    records[3].fields[60] = new FlatFileBufferField.RecordAdapter(additionalFamilyName,null,null);
    records[3].fields[61] = new FlatFileBufferField.RecordAdapter(secondaryCardName,null,null);
    records[3].fields[62] = new FlatFileBufferField.RecordAdapter(secondaryCardEmbossName,null,null);
    records[3].fields[63] = new FlatFileBufferField.RecordAdapter(secondaryCardRelation,null,null);
    records[3].fields[64] = new FlatFileBufferField.RecordAdapter(additionalBirthdate,null,null);
    records[3].fields[65] = new FlatFileBufferField.RecordAdapter(insuranceNomineeName,null,null);
    records[3].fields[66] = new FlatFileBufferField.RecordAdapter(insuranceNominationRelation,null,null);
    records[3].fields[67] = new FlatFileBufferField.RecordAdapter(applicationStatus,null,null);
    records[3].fields[68] = new FlatFileBufferField.RecordAdapter(remarks,null,null);
    records[3].fields[69] = new FlatFileBufferField.RecordAdapter(motherMaidenName,null,null);
    records[3].fields[70] = new FlatFileBufferField.RecordAdapter(sourceType,null,null);
    records[3].fields[71] = new FlatFileBufferField.RecordAdapter(branchCode,null,null);
    records[3].fields[72] = new FlatFileBufferField.RecordAdapter(issuanceOfAPSSBook,null,null);
    records[3].fields[73] = new FlatFileBufferField.RecordAdapter(creditLimit,null,null);
    records[3].fields[74] = new FlatFileBufferField.RecordAdapter(photocardAppInd,null,null);
    records[3].fields[75] = new FlatFileBufferField.RecordAdapter(embossedLine4,null,null);
    records[3].fields[76] = new FlatFileBufferField.RecordAdapter(cashLimit,null,null);
    records[3].fields[77] = new FlatFileBufferField.RecordAdapter(crAccount,null,null);
    records[3].fields[78] = new FlatFileBufferField.RecordAdapter(applicationType,null,null);
    records[3].fields[79] = new FlatFileBufferField.RecordAdapter(emplDesignation,null,null);
    records[3].fields[80] = new FlatFileBufferField.RecordAdapter(emplDepartment,null,null);
    records[3].fields[81] = new FlatFileBufferField.RecordAdapter(emplCurrentPosition,null,null);
    records[3].fields[82] = new FlatFileBufferField.RecordAdapter(spouseWorkingStatus,null,null);
    records[3].fields[83] = new FlatFileBufferField.RecordAdapter(dematAccountNumber,null,null);
    records[3].fields[84] = new FlatFileBufferField.RecordAdapter(existingCreditCardLimit,null,null);
    records[3].fields[85] = new FlatFileBufferField.RecordAdapter(creditAsPercentOfIncome,null,null);
    records[3].fields[86] = new FlatFileBufferField.RecordAdapter(middleName,null,null);
    records[3].fields[87] = new FlatFileBufferField.RecordAdapter(additionalCardMiddleName,null,null);
    records[3].fields[88] = new FlatFileBufferField.RecordAdapter(additionalGender,null,null);
    records[3].fields[89] = new FlatFileBufferField.RecordAdapter(witnessedBy,null,null);
    records[3].fields[90] = new FlatFileBufferField.RecordAdapter(birthdateNominee,null,null);
    records[3].fields[91] = new FlatFileBufferField.RecordAdapter(referenceEmployeeId,null,null);
    records[3].fields[92] = new FlatFileBufferField.RecordAdapter(referenceMailingAddress,null,null);
    records[3].fields[93] = new FlatFileBufferField.RecordAdapter(emplID,null,null);
    records[3].fields[94] = new FlatFileBufferField.RecordAdapter(cycOffCode,null,null);
    records[3].fields[95] = new FlatFileBufferField.RecordAdapter(tariffCode,null,null);
    records[3].fields[96] = new FlatFileBufferField.RecordAdapter(profileCode,null,null);
    records[3].fields[97] = new FlatFileBufferField.RecordAdapter(ourAccountTenure,null,null);
    records[3].fields[98] = new FlatFileBufferField.RecordAdapter(otherBankName,null,null);
    records[3].fields[99] = new FlatFileBufferField.RecordAdapter(otherAccountType,null,null);
    records[3].fields[100] = new FlatFileBufferField.RecordAdapter(otherAccountNumber,null,null);
    records[3].fields[101] = new FlatFileBufferField.RecordAdapter(otherCreditCardsCount,null,null);
    records[3].fields[102] = new FlatFileBufferField.RecordAdapter(ref1Name,null,null);
    records[3].fields[103] = new FlatFileBufferField.RecordAdapter(ref1Address1,null,null);
    records[3].fields[104] = new FlatFileBufferField.RecordAdapter(ref1Address2,null,null);
    records[3].fields[105] = new FlatFileBufferField.RecordAdapter(ref1Address3,null,null);
    records[3].fields[106] = new FlatFileBufferField.RecordAdapter(ref1Address4,null,null);
    records[3].fields[107] = new FlatFileBufferField.RecordAdapter(ref1ZipCode,null,null);
    records[3].fields[108] = new FlatFileBufferField.RecordAdapter(ref1CityCode,null,null);
    records[3].fields[109] = new FlatFileBufferField.RecordAdapter(ref1CountryCode,null,null);
    records[3].fields[110] = new FlatFileBufferField.RecordAdapter(ref1PhoneNumber,null,null);
    records[3].fields[111] = new FlatFileBufferField.RecordAdapter(otherBankBranch,null,null);
    records[3].fields[112] = new FlatFileBufferField.RecordAdapter(sourceApplicationNo,null,null);
    records[3].fields[113] = new FlatFileBufferField.RecordAdapter(panGirNo,null,null);
    records[3].fields[114] = new FlatFileBufferField.RecordAdapter(clientCode,null,null);
    records[3].fields[115] = new FlatFileBufferField.RecordAdapter(cardNumber,null,null);
    records[3].fields[116] = new FlatFileBufferField.RecordAdapter(age,null,null);
    records[3].fields[117] = new FlatFileBufferField.RecordAdapter(preferences,null,null);
    records[3].fields[118] = new FlatFileBufferField.RecordAdapter(mailingAddressTenure,null,null);
    records[3].fields[119] = new FlatFileBufferField.RecordAdapter(currentJobTenure,null,null);
    records[3].fields[120] = new FlatFileBufferField.RecordAdapter(directDebitFlag,null,null);
    records[3].fields[121] = new FlatFileBufferField.RecordAdapter(directDebitBranch,null,null);
    records[3].fields[122] = new FlatFileBufferField.RecordAdapter(directDebitAccountName,null,null);
    records[3].fields[123] = new FlatFileBufferField.RecordAdapter(directDebitAmountType,null,null);
    records[3].fields[124] = new FlatFileBufferField.RecordAdapter(directDebitAccountNumber,null,null);
    records[3].fields[125] = new FlatFileBufferField.RecordAdapter(directDebitAmountFlag,null,null);
    records[3].fields[126] = new FlatFileBufferField.RecordAdapter(directDebitPercentage,null,null);
    records[3].fields[127] = new FlatFileBufferField.RecordAdapter(deliveryAddress1,null,null);
    records[3].fields[128] = new FlatFileBufferField.RecordAdapter(deliveryAddress2,null,null);
    records[3].fields[129] = new FlatFileBufferField.RecordAdapter(deliveryAddress3,null,null);
    records[3].fields[130] = new FlatFileBufferField.RecordAdapter(deliveryAddress4,null,null);
    records[3].fields[131] = new FlatFileBufferField.RecordAdapter(deliveryZipCode,null,null);
    records[3].fields[132] = new FlatFileBufferField.RecordAdapter(deliveryCityCode,null,null);
    records[3].fields[133] = new FlatFileBufferField.RecordAdapter(statementPrintingRegister,null,null);
    records[3].nOfFields = 134;
    records[3].setSimple(true);
    records[4].fields = new FlatFileBufferField.RecordAdapter[0];
    records[4].nOfFields = 0;
    records[4].setSimple(true);
  }

  protected String getVersion() {return "2.1";}
}