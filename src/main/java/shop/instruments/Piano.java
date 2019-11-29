package shop.instruments;

import shop.ISellable;

public class Piano extends Instrument implements IPlayable {

    private int keys;

    public Piano(int keys, String material, String colour, String type, int priceBought, int priceToSell){
        super(material, colour, type, priceBought, priceToSell);
        this.keys = keys;
    }

    public int getKeys() {
        return this.keys;
    }

    public String play(){
        return "Softly, in the dusk, a woman is singing to me;\n" +
                "Taking me back down the vista of years, till I see\n" +
                "A child sitting under the piano, in the boom of the tingling strings\n" +
                "And pressing the small, poised feet of a mother who smiles as she sings.\n" +
                "\n" +
                "In spite of myself, the insidious mastery of song\n" +
                "Betrays me back, till the heart of me weeps to belong\n" +
                "To the old Sunday evenings at home, with winter outside\n" +
                "And hymns in the cosy parlour, the tinkling piano our guide.\n" +
                "\n" +
                "So now it is vain for the singer to burst into clamour\n" +
                "With the great black piano appassionato. The glamour\n" +
                "Of childish days is upon me, my manhood is cast\n" +
                "Down in the flood of remembrance, I weep like a child for the past.";
    }
}
