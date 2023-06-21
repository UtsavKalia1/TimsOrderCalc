public class Coffee implements TimsConsumable{
    @Override
    public int getCalories() {
        return 25;
    }

    @Override
    public double getPrice() {
        return 2;
    }
    @Override
    public String toString() {
        return "NAME : Coffee\n" +
                "CALORIES: " + getCalories()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
