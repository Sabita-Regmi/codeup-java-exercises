
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Copy this code into your main method:
//        double pi = 3.14159;
//        System.out.println("The value of the pi is approximately"+pi+".");

//        Write some java code that uses the variable pi to output the following

//        System.out.format("The value of the pi is approximately %.2f.",pi);

//      Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//    System.out.println(" \nEnter number:");
//    int num=scanner.nextInt();
//        System.out.println("You entered: --> \"" + num + "\" <--");

//Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on
// a newline.
//        System.out.println("\n Enter three words: ");
//        String word1=scanner.next();
//        String word2=scanner.next();
//        String word3=scanner.next();
//
//
//        System.out.println("YOU ENTERED "+word1+" "+word2+" "+word3+".");

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
//
//        do you capture all of the words?
//        Rewrite the above example using the .nextLine method.
//        System.out.println("\n Enter the sentence: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.printf("Your sentence: %s%n",userInput);
//        System.out.printf()
//
////
//        Calculate the perimeter and area of Codeup's classrooms
//
//        Prompt the user to enter values of length and width of a classroom at Codeup.
//
//        Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.

//        System.out.println("\n Enter the length of room: ");
//        int width=scanner.nextInt();
//        System.out.println("\n Enter the width of room: ");
//        int length=scanner.nextInt();
//        System.out.println("\n Enter the height of room: ");
//        int height=scanner.nextInt();
//        System.out.println("The perimeter of room is "+(2*(width+length)));
//        System.out.println("The area of room is "+(width*length));
//        System.out.println("The volume of room is "+(width*length*height));
//


//        Bonuses
//
//        Accept decimal entries
//        Calculate the volume of the rooms in addition to the area and perimeter
//
//        System.out.println("\n Enter the length of room: ");
//        double width=scanner.nextDouble();
//        System.out.format("\n Enter the width of room: ");
//
//        double length=scanner.nextDouble();
//        System.out.format("\n Enter the height of: room ");
//        double height=scanner.nextDouble();
//        System.out.println(("The perimeter of room is "+(2*(width+length))));
//        System.out.println("The area of room is "+(width*length));
//        System.out.println("The volume of room is "+(width*length*height));


//boolean mini exercise
        boolean bol1=true;
        boolean bol2=false;
        System.out.println((bol1 || bol2)||(bol1&&bol1)&&(bol1 && bol2)&&(bol1||bol2)||(bol1&&bol2)&&(bol1||bol2)&&(bol2||bol1)||(bol1||bol2)&&(bol1&&bol2)||(bol1 ||bol2));

        boolean iLikeDoughnuts = true; // of course
        boolean dayIsSunday = false; // I get doughnuts most Sundays
        double time = 8.5;  // before 9:30
        boolean krispyKreme = (iLikeDoughnuts && dayIsSunday && time < 9.5);
        System.out.println(krispyKreme);


        boolean wantVacation=true;
        boolean isWeekend=false;
        boolean isGraduated=false;
        boolean findJob=false;
        System.out.println((wantVacation||isWeekend)&&(wantVacation));



    }
}

