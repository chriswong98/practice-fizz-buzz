package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String countOff(int n){
        if (n %3 ==0){
            return FIZZ;
        }
        else if(n%5 ==0){
            return BUZZ;
        }
        
        return Integer.toString(n);
    }

}
