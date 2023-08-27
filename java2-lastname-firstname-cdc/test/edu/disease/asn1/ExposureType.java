package edu.disease.asn1;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class ExposureType {
	
	final UUID uuid = UUID.randomUUID();
    private Exposure exposure;
	
	@Test
	public void setUp() {
		exposure = new Exposure(uuid);
		exposure.setExposureType("D");
	}
	
	@Test
	public void testPatientPostiveScenario() {
		exposure = new Exposure(uuid);
		assertNotNull(exposure.toString());
		exposure.setExposureType("I");
		assertEquals("I", exposure.getExposureType());
		System.out.println(exposure.getExposureType());
		assertNotNull(exposure.hashCode());
		final Exposure exposureObj = exposure;
		assertTrue(exposure.equals(exposureObj));
		assertTrue(exposure.equals(exposure));
		assertFalse(exposure.equals(null));
		final Exposure exposureObjEquals = new Exposure(exposure.getPatientId());
		exposureObjEquals.setExposureType("I");
		assertTrue(exposure.equals(exposureObjEquals));
		assertFalse(exposure.equals(null));
		assertFalse(exposure.equals(exposureObjEquals));
		assertFalse(exposure.equals(exposureObjEquals));
		assertFalse(exposure.equals(exposureObjEquals));
		
	}
}
