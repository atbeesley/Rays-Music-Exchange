package shop.instruments;

import shop.ISellable;

public class Trumpet extends Instrument implements IPlayable, ISellable {

    private int valves;

    public Trumpet(int valves, String material, String colour, String type) {
        super(material, colour, type);
        this.valves = valves;

    }

        public int getValves(){
            return this.valves;
        }

        public String play(){
            return "So What";
        }


}
