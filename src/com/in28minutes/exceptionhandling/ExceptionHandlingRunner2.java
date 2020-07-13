package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner2 {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
			method1();
			System.out.println("Main Ended");

		}

		private static void method1() {
			method2();
			System.out.println("Method1 Ended");
		}

		private static void method2() {
			try { 
//				String str = null;
//				str.length();
				int[] i = {1,2};
				int number = i[3];
				System.out.println("Method2 Ended");
				
			} catch (NullPointerException ex) {
				System.out.println("NullPointerException");
				ex.printStackTrace();
				
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Matched ArrayIndexOutOfBoundsExecption");
				ex.printStackTrace();
				
			} catch (Exception ex) {
				System.out.println("Matched Exception");
				ex.printStackTrace();
			}
			
		}	
}
