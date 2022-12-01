package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int n){
        if (n %3 ==0){
            return "Fizz";
        }
        return Integer.toString(n);
    }

}
