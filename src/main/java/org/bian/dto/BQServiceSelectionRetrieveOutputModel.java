package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceAnalysis;
import org.bian.dto.BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionRetrieveOutputModel
 */
public class BQServiceSelectionRetrieveOutputModel   {
  private String serviceSelectionRetrieveActionTaskReference = null;

  private Object serviceSelectionRetrieveActionTaskRecord = null;

  private String serviceSelectionRetrieveActionResponse = null;

  private BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceReport serviceSelectionInstanceReport = null;

  private BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceAnalysis serviceSelectionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Selection instance retrieve service call 
   * @return serviceSelectionRetrieveActionTaskReference
  **/

  public String getServiceSelectionRetrieveActionTaskReference() {
    return serviceSelectionRetrieveActionTaskReference;
  }

  public void setServiceSelectionRetrieveActionTaskReference(String serviceSelectionRetrieveActionTaskReference) {
    this.serviceSelectionRetrieveActionTaskReference = serviceSelectionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return serviceSelectionRetrieveActionResponse
  **/

  public String getServiceSelectionRetrieveActionResponse() {
    return serviceSelectionRetrieveActionResponse;
  }

  public void setServiceSelectionRetrieveActionResponse(String serviceSelectionRetrieveActionResponse) {
    this.serviceSelectionRetrieveActionResponse = serviceSelectionRetrieveActionResponse;
  }


  /**
   * Get serviceSelectionInstanceReport
   * @return serviceSelectionInstanceReport
  **/

  public BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceReport getServiceSelectionInstanceReport() {
    return serviceSelectionInstanceReport;
  }

  public void setServiceSelectionInstanceReport(BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceReport serviceSelectionInstanceReport) {
    this.serviceSelectionInstanceReport = serviceSelectionInstanceReport;
  }


  /**
   * Get serviceSelectionInstanceAnalysis
   * @return serviceSelectionInstanceAnalysis
  **/

  public BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceAnalysis getServiceSelectionInstanceAnalysis() {
    return serviceSelectionInstanceAnalysis;
  }

  public void setServiceSelectionInstanceAnalysis(BQServiceSelectionRetrieveOutputModelServiceSelectionInstanceAnalysis serviceSelectionInstanceAnalysis) {
    this.serviceSelectionInstanceAnalysis = serviceSelectionInstanceAnalysis;
  }


}

