package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveHelpServiceOperatingSessionControlInputModelInteractiveHelpServiceOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionControlInputModel
 */
public class CRInteractiveHelpServiceOperatingSessionControlInputModel   {
  private String interactiveHelpServicingSessionReference = null;

  private String interactiveHelpServiceOperatingSessionInstanceReference = null;

  private Object interactiveHelpServiceOperatingSessionControlActionTaskRecord = null;

  private CRInteractiveHelpServiceOperatingSessionControlInputModelInteractiveHelpServiceOperatingSessionControlActionRequest interactiveHelpServiceOperatingSessionControlActionRequest = null;


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
   * Get interactiveHelpServiceOperatingSessionControlActionRequest
   * @return interactiveHelpServiceOperatingSessionControlActionRequest
  **/

  public CRInteractiveHelpServiceOperatingSessionControlInputModelInteractiveHelpServiceOperatingSessionControlActionRequest getInteractiveHelpServiceOperatingSessionControlActionRequest() {
    return interactiveHelpServiceOperatingSessionControlActionRequest;
  }

  public void setInteractiveHelpServiceOperatingSessionControlActionRequest(CRInteractiveHelpServiceOperatingSessionControlInputModelInteractiveHelpServiceOperatingSessionControlActionRequest interactiveHelpServiceOperatingSessionControlActionRequest) {
    this.interactiveHelpServiceOperatingSessionControlActionRequest = interactiveHelpServiceOperatingSessionControlActionRequest;
  }


}

