package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Space Complexity -> O(n * k log k)
//Time Complexity -> O(n)
//Optimal for Google -> Maybe
//Time Spent -> 1hour, 03/24/26
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> freqMapWithList = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String freqCode = String.valueOf(charArray);

            if (freqMapWithList.containsKey(freqCode)) {
                freqMapWithList.get(freqCode).add(strs[i]);
            } else {
                freqMapWithList.put(freqCode, new ArrayList<>(List.of(strs[i])));
            }
        }

        List<List<String>> finalListOfSubsets = new ArrayList<>();
        for (List<String> subset : freqMapWithList.values()) {
            finalListOfSubsets.add(subset);
        }
        return finalListOfSubsets;
    }
}