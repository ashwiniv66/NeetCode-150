//Contains Duplicate -  EASY
//        Given an integer array nums, return true if any value appears more than once in the array,
//        otherwise return false.
//
//        Example 1:
//
//        Input: nums = [1, 2, 3, 3]
//
//        Output: true
//
//        Example 2:
//
//        Input: nums = [1, 2, 3, 4]
//
//        Output: false

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class ContainsDuplicate {

    //APPROACH USING ARRAYS
    /* Time & Space Complexity:
       Time Complexity: O(n log n) (because of sorting)
       Space Complexity: O(1) (ignoring sorting internal space)
    */

//    public boolean hasDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i = 0 ; i < nums.length - 1; i++){
//            if(nums[i] == nums[i+1]){
//                return true;
//            }
//        } return false;
//    }


    //APPROACH USING HASHSET

    /*Time & Space Complexity (HashSet Version)
    Time Complexity: O(n) ✅ (Best)
    Space Complexity: O(n) (Extra space for HashSet)
     */
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;   // Duplicate found
            }

            set.add(num);
        }

        return false;   // No duplicates
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        ContainsDuplicate obj = new ContainsDuplicate();
        boolean result = obj.hasDuplicate(nums);

        if (result) {
            System.out.println("Array contains duplicate elements.");
        } else {
            System.out.println("Array does not contain duplicate elements.");
        }

        sc.close();
    }

}

