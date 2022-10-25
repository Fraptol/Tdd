
package Koszonto;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Arrays;

//0.3
public class Koszonto {
    public static void main(String[] args)
    {}
    public String Reply(String[] names) {
        int length= names.length;
        if (length == 0) {
            System.out.println("Hello, my friend.");
            return "Hello, my friend.";



        } else {
            String text="";
            ArrayList<String> namesSplit = new ArrayList<String>();
            //String[] namesSplit=new String[]{names.split(", ")};  //java amirite
            for (int i = 0; i < names.length; i++) {
                String[] lil=names[i].split(", ");

                //namesSplit.add(names[i].split(", "));             //java amirite
                for(int j =0; j< lil.length; j++){
                    namesSplit.add(lil[j]);
                }
            }                                                       //did it have to be this hard,

            // also now its in Arraylist,
            // so i need to google again, but thank god its not me writing functional code tho.


            //                              ~~thoughts of the writer~~

            // im doing this first because i didn't want to rewrite it later,
            // so i just made it with relatively fresh memory of how the reworked part works.
            // i feel like a lazy * a bit, not following order of duty when that's the actual point, but...
            // for one, got into the flow of it, but also
            // i just want it done and this seemed best to understand (for me) in bulk. if not else im rewriting it
            // with more ordered writing timings next year :(
            // or this week if it means anything.
            // btw im basically relearning java, i haven't programmed in a while, (and i thought i remember)
            // ... you know how sitting hours in front of a vibrating lamp is not really good for one's psiche,
            // well, i really have wanted to give up on programming, BUT for now im using it outside of this anyway,
            // so i could say, it doesn't seem that bad... well it is, it is bad,
            // and i SHOULD limit my recreational hours in front of the screen,
            // because it gets me falling apart when working on these machines.

            // i just needed to write this out because otherwise it would be harder
            // to admit fault, and find my wrongs without.




            length = namesSplit.size();
            String[] split = new String[length];
            for (int i = 0; i < namesSplit.size(); i++) {//how the hell is this always false
                if (!(i<namesSplit.size()-1)) {
                    text = text + ", " + namesSplit.get(i);
                } else {
                    text = text + ", and " + namesSplit.get(i);
                }
            }


            //out
            System.out.println("Hello, " + text + ".");
            return "Hello, " + names + ".";
        }
    }
}