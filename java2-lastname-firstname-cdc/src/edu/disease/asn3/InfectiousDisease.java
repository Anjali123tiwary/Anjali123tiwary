package edu.disease.asn3;


import java.io.Serializable;

import edu.disease.asn3.Disease;

public class InfectiousDisease extends Disease implements Serializable {

	@Override
	public String[] getExamples() {
		String[] DiseasesName= {"bacteria","viruses","fungi","parasites"};
		return DiseasesName;

	}

	

}
