package _06_Hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor{



	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean performsSurgery() {
		return true;
	}

	@Override
	public boolean makesHouseCalls() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList getPatients() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
