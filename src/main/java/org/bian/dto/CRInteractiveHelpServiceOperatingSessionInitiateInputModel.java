package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionInitiateInputModel
 */
public class CRInteractiveHelpServiceOperatingSessionInitiateInputModel   {
  private String interactiveHelpServicingSessionReference = null;

  private Object interactiveHelpServiceOperatingSessionInitiateActionRecord = null;

  private String interactiveHelpServiceOperatingSessionInstanceStatus = null;

  private Object interactiveHelpServiceOperatingSessionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return interactiveHelpServicingSessionReference
  **/

  public String getInteractiveHelpServicingSessionReference() {
    return interactiveHelpServicingSessionReference;
  }

  public void setInteractiveHelpServicingSessionReference(String interactiveHelpServicingSessionReference) {
    this.interactiveHelpServicingSessionReference = interactiveHelpServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return interactiveHelpServiceOperatingSessionInitiateActionRecord
  **/

  public Object getInteractiveHelpServiceOperatingSessionInitiateActionRecord() {
    return interactiveHelpServiceOperatingSessionInitiateActionRecord;
  }

  public void setInteractiveHelpServiceOperatingSessionInitiateActionRecord(Object interactiveHelpServiceOperatingSessionInitiateActionRecord) {
    this.interactiveHelpServiceOperatingSessionInitiateActionRecord = interactiveHelpServiceOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Interactive Help Service Operating Session instance (e.g. initialised, pending, active) 
   * @return interactiveHelpServiceOperatingSessionInstanceStatus
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceStatus() {
    return interactiveHelpServiceOperatingSessionInstanceStatus;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceStatus(String interactiveHelpServiceOperatingSessionInstanceStatus) {
    this.interactiveHelpServiceOperatingSessionInstanceStatus = interactiveHelpServiceOperatingSessionInstanceStatus;
  }


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


}

