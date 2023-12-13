package com.aaJavaprograms;

import java.util.Scanner;

public class Conditional_Statement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name = sc.nextLine();
	System.out.println("Enter your RollNo: ");
	int rollNo = sc.nextInt();
	System.out.println("Enter your Tamil mark: ");
	int tamilMark = sc.nextInt();
	System.out.println("Enter your English mark: ");
	int englishMark = sc.nextInt();
	System.out.println("Enter your Mathemetics mark: ");
	int mathMark = sc.nextInt();
	System.out.println("Enter your Science mark: ");
	int scienceMark = sc.nextInt();
	System.out.println("Enter your Social mark: ");
	int socialMark = sc.nextInt();
	System.out.println();
	System.out.println("Candidate name: "+name+"\nRollno: "+rollNo);
	System.out.println();
	System.out.println("Subject        marks obtained for 100	Grade");
	System.out.println("__________________________________________");
	if (tamilMark>90 && tamilMark<=100) {
		System.out.println("Tamil			"+tamilMark+ "		A1");
	}else if (tamilMark>80 && tamilMark<=90) {
		System.out.println("Tamil			"+tamilMark+ "		A2");
	}else if (tamilMark>70 && tamilMark<=80) {
		System.out.println("Tamil			"+tamilMark+ "		B1");
	}else if (tamilMark>60 && tamilMark<=70) {
		System.out.println("Tamil			"+tamilMark+ "		B2");
	}else if (tamilMark>50 && tamilMark<=60) {
		System.out.println("Tamil			"+tamilMark+ "		C1");
	}else if (tamilMark>40 && tamilMark<=50) {
		System.out.println("Tamil			"+tamilMark+ "		C2");
	}else if (tamilMark>=35 && tamilMark<=40) {
		System.out.println("Tamil			"+tamilMark+ "		D");
	}else if (tamilMark>0 && tamilMark<35) {
		System.out.println("Tamil			"+tamilMark+ "		E");
	}
	if (englishMark>90 && englishMark<=100) {
		System.out.println("English			"+englishMark+ "		A1");
	}else if (englishMark>80 && englishMark<=90) {
		System.out.println("English			"+englishMark+ "		A2");
	}else if (englishMark>70 && englishMark<=80) {
		System.out.println("English			"+englishMark+ "		B1");
	}else if (englishMark>60 && englishMark<=70) {
		System.out.println("English			"+englishMark+ "		B2");
	}else if (englishMark>50 && englishMark<=60) {
		System.out.println("English			"+englishMark+ "		C1");
	}else if (englishMark>40 && englishMark<=50) {
		System.out.println("English			"+englishMark+ "		C2");
	}else if (englishMark>=35 && englishMark<=40) {
		System.out.println("English			"+englishMark+ "		D");
	}else if (englishMark>0 && englishMark<35) {
		System.out.println("English			"+englishMark+ "		E");
	}
	if (mathMark>90 && mathMark<=100) {
		System.out.println("Mathemetics		"+mathMark+ "		A1");
	}else if (mathMark>80 && mathMark<=90) {
		System.out.println("Mathemetics		"+mathMark+ "		A2");
	}else if (mathMark>70 && mathMark<=80) {
		System.out.println("Mathemetics		"+mathMark+ "		B1");
	}else if (mathMark>60 && mathMark<=70) {
		System.out.println("Mathemetics		"+mathMark+ "		B2");
	}else if (mathMark>50 && mathMark<=60) {
		System.out.println("Mathemetics		"+mathMark+ "		C1");
	}else if (mathMark>40 && mathMark<=50) {
		System.out.println("Mathemetics		"+mathMark+ "		C2");
	}else if (mathMark>=35 && mathMark<=40) {
		System.out.println("Mathemetics		"+mathMark+ "		D");
	}else if (mathMark>0 && mathMark<35) {
		System.out.println("Mathemetics		"+mathMark+ "		E");
	}
	if (scienceMark>90 && scienceMark<=100) {
		System.out.println("Science			"+scienceMark+ "		A1");
	}else if (scienceMark>80 && scienceMark<=90) {
		System.out.println("Science			"+scienceMark+ "		A2");
	}else if (scienceMark>70 && scienceMark<=80) {
		System.out.println("Science			"+scienceMark+ "		B1");
	}else if (scienceMark>60 && scienceMark<=70) {
		System.out.println("Science			"+scienceMark+ "		B2");
	}else if (scienceMark>50 && scienceMark<=60) {
		System.out.println("Science			"+scienceMark+ "		C1");
	}else if (scienceMark>40 && scienceMark<=50) {
		System.out.println("Science			"+scienceMark+ "		C2");
	}else if (scienceMark>=35 && scienceMark<=40) {
		System.out.println("Science			"+scienceMark+ "		D");
	}else if (scienceMark>0 && scienceMark<35) {
		System.out.println("Science			"+scienceMark+ "		E");
	}
	if (socialMark>90 && socialMark<=100) {
		System.out.println("Social			"+socialMark+ "		A1");
	}else if (socialMark>80 && socialMark<=90) {
		System.out.println("Social			"+socialMark+ "		A2");
	}else if (socialMark>70 && socialMark<=80) {
		System.out.println("Social			"+socialMark+ "		B1");
	}else if (socialMark>60 && socialMark<=70) {
		System.out.println("Social			"+socialMark+ "		B2");
	}else if (socialMark>50 && socialMark<=60) {
		System.out.println("Social			"+socialMark+ "		C1");
	}else if (socialMark>40 && socialMark<=50) {
		System.out.println("Social			"+socialMark+ "		C2");
	}else if (socialMark>=35 && socialMark<=40) {
		System.out.println("Social			"+socialMark+ "		D");
	}else if (socialMark>0 && socialMark<35) {
		System.out.println("Social			"+socialMark+ "		E");
	}
	System.out.println("__________________________________________");

	int total = tamilMark+englishMark+mathMark+scienceMark+socialMark;
	System.out.println("Total mark		: "+total);
	double percentage = total/5;
	System.out.println("Total Percentage 	: "+percentage);
	
	if (percentage>90 && percentage<=100) {
		System.out.println("Grade			: A1");
	}else if (percentage>80 && percentage<=90) {
		System.out.println("Grade			: A2");
	}else if (percentage>70 && percentage<=80) {
		System.out.println("Grade			: B1");
	}else if (percentage>60 && percentage<=70) {
		System.out.println("Grade			: B2");
	}else if (percentage>50 && percentage<=60) {
		System.out.println("Grade			: C1");
	}else if (percentage>40 && percentage<=50) {
		System.out.println("Grade			: C2");
	}else if (percentage>=35 && percentage<=40) {
		System.out.println("Grade			: D");
	}else if (percentage>0 && percentage<35) {
		System.out.println("Grade			: E");
	}
}
}
