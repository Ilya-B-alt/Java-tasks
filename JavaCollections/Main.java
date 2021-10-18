package javacollections;

import javacollections.candies.Candies;
import javacollections.candies.Chocolate;
import javacollections.candies.JellyBeans;
import javacollections.newyeargift.NewYearGift;
import javacollections.candies.CandyBase;

public class Main {
    public static void main(String[] args) {

        Candies rafaello = new Candies("Rafaello", 15, 15);
        Candies komunarka = new Candies("Komunarka", 30, 10);
        Candies spartak = new Candies("Spartak", 25, 12);
        Candies mars = new Candies("Mars", 15, 12);
        Candies roshen = new Candies("Roshen", 30, 14);
        Chocolate alpengold = new Chocolate("Alpen Gold", 100, 30);
        JellyBeans tasty = new JellyBeans("Tasty", 200, 50);

        NewYearGift newYearGift = new NewYearGift();
        newYearGift.addCandy(rafaello);
        newYearGift.addCandy(komunarka);
        newYearGift.addCandy(spartak);
        newYearGift.addCandy(mars);
        newYearGift.addCandy(roshen);
        newYearGift.addChocolate(alpengold);
        newYearGift.addJellyBeans(tasty);




        newYearGift.determineWeightOfGift();
        newYearGift.sortByName();
        newYearGift.findCandiesBySugarContent(15, 20);


    }
}
