package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceSelectionRetrieveInputModelServiceSelectionInstanceAnalysis;
import org.bian.dto.BQServiceSelectionRetrieveInputModelServiceSelectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionRetrieveInputModel
 */
public class BQServiceSelectionRetrieveInputModel   {
  private Object serviceSelectionRetrieveActionTaskRecord = null;

  private String serviceSelectionRetrieveActionRequest = null;

  private BQServiceSelectionRetrieveInputModelServiceSelectionInstanceReport serviceSelectionInstanceReport = null;

  private BQServiceSelectionRetrieveInputModelServiceSelectionInstanceAnalysis serviceSelectionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceSelectionRetrieveActionTaskRecord
  **/

  public Object getServiceSelectionRetrieveActionTaskRecord() {
    return serviceSelectionRetrieveActionTaskRecord;
  }

  public void setServiceSelectionRetrieveActionTaskRecord(Object serviceSelectionRetrieveActionTaskRecord) {
    this.serviceSelectionRetrieveActionTaskRecord = serviceSelectionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceSelectionRetrieveActionRequest
  **/

  public String getServiceSelectionRetrieveActionRequest() {
    return serviceSelectionRetrieveActionRequest;
  }

  public void setServiceSelectionRetrieveActionRequest(String serviceSelectionRetrieveActionRequest) {
    this.serviceSelectionRetrieveActionRequest = serviceSelectionRetrieveActionRequest;
  }


  /**
   * Get serviceSelectionInstanceReport
   * @return serviceSelectionInstanceReport
  **/

  public BQServiceSelectionRetrieveInputModelServiceSelectionInstanceReport getServiceSelectionInstanceReport() {
    return serviceSelectionInstanceReport;
  }

  public void setServiceSelectionInstanceReport(BQServiceSelectionRetrieveInputModelServiceSelectionInstanceReport serviceSelectionInstanceReport) {
    this.serviceSelectionInstanceReport = serviceSelectionInstanceReport;
  }


  /**
   * Get serviceSelectionInstanceAnalysis
   * @return serviceSelectionInstanceAnalysis
  **/

  public BQServiceSelectionRetrieveInputModelServiceSelectionInstanceAnalysis getServiceSelectionInstanceAnalysis() {
    return serviceSelectionInstanceAnalysis;
  }

  public void setServiceSelectionInstanceAnalysis(BQServiceSelectionRetrieveInputModelServiceSelectionInstanceAnalysis serviceSelectionInstanceAnalysis) {
    this.serviceSelectionInstanceAnalysis = serviceSelectionInstanceAnalysis;
  }


}

