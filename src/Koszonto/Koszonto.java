
package Koszonto;

//0.3
public class Koszonto {
    public String Reply(String name) {
        if (name == null) {
            System.out.println("Hello, my friend.");
            return "Hello, my friend.";
        } else if (name.matches("Bob")) {
            System.out.println("Hello, " + name + ".");
            return "Hello, " + name + ".";
        }
        return "I failed.";
    }
}