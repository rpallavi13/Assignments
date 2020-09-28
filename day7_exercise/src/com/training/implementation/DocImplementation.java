package com.training.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.doctor.Doctor;
import com.training.ifaces.DoctorInterface;

public class DocImplementation implements DoctorInterface {
//Use of HashMap to store doctor and appointment list data
private Map<String,List<String>> mapStore;

	
	public DocImplementation() {
	super();
	mapStore=new HashMap<String,List<String>>();
	
}

	@Override
	public boolean add(Doctor doctor) {
		//If a Doctor already has some appointments then add new appointments to that same list
		if(mapStore.containsKey(doctor.getDoctorName()))
		{
			return (mapStore.get(doctor.getDoctorName())).add(doctor.getPatientName());
		}
		//If it's a doctor's first appointment create new list
		else
		{	ArrayList<String> list=new ArrayList<String>();
			list.add(doctor.getPatientName());
			mapStore.put(doctor.getDoctorName(),list);
			return true;
		}
		
	}

	@Override
	public List<String> findAppointment(Doctor doctor) {
		return  mapStore.get(doctor.getDoctorName());
	}

	@Override
	public boolean cancelApp(String doctorName, String patientName) {
		try
		{
			List<String> removalList=mapStore.get(doctorName);
			return removalList.remove(patientName);
		}
		//Check NullPointerException if removalList is pointing to null
		catch(NullPointerException e)
		{
			System.out.println("No DOCTOR WITH THAT NAME EXISTS IN OUR RECORDS");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
		
	}



}
