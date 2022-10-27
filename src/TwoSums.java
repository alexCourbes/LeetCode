/** LeetCode
 * Completed on the 08/10/2022
 * https://leetcode.com/problems/two-sum/
 * **/


class TwoSums {

    public int [] twoSum(int[] nums, int target) {

        int y = 1;
        for (int i = 0; i< nums.length; ){

            if ( nums[i] + nums[y] == target ){
                return new int[] {i,y};

            }else if(y +1  == nums.length){
                i++;
                y = i+1;
            }
            else{

                y++;
            }

        }
        return null;

    }


    public static void main(String[] args) {
        TwoSums ts = new TwoSums();

        ts.twoSum(new int[]{3,2,4},6);
    }
}