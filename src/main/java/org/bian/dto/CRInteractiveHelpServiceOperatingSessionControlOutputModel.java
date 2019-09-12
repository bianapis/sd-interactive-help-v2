package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionControlOutputModel
 */
public class CRInteractiveHelpServiceOperatingSessionControlOutputModel   {
  private String interactiveHelpServiceOperatingSessionControlActionTaskReference = null;

  private Object interactiveHelpServiceOperatingSessionControlActionTaskRecord = null;

  private String interactiveHelpServiceOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interactive Help Service Operating Session instance control processing service call 
   * @return interactiveHelpServiceOperatingSessionControlActionTaskReference
  **/

  public String getInteractiveHelpServiceOperatingSessionControlActionTaskReference() {
    return interactiveHelpServiceOperatingSessionControlActionTaskReference;
  }

  public void setInteractiveHelpServiceOperatingSessionControlActionTaskReference(String interactiveHelpServiceOperatingSessionControlActionTaskReference) {
    this.interactiveHelpServiceOperatingSessionControlActionTaskReference = interactiveHelpServiceOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return interactiveHelpServiceOperatingSessionControlActionTaskRecord
  **/

  public Object getInteractiveHelpServiceOperatingSessionControlActionTaskRecord() {
    return interactiveHelpServiceOperatingSessionControlActionTaskRecord;
  }

  public void setInteractiveHelpServiceOperatingSessionControlActionTaskRecord(Object interactiveHelpServiceOperatingSessionControlActionTaskRecord) {
    this.interactiveHelpServiceOperatingSessionControlActionTaskRecord = interactiveHelpServiceOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return interactiveHelpServiceOperatingSessionControlActionResponse
  **/

  public String getInteractiveHelpServiceOperatingSessionControlActionResponse() {
    return interactiveHelpServiceOperatingSessionControlActionResponse;
  }

  public void setInteractiveHelpServiceOperatingSessionControlActionResponse(String interactiveHelpServiceOperatingSessionControlActionResponse) {
    this.interactiveHelpServiceOperatingSessionControlActionResponse = interactiveHelpServiceOperatingSessionControlActionResponse;
  }


}

