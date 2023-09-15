/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.managecandidate.Model;

import com.mycompany.managecandidate.View.Validation;
import java.util.Scanner;

public class Fresher extends Candidate {
	private int graTime;// graduated time
	private String  graRank, edu;// Rank of graduation, university
        private Validation val;
	public Fresher() {
		super();
	}
	public int getGraTime() {
		return graTime;
	}
	public void setGraTime(int graTime) {
		this.graTime = graTime;
	}
	public String getGraRank() {
		return graRank;
	}
	public void setGraRank(String graRank) {
		this.graRank = graRank;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	
	public void input(Scanner s) {
		super.input(s);
		super.setType("Fresher");
		System.out.print("Enter graduated time: ");
		graTime = s.nextInt();
		System.out.print("Enter rank of graduation (Excellence-Good-Fair-Poor): ");
		do{graRank = s.nextLine();}
		while(!val.checkRankGra(graRank));
		System.out.print("Enter candidate's university: ");
		edu = s.nextLine();
                
	}
	
	public void show() {
		super.toString();
		System.out.print(graTime);
		System.out.print(" | ");
		System.out.print(graRank);
		System.out.print(" | ");
		System.out.print(edu);
		System.out.print(" | ");
		System.out.println();
	}
}
