package com.company;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        for(String str : fizzBuzz(5)) {
            System.out.println(str);
        }
        String[] answerFive = new String[] {"1","2","Fizz","4","Buzz"};
        if (!Arrays.equals(fizzBuzz(5), answerFive))
        {
            System.out.println("Failed! Try again.");
        } else {
            System.out.println("Correct!");
        }

        for(String str : fizzBuzz(15)) {
            System.out.println(str);
        }
        String[] answerFifteen = new String[] {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
        if (!Arrays.equals(fizzBuzz(15), answerFifteen))
        {
            System.out.println("Failed! Try again.");
        } else {
            System.out.println("Correct!");
        }

    }

    /*
     * This function returns a String that obeys
     * the rules of the game "fizz buzz."
     * The rules: When counting up from 1 to n,
     * if the number is a multiple of 3, say "fizz."
     * If the number is a multiple of 5, say "buzz."
     * If it is a multiple of both, say "fizz buzz."
     */
    public static String[] fizzBuzz(int n)

    {

        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            int j = 0;
            int k = 0;
            if(i % 3 == 0){
                 j = 1;

            }
            if(i % 5 == 0){
                 k = 1;
            }
            if (j == 1 && k == 1) {
                result[i - 1] = "FizzBuzz";

            }
            else if (j == 1) {
                result[i - 1] = "Fizz";
            }
            else if (k == 1) {
                result[i - 1] = "Buzz";
            }
            else {
                result[i - 1] = Integer.toString(i);
            }

        }
        return result;
    }

}