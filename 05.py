class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i, j = 0, 0

        while i < len(s) and j < len(t):
            # If characters match, move the s pointer
            if s[i] == t[j]:
                i += 1
            # Always move the t pointer
            j += 1
            
        return i == len(s)
