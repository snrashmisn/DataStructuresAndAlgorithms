package main.java.numbers;

import java.math.BigDecimal;

/**
 * Created by rasn on 8/30/16.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        BigDecimal a;
        if(n <= 0) return false;
        //if(n == 1) return true;
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Math.log(Integer.MAX_VALUE) = " + Math.log(Integer.MAX_VALUE)/Math.log(2));
        System.out.println("Math.pow(2, 21) = " + Math.pow(2, 30));
        System.out.println("Math.pow(2, Math.log(Integer.MAX_VALUE)) = " + (int) Math.pow(2, Math.log(Integer.MAX_VALUE)));
        return (int) Math.pow(2, (int) (Math.log(Integer.MAX_VALUE)/Math.log(2))) % n == 0 ? true : false;
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println("powerOfTwo.isPowerOfTwo(1) = " + powerOfTwo.isPowerOfTwo(4194304));
    }
}
