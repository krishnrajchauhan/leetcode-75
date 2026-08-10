class Solution {
    public String reverseVowels(String s) {
        // Create a fast boolean lookup array for all ASCII characters
        boolean[] isVowel = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }
        
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        
        while (i < j) {
            // O(1) array lookup is faster than string.indexOf()
            while (i < j && !isVowel[chars[i]]) {
                i++;
            }
            while (i < j && !isVowel[chars[j]]) {
                j--;
            }
            
            // Swap
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            
            i++;
            j--;
        }
        
        return new String(chars);
    }
}
