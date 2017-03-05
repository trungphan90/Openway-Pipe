
package com.openwaygroup.pipe.applicationuploadfile.autogen;
import com.openwaygroup.application.pipe.spi.base.vector.*;
import com.openwaygroup.application.pipe.impl.jdbc.*;

public class GetProductInfo extends SelectTargetVectorBuffer
{

    private static final VectorFieldMetaData product_codeMetaData = new VectorFieldMetaData("product_code", IN);
    private   java.lang.String product_code;
    
    public java.lang.String getProduct_code() {
      return product_code;
    }
    
      public void setProduct_code(java.lang.String product_code) {
        this.product_code = product_code;
      }
    
    private static final VectorFieldMetaData product_codeMetaData1 = new VectorFieldMetaData("product_code", IN);
  
    private static final VectorFieldMetaData productGroupMetaData = new VectorFieldMetaData("productGroup", OUT);
    private   java.lang.String productGroup;
    
    public java.lang.String getProductGroup() {
      return productGroup;
    }
    
    private static final VectorFieldMetaData codeMetaData = new VectorFieldMetaData("code", OUT);
    private   java.lang.String code;
    
    public java.lang.String getCode() {
      return code;
    }
    
    private static final VectorFieldMetaData nameMetaData = new VectorFieldMetaData("name", OUT);
    private   java.lang.String name;
    
    public java.lang.String getName() {
      return name;
    }
    
  private static final VectorMetaData VECTOR_META_DATA =
      new VectorMetaData(GetProductInfo.class, new VectorFieldMetaData[] {
         product_codeMetaData,
           product_codeMetaData1,
           productGroupMetaData,
         codeMetaData,
         nameMetaData,

      }
  );

  protected VectorMetaData getFieldsMetaData() {
    return VECTOR_META_DATA;
  }

  protected void retrieveBuffer() throws Exception {
    productGroup =  getString(productGroupMetaData);
            code =  getString(codeMetaData);
            name =  getString(nameMetaData);
        
  }


  protected void setSelectParameters() throws Exception {
    
        set(product_codeMetaData, product_code);
      
        set(product_codeMetaData1, product_code);
      
  }
}
