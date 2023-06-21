public class Donut implements TimsConsumable{
    @Override
    public int getCalories() {
        return 250;
    }

    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String toString() {
        return "NAME : Donut\n" +
                "CALORIES: " + getCalories()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
