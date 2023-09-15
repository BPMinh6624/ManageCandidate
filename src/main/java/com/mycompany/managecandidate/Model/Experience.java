/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managecandidate.Model;

import com.mycompany.managecandidate.View.Validation;
import java.util.Scanner;

public class Experience extends Candidate {
	private int expYear; // year of experience
	private String proSkill;// Professional Skill
        Validation val = new Validation();
	public Experience() {
		super();
	}
	public int getExpYear() {
		return expYear;
	}
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	public void input(Scanner s) {
		super.input(s);
		super.setType("Experience");
		System.out.print("Enter year of experience (0-100): ");
		do{expYear = s.nextInt();}
		while(!val.checkValidYear(expYear));
		s.nextLine();
		System.out.print("Enter professional skill: ");
		proSkill = s.nextLine();
	}
	public void show() {
		super.toString();
		System.out.print(expYear);
		System.out.print(" | ");
		System.out.print(proSkill);
		System.out.print(" | ");
		System.out.println();
	}
	
	
}

