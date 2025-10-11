package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> docList = new ArrayList<>();
	ArrayList<Patient> unassignedPatList = new ArrayList<>();

	public void addDoctor(Doctor doc) {
		docList.add(doc);
	}

	public void addPatient(Patient pat) {
		unassignedPatList.add(pat);
	}

	public ArrayList getDoctors() {

		return docList;
	}

	public ArrayList getPatients() {
		return unassignedPatList;
	}

	public void assignPatientsToDoctors() {
		addDoctor(new GeneralPractitioner());
		addDoctor(new Surgeon());
		addDoctor(new GeneralPractitioner());
		for (int i = 0; i < 8; i++) {
			addPatient(new Patient());
		}
		if (unassignedPatList.size() > 0) {
			for (int i = 0; i < unassignedPatList.size(); i++) {
				try {
					docList.get(i % docList.size()).assignPatient(unassignedPatList.get(i));
					

				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.threeOnly();
				}
			}
		}
	}
}
