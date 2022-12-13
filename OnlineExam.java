package com.beans;

import java.util.Scanner;

public class OnlineExam {
	public static void main(String[] args) {
		//Task 4
		//By Siddhi Girish Malwadkar.
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Welcome to Online Examination.");
		System.out.println("\n1.Login.\n2.Questions.\n3.Exit");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			String StudentName;
			 String Password;
			 Integer HallTicketNumber;
			 System.out.println("Enter your Name here:");
				StudentName=sc.next();
				System.out.println("Enter your Password here:");
				Password=sc.next();
				System.out.println("Enter your HallTicket Number only last 4 digits: ");
				HallTicketNumber=sc.nextInt();
		case 2:
			long StartTime=System.currentTimeMillis();
			long EndTime=StartTime+30;
			Integer Score=0;
			Integer Answer;
			System.out.println("Exam:");
			while(System.currentTimeMillis()<EndTime) {
				System.out.println("In this exam you have 5 questions which are all compulsory.The timelimit given");
				System.out.println("");
				System.out.println("Q1.Which of the following is advice supported by Advice Annotation:");
				System.out.println("1.@Before"+"\t"+"2.@After"+"\t"+"3.@AfterReturning"+"\t"+"4.All of the mentioned");
				System.out.println("Enter your answer:");
				Answer=sc.nextInt();
				System.out.println("You answer has been saved");
				if(Answer==4) {
					Score=Score+5;
				}else {
					Score--;
				}
				System.out.println("");
				System.out.println("Q2.An advice is an action which comes into play at pointcuts");
				System.out.println("1.True"+"\t"+"2.False");
				Answer=sc.nextInt();
				if(Answer==2) {
					Score=Score+5;
				}else {
					Score--;
				}
				System.out.println("Q3.Which class is available to all the class automatically");
				System.out.println("1.lang"+"\t"+"2.util"+"\t"+"3.awt");
				Answer=sc.nextInt();
				if(Answer==1) {
					Score=Score+5;
				}else {
					Score--;
				}
				System.out.println("Q4.Which component of Java is used to compile,debug and execute the java programs:");
				System.out.println("1.JRE"+"\t"+"2.JIT"+"\t"+"3.JDK"+"\t"+"4.JVM");
				Answer=sc.nextInt();
				if(Answer==3) {
					Score=Score+5;
				}else {
					Score--;
				}
				System.out.println("Q5.Which of the following is not an OOPS concept");
				System.out.println("1.Polymorphism"+"\t"+"2.Inheritance"+"\t"+"3.Compilation"+"\t"+"4.Encapsulation");
				Answer=sc.nextInt();
				if(Answer==3) {
					Score=Score+5;
				}else {
					Score--;
				}
				break;
			}
			System.out.println("");
			System.out.println("\nCongratulations!!Your exam has been finished!!\n");
			System.out.println("\nYour Score is:"+Score+"/25\n");
			break;
		case 3:
			System.exit(0);
			break;
			default:
				System.out.println("Sorry but Wrong Choice!!");
		}
		
		

		}
		
	
}


