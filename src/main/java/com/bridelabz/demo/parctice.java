package com.bridelabz.demo;

import java.util.Scanner;


public class parctice {
	Scanner sc= new Scanner(System.in);
	static char[] board = new char[10];
	public static void createBoard() {
		
		
	for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		System.out.println();
		System.out.println("  " + board[1] + "  |  " + board[2] + "   | " + board[3] + "  ");
		System.out.println("------------------");
		System.out.println("  " + board[4] + "  |  " + board[5] + "   | " + board[6] + "  ");
		System.out.println("------------------");
		System.out.println("  " + board[7] + "  |  " + board[8] + "   | " + board[9] + "  ");

	}
	
	public void input() {
		System.out.println("Enter the input from user");
		
		char user=sc.next().charAt(0);
		System.out.println("input from user is"+ user);
		if(user=='x')
		{
			char computer='o';
			System.out.println("input from computer is"+ computer);
		}
		else {
			char computer='x';
			System.out.println("input from computer is"+ computer);
		}
	}
	public void move() {
		System.out.println("Enter the position: between 1 to 9");
		int userPosition= sc.nextInt();
		board[userPosition]='x';
		System.out.println("  " + board[1] + "  |  " + board[2] + "   | " + board[3] + "  ");
		System.out.println("------------------");
		System.out.println("  " + board[4] + "  |  " + board[5] + "   | " + board[6] + "  ");
		System.out.println("------------------");
		System.out.println("  " + board[7] + "  |  " + board[8] + "   | " + board[9] + "  ");

	}

	public static void main(String[] args) {
		parctice.createBoard();
		parctice par= new parctice();
		par.input();
		par.move();
		

	}
	

}
