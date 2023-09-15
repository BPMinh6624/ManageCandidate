/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.managecandidate;

import java.util.Scanner;
import com.mycompany.managecandidate.Controller.CandidateList;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menu = {
			"Experince",
			"Fresher",
			"Intership",
			"Searching",
			"Exit"
		};
		CandidateList list = new CandidateList(); 
		int choice, check=1;
		do {
			choice = menu(menu);
			switch (choice) {
			case 1:
				list.input(sc, choice);
				break;
			case 2:
				list.input(sc, choice);
				break;
			case 3:
				list.input(sc, choice);
				break;
			case 4:
				list.search(sc);
				break;
			default:
				if(choice!=5) 
					System.out.println("Wrong number!!!");
				else check=0;
				break;
			}
		}
		while(check!=0);
	}
	private static int menu(String a[]) {
		
		System.out.println("--------------------MENU--------------------");
		for(int i=0;i<a.length;i++) 
			System.out.println((i+1)+".  "+ a[i]);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		return sc.nextInt();
	}
}
