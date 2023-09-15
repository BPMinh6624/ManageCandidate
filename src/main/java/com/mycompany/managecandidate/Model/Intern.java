/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managecandidate.Model;

import java.util.Scanner;

public class Intern extends Candidate {
	private String majors, semester, edu;//university name

	public Intern() {
		super();
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}
	
	public void input(Scanner s) {
		super.input(s);
		super.setType("Intern");
		System.out.print("Enter professional majors: ");
		majors = s.nextLine();
		System.out.print("Enter professional semester: ");
		semester = s.nextLine();
		System.out.print("Enter candidate's university: ");
		edu = s.nextLine();
	}
	
	public void show() {
		super.toString();
		System.out.print(majors);
		System.out.print(" | ");
		System.out.print(semester);
		System.out.print(" | ");
		System.out.print(edu);
		System.out.print(" | ");
		System.out.println();
	}
}