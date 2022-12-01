package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String WHIZZ = "Whizz";
    public static final String FIZZ_WHIZZ = "FizzWhizz";
    public static final String BUZZ_WHIZZ = "BuzzWhizz";
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public String countOff(int n){

        if(n%3 ==0 && n%5==0&& n%7==0){
            return FIZZ_BUZZ_WHIZZ;
        }
        else if(n%5==0&& n%7==0){
            return BUZZ_WHIZZ;
        }
        else if(n%3==0&& n%7==0){
            return FIZZ_WHIZZ;
        }
        else if(n%3==0 && n%5==0){
            return FIZZ_BUZZ;
        }
        else if (n %3 ==0){
            return FIZZ;
        }
        else if(n%5 ==0){
            return BUZZ;
        }
        else if(n%7 ==0){
            return WHIZZ;
        }
        
        return Integer.toString(n);
    }

}
