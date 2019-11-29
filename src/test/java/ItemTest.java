import accessories.Item;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ItemTest {

    Item item;
    Item item2;
    Item item3;

    @Before
    public void before(){
        item = new Item("Guitar strings", 5, 10);
        item2 = new Item("Sheet music", 2, 9);
        item3 = new Item("Drum sticks", 3, 11);
    }

    @Test
    public void hasType(){
        assertEquals("Guitar strings", item.getType());
    }

    @Test
    public void hasPriceBought(){
        assertEquals(2, item2.getPriceBought());
    }

    @Test
    public void hasPriceToSell(){
        assertEquals(11, item3.getPriceToSell());
    }




}
