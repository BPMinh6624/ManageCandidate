/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managecandidate.View;

/**
 *
 * @author tuanh
 */
public class Validation {
    public boolean checkValidPhoneNumber(String num) {
		if (num.matches("\\d{10}")) {                              // so xuat hien 10 lan
			System.out.println("It is a valid phone number.");
			return true;
		}
		else
			System.out.println("Entered phone number is invalid.");
		return false;
	}
	
	public boolean checkValidBirthDate(int bd) {
		if (bd/1000 < 10 && bd/1000 > 0) {
			System.out.println("It is a valid birth date.");
			return true;
		}
		else
			System.out.println("Entered birth date is invalid. Number of birth should be 4 characters");
		return false;
	}
	
	public boolean checkValidEmail(String mail) {
		if (mail.matches("^(.+)@(\\S+)$")) {		// bdau bang bat ki ki tu nao ko bo trong @ phan cuoi ko co khoang trong
			System.out.println("It is a valid email.");
			return true;
		}
		else
			System.out.println("Entered email is invalid.");
		return false;
	}
        public boolean checkValidYear(int y) {
		if (y >= 0 && y <100 ) {
			System.out.println("It is valid.");
			return true;
		}
		else
			System.out.println("Entered number is invalid.");
		return false;
	}
        
	
	public boolean checkRankGra(String rank) {
		String[] ranks = {"Excellence", "Good", "Fair", "Poor"};
		if (isConsist(ranks, rank)) {
			System.out.println("It is a valid rank.");
			return true;
		}
		else
			System.out.println("Entered rank is invalid.");
		return false;
	}
	
	private boolean isConsist(String[] a, String x) {
		for(int i=0; i< a.length; i++)
			if (a[i].matches(x))
				return true;
		return false;
	}
}
