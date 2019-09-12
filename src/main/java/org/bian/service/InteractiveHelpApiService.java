/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface InteractiveHelpApiService {

	SDInteractiveHelpActivateOutputModel activate(SDInteractiveHelpActivateInputModel request);
	
	BQServiceSelectionCaptureOutputModel captureServiceselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSelectionCaptureInputModel request);
	
	SDInteractiveHelpConfigureOutputModel configure(String sdReferenceId, SDInteractiveHelpConfigureInputModel request);
	
	CRInteractiveHelpServiceOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRInteractiveHelpServiceOperatingSessionControlInputModel request);
	
	BQServiceSelectionExecuteOutputModel executeServiceselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSelectionExecuteInputModel request);
	
	SDInteractiveHelpFeedbackOutputModel feedback(String sdReferenceId, SDInteractiveHelpFeedbackInputModel request);
	
	CRInteractiveHelpServiceOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRInteractiveHelpServiceOperatingSessionInitiateInputModel request);
	
	BQServiceSelectionInitiateOutputModel initiateServiceselection(String sdReferenceId, String crReferenceId, BQServiceSelectionInitiateInputModel request);
	
	CRInteractiveHelpServiceOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQServiceSelectionRetrieveOutputModel retrieveServiceselection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDInteractiveHelpRetrieveOutputModel retrieveSD(String sdReferenceId);
	
}
