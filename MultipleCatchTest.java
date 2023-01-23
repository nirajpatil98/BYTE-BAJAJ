package com.Assignment3.Exception;

import java.util.Scanner;

public class MultipleCatchTest {

	public static void main(String[] args) {
			try (Scanner scanner = new Scanner(System.in)) {
				
				int x,y;
				
				MultipleCatch multipleCatch = new MultipleCatch();
				x = scanner.nextInt();
				y = scanner.nextInt();
				multipleCatch.setA(x);
				multipleCatch.setB(y);
				multipleCatch.divison();
			
			}
		}
	}