package edu.disease.asn3;
import edu.disease.asn3.Disease;
import java.util.UUID;
import edu.disease.asn3.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager{
	private Disease[] disease ;
	private Patient[] patients;
	int i=0;
		public DiseaseControlManagerImpl(int maxDisease,int maxPatient) {
			if(maxDisease>0) {
				disease=new Disease[maxDisease];
				
			}
			else {
				throw new IllegalArgumentException("Invalid maxDisease");
			}
			if(maxPatient>0) {
				patients=new Patient[maxPatient];
			}
			else {
				throw new IllegalArgumentException("Invalid maxPatient");
			}
		}
		@Override
		public Disease addDisease(String name, boolean infectious) {
			if(i<disease.length) {
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
			for (int i = 0; i < disease.length; i++) {
				if(disease[i].getDiseaseId().equals(diseaseId)) {
					return disease[i];
				}
			}
			return null;
		}
		@Override
		public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
			if(i<patients.length) {
				patients[i]=new Patient(maxDiseases, maxExposures);
				patients[i].setFirstName(firstName);
				patients[i].setLastName(lastName);
				return patients[i++];
			}
			else {
				throw new IllegalArgumentException("Limit reached");
			}
		
		}
		@Override
		public Patient getPatient(UUID patientId) {
			Patient p1=null;
			for (int i = 0; i < patients.length ; i++) {
				if ((patients[i].patientId).equals(patientId)) {
					return patients[i];
				}
			}
		return null;
			}
			
		@Override
		public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
			
			for(int i=0;i<patients.length;i++) {
				
				if(!patients[i].patientId.equals(patientId)) {
					throw new IllegalArgumentException("Not Found");
				}
			}
			
			for(int i=0;i<disease.length;i++) {
				if(!disease[i].diseaseId.equals(diseaseId)) {
					throw new IllegalArgumentException("Not Found");
				}
				else {
					patients[i].addDiseaseId(diseaseId);
				}
			}
		}
		
		@Override
		public Disease[] getDiseases() {
			return this.disease;
		}
		@Override
		public Patient[] getPatient() {
		return this.patients;
		}
		@Override
		public void addExposureToPatient(UUID patientId, Exposure exposure) {
			for(int i=0;i<patients.length;i++) {
				if(!patients[i].patientId.equals(patientId)) {
					throw new IllegalArgumentException("Not Found");
				}
				else {
					patients[i].addExposure(exposure);
				}
			}
			
		}
		
}
		