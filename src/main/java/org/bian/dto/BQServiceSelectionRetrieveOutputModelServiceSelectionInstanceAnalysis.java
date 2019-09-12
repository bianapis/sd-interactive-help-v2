package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceAnalysis
 */
public class BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceAnalysis   {
  private Object serviceSelectionInstanceAnalysisRecord = null;

  private String serviceSelectionInstanceAnalysisReportType = null;

  private String serviceSelectionInstanceAnalysisParameters = null;

  private Object serviceSelectionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return serviceSelectionInstanceAnalysisRecord
  **/

  public Object getServiceSelectionInstanceAnalysisRecord() {
    return serviceSelectionInstanceAnalysisRecord;
  }

  public void setServiceSelectionInstanceAnalysisRecord(Object serviceSelectionInstanceAnalysisRecord) {
    this.serviceSelectionInstanceAnalysisRecord = serviceSelectionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return serviceSelectionInstanceAnalysisReportType
  **/

  public String getServiceSelectionInstanceAnalysisReportType() {
    return serviceSelectionInstanceAnalysisReportType;
  }

  public void setServiceSelectionInstanceAnalysisReportType(String serviceSelectionInstanceAnalysisReportType) {
    this.serviceSelectionInstanceAnalysisReportType = serviceSelectionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return serviceSelectionInstanceAnalysisParameters
  **/

  public String getServiceSelectionInstanceAnalysisParameters() {
    return serviceSelectionInstanceAnalysisParameters;
  }

  public void setServiceSelectionInstanceAnalysisParameters(String serviceSelectionInstanceAnalysisParameters) {
    this.serviceSelectionInstanceAnalysisParameters = serviceSelectionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return serviceSelectionInstanceAnalysisReport
  **/

  public Object getServiceSelectionInstanceAnalysisReport() {
    return serviceSelectionInstanceAnalysisReport;
  }

  public void setServiceSelectionInstanceAnalysisReport(Object serviceSelectionInstanceAnalysisReport) {
    this.serviceSelectionInstanceAnalysisReport = serviceSelectionInstanceAnalysisReport;
  }


}

