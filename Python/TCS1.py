def nthterm(n):
    index=n//2
    if n%2==0:
        return 3**(index-1)
    else:
        return 2**index

print(nthterm(int(input())))
