package com.training.doctor;

import java.util.HashMap;
import java.util.List;

public class Doctor {
 private String doctorName;
 private String patientName;
public Doctor() {
	super();
}

//Initialize private members using constructor
public Doctor(String doctorName, String patientName) {
	super();
	this.doctorName = doctorName;
	this.patientName = patientName;
}
//Getter methods
public String getDoctorName() {
	return doctorName;
}
public String getPatientName() {
	return patientName;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
