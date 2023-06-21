public class Sandwich implements TimsConsumable{
    @Override
    public int getCalories() {
        return 230;
    }

    @Override
    public double getPrice() {
        return 7;
    }
    @Override
    public String toString() {
        return "NAME : Sandwich\n" +
                "CALORIES: " + getCalories()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
