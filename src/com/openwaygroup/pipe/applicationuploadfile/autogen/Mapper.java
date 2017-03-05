
package com.openwaygroup.pipe.applicationuploadfile.autogen;
import com.openwaygroup.application.pipe.impl.java_mapper.AbstractJavaMapper;

public abstract class Mapper extends AbstractJavaMapper {

  protected com.openwaygroup.pipe.applicationuploadfile.autogen.Source source;

  protected com.openwaygroup.pipe.applicationuploadfile.autogen.Way4ApplicationInput way4ApplicationInput;

  protected com.openwaygroup.pipe.applicationuploadfile.autogen.GetFileSeq getFileSeq;

  protected com.openwaygroup.pipe.applicationuploadfile.autogen.CheckExistClient checkExistClient;

  protected com.openwaygroup.pipe.applicationuploadfile.autogen.GetProductInfo getProductInfo;

  protected com.openwaygroup.pipe.applicationuploadfile.autogen.GetInfoFromPrimaryCard getInfoFromPrimaryCard;

  protected com.openwaygroup.pipe.applicationuploadfile.autogen.GetCountry getCountry;

  protected com.openwaygroup.pipe.applicationuploadfile.autogen.CheckExistLiability checkExistLiability;
  

  protected Object getSourceCustomCalculationHandler() {return null;}
  public void resolve() throws Exception {
	source = (com.openwaygroup.pipe.applicationuploadfile.autogen.Source)getMandatoryService("source").getBuffer();
	way4ApplicationInput = (com.openwaygroup.pipe.applicationuploadfile.autogen.Way4ApplicationInput)getMandatoryService("way4ApplicationInput").getBuffer();
	getFileSeq = (com.openwaygroup.pipe.applicationuploadfile.autogen.GetFileSeq)getMandatoryService("getFileSeq").getBuffer();
	checkExistClient = (com.openwaygroup.pipe.applicationuploadfile.autogen.CheckExistClient)getMandatoryService("checkExistClient").getBuffer();
	getProductInfo = (com.openwaygroup.pipe.applicationuploadfile.autogen.GetProductInfo)getMandatoryService("getProductInfo").getBuffer();
	getInfoFromPrimaryCard = (com.openwaygroup.pipe.applicationuploadfile.autogen.GetInfoFromPrimaryCard)getMandatoryService("getInfoFromPrimaryCard").getBuffer();
	getCountry = (com.openwaygroup.pipe.applicationuploadfile.autogen.GetCountry)getMandatoryService("getCountry").getBuffer();
	checkExistLiability = (com.openwaygroup.pipe.applicationuploadfile.autogen.CheckExistLiability)getMandatoryService("checkExistLiability").getBuffer();
	
    source.setCustomCalculationHandler(getSourceCustomCalculationHandler());
  }

  
  public com.openwaygroup.pipe.applicationuploadfile.autogen.Source getSource() throws Exception {
    if (!getMandatoryService("source").isOpened()) {
      getMandatoryService("source").open();
    }
  
    return source;
  }
  
  public com.openwaygroup.pipe.applicationuploadfile.autogen.Way4ApplicationInput getWay4ApplicationInput() throws Exception {
    if (!getMandatoryService("way4ApplicationInput").isOpened()) {
      getMandatoryService("way4ApplicationInput").open();
    }
  
    return way4ApplicationInput;
  }
  
  public com.openwaygroup.pipe.applicationuploadfile.autogen.GetFileSeq getGetFileSeq() throws Exception {
    if (!getMandatoryService("getFileSeq").isOpened()) {
      getMandatoryService("getFileSeq").open();
    }
  
    return getFileSeq;
  }
  
  public com.openwaygroup.pipe.applicationuploadfile.autogen.CheckExistClient getCheckExistClient() throws Exception {
    if (!getMandatoryService("checkExistClient").isOpened()) {
      getMandatoryService("checkExistClient").open();
    }
  
    return checkExistClient;
  }
  
  public com.openwaygroup.pipe.applicationuploadfile.autogen.GetProductInfo getGetProductInfo() throws Exception {
    if (!getMandatoryService("getProductInfo").isOpened()) {
      getMandatoryService("getProductInfo").open();
    }
  
    return getProductInfo;
  }
  
  public com.openwaygroup.pipe.applicationuploadfile.autogen.GetInfoFromPrimaryCard getGetInfoFromPrimaryCard() throws Exception {
    if (!getMandatoryService("getInfoFromPrimaryCard").isOpened()) {
      getMandatoryService("getInfoFromPrimaryCard").open();
    }
  
    return getInfoFromPrimaryCard;
  }
  
  public com.openwaygroup.pipe.applicationuploadfile.autogen.GetCountry getGetCountry() throws Exception {
    if (!getMandatoryService("getCountry").isOpened()) {
      getMandatoryService("getCountry").open();
    }
  
    return getCountry;
  }
  
  public com.openwaygroup.pipe.applicationuploadfile.autogen.CheckExistLiability getCheckExistLiability() throws Exception {
    if (!getMandatoryService("checkExistLiability").isOpened()) {
      getMandatoryService("checkExistLiability").open();
    }
  
    return checkExistLiability;
  }
  
  public static final String getSignature() {
    return "917234194";
  }
}
	