package newyeargift;

import candies.Candies;

import java.util.ArrayList;
import java.util.List;

public class NewYearGift {

    List<Candies> candiesInGift = new ArrayList<>();
    public void addCandy(Candies candy) {
        candiesInGift.add(candy);
    }
    public  int determineWeightOfGift () {
        int totalWeight = 0;
           for (Candies candy : candiesInGift) {
               totalWeight += candy.getWeight();
           }
        System.out.println(totalWeight);
        return totalWeight;
    }

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
