package ArraysAndHashing;

import java.util.HashMap;

//Space Complexity -> O(n)
//Time Complexity -> O(n)
//Optimal for Google -> Yes?
//Time Spent -> 8mins, 03/24/26
//Times googled -> 2 times checked Map methods
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seenNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];
            if (seenNums.containsKey(secondNum)) {
                return new int[] {seenNums.get(secondNum), i};
            } else seenNums.put(nums[i], i);
        }
        return new int[]{};
    }
}