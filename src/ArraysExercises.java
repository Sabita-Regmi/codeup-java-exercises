import java.util.Arrays;
import java.util.ArrayList;

public class ArraysExercises {
    public static void main(String[] args) {
        //Create a class inside of src named ArraysExercises. Create a main method for this class to do your work
        //
        //What happens when you run the following code? Why is Arrays.toString necessary?
        //
        //
        //int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(numbers);
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));



        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.




        Person[] objects= new Person[3];
       objects[0]=new Person("Daniel");
       objects[1]=new Person("Ryan");
       objects[2]=new Person("Justin");
       for(int i=0;i<objects.length;i++){
           System.out.println(objects[i].getName());


       }

       Person newOne=new Person("Sabita");
       Person newTwo=new Person("Megan");
       Person[] newArray=ArraysExercises.addPerson(objects,newOne);
       for(int i=0;i<newArray.length;i++){
           System.out.println(newArray[i].getName());
       }


    }
//    Create a static method named addPerson. It should accept an array of Person objects, as well as a single
//    person object to add to the passed array. It should return an array whose length is 1 greater than the
//    passed array, with the passed person object at the end of the array.

  public static Person[] addPerson(Person[] objects,Person addNew){
        Person[] newArray=Arrays.copyOf(objects,objects.length+1);
        newArray[objects.length]=addNew;
        return newArray;
  }
}
