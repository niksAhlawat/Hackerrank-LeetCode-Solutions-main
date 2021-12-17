#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'jumpingOnClouds' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY c as parameter.
#

def jumpingOnClouds(cloud):
    # Write your code here
    jump, currentCloud= 0, 0
    while(currentCloud < len(cloud) - 1):

        # There are only two ways to jump. Either jump two clouds away or one 
        # cloud away from the current position

        # Check if next 2 clouds are "cumulus" which values are 0s and cloud length not exceed current cloud
        # If they are cumulus then jump to 2 clouds away from the current cloud
        # else jump 1 position away from the current cloud
        # Since you jump on both cases, you just have to increment the number 
        # of jumps by 1.

        if ((currentCloud+2<len(cloud)) and (cloud[currentCloud+2] == 0)):
            jump +=1
            currentCloud +=2
        else:
            jump +=1
            currentCloud +=1
    
    return jump

if __name__ == '__main__':
    n = int(input().strip())

    c = list(map(int, input().rstrip().split()))

    result = jumpingOnClouds(c)

    
