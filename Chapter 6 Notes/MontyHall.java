
/**
 * Write a description of class MontyHall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MontyHall
{

    public static void runTests(){
        String door1;
        String door2;
        String door3;
        int strat1=0;
        int strat2=0;
        for(int i =1; i<=1000;i++){

            int randNum= (int)(Math.random()*3)+1;
            if (randNum==1){
                door1="car";
                door2="goat";
                door3="goat";
            }
            else if (randNum==2){
                door2="car";
                door1="goat";
                door3="goat";
            }
            else{
                door3="car";
                door2="goat";
                door1="goat";

            }

            int playerGuess= (int)(Math.random()*3)+1;
            if (playerGuess==1){
                if (door2.equals("goat")&&door3.equals("goat")){
                strat1++;
                }
                else{
                strat2++;
                }
            }

            else if (playerGuess==2){
                    if (door1.equals("goat")&&door3.equals("goat")){
                strat1++;
                }
                else{
                strat2++;
                }
            }
            else{
                    if (door2.equals("goat")&&door1.equals("goat")){
                strat1++;
                }
                else{
                strat2++;
                }
            }
        }
        System.out.println("strat1: "+strat1);
        System.out.println("strat2: "+strat2);
    }
}
