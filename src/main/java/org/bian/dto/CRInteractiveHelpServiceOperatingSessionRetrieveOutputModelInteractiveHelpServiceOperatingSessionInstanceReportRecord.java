package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord
 */
public class CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord   {
  private String interactiveHelpServiceOperatingSessionInstanceReportData = null;

  private String interactiveHelpServiceOperatingSessionInstanceReportType = null;

  private Object interactiveHelpServiceOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return interactiveHelpServiceOperatingSessionInstanceReportData
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceReportData() {
    return interactiveHelpServiceOperatingSessionInstanceReportData;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReportData(String interactiveHelpServiceOperatingSessionInstanceReportData) {
    this.interactiveHelpServiceOperatingSessionInstanceReportData = interactiveHelpServiceOperatingSessionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return interactiveHelpServiceOperatingSessionInstanceReport
  **/

  public Object getInteractiveHelpServiceOperatingSessionInstanceReport() {
    return interactiveHelpServiceOperatingSessionInstanceReport;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReport(Object interactiveHelpServiceOperatingSessionInstanceReport) {
    this.interactiveHelpServiceOperatingSessionInstanceReport = interactiveHelpServiceOperatingSessionInstanceReport;
  }


}

