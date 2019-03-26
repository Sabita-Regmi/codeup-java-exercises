import java.util.Scanner;



public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15


//      #######solution####
//        long i = 5;
//        while (i <= 15) {
//            System.out.print(+ i+" " );
//            i++;
//        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int z = 0;
//        while (z <= 100) {
//            System.out.println(+z);
//            z += 2;
//        }
////
//
//        Alter your loop to count backwards by 5's from 100 to -10.
        //#####solution########
//        int j = 100;
//        do {
//            System.out.println(j);
//            j = j - 5;
//        }
//        while (j >= -10);
////


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
//######solution########
        System.out.println();
        long x = 2;
        do {
            System.out.println(x);
            x = x * x;
        }
        while (x < 100000);
//fizzbuzz

//    //Fizzbuzz
//        for (int k = 1; k <= 100; k++){
//            if (k % 3 == 0 && k% 5 == 0) {
//                System.out.println("FizzBuzz ");
//                continue;
//            }
//            if (k % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//
//            }if (k % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//
//            }
//                System.out.println(k);

//        for (int y = 1; y <= 100; y++) {
//            if (y % 3 == 0 && y % 5 == 0) {
//                System.out.println("FizzBuzz");
//
//            } else if (y % 3 == 0) {
//                System.out.println("Fizz");
//
//
//            } else if (y % 5 == 0) {
//                System.out.println("Buzz");
//
//
//            } else {
//                System.out.println(y);
//
//
//            }
//        }


//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        //Display a table of powers
        String chooseNumber;
        do {

            System.out.print("What number would you like to go up to?");
            int userInput = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInput; i++) {
                int userInputSquared = (int) Math.pow(i, 2);
                int userInputCubed = (int) Math.pow(i, 3);
                System.out.format("%-6d | %-7d |  %-8d%n", i, userInputSquared, userInputCubed);
//

            }
            System.out.println("Do you want to print another number?");
            chooseNumber = scanner.next();
        } while (chooseNumber.equalsIgnoreCase("y") || chooseNumber.equalsIgnoreCase("yes"));


//
//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
/////           F : 59 - 0
//        String wantToContinue;
//
//        do {
//            System.out.println("Enter your number: ");
//            int userGrade = scanner.nextInt();
//            if (userGrade >= 88 && userGrade <= 100) {
//                System.out.println("YOUR GRADE IS: A");
//            } else if (userGrade >= 80 && userGrade <= 87) {
//                System.out.println("YOUR GRADE IS: B");
//            } else if (userGrade >= 67 && userGrade <= 79) {
//                System.out.println("YOUR GRADE IS :C");
//            } else if (userGrade >= 60 && userGrade <= 66) {
//                System.out.println("YOUR GRADE IS :D");
//            } else {
//                System.out.println("YOUR GRADE IS : F");
//            }
//
//            System.out.println("would you like to continue?");
//
//            wantToContinue = scanner.next();
//
//
//        }while (wantToContinue.equalsIgnoreCase("y") || wantToContinue.equalsIgnoreCase("yes"));


//        String wantToContinue;
//        wantToContinue = scanner.next();
//        if (wantToContinue.equalsIgnoreCase("y") || wantToContinue.equalsIgnoreCase("yes")) {
//
////
////
//            System.out.println("enter a number:");
//            int userInput = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInput; i++) {
//                int userInputSquared = (int) Math.pow(i, 2);
//                int userInputCubed = (int) Math.pow(i, 3);
//                System.out.format("%-6d | %-7d |  %-8d%n", i, userInputSquared, userInputCubed);
//            }
//
//            System.out.println("would you like to continue?");
////
//
//
//        }






















        //Bonuses


//        create three variables, start, end, and sum. Use a loop to find the summation of all the numbers between start and end (inclusive)
//        int end ;
//        int start ;
//        int sum=0;
//        System.out.println("enter the start number");
//        start=scanner.nextInt();
//        end=scanner.nextInt();
//        System.out.println("enter the end number");
//        for (int i = start; i <= end; i++) {
//            sum = sum + i;
//
//        }
//
//        System.out.println("Sum of the number is: "+sum);




        //BONUS 2 FROM DANIEL

//        2) write a loop which will output all the prime numbers (evenly divisible by only 1 and themselves) between 10 and 10000
        //#####solution########
//        for(int counter=0;counter<=10000;counter++){
//            boolean notPrime=false;
//            for(int i =2;i<=counter;i++){
//                if(counter%i==0 && i!=counter){
//                    notPrime=true;
//                }
//            }
//            if(notPrime==false){
//                System.out.println(counter);
//            }
//        }

        //curriculum bonus
//        boolean confirmation = true;
//        do {
////
//            System.out.print("Please enter your grade (w/o percentage) here: ");
//            int userNumberGrade = scanner.nextInt();
//            System.out.println();
//            if ((userNumberGrade >= 99) && (userNumberGrade <= 100)) {
//                System.out.println("Congratulations, you scored an A+!!!");
//            } else if ((userNumberGrade >= 94) && (userNumberGrade <= 98)) {
//                System.out.println("Great job, you got an A!!");
//            } else if ((userNumberGrade >= 90) && (userNumberGrade <= 93)) {
//                System.out.println("Nice work, that's an A-!");
//            } else if ((userNumberGrade >= 88) && (userNumberGrade <= 89)) {
//                System.out.println("Nice, that's a B+.");
//            } else if ((userNumberGrade >= 84) && (userNumberGrade <= 87)) {
//                System.out.println("Not bad, that's a B.");
//            } else if ((userNumberGrade >= 80) && (userNumberGrade <= 83)) {
//                System.out.println("Not too bad, that's a B-.");
//            } else if ((userNumberGrade >= 78) && (userNumberGrade <= 79)) {
//                System.out.println("Well, you at least got a C+.");
//            } else if ((userNumberGrade >= 74) && (userNumberGrade <= 77)) {
//                System.out.println("Hey, it could be worse...you got a C.");
//            } else if ((userNumberGrade >= 70) && (userNumberGrade <= 73)) {
//                System.out.println("You barely passed with a C-.");
//            } else if ((userNumberGrade >= 68) && (userNumberGrade <= 69)) {
//                System.out.println("Yikes, you got a D+!");
//            } else if ((userNumberGrade >= 64) && (userNumberGrade <= 67)) {
//                System.out.println("So sorry...you got a D.");
//            } else if ((userNumberGrade >= 60) && (userNumberGrade <= 63)) {
//                System.out.println("Ouch! You got a D-.");
//            } else if ((userNumberGrade >= 0) && (userNumberGrade <= 59)) {
//                System.out.println("Woah...dude. You failed with an F.");
//            } else {
//                System.out.println("Incorrect entry. Please try again.");
//            }
//            System.out.println();
//            System.out.print("Would you like to continue? [y/n]");
//            System.out.println();
//            String userResponse = scanner.next();
//            System.out.println("\n");
//            if (userResponse.equalsIgnoreCase("n")) {
//                confirmation = false;
//            }
//
//        } while (confirmation);
//        3) output a table representing the binary representations of the powers of 2
//        decimal       |       binary
//        1     |     00000001
//        2     |     00000010
//        4     |     00000100


        System.out.print("What number would you like to go up to?");
        int user=scanner.nextInt();
        System.out.println("number | binary ");
        System.out.println("------ | ------- ");
        for(int i = 1; i <= user; i++) {
            System.out.print(i + " "); //show integer
            System.out.println(Integer.toBinaryString(i) + "       "); //show binary


        }


    }
}


