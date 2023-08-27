package edu.disease.asn3;

import java.io.Serializable;

import edu.disease.asn3.Disease;

public class NonInfectiousDisease extends Disease implements Serializable{

	@Override
	public String[] getExamples() {
		String[] DiseasesName= {"Diabetes","cancers","respiratory","Mental health"};
		return DiseasesName;
	}

}
