
package com.openwaygroup.pipe.applicationuploadfile.autogen;
import com.openwaygroup.application.pipe.spi.base.vector.*;
import com.openwaygroup.application.pipe.impl.jdbc.*;

public class GetFileSeq extends SelectTargetVectorBuffer
{

    private static final VectorFieldMetaData filenumberMetaData = new VectorFieldMetaData("filenumber", OUT);
    private   java.lang.Long filenumber;
    
    public java.lang.Long getFilenumber() {
      return filenumber;
    }
    
  private static final VectorMetaData VECTOR_META_DATA =
      new VectorMetaData(GetFileSeq.class, new VectorFieldMetaData[] {
         filenumberMetaData,

      }
  );

  protected VectorMetaData getFieldsMetaData() {
    return VECTOR_META_DATA;
  }

  protected void retrieveBuffer() throws Exception {
    filenumber =  getLong(filenumberMetaData);
        
  }


  protected void setSelectParameters() throws Exception {
    
  }
}
