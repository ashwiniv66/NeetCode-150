import java.util.Arrays;
import java.util.HashMap;
//        Two Sum -  EASY
//
//        Given an array of integers nums and an integer target,return the indices i and j such that nums[i]+nums[j]==target and i!=j.
//
//        You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
//
//        Return the answer with the smaller index first.
//
//        Example 1:
//
//        Input:
//        nums=[3,4,5,6],target=7
//
//        Output:[0,1]
//        Explanation:nums[0]+nums[1]==7,so we return[0,1].
//
//        Example 2:
//
//        Input:nums=[4,5,6],target=10
//
//        Output:[0,2]

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}

