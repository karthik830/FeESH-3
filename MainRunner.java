public class MainRunner{
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
    }
}