package CoreJavaControlFlow;
import java.util.Scanner;
public class CoreJavaControlFlow {
    public static void main(String[] args) {

//        Write a program that declares 1 integer variable x, and then assigns 7 to it.
//        Write an if statement to print out “Less than 10” if x is less than 10.
//        Change x to equal 15 and notice the result (console should not display anything).
          int x = 7;
          if (x < 10) {
              x = 15;
          } // end if

//        Write a program that declares 1 integer variable x, and then assigns 7 to it.
//        Write an if-else statement that prints out “Less than 10” if x is less than 10
//        and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
          int y = 7;
          if ( y < 10) {
              System.out.println("Less than 10");
          } else {
              System.out.println("Greater than 10");
          }
//
//
//        Write a program that declares 1 integer variable x, and then assigns 15 to it.
//        Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
//        “Between 10 and 20” if x is greater than 10 but less than 20,
//        and “Greater than or equal to 20” if x is greater than or equal to 20.
//        Change x to 50 and notice the result.

          int z = 10;
          if(z < 10) {
              System.out.println("Less than 10");
          } else if(z > 10 && z < 20) {
              System.out.println("Between 10 and 20");
          } else {
              System.out.println("Greater than or equal to 20");
          } //edge case when z = 10 ?

//        Write a program that declares 1 integer variable x, and then assigns 15 to it.
//        Write an if-else statement that prints “Out of range” if the number is less than
//        10 or greater than 20 and prints “In range” if between 10 and 20 (including equal to 10 or 20).
//        Change x to 5 and notice the result.
          int a = 15;
          if(a < 10 || a > 20) {
              System.out.println("Out of range");
          } else {
              System.out.println("In range");
          }

//        Write a program that uses if-else-if statements to print out grades A, B, C, D, F
//        according to the following criteria:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: <60
//
//        Use the Scanner class to accept a number score from the user to determine the letter grade.
//        Print out “Score out of range.” if the score is less than 0 or greater than 100.

          Scanner scn = new Scanner(System.in);
          System.out.print("Enter a score: ");
          int grade = scn.nextInt();

          if(grade >= 90 && grade <= 100) {
              System.out.println("A");
          } else if(grade < 90 && grade >= 80) {
              System.out.println("B");
          } else if(grade < 80 && grade >= 70) {
              System.out.println("C");
          } else if(grade < 70 && grade >= 60) {
              System.out.println("D");
          } else if(grade < 60) {
              System.out.println("F");
          } else {
              System.out.println("Score out of range.");
          }

//        Write a program that accepts an integer between 1 and 7 from the user.
//        Use a switch statement to print out the corresponding weekday.
//        Print “Out of range” if the number is less than 1 or greater than 7.
//        Don’t forget to include “break” statements in each of your cases.
          Scanner input = new Scanner(System.in);
          System.out.print("Enter an integer between 1 and 7: ");
          int day = input.nextInt();
          if(day < 1 || day > 7) {
              System.out.println("Out of range");
          } else {
              switch (day) {
                  case 1:
                      System.out.println("Monday");
                      break;
                  case 2:
                      System.out.println("Tuesday");
                      break;
                  case 3:
                      System.out.println("Wednesday");
                      break;
                  case 4:
                      System.out.println("Thursday");
                      break;
                  case 5:
                      System.out.println("Friday");
                      break;
                  case 6:
                      System.out.println("Saturday");
                      break;
                  case 7:
                      System.out.println("Sunday");
                      break;
              }
          }
    }
}
