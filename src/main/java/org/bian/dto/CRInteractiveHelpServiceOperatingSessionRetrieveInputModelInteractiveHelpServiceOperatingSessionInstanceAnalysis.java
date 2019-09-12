package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis
 */
public class CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis   {
  private String interactiveHelpServiceOperatingSessionInstanceAnalysisReference = null;

  private String interactiveHelpServiceOperatingSessionInstanceAnalysisReportType = null;

  private String interactiveHelpServiceOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return interactiveHelpServiceOperatingSessionInstanceAnalysisReference
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceAnalysisReference() {
    return interactiveHelpServiceOperatingSessionInstanceAnalysisReference;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceAnalysisReference(String interactiveHelpServiceOperatingSessionInstanceAnalysisReference) {
    this.interactiveHelpServiceOperatingSessionInstanceAnalysisReference = interactiveHelpServiceOperatingSessionInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return interactiveHelpServiceOperatingSessionInstanceAnalysisReportType
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceAnalysisReportType() {
    return interactiveHelpServiceOperatingSessionInstanceAnalysisReportType;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceAnalysisReportType(String interactiveHelpServiceOperatingSessionInstanceAnalysisReportType) {
    this.interactiveHelpServiceOperatingSessionInstanceAnalysisReportType = interactiveHelpServiceOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return interactiveHelpServiceOperatingSessionInstanceAnalysisParameters
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceAnalysisParameters() {
    return interactiveHelpServiceOperatingSessionInstanceAnalysisParameters;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceAnalysisParameters(String interactiveHelpServiceOperatingSessionInstanceAnalysisParameters) {
    this.interactiveHelpServiceOperatingSessionInstanceAnalysisParameters = interactiveHelpServiceOperatingSessionInstanceAnalysisParameters;
  }


}

