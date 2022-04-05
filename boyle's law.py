# Yayyyy it works happy dance
def p1_constant(v1,p2,v2):
    p1 =p2*v2/v1
    return p1

def v1_constant(p1,p2,v2):
    v1=p2*v2/p1
    return v1

def p2_constant(p1,v1,v2):
    p2=p1*v1/v2
    return p2

def v2_constant(p1,v1,p2):
    v2=p1*v1/p2
    return v2

q=input("Enter your unknown variable as  p1 v1 v2  or p2  ")
if q=='p1':
    v1=int(input('v1 '))
    p2=int(input('p2 '))
    v2=int(input('v2 '))
    print(f'Your Anser ={p1_constant(v1,p2,v2)}')

elif q=='v1':
    p1=int(input('p1 '))
    p2=int(input('p2 '))
    v2=int(input('v2 '))
    print(f'Your Answer = {v1_constant(p1,p2,v2)}')

elif q=='p2':
    v1=int(input('v1 '))
    p1=int(input('p1 '))
    v2=int(input('v2 '))
    print(f'Your Answer = {p2_constant(p1,v1,v2)}')

elif  q=='v2':
    p1=int(input("p1 "))
    v1=int(input('v1 '))
    p2=int(input('p2 '))
    print(f'Your Answer = {v2_constant(p1,v1,p2)}')
