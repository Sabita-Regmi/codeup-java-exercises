public class BurgerTester {
    public static void main(String[] args) {
        System.out.println(BurgerTools.getMostPopularTopping());
        System.out.println(BurgerTools.getAverageDaysBeforeExpiration());
        System.out.println(BurgerTools.temperatureWhenCooked);
       BurgerTools.grill();
    }
}
