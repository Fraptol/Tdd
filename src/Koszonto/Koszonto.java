
package Koszonto;

import java.net.ConnectException;

//0.3
public class Koszonto {
    public String Reply(String[] names) {
        final int length= names.length;
        if (length == 0) {
            System.out.println("Hello, my friend.");
            return "Hello, my friend.";
        } else if (length>0) {
            //String[] nametext=new String[]{names.split(" ")};
            String text="";
            for (int i = 0; i < names.length; i++)
            {text= text+names[i];}
            System.out.println("Hello, " + text + ".");
            return "Hello, " + names + ".";
        }
        return "I failed.";
    }
}