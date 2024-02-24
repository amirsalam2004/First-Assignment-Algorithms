import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercises2 {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    */

    public int[] twoSum(int[] nums, int target) {
        // TODO
        return null;
    }

    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two ones added together.
    12 is written as XII, which is simply X + II.
    The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII.
    Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given a roman numeral, convert it to an integer.
    */

    public int romanToInt(String s) {
        s+="  ";
        int num=0;
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+1).equals("M"))
                num+=1000;
            if(s.substring(i,i+1).equals("D"))
                num+=500;
            if(s.substring(i,i+1).equals("C"))
                num+=100;
            if(s.substring(i,i+1).equals("L"))
                num+=50;
            if(s.substring(i,i+1).equals("X"))
                num+=10;
            if(s.substring(i,i+1).equals("V"))
                num+=5;
            if(s.substring(i,i+1).equals("I"))
                num+=1;
            if(s.substring(i,i+2).equals("CM") || s.substring(i,i+2).equals("CD"))
                num-=200;
            if(s.substring(i,i+2).equals("XL") || s.substring(i,i+2).equals("XC"))
                num-=20;
            if(s.substring(i,i+2).equals("IX") || s.substring(i,i+2).equals("IV"))
                num-=2;
        }
        return num;
    }

    /*
    Given an array nums of distinct integers, return all the possible permutations.
    You can return the answer in any order.
    */

    public List<List<Integer>> permute(int[] nums) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        // test your code here!
    }
}