import org.junit.Before;
import org.junit.Test;
import shop.instruments.Piano;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(88, "wood", "black", "grand");
    }

    @Test
     public void hasKeys(){
        assertEquals(88, piano.getKeys());
        }

      @Test
      public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
        }

        @Test
        public void hasColor(){
        assertEquals("black", piano.getColour());
        }

        @Test
        public void hasType(){
        assertEquals("grand", piano.getType());
        }



}
