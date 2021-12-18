#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())

    #arr = list(map(int, input().rstrip().split()))

    arr = [9,2,3,7]
    
    #Approach 1
    for i in range(len(arr)-1 , -1, -1):
        print(arr[i])
        
    
    #Approach 1
    for x in reversed(arr):
        print(x, end =" ")
