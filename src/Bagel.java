public class Bagel implements TimsConsumable{
    @Override
    public int getCalories() {
        return 500;
    }

    @Override
    public double getPrice() {
        return 3;
    }
    @Override
    public String toString() {
        return "NAME : Bagel\n" +
                "CALORIES: " + getCalories()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
