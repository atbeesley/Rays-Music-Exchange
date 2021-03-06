import org.junit.Before;
import org.junit.Test;
import instruments.Piano;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(88, "wood", "black", "grand", 60, 160);
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
