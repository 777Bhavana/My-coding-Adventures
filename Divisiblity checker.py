print('enter numerator')
n = float(input())
print('enter denominator')
d = float(input())
if n % d == 0:
    print(str(n) + ' is divisible  by ' + str(d))
elif n % d != 0:
    print(str(n) + ' is not divisible  by ' + str(d))
