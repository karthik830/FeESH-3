import java.lang.Math;
import java.util.*;

interface Squared{
    public boolean perfectSquare(double num);
}
public class MainRunner{
<<<<<<< HEAD
    public static void main(String[] args){
        Quotient q = (one, two) ->{
            float q = one/two;
            System.out.printf("Quotient: %.3f", q);
        };
        q.printQuotient(10, 5);
    }
    public Interface Quotient
    {
        public void printQuotient(float one, float two);
=======
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
>>>>>>> PerfectSquare
    }
}