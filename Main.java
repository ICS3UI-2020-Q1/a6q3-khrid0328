import java.util.Scanner;
/**
 * This program populates a 10 element array with integers. Once the array is full, this program finds the largest value inside of that array.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // declare a constant
    final int TEN_ELEMENTS = 10;

    // create an array with 10 spots
    int[] numbers = new int [TEN_ELEMENTS];

    // ask the user to type 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    // put integers into the array using a loop
    for(int i = 0; i < TEN_ELEMENTS; i++){

      // putting the user's value into the array
      numbers[i] = input.nextInt();
      
    }

    // declare a temporary variable to keep track of the largest number
    int temp = numbers[0];

    // use a for loop to declare what number is the largest
    for(int i = 0; i < TEN_ELEMENTS; i++){

      // use an if statement to declare what number is the largest
      if(temp < numbers[i]){

        // initialize temp equals the larger number at the end of every loop
       temp = numbers[i];
      }
    }
    // print the largest number
    System.out.println("The largest number is " + temp);
    
  }
}
