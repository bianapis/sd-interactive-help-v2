package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis;
import org.bian.dto.CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRInteractiveHelpServiceOperatingSessionRetrieveOutputModel
 */
public class CRInteractiveHelpServiceOperatingSessionRetrieveOutputModel   {
  private Object interactiveHelpServiceOperatingSessionInstanceRecord = null;

  private String interactiveHelpServiceOperatingSessionRetrieveActionTaskReference = null;

  private Object interactiveHelpServiceOperatingSessionRetrieveActionTaskRecord = null;

  private String interactiveHelpServiceOperatingSessionRetrieveActionResponse = null;

  private CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord interactiveHelpServiceOperatingSessionInstanceReportRecord = null;

  private CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis interactiveHelpServiceOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Operational service that provides context specific servicing guidance to employees and self-service customers 
   * @return interactiveHelpServiceOperatingSessionInstanceRecord
  **/

  public Object getInteractiveHelpServiceOperatingSessionInstanceRecord() {
    return interactiveHelpServiceOperatingSessionInstanceRecord;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceRecord(Object interactiveHelpServiceOperatingSessionInstanceRecord) {
    this.interactiveHelpServiceOperatingSessionInstanceRecord = interactiveHelpServiceOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Interactive Help Service Operating Session instance retrieve service call 
   * @return interactiveHelpServiceOperatingSessionRetrieveActionTaskReference
  **/

  public String getInteractiveHelpServiceOperatingSessionRetrieveActionTaskReference() {
    return interactiveHelpServiceOperatingSessionRetrieveActionTaskReference;
  }

  public void setInteractiveHelpServiceOperatingSessionRetrieveActionTaskReference(String interactiveHelpServiceOperatingSessionRetrieveActionTaskReference) {
    this.interactiveHelpServiceOperatingSessionRetrieveActionTaskReference = interactiveHelpServiceOperatingSessionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return interactiveHelpServiceOperatingSessionRetrieveActionResponse
  **/

  public String getInteractiveHelpServiceOperatingSessionRetrieveActionResponse() {
    return interactiveHelpServiceOperatingSessionRetrieveActionResponse;
  }

  public void setInteractiveHelpServiceOperatingSessionRetrieveActionResponse(String interactiveHelpServiceOperatingSessionRetrieveActionResponse) {
    this.interactiveHelpServiceOperatingSessionRetrieveActionResponse = interactiveHelpServiceOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get interactiveHelpServiceOperatingSessionInstanceReportRecord
   * @return interactiveHelpServiceOperatingSessionInstanceReportRecord
  **/

  public CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord getInteractiveHelpServiceOperatingSessionInstanceReportRecord() {
    return interactiveHelpServiceOperatingSessionInstanceReportRecord;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReportRecord(CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceReportRecord interactiveHelpServiceOperatingSessionInstanceReportRecord) {
    this.interactiveHelpServiceOperatingSessionInstanceReportRecord = interactiveHelpServiceOperatingSessionInstanceReportRecord;
  }


  /**
   * Get interactiveHelpServiceOperatingSessionInstanceAnalysis
   * @return interactiveHelpServiceOperatingSessionInstanceAnalysis
  **/

  public CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis getInteractiveHelpServiceOperatingSessionInstanceAnalysis() {
    return interactiveHelpServiceOperatingSessionInstanceAnalysis;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceAnalysis(CRInteractiveHelpServiceOperatingSessionRetrieveOutputModelInteractiveHelpServiceOperatingSessionInstanceAnalysis interactiveHelpServiceOperatingSessionInstanceAnalysis) {
    this.interactiveHelpServiceOperatingSessionInstanceAnalysis = interactiveHelpServiceOperatingSessionInstanceAnalysis;
  }


}

