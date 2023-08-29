package edu.disease.asn6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import edu.disease.asn3.Exposure;
public class Patient implements Comparable <Patient> ,Serializable{
	UUID patientId;
	String firstName;
	String LastName;
	List<Exposure>exposures;
	List<UUID>diseaseIds;
/**
 * 
 * @param maxDiseases
 * @param maxExposures
 */
	public Patient(int maxDiseases, int maxExposures) {
		if(maxDiseases>0 && maxExposures>0 ) {
			this.diseaseIds=new ArrayList<>(maxDiseases);
			this.exposures=new ArrayList<>(maxExposures);
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	
	@Override
public String toString() {
	return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", LastName=" + LastName + ", exposures="
			+ exposures + ", diseaseIds=" + diseaseIds + "]";
}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}
	public UUID getPatientId() {
		return patientId;
	}
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public List<Exposure> getExposures() {
		return exposures;
	}
	public void setExposures( List<Exposure>exposures) {
		this.exposures = exposures;
	}
	public List<UUID> getDiseaseIds() {
		return diseaseIds;
	}
	public void setDiseaseIds(List<UUID> diseaseIds) {
		this.diseaseIds = diseaseIds;
	}
	void addDiseaseId(UUID diseaseId) {
	
		for(int i=0;i<diseaseIds.size();i++) {
			if(i<diseaseIds.size()) {
				diseaseIds.set(i, diseaseId);
		}
			else {
				throw new IndexOutOfBoundsException();
			}
	}

}
	void addExposure(Exposure exposure) {
		for(int i=0;i<exposures.size();i++) {
			if(i<exposures.size()) {
				exposures.set(i, exposure);
		}
			else {
				throw new IndexOutOfBoundsException();
			}
	}
	}

	@Override
	public int compareTo(Patient o) {
		int lastComparison=o.LastName.compareToIgnoreCase(this.LastName);
		if(lastComparison==0) {
			return o.firstName.compareToIgnoreCase(this.firstName);
		}
		else {
			return lastComparison;
		}
		
	}

	

}

	




