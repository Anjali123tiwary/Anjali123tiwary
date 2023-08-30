package edu.disease.asn6;
import edu.disease.asn3.Disease;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.InfectiousDisease;
import edu.disease.asn3.NonInfectiousDisease;
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
				patients=new ArrayList<>(maxPatient);
			}
			else {
				throw new IllegalArgumentException("Invalid maxPatient");
			}
		}
		@Override
		public Disease addDisease(String name, boolean infectious) {
				if(infectious==true) {
					Disease d=new InfectiousDisease();
					return disease.get(i);
				}
				else {
					Disease d1=new NonInfectiousDisease();
					return disease.get(i);
				}
			
			
		}
		@Override
		public Disease getDisease(UUID diseaseId) {
			for (int i = 0; i < disease.size(); i++) {
				if(disease.get(i).getDiseaseId().equals(diseaseId)) {
					return disease.get(i);
				}
			}
			return null;
		}
		@Override
		public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
				Patient p=new Patient(maxDiseases, maxExposures);
				p.setFirstName(firstName);
				p.setLastName(lastName);
				return p;
	
		
		}
		@Override
		public Patient getPatient(UUID patientId) {
			
			Patient p=null;
				if ((p.patientId).equals(patientId)) {
					return p;
				}
			
		return null;
			}
			
		@Override
		public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
			int d=0,p=0;
			Patient c=null;
			Disease ds=null;
			for(Patient p1:patients) {
				
				if(p1.getPatientId().equals(patientId)) {
					p=1;
					c=p1;
					break;
				}
			}
			
			for(Disease df:disease)
			{
				if(df.getDiseaseId().equals(diseaseId))
				{
					ds=df;
					d=1;
					break;
				}
			}
			if(p==1&&d==1)
			{
				c.addDiseaseId(ds.getDiseaseId());
			}
			else {
				throw new IllegalArgumentException();
			}
		}
		
		@Override
		public List<Disease> getDiseases() {
			return this.disease;
		}
		@Override
		public List<Patient> getPatient() {
		return this.patients;
		}
		@Override
		public void addExposureToPatient(UUID patientId, Exposure exposure) {
			int p=0;
			Patient c=null;
			for(Patient p1:patients) {
				
				if(p1.getPatientId().equals(patientId)) {
					p=1;
					c=p1;
					break;
				}
			}
			
			if(p==1)
			{
				c.addExposure(exposure);
			}
			else {
				throw new IllegalArgumentException();
			}
			
		}
		
}
		