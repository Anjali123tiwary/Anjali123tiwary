package edu.disease.asn3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;

import edu.disease.asn3.Exposure;
public class Patient implements Comparable <Patient> ,Serializable{
	UUID patientId;
	String firstName;
	String LastName;
	Exposure[] exposures;
	UUID [] diseaseIds;
/**
 * 
 * @param maxDiseases
 * @param maxExposures
 */
	public Patient(int maxDiseases, int maxExposures) {
		if(maxDiseases>0 && maxExposures>0 ) {
			this.diseaseIds=new UUID[maxDiseases];
			this.exposures=new Exposure[maxExposures];
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
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
	public Exposure[] getExposures() {
		return exposures;
	}
	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}
	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}
	public void setDiseaseIds(UUID[] diseaseIds) {
		this.diseaseIds = diseaseIds;
	}
	void addDiseaseId(UUID diseaseId) {
	
		for(int i=0;i<diseaseIds.length;i++) {
			if(i<diseaseIds.length) {
				diseaseIds[i]=diseaseId;
		}
			else {
				throw new IndexOutOfBoundsException();
			}
	}

}
	void addExposure(Exposure exposure) {
		for(int i=0;i<exposures.length;i++) {
			if(i<exposures.length) {
				exposures[i]=exposure;
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

	



