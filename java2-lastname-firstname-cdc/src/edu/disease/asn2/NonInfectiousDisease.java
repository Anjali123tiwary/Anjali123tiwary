package edu.disease.asn2;

import java.io.Serializable;

public class NonInfectiousDisease extends Disease implements Serializable{

	@Override
	public String[] getExamples() {
		String[] DiseasesName= {"Diabetes","cancers","respiratory","Mental health"};
		return DiseasesName;
	}

}
