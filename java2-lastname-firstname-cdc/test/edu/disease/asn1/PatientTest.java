package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class PatientTest {

	 Exposure exposure;
	 @Test
	 public void testSetPatientId()
		{
		    Patient Test = new Patient(3,3);
		    Test.setPatientId(UUID.randomUUID());
		  
		}
	 @Test
	 public void testGetPatientId()
		{
		    Patient Test = new Patient(3,3);
		    UUID f=Test.getPatientId();
		  
		}
	@Test
	public void testAddDisease()
	{
	    Patient Test = new Patient(3,3);
	    Test.addDiseaseId(UUID.randomUUID());
	    Test.addDiseaseId(UUID.randomUUID());
	    Test.addDiseaseId(UUID.randomUUID());
//	    Test.addDiseaseId(UUID.randomUUID());
		assertEquals(3, Test.getDiseaseIds().length);
	}
	@Test
	public void testAddExposure()
	{
		
	    Patient Test = new Patient(3,3);
	    Test.addExposure(exposure);
	    Test.addExposure(exposure);
	    Test.addExposure(exposure);
//	    Test.addExposure(exposure);
		assertEquals(3, Test.getExposures().length);
	}
	@Test
	public void testAddExposure1()
	{
		
	    Patient Test = new Patient(3,3);
	    Test.addExposure(exposure);
	    Test.addExposure(exposure);
	    Test.addExposure(exposure);
//	    Test.addExposure(exposure);
		assertEquals(3, Test.getExposures().length);
	}
}
