package edu.disease.asn6;
import edu.disease.asn3.Disease;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import edu.disease.asn3.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager{
	private List<Disease> disease ;
	private List<Patient> patients;
	int i=0;
		public DiseaseControlManagerImpl(int maxDisease,int maxPatient) {
			if(maxDisease>0) {
				disease=new ArrayList<>(maxDisease);
				
			}
			else {
				throw new IllegalArgumentException("Invalid maxDisease");
			}
			if(maxPatient>0) {
				patients=new ArrayList<Patient>(maxPatient);
			}
			else {
				throw new IllegalArgumentException("Invalid maxPatient");
			}
		}
		@Override
		public Disease addDisease(String name, boolean infectious) {
			if(i<disease.size()) {
				if(infectious==true) {
					disease[i++]=new InfectiousDisease();
					return disease[i];
				}
				else {
					disease[i++]=new NonInfectiousDisease();
					return disease[i];
				}
			}
			else {
				throw new IllegalArgumentException("Limit reached");
			}
			
		}
		@Override
		public Disease getDisease(UUID diseaseId) {
			for (int i = 0; i < disease.size(); i++) {
				if(disease.get(i).getDiseaseId().equals(diseaseId)) {
					return (Disease) disease;
				}
			}
			return null;
		}
		@Override
		public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
			if(i<patients.size()) {
				patients=(List<Patient>) new Patient(maxDiseases, maxExposures);
				patients.setFirstName(i, firstName);
				patients[i].setLastName(i,lastName);
				return patients[i++];
			}
			else {
				throw new IllegalArgumentException("Limit reached");
			}
		
		}
		@Override
		public Patient getPatient(UUID patientId) {
			for (int i = 0; i < patients.size() ; i++) {
				if ((patients.get(i).patientId).equals(patientId)) {
					return (Patient) patients;
				}
			}
		return null;
			}
			
		@Override
		public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
			
			for(int i=0;i<patients.size();i++) {
				
				if(!patients.get(i).patientId.equals(patientId)) {
					throw new IllegalArgumentException("Not Found");
				}
			}
			
			for(int i=0;i<disease.size();i++) {
				if(!disease.get(i).diseaseId.equals(diseaseId)) {
					throw new IllegalArgumentException("Not Found");
				}
				else {
					patients.get(i).addDiseaseId(diseaseId);
				}
			}
		}
		
		@Override
		public List<Disease>getDiseases() {
			return this.disease;
		}
		@Override
		public List<Patient> getPatient() {
		return this.patients;
		}
		@Override
		public void addExposureToPatient(UUID patientId, Exposure exposure) {
			for(int i=0;i<patients.size();i++) {
				if(!patients.get(i).patientId.equals(patientId)) {
					throw new IllegalArgumentException("Not Found");
				}
				else {
					patients.get(i).addExposure(exposure);
					
				}
			}
			
		}
		
}
		
