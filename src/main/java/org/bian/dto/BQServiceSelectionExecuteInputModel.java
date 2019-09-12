package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceSelectionExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQServiceSelectionExecuteInputModel
 */
public class BQServiceSelectionExecuteInputModel   {
  private String interactiveHelpServiceOperatingSessionInstanceReference = null;

  private String serviceSelectionInstanceReference = null;

  private Object serviceSelectionExecuteActionTaskRecord = null;

  private BQServiceSelectionExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Interactive Help Service Operating Session instance 
   * @return interactiveHelpServiceOperatingSessionInstanceReference
  **/

  public String getInteractiveHelpServiceOperatingSessionInstanceReference() {
    return interactiveHelpServiceOperatingSessionInstanceReference;
  }

  public void setInteractiveHelpServiceOperatingSessionInstanceReference(String interactiveHelpServiceOperatingSessionInstanceReference) {
    this.interactiveHelpServiceOperatingSessionInstanceReference = interactiveHelpServiceOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Selection instance 
   * @return serviceSelectionInstanceReference
  **/

  public String getServiceSelectionInstanceReference() {
    return serviceSelectionInstanceReference;
  }

  public void setServiceSelectionInstanceReference(String serviceSelectionInstanceReference) {
    this.serviceSelectionInstanceReference = serviceSelectionInstanceReference;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceSelectionExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceSelectionExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

