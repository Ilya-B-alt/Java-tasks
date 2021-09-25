package candies;

public class JellyBeans extends CandyBase {
    public JellyBeans(String name, int weight, int sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void setWeight(int weight) {

    }

    @Override
    public int getSugarContent() {
        return 0;
    }

    @Override
    public void setSugarContent(int sugarContent) {

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
