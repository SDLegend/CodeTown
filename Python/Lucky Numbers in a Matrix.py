#https://leetcode.com/contest/weekly-contest-180/problems/lucky-numbers-in-a-matrix/

class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        m,n=len(matrix),len(matrix[0])
        minrows,maxcols=[0]*m,[0]*n
        rowmins=set()
        for i in range(m):
            tempmin=1000000
            for j in range(n):
                if matrix[i][j]<tempmin:
                    tempmin=matrix[i][j]
                if matrix[i][j]>maxcols[j]:
                    maxcols[j]=matrix[i][j]
            minrows[i]=tempmin+0
            rowmins.add(tempmin+0)
        lst=[]
        for i in range(n):
            if maxcols[i] in rowmins:
                print(maxcols[i])
                lst.append(maxcols[i])         
        return lst