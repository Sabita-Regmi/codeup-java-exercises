//-- SHORT ASSIGNMENT #2 (part 2) --
//        Refactor your RestaurantDish and RestaurantTest classes...
//        1) Change your public properties in your RestaurantDish class to private
//  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to do this quickly)
//          3) Refactor code used in RestaurantTest to set and print these property values...
//          ...to use your getters and setters
//          4) Add a constructor method to RestaurantDish that will assign property...
//          ...values based on arguments passed into the constructor
//
//








public class RestaurantTest {


    public static void main(String[] args) {
//        System.out.println(RestaurantDish.eat());
        RestaurantDish dish=new RestaurantDish(500,"momo",true);
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.getWouldRecommend());
        System.out.println(dish.eat());




    }

}
