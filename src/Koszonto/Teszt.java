package Koszonto;
import static org.junit.Assert.assertEquals;

public class Teszt {

    String nameless ="";
    String reply0 ="Hello, my friend.";
    String names1 = "Bob";
    String reply1 = "Hello, Bob.";



    public void shouldReplyCorrectly0(String nameless) {
        assertEquals(reply0, new Koszonto().Reply(nameless));
    }
    public void shouldReplyCorrectly1(String names1) {
        assertEquals(reply1, new Koszonto().Reply(names1));
    }
}
