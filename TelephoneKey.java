/**
 * The method receives a single letter as input, returns the corresponding digit on the telephone pad. Returns -1 when it is Q or Z.
 */

public class TelephoneKey {

    public static void main(String[] args){

        char key = 'W';
        
        System.out.println("The corresponding key is: " + convert(key));
    }

    public static int convert(char key){

        if("ABC".indexOf(key) != -1)
            return 2;
        if("DEF".indexOf(key) != -1)
            return 3;
        if("GHI".indexOf(key) != -1)
            return 4;
        if("JKL".indexOf(key) != -1)
            return 5;
        if("MNO".indexOf(key) != -1)
            return 6;
        if("PRS".indexOf(key) != -1)
            return 7;
        if("TUV".indexOf(key) != -1)
            return 8;
        if("WXY".indexOf(key) != -1)
            return 9;
        else
            return -1;

        
    }
}
