#https://www.hackerrank.com/challenges/lisa-workbook/problem

def solve(n,k,lst):
    page=1
    count=0
    for i in range(n):
        problems=lst[i]
        total=0
        problem=0
        for j in range(problems):
            total+=1
            problem+=1
            #print(page,problem)
            if problem==page:
                count+=1
            if problem%k==0 and problem!=problems:
                page+=1
        page+=1
    return count


n,k=[int(x) for x in input().split()]
lst=[int(x) for x in input().split()]

print(solve(n,k,lst))
