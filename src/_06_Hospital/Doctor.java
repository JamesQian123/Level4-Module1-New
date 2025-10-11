package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> patientList = new ArrayList<>();
	public void assignPatient(Patient patient) throws DoctorFullException{
		patientList.add(patient);
		if(patientList.size() > 3) {
			patientList.remove(3);
			throw new DoctorFullException();
		}
	}
	public abstract void doMedicine();
	
	public abstract boolean performsSurgery();
	 
	public abstract boolean makesHouseCalls();
	
	public ArrayList getPatients() {
		return patientList;
	}
}
