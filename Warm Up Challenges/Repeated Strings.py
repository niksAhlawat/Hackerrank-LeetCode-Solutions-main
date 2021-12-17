#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'repeatedString' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. STRING s
#  2. LONG_INTEGER n
#


# This Method is Efficient and works perfectly on HackerRank.
def repeatedString1(s, n):
    
    return (s.count('a') * (n//len(s))+s[:n%len(s)].count('a'))


# This method is not Memory Efficient and a Naive approach to solve the problem.
# If you want to add your approach or modify this snippet then you are welcome.
def repeatedString2(s,n):

    a = list(s)
    while n>len(a):
        a.extend(a[x] for x in range(n - len(a)))
        n-=1
    return (a.count('a')) 
    


if __name__ == '__main__':
    
    s = input()
    n = int(input().strip())
    result = repeatedString1(s, n)
    result = repeatedString2(s, n)

