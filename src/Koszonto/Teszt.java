package Koszonto;
import static org.junit.Assert.assertEquals;

public class Teszt {

    String names1 = new String ("Bob");
    String reply1 = new String("Hello, Bob.");

    public void shouldReplyCorrectly1(String names) {
        assertEquals(reply1, new Koszonto().Reply(names1));
    }
}
