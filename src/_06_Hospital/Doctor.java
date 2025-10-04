package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> patientList = new ArrayList<>();
	public void assignPatient(Patient patient) {
		patientList.add(patient);
	}
	
	public abstract void doMedicine();
	
	public abstract boolean performsSurgery();
	 
	public abstract boolean makesHouseCalls();
	
	public abstract ArrayList getPatients();
}
