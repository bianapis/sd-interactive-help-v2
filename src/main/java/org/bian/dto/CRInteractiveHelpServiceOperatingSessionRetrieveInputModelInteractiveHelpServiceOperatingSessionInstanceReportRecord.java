package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord
 */
public class CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord   {
  private String interactiveHelpServiceOperatingSessionInstanceReportReference = null;

  private String interactiveHelpServiceOperatingSessionInstanceReportType = null;

  private String interactiveHelpServiceOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return interactiveHelpServiceOperatingSessionInstanceReportReference
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceReportReference() {
    return interactiveHelpServiceOperatingSessionInstanceReportReference;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReportReference(String interactiveHelpServiceOperatingSessionInstanceReportReference) {
    this.interactiveHelpServiceOperatingSessionInstanceReportReference = interactiveHelpServiceOperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return interactiveHelpServiceOperatingSessionInstanceReportType
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceReportType() {
    return interactiveHelpServiceOperatingSessionInstanceReportType;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReportType(String interactiveHelpServiceOperatingSessionInstanceReportType) {
    this.interactiveHelpServiceOperatingSessionInstanceReportType = interactiveHelpServiceOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return interactiveHelpServiceOperatingSessionInstanceReportParameters
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceReportParameters() {
    return interactiveHelpServiceOperatingSessionInstanceReportParameters;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReportParameters(String interactiveHelpServiceOperatingSessionInstanceReportParameters) {
    this.interactiveHelpServiceOperatingSessionInstanceReportParameters = interactiveHelpServiceOperatingSessionInstanceReportParameters;
  }


}

