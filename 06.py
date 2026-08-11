class Solution:
    def reverseWords(self, s: str) -> str:
        newStr = s.strip()
        main = newStr.split()

        i, j = 0, len(main) - 1

        while i <= j:
            main[i], main[j] = main[j], main[i]

            i += 1
            j -= 1
        return ' '.join(main)


        