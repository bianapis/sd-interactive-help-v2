package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis;
import org.bian.dto.CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionRetrieveInputModel
 */
public class CRInteractiveHelpServiceOperatingSessionRetrieveInputModel   {
  private Object interactiveHelpServiceOperatingSessionRetrieveActionTaskRecord = null;

  private String interactiveHelpServiceOperatingSessionRetrieveActionRequest = null;

  private CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord interactiveHelpServiceOperatingSessionInstanceReportRecord = null;

  private CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis interactiveHelpServiceOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return interactiveHelpServiceOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getInteractiveHelpServiceOperatingSessionRetrieveActionTaskRecord() {
    return interactiveHelpServiceOperatingSessionRetrieveActionTaskRecord;
  }

  public void setInteractiveHelpServiceOperatingSessionRetrieveActionTaskRecord(Object interactiveHelpServiceOperatingSessionRetrieveActionTaskRecord) {
    this.interactiveHelpServiceOperatingSessionRetrieveActionTaskRecord = interactiveHelpServiceOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return interactiveHelpServiceOperatingSessionRetrieveActionRequest
  **/

  public String getInteractiveHelpServiceOperatingSessionRetrieveActionRequest() {
    return interactiveHelpServiceOperatingSessionRetrieveActionRequest;
  }

  public void setInteractiveHelpServiceOperatingSessionRetrieveActionRequest(String interactiveHelpServiceOperatingSessionRetrieveActionRequest) {
    this.interactiveHelpServiceOperatingSessionRetrieveActionRequest = interactiveHelpServiceOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get interactiveHelpServiceOperatingSessionInstanceReportRecord
   * @return interactiveHelpServiceOperatingSessionInstanceReportRecord
  **/

  public CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord getInteractiveHelpServiceOperatingSessionInstanceReportRecord() {
    return interactiveHelpServiceOperatingSessionInstanceReportRecord;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReportRecord(CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord interactiveHelpServiceOperatingSessionInstanceReportRecord) {
    this.interactiveHelpServiceOperatingSessionInstanceReportRecord = interactiveHelpServiceOperatingSessionInstanceReportRecord;
  }


  /**
   * Get interactiveHelpServiceOperatingSessionInstanceAnalysis
   * @return interactiveHelpServiceOperatingSessionInstanceAnalysis
  **/

  public CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis getInteractiveHelpServiceOperatingSessionInstanceAnalysis() {
    return interactiveHelpServiceOperatingSessionInstanceAnalysis;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceAnalysis(CRInteractiveHelpServiceOperatingSessionRetrieveInputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis interactiveHelpServiceOperatingSessionInstanceAnalysis) {
    this.interactiveHelpServiceOperatingSessionInstanceAnalysis = interactiveHelpServiceOperatingSessionInstanceAnalysis;
  }


}

