package com.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUser {
		
	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if (pin == 4) {
			return true;
		} else {
			return false;			
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (confirmedAuthID == super.id) {
			return true;
		} else {
			return false;
		}
	}

}
