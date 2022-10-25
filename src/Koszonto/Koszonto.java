package Koszonto;

import java.util.ArrayList;

//1.0
public class Koszonto {
    public static void main(String[] args)
    {/*?*/}
    public String Reply(String[] names) {
        int length= names.length;
        if (length == 0) {
//no input case
            return "Hello, my friend.";

        } else {
//splitting the input
            String text="";
            String TEXT="";
            ArrayList<String> namesSplit = new ArrayList<String>();
            ArrayList<String> NAMESSplit = new ArrayList<String>();
            //String[] namesSplit=new String[]{names.split(", ")};  //java amirite
            for (int i = 0; i < names.length; i++) {
                String[] lilBites=names[i].split(", ");

                //namesSplit.add(names[i].split(", "));             //java amirite
                for(int j =0; j< lilBites.length; j++) {

                    boolean Uppercase=false;
//Checking uppercase
                    Uppercase=lilBites[j].matches(lilBites[j].toUpperCase());
                    if(Uppercase)
                    {NAMESSplit.add(lilBites[j]);}
                    else
                    {namesSplit.add(lilBites[j]);}
                }
            }
//concat
            length = namesSplit.size();
            String[] split = new String[length];
            for (int i = 0; i < namesSplit.size(); i++) {//how the hell is this always false
                if (!(i<namesSplit.size()-1)) {
                    text = text + ", " + namesSplit.get(i);
                } else {
                    text = text + ", and " + namesSplit.get(i);
                }
            }
            length = NAMESSplit.size();
            String[] SPLIT = new String[length];
            for (int i = 0; i < NAMESSplit.size(); i++) {//how the hell is this always false too
                if (!(i < NAMESSplit.size() - 1)) {
                    TEXT = TEXT + ", " + NAMESSplit.get(i);
                } else {
                    TEXT = TEXT + ", AND " + NAMESSplit.get(i);
                }
            }
//wording
            String reply = new String("");
            if (split.length>0) {
                reply = "Hello, " + text + ".";
                if (SPLIT.length > 0) {
                    reply = reply + " AND ";
                }
            }
            if (SPLIT.length>0){reply=reply+ "HELLO "+TEXT+"!";}
//out
            return reply;
        }
    }
}