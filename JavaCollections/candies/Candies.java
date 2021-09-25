package candies;

import java.util.Comparator;


public class Candies extends CandyBase {

    public Candies(String name, int weight, int sugarContent ) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getSugarContent() {
        return sugarContent;
    }

    @Override
    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public static class NameComparator implements Comparator<Candies>{
        @Override
        public int compare(Candies o1, Candies o2) {
           return o1.getName().compareTo(o2.getName());
        }
    }

    @Override
    public String toString() {
        return "Candies{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarContent=" + sugarContent +
                '}';
    }
}
