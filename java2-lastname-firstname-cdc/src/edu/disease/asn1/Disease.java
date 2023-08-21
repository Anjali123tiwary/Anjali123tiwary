package edu.disease.asn1;
import java.util.UUID;
public class Disease {
UUID patientId;
String name;
	public UUID getPatientId() {
	return patientId;
}
/**
 * 
 * @param patientId
 */
public void setPatientId(UUID patientId) {
	this.patientId = patientId;
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
	Disease other = (Disease) obj;
	if (patientId == null) {
		if (other.patientId != null)
			return false;
	} else if (!patientId.equals(other.patientId))
		return false;
	return true;
}

@Override
public String toString() {
	return "Disease [patientId=" + patientId + ", name=" + name + "]";
}


}
