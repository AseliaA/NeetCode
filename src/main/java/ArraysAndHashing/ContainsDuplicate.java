package ArraysAndHashing;

import java.util.HashSet;

//Space Complexity -> O(n)
//Time Complexity -> O(n)
//Optimal for Google -> Yes
//Time Spent -> 5mins, 03/17/26
public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {
            if (hash.contains(num)) {
                return true;
            } else {
                hash.add(num);
            }
        }
        return false;
    }
}