package Koszonto;

import static org.junit.Assert.assertEquals;

public class Teszt {

    String nameless ="";
    String reply0 ="Hello, my friend.";
    String names1 = "Bob";
    String reply1 = "Hello, Bob.";
    String[] names2 = new String[] {"Alice", "Bob", "Jerry"};
    String reply2 = new String("Hello, Alice, Bob, and Jerry.");
    String[] names3 = new String[] {"Jerry", "Alice, Bob"};
    String reply3 = new String("Hello, Jerry, Alice and Bob.");
    String[] names4 = new String[] {"BARRY"};
    String reply4 = new String("HELLO BARRY!");
    String[] names5 = new String[] {"JAY","Maya","Alice","BOB","Charlotte"};
    String reply5 = new String("Hello, Maya, Alice, and Charlotte. AND HELLO JAY AND BOB!");

//empty
    public void shouldReplyCorrectly0(String nameless) {
        assertEquals(reply0, new Koszonto().Reply(new String[] {nameless}));
    }
//1 lowercase
    public void shouldReplyCorrectly1(String names1) {
        assertEquals(reply1, new Koszonto().Reply(new String[] {names1}));
    }
//3 lowercase
    public void shouldReplyCorrectly2(String names2) {
        assertEquals(reply2, new Koszonto().Reply(new String[] {names2}));
    }
//3 lowercase, multi name String
    public void shouldReplyCorrectly3(String names3) {
        assertEquals(reply3, new Koszonto().Reply(new String[] {names3}));
    }
//1 Shouting simple
    public void shouldReplyCorrectly4(String names4) {
        assertEquals(reply4, new Koszonto().Reply(new String[] {names4}));
    }
//3 basic, 2 Shout
    public void shouldReplyCorrectly5(String names5) {
        assertEquals(reply5, new Koszonto().Reply(new String[] {names5}));
    }
}
