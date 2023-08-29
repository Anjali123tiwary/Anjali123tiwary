package edu.disease.asn2;

import java.io.Serializable;

public class InfectiousDisease extends Disease  implements Serializable{

	@Override
	public String[] getExamples() {
		String[] DiseasesName = { "bacteria", "viruses", "fungi", "parasites" };
		return DiseasesName;

	}

}
