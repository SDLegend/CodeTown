"""
The logic is to solve the sub-problems and make decisions using them.
We create matrix of (n+1)*(size+1) and each of these elements answer a sub-problem.
ith row and jth coloumn will tell what is the max value I can get if I have size=j and objects till index i.
For eg: for i=2 and j=6 will tell what is the max value I can get if I have size=6 and objects 1,2.
The decision making happens in selecting max([matrix[i-1][j],matrix[i-1][j-weights[i-1]]+values[i-1]])
The choice matrix[i-1][j] represents I do not take the current object and
the choice matrix[i-1][j-weights[i-1]]+values[i-1] represents
I take the current object and then I see what is the max value I can get from the capacity left 
"""

def knapsack(values,weights,n,size):
    matrix=[]
    for i in range(n+1):
        matrix.append([0]*(size+1))
    for i in range(1,n+1):
        for j in range(1,size+1):
            if j>=weights[i-1]:
                matrix[i][j]=max([matrix[i-1][j],matrix[i-1][j-weights[i-1]]+values[i-1]])
            else:
                matrix[i][j]=matrix[i-1][j]
    return matrix[-1][-1]

values=[1,2,5,6]
weights=[2,3,4,5]
size=8
print(knapsack(values,weights,len(values),size))
