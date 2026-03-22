package ArraysAndHashing;

//Space Complexity -> O(1)
//Time Complexity -> O(n)
//Optimal for Google -> I think so?
//Time Spent -> 11 mins, 03/21/26
//Times googled -> 3 times checked counting and freq storing DS
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] letterFreq = new int[26]; //only lower cases

        for (char ch : s.toCharArray()) {
            letterFreq[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            letterFreq[ch - 'a']--;
        }

        for (int freq : letterFreq) {
            if (freq != 0) return false;
        }
        return true;
    }
}