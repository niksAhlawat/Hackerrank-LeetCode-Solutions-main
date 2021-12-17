class Solution(object):
    
    def countBinarySubstrings(self, s):
        
        sLen = len(s)
        count, zero, one, zeroCnt, oneCnt = 0, 0, 0, 0, 0
        while True:
            while zero < sLen and s[zero] == '0':
                zero += 1
            zeroCnt = zero - one
            count += min(zeroCnt, oneCnt)
            if zero == sLen:
                break
            oneCnt = 0
            one = zero
            while one < sLen and s[one] == '1':
                one += 1
            oneCnt = one - zero
            count += min(zeroCnt, oneCnt)
            if one == sLen:
                break
            zero = one
            zeroCnt = 0
        return count