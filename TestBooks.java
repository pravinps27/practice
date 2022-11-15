package com.chainsys.day2;

import java.util.Scanner;

public class TestBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books bk=new Books();
		
		Scanner ac=new Scanner(System.in);
		
		System.out.println("Enter Book Name:");
		String bookName= ac.next();
		bk.bookName=bookName;
		
		
		System.out.println("Enter Author Name:");
		String author=ac.next();
		bk.authorName=author;
		
		System.out.println("Enter Book Edition:");
		int edition=ac.nextInt();
		bk.edition=edition;
		
		System.out.println("Your book Name is:"+bk.bookName);
		System.out.println("Your Author name is:"+bk.authorName);
		System.out.println("Your Book Edition is:"+edition);
		
		
	}

}
