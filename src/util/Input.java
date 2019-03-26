package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
  public Input() {
      scanner = new Scanner(System.in);
  }

public String getString(){
  return scanner.nextLine();
}

public boolean yesNo(){
    System.out.println("yes/no");
    String userInput=getString();
    return (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("yes"));

    }

    public int getInteger(int min, int max) {

        System.out.println("Enter a number between " + min + " and " + max);

        int userInput = scanner.nextInt();


        while (userInput < min || userInput > max) {

            System.out.println("Your number is out of range, try again: ");

            userInput = scanner.nextInt();


        }

        System.out.println("Your number " + userInput + " is valid!");

        return userInput;
    }

public int getInt(){
    System.out.println("enter a number");
    return scanner.nextInt();
}

   public double getDouble(double min, double max){
       System.out.println("Enter a number between " + min + " and " + max);

       int userInput = scanner.nextInt();


       while (userInput < min || userInput > max) {

           System.out.println("Your number is out of range, try again: ");

           userInput = scanner.nextInt();


       }

       System.out.println("Your number " + userInput + " is valid!");

       return userInput;
   }



    public double getDouble(){
    return scanner.nextDouble();
    }

}




