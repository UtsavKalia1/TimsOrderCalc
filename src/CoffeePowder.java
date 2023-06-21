public class CoffeePowder  implements TimsMerchendise{
    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public String getFeature() {
        return "NATURAL COFFEE";
    }
    @Override
    public String toString() {
        return "NAME : COFFEE POWDER\n" +
                "FEATURES: " + getFeature()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
