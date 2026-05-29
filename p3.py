class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left = 0
        anset = set()
        maxlength = 0

        for right in range(len(s)):
            while s[right] in anset:
                anset.remove(s[left])
                left+=1

            anset.add(s[right])

            maxlength = max(maxlength, right-left+1)

        return maxlength
