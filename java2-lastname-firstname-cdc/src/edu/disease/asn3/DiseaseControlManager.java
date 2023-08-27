package edu.disease.asn3;


import java.util.UUID;

import edu.disease.asn3.Exposure;

public interface DiseaseControlManager {
		 Disease addDisease(String name,boolean infectious);
		 Disease getDisease(UUID diseaseId);
		 Patient addPatient(String firstName,String lastName,int maxDiseases,int maxExposures);
		 Patient getPatient(UUID patientId);
		 void addDiseaseToPatient(UUID patientId,UUID diseaseId);
		 void addExposureToPatient(UUID patientId,Exposure exposure);
		 Disease[] getDiseases();
		 Patient[] getPatient();
		
}
