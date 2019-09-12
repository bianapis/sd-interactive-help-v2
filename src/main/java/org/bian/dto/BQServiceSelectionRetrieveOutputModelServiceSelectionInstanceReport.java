package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceReport
 */
public class BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceReport   {
  private Object serviceSelectionInstanceReportRecord = null;

  private String serviceSelectionInstanceReportType = null;

  private String serviceSelectionInstanceReportParameters = null;

  private Object serviceSelectionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return serviceSelectionInstanceReportRecord
  **/

  public Object getServiceSelectionInstanceReportRecord() {
    return serviceSelectionInstanceReportRecord;
  }

  public void setServiceSelectionInstanceReportRecord(Object serviceSelectionInstanceReportRecord) {
    this.serviceSelectionInstanceReportRecord = serviceSelectionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return serviceSelectionInstanceReportType
  **/

  public String getServiceSelectionInstanceReportType() {
    return serviceSelectionInstanceReportType;
  }

  public void setServiceSelectionInstanceReportType(String serviceSelectionInstanceReportType) {
    this.serviceSelectionInstanceReportType = serviceSelectionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return serviceSelectionInstanceReportParameters
  **/

  public String getServiceSelectionInstanceReportParameters() {
    return serviceSelectionInstanceReportParameters;
  }

  public void setServiceSelectionInstanceReportParameters(String serviceSelectionInstanceReportParameters) {
    this.serviceSelectionInstanceReportParameters = serviceSelectionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return serviceSelectionInstanceReport
  **/

  public Object getServiceSelectionInstanceReport() {
    return serviceSelectionInstanceReport;
  }

  public void setServiceSelectionInstanceReport(Object serviceSelectionInstanceReport) {
    this.serviceSelectionInstanceReport = serviceSelectionInstanceReport;
  }


}

