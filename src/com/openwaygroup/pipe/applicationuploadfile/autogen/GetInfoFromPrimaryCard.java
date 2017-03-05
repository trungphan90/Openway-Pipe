
package com.openwaygroup.pipe.applicationuploadfile.autogen;
import com.openwaygroup.application.pipe.spi.base.vector.*;
import com.openwaygroup.application.pipe.impl.jdbc.*;

public class GetInfoFromPrimaryCard extends SelectTargetVectorBuffer
{

    private static final VectorFieldMetaData primary_card_noMetaData = new VectorFieldMetaData("primary_card_no", IN);
    private   java.lang.String primary_card_no;
    
    public java.lang.String getPrimary_card_no() {
      return primary_card_no;
    }
    
      public void setPrimary_card_no(java.lang.String primary_card_no) {
        this.primary_card_no = primary_card_no;
      }
    
    private static final VectorFieldMetaData issContractNumMetaData = new VectorFieldMetaData("issContractNum", OUT);
    private   java.lang.String issContractNum;
    
    public java.lang.String getIssContractNum() {
      return issContractNum;
    }
    
    private static final VectorFieldMetaData clientNumberMetaData = new VectorFieldMetaData("clientNumber", OUT);
    private   java.lang.String clientNumber;
    
    public java.lang.String getClientNumber() {
      return clientNumber;
    }
    
    private static final VectorFieldMetaData regNumberMetaData = new VectorFieldMetaData("regNumber", OUT);
    private   java.lang.String regNumber;
    
    public java.lang.String getRegNumber() {
      return regNumber;
    }
    
    private static final VectorFieldMetaData shortNameMetaData = new VectorFieldMetaData("shortName", OUT);
    private   java.lang.String shortName;
    
    public java.lang.String getShortName() {
      return shortName;
    }
    
  private static final VectorMetaData VECTOR_META_DATA =
      new VectorMetaData(GetInfoFromPrimaryCard.class, new VectorFieldMetaData[] {
         primary_card_noMetaData,
           issContractNumMetaData,
         clientNumberMetaData,
         regNumberMetaData,
         shortNameMetaData,

      }
  );

  protected VectorMetaData getFieldsMetaData() {
    return VECTOR_META_DATA;
  }

  protected void retrieveBuffer() throws Exception {
    issContractNum =  getString(issContractNumMetaData);
            clientNumber =  getString(clientNumberMetaData);
            regNumber =  getString(regNumberMetaData);
            shortName =  getString(shortNameMetaData);
        
  }


  protected void setSelectParameters() throws Exception {
    
        set(primary_card_noMetaData, primary_card_no);
      
  }
}
