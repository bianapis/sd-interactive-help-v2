package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionCaptureOutputModel
 */
public class BQServiceSelectionCaptureOutputModel   {
  private String serviceSelectionCaptureActionTaskReference = null;

  private Object serviceSelectionCaptureActionTaskRecord = null;

  private String serviceSelectionCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Selection instance capture service call 
   * @return serviceSelectionCaptureActionTaskReference
  **/

  public String getServiceSelectionCaptureActionTaskReference() {
    return serviceSelectionCaptureActionTaskReference;
  }

  public void setServiceSelectionCaptureActionTaskReference(String serviceSelectionCaptureActionTaskReference) {
    this.serviceSelectionCaptureActionTaskReference = serviceSelectionCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return serviceSelectionCaptureActionTaskRecord
  **/

  public Object getServiceSelectionCaptureActionTaskRecord() {
    return serviceSelectionCaptureActionTaskRecord;
  }

  public void setServiceSelectionCaptureActionTaskRecord(Object serviceSelectionCaptureActionTaskRecord) {
    this.serviceSelectionCaptureActionTaskRecord = serviceSelectionCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Selection structured input transaction/record 
   * @return serviceSelectionCaptureRecordReference
  **/

  public String getServiceSelectionCaptureRecordReference() {
    return serviceSelectionCaptureRecordReference;
  }

  public void setServiceSelectionCaptureRecordReference(String serviceSelectionCaptureRecordReference) {
    this.serviceSelectionCaptureRecordReference = serviceSelectionCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

