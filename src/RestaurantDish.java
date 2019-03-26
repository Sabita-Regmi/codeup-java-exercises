
//-- OOP SHORT ASSIGNMENT #1 --
//
//        Create a class called "RestaurantDish" (you should not include quotes)
//
//        Include an integer property called "costInCents"
//        Include a string property called "nameOfDish"
//        Include a boolean property called "wouldRecommend"
//        Include a method called "eat"
//        this method will print out "Nom nom nom!"
//
//        Create another class called RestaurantTest
//        Add a main method and inside the method...
//        1) instantiate a RestaurantDish object called "dish"
//        2) assign creative values for each of the properties
//        3) print out each of the property values
//        4) test the eat() method by calling it

public class RestaurantDish {

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    private int costInCents;

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    private String nameOfDish;

    public boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    private boolean wouldRecommend;

    public  String eat(){

        return ("Nom nom nom!!!");
    }


public RestaurantDish(int cost, String dish,boolean recommendentaion ){
        costInCents=cost;
        nameOfDish=dish;
        wouldRecommend=recommendentaion;


    }

}
