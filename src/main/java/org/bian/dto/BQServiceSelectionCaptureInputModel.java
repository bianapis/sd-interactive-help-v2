package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceSelectionCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionCaptureInputModel
 */
public class BQServiceSelectionCaptureInputModel   {
  private String interactiveHelpServiceOperatingSessionInstanceReference = null;

  private String serviceSelectionInstanceReference = null;

  private Object serviceSelectionCaptureActionTaskRecord = null;

  private BQServiceSelectionCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Interactive Help Service Operating Session instance 
   * @return interactiveHelpServiceOperatingSessionInstanceReference
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceReference() {
    return interactiveHelpServiceOperatingSessionInstanceReference;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReference(String interactiveHelpServiceOperatingSessionInstanceReference) {
    this.interactiveHelpServiceOperatingSessionInstanceReference = interactiveHelpServiceOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Selection instance 
   * @return serviceSelectionInstanceReference
  **/

  public String getServiceSelectionInstanceReference() {
    return serviceSelectionInstanceReference;
  }

  public void setServiceSelectionInstanceReference(String serviceSelectionInstanceReference) {
    this.serviceSelectionInstanceReference = serviceSelectionInstanceReference;
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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQServiceSelectionCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQServiceSelectionCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

