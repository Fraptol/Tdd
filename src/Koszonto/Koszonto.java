
package Koszonto;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Arrays;

//0.3
public class Koszonto {
    public String Reply(String[] names) {
        final int length= names.length;
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
                for(int j =0; i< lil.length; j++){
                    namesSplit.add(lil[j]);
                }
            }                                                       //did it have to be this hard

            for (int i = 0; i < names.length; i++) {
                if (!(i<names.length-1)) {
                    text = text + ", " + names[i];
                } else {
                    text = text + ", and " + names[i];
                }
            }
            System.out.println("Hello, " + text + ".");
            return "Hello, " + names + ".";
        }
    }
}