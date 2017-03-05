
package com.openwaygroup.pipe.applicationuploadfile.autogen;
import com.openwaygroup.application.pipe.spi.base.vector.*;
import com.openwaygroup.application.pipe.impl.jdbc.*;

public class GetCountry extends SelectSourceVectorBuffer
{

    private static final VectorFieldMetaData nCodeMetaData = new VectorFieldMetaData("nCode", OUT);
    private   java.lang.String nCode;
    
    public java.lang.String getNCode() {
      return nCode;
    }
    
      public void setNCode(java.lang.String nCode) {
        this.nCode = nCode;
      }
    
    private static final VectorFieldMetaData codeMetaData = new VectorFieldMetaData("code", OUT);
    private   java.lang.String code;
    
    public java.lang.String getCode() {
      return code;
    }
    
      public void setCode(java.lang.String code) {
        this.code = code;
      }
    
    private static final VectorFieldMetaData nameMetaData = new VectorFieldMetaData("name", OUT);
    private   java.lang.String name;
    
    public java.lang.String getName() {
      return name;
    }
    
      public void setName(java.lang.String name) {
        this.name = name;
      }
    
  private static final VectorMetaData VECTOR_META_DATA =
      new VectorMetaData(GetCountry.class, new VectorFieldMetaData[] {
         nCodeMetaData,
         codeMetaData,
         nameMetaData,

      }
  );

  protected VectorMetaData getFieldsMetaData() {
    return VECTOR_META_DATA;
  }

  protected void retrieveBuffer() throws Exception {
    nCode =  getString(nCodeMetaData);
            code =  getString(codeMetaData);
            name =  getString(nameMetaData);
        
  }


  protected void setSelectParameters() throws Exception {
    
  }
}
