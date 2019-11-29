package shop.instruments;

import shop.ISellable;

public class Guitar extends Instrument implements IPlayable {

private int strings;

public Guitar(int strings, String material, String colour, String type, int priceBought, int priceToSell){
    super(material, colour, type, priceBought, priceToSell);
    this.strings  = strings;
}
    public int getStrings(){
        return strings;
    }

    public String play(){
        return "I wanna rock 'n' roll all night... And party every day";
    }
}
