
import java.util.Scanner;
import java.util.Random;
public class MethodsExercises {



        public static int add(int a,int b){
            int sum=a+b;
            return sum;

        }
        public static int subtraction(int a,int b){
            int sub=a-b;
            return sub;
        }

        public static int multiplication(int a,int b){
            int multiply=a*b;
            return multiply;
        }
        public static int division(int a,int b){
            int result=a/b;
            return result;
        }
public static int module(int a,int b){
            int output=a%b;
            return output;
}

    public static int pow(int a, int b) {
        if (b == 0)
            return 1;
        int answer = a;
        int increment = a;
        int i, j;
        for(i = 1; i < b; i++)
        {
            for(j = 1; j < a; j++)
            {
                answer += increment;
            }
            increment = answer;
        }
        return answer;
    }


    public static int factorial(int num) {
        Scanner scanner = new Scanner(System.in);
        String userReply;
        do {
            System.out.println("enter the number for factorial: ");
            num = scanner.nextInt();
            int i, fact = 1;
//
            for (i = 1; i <= num; i++) {
                fact = fact * i;

            }

            System.out.println("Do you want to continue?");
            userReply=scanner.nextLine();
            return fact;
        }while(userReply.equalsIgnoreCase("y")|| userReply.equalsIgnoreCase("yes"));
    }
//    public static int multiply(int first,int second){
//     if(first==1){
//         System.out.println("We are at first ==1");
//         return second;
//     }else{
//         System.out.printf("First == %d,Second==%d%n",first,second);
//         return second+multiply(first-1,second);
//     }

    public static void rollDice (int diceNumber) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Would you like to roll the dice? [y/n]");
        String userConfirm = scan.next();
        System.out.print("Enter the number of sides for a pair of dice.");
        int numberOfSides = scan.nextInt();
        do {
            Random rand = new Random();
            int diceOneRoll = rand.nextInt(numberOfSides) + 1;
            int diceTwoRoll = rand.nextInt(numberOfSides) + 1;
            System.out.format("Your dice roll returned number %s and %s \n", diceOneRoll, diceTwoRoll);
            userConfirm = "n";
            System.out.println("Roll again? [y/n]");
            userConfirm = scan.next();

        }while (userConfirm.equalsIgnoreCase("y"));
    }
public static void main(String[] args) {

//        Basic Arithmetic
//
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//                Subtraction
//        Multiplication
//                Division

    System.out.println(add(5,3));
    System.out.println(subtraction(10,5));
    System.out.println(multiplication(8,5));
    System.out.println(division(40,5));
    System.out.println(module(40,3));
    System.out.println(pow(3,2));
    System.out.println("The factorial of number you entered is : "+factorial(4));
//            System.out.println(multiply(100,5));

//
}



}

