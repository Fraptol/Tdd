package Koszonto;
import static org.junit.Assert.assertEquals;

public class Teszt {

    String nameless ="";
    String reply0 ="Hello, my friend.";
    String names1 = "Bob";
    String reply1 = "Hello, Bob.";


    public void shouldReplyCorrectly0(String nameless) {
        assertEquals(reply0, new Koszonto().Reply(new String[] {nameless}));
    }
    public void shouldReplyCorrectly1(String names1) {
        assertEquals(reply1, new Koszonto().Reply(new String[] {names1}));
    }

    String[] names2 = new String[] {"Alice", "Bob", "Jerry"};
    String reply2 = new String("Hello, Alice, Bob, and Jerry.");

    public void shouldReplyCorrectly2(String names2) {
        assertEquals(reply2, new Koszonto().Reply(new String[] {names2}));
    }

    String[] names3 = new String[] {"Jerry", "Alice, Bob"};
    String reply3 = new String("Hello, Jerry, Alice and Bob.");

    public void shouldReplyCorrectly3(String names3) {
        assertEquals(reply3, new Koszonto().Reply(new String[] {names3}));
    }

    }
