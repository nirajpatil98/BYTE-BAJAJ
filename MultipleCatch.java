package com.Assignment3.Exception;

public class MultipleCatch {
	
	int a;
	int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void divison() {
		try
		{
			int k = a/b;
			System.out.println("Quotient :" + k);
			Thread.sleep(10000);
		}
		catch (ArithmeticException e) {
			System.out.println("Can not be divided by zero");
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Interrupted exception Handled");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Always Executed Finally");
		}
	}	

}
