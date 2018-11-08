
/**
 * Write a description of class RandomWalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomWalk
{
    public static void simulate(){
    int x=0;
    int y=0;
    for(int i =0; i<1000000;i++){
    int randNum= (int)(Math.random()*4)+1;
    if (randNum==1){
    x++;
    }
    else if (randNum==2){
    x--;
    }
    
    else if (randNum==3){
    y--;
    }
    
    else {
    y++;
    }
    }
    
    System.out.println(x);
    System.out.println(y);
}
}
