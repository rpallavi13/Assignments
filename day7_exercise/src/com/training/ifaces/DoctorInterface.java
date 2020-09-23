package com.training.ifaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.training.doctor.Doctor;
//DAO of Doctor Class
public interface DoctorInterface {
 
	boolean add(Doctor doctor);
	//Find appointment for a specific doctor
	List<String> findAppointment(Doctor doctor);
	boolean cancelApp(String doctorName, String patientName);
}
