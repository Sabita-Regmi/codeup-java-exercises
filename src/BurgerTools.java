public class BurgerTools {
    public static String getMostPopularTopping() {
        return mostPopularTopping;
    }

    public static void setMostPopularTopping(String mostPopularTopping) {
        BurgerTools.mostPopularTopping = mostPopularTopping;
    }

    private static String mostPopularTopping="cheese";

    public static int getAverageDaysBeforeExpiration() {
        return averageDaysBeforeExpiration;
    }

    public static void setAverageDaysBeforeExpiration(int averageDaysBeforeExpiration) {
        BurgerTools.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
    }

    private static int averageDaysBeforeExpiration=4;
    public static int  temperatureWhenCooked=100;

    public static void grill(){
        System.out.println("grilling burger");
    }
}
