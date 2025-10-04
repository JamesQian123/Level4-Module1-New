package _06_Hospital;

import java.util.ArrayList;

public class GeneralPractitioner extends Doctor{
	
	public ArrayList getPatients() {
		return patientList;
	}

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i = 0; i < patientList.size(); i++) {
			patientList.get(i).checkPulse();
		}
	}

	@Override
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
