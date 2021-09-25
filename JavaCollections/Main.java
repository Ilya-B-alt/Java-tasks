import candies.Candies;
import newyeargift.NewYearGift;

public class Main {

    public static void main(String[] args) {

        Candies rafaello = new Candies("Rafaello", 15, 15);
        Candies komunarka = new Candies("Komunarka", 30, 10);
        Candies spartak = new Candies("Spartak", 25, 12);
        Candies mars = new Candies("Mars", 15, 12);
        Candies roshen = new Candies("Roshen", 30, 14);

        NewYearGift newYearGift = new NewYearGift();
        newYearGift.addCandy(rafaello);
        newYearGift.addCandy(komunarka);
        newYearGift.addCandy(spartak);
        newYearGift.addCandy(mars);
        newYearGift.addCandy(roshen);
        newYearGift.determineWeightOfGift();
        newYearGift.sortByName();
        newYearGift.findCandiesBySugarContent(15, 20);


    }
}
