/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyGradleProject;

import java.util.Scanner;

public class Library {
    public static void main(String [] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the first number : ");
    	int num1 = sc.nextInt();
    	System.out.println("Enter the second number : ");
    	int num2 = sc.nextInt();
    	System.out.println("The Sum of these two numbers is : "+(num1+num2));
    }
}
