package javacollections.newyeargift;

import javacollections.candies.Candies;
import javacollections.candies.Chocolate;
import javacollections.candies.JellyBeans;

import java.util.ArrayList;
import java.util.List;

public class NewYearGift {
    List<Candies> candiesInGift = new ArrayList<>();
    public void addCandy(Candies candy) {
        candiesInGift.add(candy);
    }

    List <Chocolate> chocolatesInGift = new ArrayList<>();
    public void addChocolate(Chocolate chocolates) {
        chocolatesInGift.add(chocolates);
    }

    List <JellyBeans> jellyBeansInGift = new ArrayList<>();
    public void addJellyBeans(JellyBeans jellyBeans) {
        jellyBeansInGift.add(jellyBeans);
    }


    public  int determineWeightOfGift () {
        int totalWeightGift = 0;
        for (Candies candy : candiesInGift) {
            totalWeightGift += candy.getWeight();
        }
        for (Chocolate chocolate : chocolatesInGift) {
            totalWeightGift += chocolate.getWeight();
        }
        for (JellyBeans jellyBeans : jellyBeansInGift) {
            totalWeightGift += jellyBeans.getWeight();
        }
        System.out.println(totalWeightGift);
        return totalWeightGift;
    }



    //Проводил только сортировку конфет в подарке, как сказано в задании
    public  List<Candies> sortByName () {
        candiesInGift.sort(new Candies.NameComparator());
        System.out.println(candiesInGift);
        return candiesInGift;
    }

    public List<Candies> findCandiesBySugarContent (int minimalSugarContent, int maximumSugarContent) {
        List<Candies> candiesBySugarContent = new ArrayList<>();
        for (Candies candy : candiesInGift) {
            if ((candy.getSugarContent() >= minimalSugarContent) && (candy.getSugarContent() <= maximumSugarContent)) {
                candiesBySugarContent.add(candy);
            }
        }
        candiesBySugarContent.sort(new Candies. NameComparator());
        System.out.println(candiesBySugarContent);
        return candiesBySugarContent;
    }
}

