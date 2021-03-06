package com.smagin.ami.java.sec01;

public class IntSequenceDemo {
    public static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n) {
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void main(String[] args) {
        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);
        System.out.println("Average of first 100 squares: " + avg);
        
        IntSequence digits = new DigitSequence(1729);
        IntSequence digitRandom = new RandomSequence();
        while (digits.hasNext()) System.out.print(digits.next() + " ");
        System.out.println();

        System.out.println(digits instanceof RandomSequence);
        if(digits instanceof DigitSequence){
            DigitSequence digits1 = (DigitSequence) digits;
        }
        
        digits = new DigitSequence(1729);
        avg = average(digits, 100);
            // Will only look at the first four sequence values
        System.out.println("Average of the digits: " + avg);
    }

}
