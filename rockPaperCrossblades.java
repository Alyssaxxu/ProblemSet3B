
/**
 * @alyssa xu
 */

import java.util.Scanner;
public class rockPaperCrossblades
{
    Scanner input = new Scanner(System.in);
    public rockPaperCrossblades() {
    }

    public static String computerResponse(String a){
        String b = ".";
        if ( a.equals ("des")) {
            b = "rock";
        }
        if ( a.equals("ock")) {
            b = "paper";
        }
        if ( a.equals("per")){
            b = "crossblades";
        }
        String r = b;
        return r;
    }

    public static String computerRandom( ){
        int x = (int) (Math.random() * 3) + 1;
        String a = "rock";
        String b = "paper";
        String c = "crossblades";
        if (x == 1){ 
            return a;
        } else if (x == 2) {
            return b;  
        } else{
            return c;
        }
       
    }

}
