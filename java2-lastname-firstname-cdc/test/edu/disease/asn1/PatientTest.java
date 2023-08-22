package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.UUID;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PatientTest {
private Patient patient;
	
	 private static final String FIRST_NAME = "Anjali";
	 private static final String LAST_NAME = "kumari";
	 private Exposure exposure;
	 @Test
		public void setUp() {
			final UUID uuid = UUID.randomUUID();
			exposure = new Exposure(uuid);
//			exposure.setDateTime(LocalDateTime.now());
			exposure.setExposureType("D");
			patient = new Patient(1,1);
			patient.setDiseaseIds(new UUID[] {UUID.randomUUID(), UUID.randomUUID()});
			patient.setExposures(new Exposure[] {exposure});
			patient.setFirstName(FIRST_NAME);
			patient.setLastName(LAST_NAME);
			patient.setPatientId(uuid);
			//patient.getFirstName();
		}
	 @Test
		public void testPatientPostiveScenario()
		{
		 final UUID uuid = UUID.randomUUID();
		 exposure = new Exposure(uuid);
//			exposure.setDateTime(LocalDateTime.now());
			exposure.setExposureType("D");
			patient = new Patient(1,1);
			patient.setDiseaseIds(new UUID[] {UUID.randomUUID(), UUID.randomUUID()});
			patient.setExposures(new Exposure[] {exposure});
			patient.setFirstName(FIRST_NAME);
			patient.setLastName(LAST_NAME);
			patient.setPatientId(uuid);
		 System.out.println(patient.getFirstName());
			assertNotNull(patient.toString());
			assertNotNull(patient.getDiseaseIds());
			assertNotNull(patient.getExposures());
			assertNotNull(patient.getFirstName());
			assertNotNull(patient.getLastName());
//			assertNotNull(patient.hashCode());
			assertNotNull(patient.getPatientId());
//			final Patient patientObj = patient;
//			assertTrue(patient.equals(patientObj));
//			assertTrue(patient.equals(patient));
//			assertFalse(patient.equals(null));
			final Patient patientObjEquals = new Patient(1,1);
			patientObjEquals.setPatientId(patient.getPatientId());
			assertTrue(patient.equals(patientObjEquals));
			assertFalse(patient.equals(null));
			patientObjEquals.setPatientId(null);
			assertFalse(patient.equals(patientObjEquals));
			
		}
	 @Test
	 public void testGetPatientId()
		{
		    Patient Test = new Patient(3,3);
		    UUID f=Test.getPatientId();
		}
	 @Test
	 public void testSetPatientId()
		{
		    Patient Test = new Patient(3,3);
		    Test.setPatientId(UUID.randomUUID());
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
