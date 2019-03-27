import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers=new int [7];
        //can also be written as: int numbers[]=new int[7];
        //arrays in java are strictly typed and strictly sized.

        String[] answers=new String[4];
        boolean decisions[]=new boolean[4];

        //assigning value to array:
        answers[0]="hi";
        answers[1]="hello world!";
        decisions[3]=true;
//        numbers[7]=7; //arrayIndexOutOfBoundsException because the predefined length of array is 7 which means index is: length-1
        numbers[0]=8;
//        String [] dayOfWeek2=new String[5];
        System.out.println(numbers[0]);

        //initializing array:
        String[] daysOfWeek={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(Arrays.toString(daysOfWeek));
        //sort
        Arrays.sort(daysOfWeek);
        //to String
        System.out.println(Arrays.toString(daysOfWeek));
        //way of looping through array:
        for(String day:daysOfWeek){
            System.out.println(day);
            for(boolean decision:decisions){
                System.out.println(decision);
            }
            for(int number:numbers){

                System.out.println(number);
            }
        }
        int[] phnNumbers=new int[7];
        Arrays.fill(phnNumbers,4);
        for(int digit:phnNumbers){
            System.out.println(digit);
        }
String [] colorsOfRainbow= new String[7];
        //fill in
        Arrays.fill(colorsOfRainbow,"red");
        System.out.println(Arrays.toString(colorsOfRainbow));

       //copy of:
        String daysOfWeek2[]= Arrays.copyOf(daysOfWeek, 6);
        System.out.println(Arrays.toString(daysOfWeek2));

    }
}
