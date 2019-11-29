import org.junit.Before;
import org.junit.Test;
import shop.instruments.Trumpet;

import static junit.framework.TestCase.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
    trumpet = new Trumpet(3, "brass", "gold", "normal");
    }

    @Test
    public void hasValves(){
       assertEquals(3, trumpet.getValves());
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("normal", trumpet.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("So What", trumpet.play());
    }


}
