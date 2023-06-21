public class Wrap implements TimsConsumable{
    @Override
    public int getCalories() {
        return 300;
    }

    @Override
    public double getPrice() {
        return 10;
    }
    @Override
    public String toString() {
        return "NAME : Wrap\n" +
                "CALORIES: " + getCalories()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
