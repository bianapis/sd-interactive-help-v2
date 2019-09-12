package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionInitiateOutputModel
 */
public class BQServiceSelectionInitiateOutputModel   {
  private Object interactiveHelpServiceOperatingSessionInstanceRecord = null;

  private String serviceSelectionInstanceReference = null;

  private String serviceSelectionInitiateActionReference = null;

  private Object serviceSelectionInitiateActionRecord = null;

  private String serviceSelectionInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return serviceSelectionInitiateActionReference
  **/

  public String getServiceSelectionInitiateActionReference() {
    return serviceSelectionInitiateActionReference;
  }

  public void setServiceSelectionInitiateActionReference(String serviceSelectionInitiateActionReference) {
    this.serviceSelectionInitiateActionReference = serviceSelectionInitiateActionReference;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Service Selection instance (e.g. initialised, pending, active) 
   * @return serviceSelectionInstanceStatus
  **/

  public String getServiceSelectionInstanceStatus() {
    return serviceSelectionInstanceStatus;
  }

  public void setServiceSelectionInstanceStatus(String serviceSelectionInstanceStatus) {
    this.serviceSelectionInstanceStatus = serviceSelectionInstanceStatus;
  }


}

