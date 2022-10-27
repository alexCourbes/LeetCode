import java.util.Arrays;
import java.util.LinkedList;

public class romanToInteger {
    public static void main(String[] args) {
        romanToInteger r = new romanToInteger();
        System.out.println( r.romanToInt("MCMXCIV"));

    }

    public int romanToInt(String s) {
        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length();i++){

            switch (s.charAt(i)){

                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
            }

        }
        int total = 0;

        for (int i = 0; i<nums.length-1;i++){
            if (nums[i] < nums[i+1]){
                total -= nums[i];
            }

            else{
                total += nums[i];
            }
        }

        return total + nums[nums.length-1];
    }
}
