import accessories.Item;
import iSellable.ISellable;
import instruments.Guitar;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar1;
    Piano piano1;
    Trumpet trumpet1;


    @Before
    public void before(){
        shop = new Shop();
        guitar1 = new Guitar(6, "wood", "red, purple", "acoustic", 6, 10);
        trumpet1 = new Trumpet(3, "brass", "silver", "nice", 10, 15);
        piano1 = new Piano(88, "wood", "gold", "upright", 14, 20);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getStockAmount());
    }

    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(guitar1);
        assertEquals(1, shop.getStockAmount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.removeItemFromStock(trumpet1);
        assertEquals(0, shop.getStockAmount());
    }


}
