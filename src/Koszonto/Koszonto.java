
package Koszonto;

//0.2
public class Koszonto {
    public String Reply(String name) {
        if (name==null) {
            System.out.println("Hello, my friend.");
        }

        else if (name.matches("Bob")){
            System.out.println("Hello, "+ "Bob" + ".");
        return "Hello, "+ "Bob" + ".";}

        return "Hello, my friend.";
    }
}