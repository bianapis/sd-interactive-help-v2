package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionInitiateInputModel
 */
public class BQServiceSelectionInitiateInputModel   {
  private Object interactiveHelpServiceOperatingSessionInstanceRecord = null;

  private String interactiveHelpServiceOperatingSessionInstanceReference = null;

  private Object serviceSelectionInitiateActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Operational service that provides context specific servicing guidance to employees and self-service customers 
   * @return interactiveHelpServiceOperatingSessionInstanceRecord
  **/

  public Object getInteractiveHelpServiceOperatingSessionInstanceRecord() {
    return interactiveHelpServiceOperatingSessionInstanceRecord;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceRecord(Object interactiveHelpServiceOperatingSessionInstanceRecord) {
    this.interactiveHelpServiceOperatingSessionInstanceRecord = interactiveHelpServiceOperatingSessionInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return serviceSelectionInitiateActionRecord
  **/

  public Object getServiceSelectionInitiateActionRecord() {
    return serviceSelectionInitiateActionRecord;
  }

  public void setServiceSelectionInitiateActionRecord(Object serviceSelectionInitiateActionRecord) {
    this.serviceSelectionInitiateActionRecord = serviceSelectionInitiateActionRecord;
  }


}

