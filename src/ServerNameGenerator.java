
//Server Name Generator
//
//        We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//        Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//        Create a method that will return a random element from an array of strings.
//        Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//        Example Output
//
//
//        Here is your server name:
//        dedicated-photon



import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static String randomAdj;
    public static String randomNoun;

    public static String randomGenerator(String[]array){
        int r=(int)(Math.random()*array.length);
        return array[r];
    }



    public static void main(String[] args) {
        String[] adjectives = {
                "Smart",
                "polite",
                "beautiful",
                "handsome",
                "foolish",
                "sleepy",
                "lazy",
                "active",
                "frank",
                "awesome"
        };
        String[] nouns = {
                "paper",
                "book",
                "copy",
                "mobile",
                "table",
                "cup",
                "laptop",
                "jacket",
                "shoes",
                "pen"
        };
        Random r=new Random();
        int randomNumber=r.nextInt(adjectives.length);
        Random ran=new Random();
        int randomNumber2=ran.nextInt(nouns.length);
        System.out.println("Here is your server name:"+"\n"+adjectives[randomNumber]+" - "+nouns[randomNumber2]);

        //second way of doing:
        randomAdj = randomGenerator(adjectives);
        randomNoun=randomGenerator(nouns);
        System.out.println("Here is your server name:"+"\n"+randomAdj+"- "+randomNoun);

    }
}