package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis
 */
public class CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis   {
  private String interactiveHelpServiceOperatingSessionInstanceAnalysisData = null;

  private String interactiveHelpServiceOperatingSessionInstanceAnalysisReportType = null;

  private Object interactiveHelpServiceOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return interactiveHelpServiceOperatingSessionInstanceAnalysisData
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceAnalysisData() {
    return interactiveHelpServiceOperatingSessionInstanceAnalysisData;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceAnalysisData(String interactiveHelpServiceOperatingSessionInstanceAnalysisData) {
    this.interactiveHelpServiceOperatingSessionInstanceAnalysisData = interactiveHelpServiceOperatingSessionInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return interactiveHelpServiceOperatingSessionInstanceAnalysisReport
  **/

  public Object getInteractiveHelpServiceOperatingSessionInstanceAnalysisReport() {
    return interactiveHelpServiceOperatingSessionInstanceAnalysisReport;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceAnalysisReport(Object interactiveHelpServiceOperatingSessionInstanceAnalysisReport) {
    this.interactiveHelpServiceOperatingSessionInstanceAnalysisReport = interactiveHelpServiceOperatingSessionInstanceAnalysisReport;
  }


}

