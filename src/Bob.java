import java.util.Scanner;



public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bobResponse=" ";
        String questions;
        System.out.println("Start Conversation: ");
        questions=scanner.nextLine();
        if(questions.endsWith("?")){
            bobResponse="Sure";
        }
else if(questions.endsWith("!")){
    bobResponse="'Whoa, chill out!";
        }
else if(questions.isEmpty()){
    bobResponse="Fine. Be that way!";

        }else{
    bobResponse="Whatever";
        }
        System.out.println(bobResponse);
    }

}
