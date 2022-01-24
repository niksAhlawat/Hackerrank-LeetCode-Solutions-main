#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'countingValleys' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER steps
#  2. STRING path
#

def countingValleys(steps, path):
    # Write your code here
    sea_lvl = 0
    valley = 0
    for i in range(steps):
        if path[i] == "D" and sea_lvl == 0:
            valley +=1
        if path[i] == "U":
            sea_lvl += 1
        else:
            sea_lvl -=1
        
    return valley  

if __name__ == '__main__':
    steps = int(input().strip())
    path = input()
    result = countingValleys(steps, path)
    print(result)
