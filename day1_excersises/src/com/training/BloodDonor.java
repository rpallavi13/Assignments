
package com.training;

public class BloodDonor {
	public String Name;
	public int age;
	public String bloodGroup;
	
	public BloodDonor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BloodDonor(String name, int age, String bloodGroup) {
		super();
		Name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public static void main(String[] args) {
	 BloodDonor bd =new BloodDonor("Rahul",45,"A+");
	 System.out.println(bd.getName()+" "+bd.getAge()+" "+bd.getBloodGroup());
	
	}

}

