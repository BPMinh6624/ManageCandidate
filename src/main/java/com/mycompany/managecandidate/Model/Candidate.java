/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managecandidate.Model;

import java.util.Scanner;
import com.mycompany.managecandidate.View.Validation;

public class Candidate {
	private int id;
	private String fName, lName, gender, email, phone, address, type;//First name & Last name
	private int birthDate;
        Validation val = new Validation();
	
	public Candidate() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void input(Scanner s) {
		System.out.print("Enter id: ");
		id = s.nextInt();
		s.nextLine();
		System.out.print("Enter first name: ");
		fName = s.nextLine();
		System.out.print("Enter last name: ");
		lName = s.nextLine();
		System.out.print("Enter birth date (xxxx): ");
		do{birthDate = s.nextInt();}
		while(!val.checkValidBirthDate(birthDate));
		s.nextLine();
		System.out.print("Enter address: ");
		address = s.nextLine();
		System.out.print("Enter phone number(10 digits): ");
		do{phone = s.nextLine();}
		while(!val.checkValidPhoneNumber(phone));
		System.out.print("Enter email: ");
		do{email = s.nextLine();}
		while(!val.checkValidEmail(email));
	}

    @Override
    public String toString() {
        return  "ID: " + id + " | " + " " + fName +" " + lName + " | " +"Email: " + email +" | " + "Phone number: " + phone + " | " +" Address:" + address +" | " + "Candidate type: " + type + " | " +" BirthDate: " + birthDate ;
    }
        
		 
	public String getFullName() {
		return lName +" " + fName;
	}
	
	
}
