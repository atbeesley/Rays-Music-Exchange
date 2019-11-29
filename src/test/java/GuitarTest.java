import org.junit.Before;
import org.junit.Test;
import shop.instruments.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(12, "Very heavy metal", "red", "electric");
    }

    @Test
    public void hasStrings(){
        assertEquals(12, guitar.getStrings());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Very heavy metal", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("electric", guitar.getType());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("I wanna rock 'n' roll all night... And party every day", guitar.play());
    }

}
