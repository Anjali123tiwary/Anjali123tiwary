package edu.disease.asn3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DiseaseFileRepository {
	
	void save(Disease[]diseases,Patient[]patients) throws IOException {
		FileOutputStream fos=new FileOutputStream("diseases.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(diseases);
		FileOutputStream fos1=new FileOutputStream("patients.dat");
		ObjectOutputStream oos1=new ObjectOutputStream(fos1);
		oos1.writeObject(patients);
	}
	
	DiseaseAndPatient init(String folderPath) throws IOException, ClassNotFoundException {

		FileInputStream fis=new FileInputStream("diseases.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Disease[] disease1=(Disease[])ois.readObject();
		
		FileInputStream fis1=new FileInputStream("diseases.dat");
		ObjectInputStream ois1=new ObjectInputStream(fis1);
		Patient[] patient1=(Patient[])ois.readObject();
		
		DiseaseAndPatient DAP=new DiseaseAndPatient(); 
		DAP.setDiseases(disease1);
		DAP.setPatients(patient1);
		return DAP;
		
		
	}
}
