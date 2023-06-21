public class HockeyCards  implements TimsMerchendise{
    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getFeature() {
        return "BEST HOCKEY CARDS";
    }

    @Override
    public String toString() {
        return "NAME : HOCKEY CARD\n" +
                "FEATURES: " + getFeature()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
