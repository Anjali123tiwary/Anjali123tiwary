package edu.disease.asn2;

import java.util.UUID;
public abstract class Disease  {
UUID diseaseId;
String name;

	public UUID getPatientId() {
	return diseaseId;
}
/**
 * 
 * @param patientId
 */
	
public void setPatientId(UUID diseaseId) {
	this.diseaseId = diseaseId;
}

public UUID getDiseaseId() {
	return diseaseId;
}
public void setDiseaseId(UUID diseaseId) {
	this.diseaseId = diseaseId;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
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
	Disease other = (Disease) obj;
	if (diseaseId == null) {
		if (other.diseaseId != null)
			return false;
	} else if (!diseaseId.equals(other.diseaseId))
		return false;
	return true;
}

@Override
public String toString() {
	return "Disease [patientId=" + diseaseId + ", name=" + name + "]";
}
public abstract String[] getExamples();

}
