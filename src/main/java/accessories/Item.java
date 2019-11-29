package accessories;

import iSellable.ISellable;

public class Item implements ISellable {

    private String type;
    private int priceBought;
    private int priceToSell;

    public Item(String type, int priceBought, int priceToSell){
        this.type = type;
        this.priceBought = priceBought;
        this.priceToSell = priceToSell;
    }

    public String getType() {
        return type;
    }

    public int getPriceBought() {
        return priceBought;
    }

    public int getPriceToSell() {
        return priceToSell;
    }

    @Override
    public int markUp() {
        return priceToSell -= priceBought;
    }


}
