
package com.openwaygroup.pipe.applicationuploadfile.autogen;
import com.openwaygroup.application.pipe.spi.base.vector.*;
import com.openwaygroup.application.pipe.impl.jdbc.*;

public class CheckExistLiability extends SelectTargetVectorBuffer
{

    private static final VectorFieldMetaData client_numberMetaData = new VectorFieldMetaData("client_number", IN);
    private   java.lang.String client_number;
    
    public java.lang.String getClient_number() {
      return client_number;
    }
    
      public void setClient_number(java.lang.String client_number) {
        this.client_number = client_number;
      }
    
    private static final VectorFieldMetaData liability_productMetaData = new VectorFieldMetaData("liability_product", IN);
    private   java.lang.String liability_product;
    
    public java.lang.String getLiability_product() {
      return liability_product;
    }
    
      public void setLiability_product(java.lang.String liability_product) {
        this.liability_product = liability_product;
      }
    
    private static final VectorFieldMetaData contractNumberMetaData = new VectorFieldMetaData("contractNumber", OUT);
    private   java.lang.String contractNumber;
    
    public java.lang.String getContractNumber() {
      return contractNumber;
    }
    
  private static final VectorMetaData VECTOR_META_DATA =
      new VectorMetaData(CheckExistLiability.class, new VectorFieldMetaData[] {
         client_numberMetaData,
           liability_productMetaData,
           contractNumberMetaData,

      }
  );

  protected VectorMetaData getFieldsMetaData() {
    return VECTOR_META_DATA;
  }

  protected void retrieveBuffer() throws Exception {
    contractNumber =  getString(contractNumberMetaData);
        
  }


  protected void setSelectParameters() throws Exception {
    
        set(client_numberMetaData, client_number);
      
        set(liability_productMetaData, liability_product);
      
  }
}
