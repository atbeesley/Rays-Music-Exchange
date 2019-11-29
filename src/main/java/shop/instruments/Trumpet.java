package shop.instruments;

import shop.ISellable;

public class Trumpet extends Instrument implements IPlayable {

    private int valves;

    public Trumpet(int valves, String material, String colour, String type, int priceBought, int priceToSell) {
        super(material, colour, type, priceBought, priceToSell);
        this.valves = valves;
        }

        public int getValves(){
            return this.valves;
        }

        public String play(){
            return "So What";
        }


}
