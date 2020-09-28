package com.training.application;

import java.util.ArrayList;
import java.util.List;

import com.training.doctor.Doctor;
import com.training.implementation.DocImplementation;

public class Application {
	public void printApp(List<String> list)
	{
		for(String patientList : list)
		{
			System.out.print(patientList+" ");
		}
	}

	public static void main(String[] args) {
	
		DocImplementation service=new DocImplementation();
		Doctor doc1=new Doctor("RAM","SHYAM");
		Doctor doc2=new Doctor("ARYA","NIDHI");
		Doctor doc3=new Doctor("RAM","SHRUTI");
		Doctor doc4=new Doctor("ARYA","VIDHI");
		//Add appointments for respective doctors
		service.add(doc1);
		service.add(doc2);
		service.add(doc3);
		service.add(doc4);
		List<String> list= service.findAppointment(doc1);
		Application app=new Application();
		System.out.println("The appointments for Dr."+doc1.getDoctorName()+" are:");
		app.printApp(list);
		
		//Remove a specific appointment for a doctor
		System.out.println("\n"+service.cancelApp("RAM","SHRUTI"));
		app.printApp(service.findAppointment(doc1));
		
	}

}
