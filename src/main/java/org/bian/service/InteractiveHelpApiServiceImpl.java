/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class InteractiveHelpApiServiceImpl implements InteractiveHelpApiService {

	public SDInteractiveHelpActivateOutputModel activate(SDInteractiveHelpActivateInputModel request){
		return JsonReader.read("activate-SDInteractiveHelpActivateOutputModel.json",new TypeReference<SDInteractiveHelpActivateOutputModel>(){});
	}
	
	public BQServiceSelectionCaptureOutputModel captureServiceselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSelectionCaptureInputModel request){
		return JsonReader.read("capture-BQServiceSelectionCaptureOutputModel.json",new TypeReference<BQServiceSelectionCaptureOutputModel>(){});
	}
	
	public SDInteractiveHelpConfigureOutputModel configure(String sdReferenceId, SDInteractiveHelpConfigureInputModel request){
		return JsonReader.read("configure-SDInteractiveHelpConfigureOutputModel.json",new TypeReference<SDInteractiveHelpConfigureOutputModel>(){});
	}
	
	public CRInteractiveHelpServiceOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRInteractiveHelpServiceOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRInteractiveHelpServiceOperatingSessionControlOutputModel.json",new TypeReference<CRInteractiveHelpServiceOperatingSessionControlOutputModel>(){});
	}
	
	public BQServiceSelectionExecuteOutputModel executeServiceselection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSelectionExecuteInputModel request){
		return JsonReader.read("execute-BQServiceSelectionExecuteOutputModel.json",new TypeReference<BQServiceSelectionExecuteOutputModel>(){});
	}
	
	public SDInteractiveHelpFeedbackOutputModel feedback(String sdReferenceId, SDInteractiveHelpFeedbackInputModel request){
		return JsonReader.read("feedback-SDInteractiveHelpFeedbackOutputModel.json",new TypeReference<SDInteractiveHelpFeedbackOutputModel>(){});
	}
	
	public CRInteractiveHelpServiceOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRInteractiveHelpServiceOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRInteractiveHelpServiceOperatingSessionInitiateOutputModel.json",new TypeReference<CRInteractiveHelpServiceOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQServiceSelectionInitiateOutputModel initiateServiceselection(String sdReferenceId, String crReferenceId, BQServiceSelectionInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceSelectionInitiateOutputModel.json",new TypeReference<BQServiceSelectionInitiateOutputModel>(){});
	}
	
	public CRInteractiveHelpServiceOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRInteractiveHelpServiceOperatingSessionRetrieveOutputModel.json",new TypeReference<CRInteractiveHelpServiceOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQServiceSelectionRetrieveOutputModel retrieveServiceselection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceSelectionRetrieveOutputModel.json",new TypeReference<BQServiceSelectionRetrieveOutputModel>(){});
	}
	
	public SDInteractiveHelpRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDInteractiveHelpRetrieveOutputModel.json",new TypeReference<SDInteractiveHelpRetrieveOutputModel>(){});
	}
	
}
