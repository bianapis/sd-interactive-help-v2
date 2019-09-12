package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionExecuteOutputModel
 */
public class BQServiceSelectionExecuteOutputModel   {
  private String serviceSelectionExecuteActionTaskReference = null;

  private Object serviceSelectionExecuteActionTaskRecord = null;

  private String serviceSelectionExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Selection instance execute service call 
   * @return serviceSelectionExecuteActionTaskReference
  **/

  public String getServiceSelectionExecuteActionTaskReference() {
    return serviceSelectionExecuteActionTaskReference;
  }

  public void setServiceSelectionExecuteActionTaskReference(String serviceSelectionExecuteActionTaskReference) {
    this.serviceSelectionExecuteActionTaskReference = serviceSelectionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return serviceSelectionExecuteActionTaskRecord
  **/

  public Object getServiceSelectionExecuteActionTaskRecord() {
    return serviceSelectionExecuteActionTaskRecord;
  }

  public void setServiceSelectionExecuteActionTaskRecord(Object serviceSelectionExecuteActionTaskRecord) {
    this.serviceSelectionExecuteActionTaskRecord = serviceSelectionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Selection execute transaction/record 
   * @return serviceSelectionExecuteRecordReference
  **/

  public String getServiceSelectionExecuteRecordReference() {
    return serviceSelectionExecuteRecordReference;
  }

  public void setServiceSelectionExecuteRecordReference(String serviceSelectionExecuteRecordReference) {
    this.serviceSelectionExecuteRecordReference = serviceSelectionExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

