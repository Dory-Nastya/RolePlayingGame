public class Merchant implements Seller{
    // Sell method
    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }
    // Enum for goods
    public enum Goods{
        POTION
    }
}
