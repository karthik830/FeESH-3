import java.lang.Math;
import java.util.*;

interface Squared{
    public boolean perfectSquare(double num);
}
public class MainRunner{
 public static void main(String[] args){
       Squared sq = num ->{
           double root = Math.pow(num, 0.5);
           String s = ''''+root;

           if(num<0){
               return false;
           }
           else if((s.substring(s.indexOf(".")+1)).equals("0")){
               return true;
           }
           else{
               return false;
           }
       };
       System.out.println(sq.perfectSquare(1.0))
    }
}