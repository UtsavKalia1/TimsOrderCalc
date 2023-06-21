public class Mugs implements TimsMerchendise{
    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getFeature() {
        return "BEAUTIFUL RED MUG";
    }
    @Override
    public String toString() {
        return "NAME : MUG\n" +
                "FEATURES: " + getFeature()+"\n" +
                "PRICE: $"+ getPrice();
    }
}
