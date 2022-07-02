package codewarstask.persistdebugger;

public class Persist {
    public static int persistence(long n) {
        int count = 0;
        long num = n;
        long multiply = 1;


        while (true) {
            if (n/10 == 0) {
                return count;
            }
            while (n > 0) {
                num = n % 10;
                multiply *= num;
                n/=10;
            }
            n=multiply;
            multiply=1;
            count++;
        }
    }
}

//    Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
//        which is the number of times you must multiply the digits in num until you reach a single digit.
