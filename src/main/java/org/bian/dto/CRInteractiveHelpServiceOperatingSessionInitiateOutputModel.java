package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionInitiateOutputModel
 */
public class CRInteractiveHelpServiceOperatingSessionInitiateOutputModel   {
  private String interactiveHelpServiceOperatingSessionInstanceReference = null;

  private String interactiveHelpServiceOperatingSessionInitiateActionReference = null;

  private Object interactiveHelpServiceOperatingSessionInitiateActionRecord = null;

  private String interactiveHelpServiceOperatingSessionInstanceStatus = null;

  private Object interactiveHelpServiceOperatingSessionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Interactive Help Service Operating Session instance 
   * @return interactiveHelpServiceOperatingSessionInstanceReference
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceReference() {
    return interactiveHelpServiceOperatingSessionInstanceReference;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReference(String interactiveHelpServiceOperatingSessionInstanceReference) {
    this.interactiveHelpServiceOperatingSessionInstanceReference = interactiveHelpServiceOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return interactiveHelpServiceOperatingSessionInitiateActionReference
  **/

  public String getInteractiveHelpServiceOperatingSessionInitiateActionReference() {
    return interactiveHelpServiceOperatingSessionInitiateActionReference;
  }

  public void setInteractiveHelpServiceOperatingSessionInitiateActionReference(String interactiveHelpServiceOperatingSessionInitiateActionReference) {
    this.interactiveHelpServiceOperatingSessionInitiateActionReference = interactiveHelpServiceOperatingSessionInitiateActionReference;
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

