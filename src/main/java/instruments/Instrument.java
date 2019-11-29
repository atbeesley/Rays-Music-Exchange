package instruments;

import iSellable.ISellable;

public abstract class Instrument implements ISellable {

    private String material;
    private String colour;
    private String type;
    private int priceBought;
    private int priceToSell;

    public Instrument(String material, String colour, String type, int priceBought, int priceToSell){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.priceBought = priceBought;
        this.priceToSell = priceToSell;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public String getType() {
        return this.type;
    }

    public int getPriceBought() {
        return priceBought;
    }

    public int getPriceToSell() {
        return priceToSell;
    }

    @Override
    public int markUp() {
        return priceToSell - priceBought;
    }
}
