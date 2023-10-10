
/**
 * @alyssa xu
 */

import java.util.Scanner;
public class Driver
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades! ");
        System.out.print ("You: ");
        String response = input.nextLine();
        response = response.toLowerCase(); 
        String answer = response.substring(response.length()-3); 

        if (response.length() >= 50){
            String x = rockPaperCrossblades.computerRandom();
            if (x.substring(x.length() - 3).equals("ock") && answer.equals("per")){
                System.out.println( "Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + x);
                System.out.println(" Result: Imposible!!!!!! How did you win!!!");
            } else if (x.substring(x.length() - 3).equals("per") && answer.equals("des")) {
                System.out.println( "Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + x);
                System.out.println(" Result: Imposible!!!!!! How did you win!!!");
            } else if (x.substring(x.length() - 3).equals("des") && answer.equals("ock")) {
                System.out.println( "Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + x);
                System.out.println(" Result: Imposible!!!!!! How did you win!!!");
            }else if ( x.substring(x.length()-3).equals(answer)){
                System.out.println( "Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + x);
                System.out.println(" Result: Unbelievable! We have tied! *Eye twitches*");
            } else if (x.substring(x.length() - 3).equals("ock") && answer.equals("des")){
                System.out.println( "Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + x);
                System.out.println( " Result: HAHAHAHA I WON!!!!");
            } else if (x.substring(x.length() - 3 ).equals("per") && answer.equals("ock")){
                System.out.println( "Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + x);
                System.out.println( " Result: HAHAHAHA I WON!!!!");
            } else if (x.substring(x.length()- 3).equals("des") && answer.equals("per")){
                System.out.println( "Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course:" + x);
                System.out.println( " Result: HAHAHAHA I WON!!!!");
            } 
        }
        else if (response.length() < 50){
            String l = ".";
            if (answer.equals("des")) {
                String x = rockPaperCrossblades.computerResponse("des");
                System.out.println( "Me: Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose " + x);
                System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
            }
            if (answer.equals( "per")){
                String x = rockPaperCrossblades.computerResponse("per");
                System.out.println( "Me: Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose " + x);
                System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
            }
            if(answer.equals ("ock")) {
                String x = rockPaperCrossblades.computerResponse("ock");
                System.out.println( "Me: Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose " + x);
                System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
            }
        }
        if ( !answer.equals("des") && !answer.equals( "per") && !answer.equals("ock")){
            System.out.println("Me: You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
            System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
        } 

    }
}

