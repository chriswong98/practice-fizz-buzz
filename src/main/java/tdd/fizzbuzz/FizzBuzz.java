package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";

    public String countOff(int n){
        if (n %3 ==0){
            return FIZZ;
        }
        return Integer.toString(n);
    }

}
