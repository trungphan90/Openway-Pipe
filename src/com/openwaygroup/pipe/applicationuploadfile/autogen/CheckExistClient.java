
package com.openwaygroup.pipe.applicationuploadfile.autogen;
import com.openwaygroup.application.pipe.spi.base.vector.*;
import com.openwaygroup.application.pipe.impl.jdbc.*;

public class CheckExistClient extends SelectTargetVectorBuffer
{

    private static final VectorFieldMetaData client_codeMetaData = new VectorFieldMetaData("client_code", IN);
    private   java.lang.String client_code;
    
    public java.lang.String getClient_code() {
      return client_code;
    }
    
      public void setClient_code(java.lang.String client_code) {
        this.client_code = client_code;
      }
    
    private static final VectorFieldMetaData client_codeMetaData1 = new VectorFieldMetaData("client_code", IN);
  
    private static final VectorFieldMetaData shortnameMetaData = new VectorFieldMetaData("shortname", OUT);
    private   java.lang.String shortname;
    
    public java.lang.String getShortname() {
      return shortname;
    }
    
    private static final VectorFieldMetaData clientnumberMetaData = new VectorFieldMetaData("clientnumber", OUT);
    private   java.lang.String clientnumber;
    
    public java.lang.String getClientnumber() {
      return clientnumber;
    }
    
  private static final VectorMetaData VECTOR_META_DATA =
      new VectorMetaData(CheckExistClient.class, new VectorFieldMetaData[] {
         client_codeMetaData,
           client_codeMetaData1,
           shortnameMetaData,
         clientnumberMetaData,

      }
  );

  protected VectorMetaData getFieldsMetaData() {
    return VECTOR_META_DATA;
  }

  protected void retrieveBuffer() throws Exception {
    shortname =  getString(shortnameMetaData);
            clientnumber =  getString(clientnumberMetaData);
        
  }


  protected void setSelectParameters() throws Exception {
    
        set(client_codeMetaData, client_code);
      
        set(client_codeMetaData1, client_code);
      
  }
}
