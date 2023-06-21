public class GiftCards  implements TimsMerchendise{
    @Override
    public double getPrice() {
        return 25;
    }

    @Override
    public String getFeature() {
        return "GIVE GIFT TO YOUR LOVED ONES";
    }
    @Override
    public String toString() {
        return "NAME : GIFT CARD\n" +
                "FEATURES: " + getFeature()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
