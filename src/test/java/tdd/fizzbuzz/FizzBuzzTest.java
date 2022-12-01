package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_say_the_number_when_count_off_given_normal_number(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(1);

        //then
        assertEquals("1", actual);
    }

    @Test
    void should_say_fizz_when_count_off_given_multiple_of_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(3);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_say_buzz_when_count_off_given_multiple_of_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(5);

        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_say_fizzbuzz_when_count_off_given_multiple_of_3and5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(15);

        //then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_say_fizzbuzz_when_count_off_given_multiple_of_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(7);

        //then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_say_fizzbuzz_when_count_off_given_multiple_of_3and7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(21);

        //then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_say_fizzbuzz_when_count_off_given_multiple_of_5and7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(70);

        //then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    void should_say_fizzbuzz_when_count_off_given_multiple_of_3and5and7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(105);

        //then
        assertEquals("FizzBuzzWhizz", actual);
    }

}
