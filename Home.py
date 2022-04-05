def boylesLAW():

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

def charlesLAW():
    def v1_constant(t1,v2,t2):
        v1=v2*t1/t2
        return v1
    def t1_constant(v1,v2,t2):
        t1=v2*t2/v1
        return t1
    def v2_constant(v1,t2,t1):
        v2=v1*t2/t1
    def t2_constant(v1,t1,v2):
        t2=v1/t1*v2
        return t2
    
    q=input("Enter your unknown variable as  v1 t1 v2 or t2   ").lower
    if q=='v1':
        t1 =int(input("t1 "))
        v2=int(input('v2 '))
        t2=int(input('t2 '))
        print(f' Your Anser {v1_constant(t1,v2,t2)}')
    elif q=='t1':
        v1 =int(input("v1 "))
        v2=int(input('v2 '))
        t2=int(input('t2 '))
        print(f' Your Answer {t1_constant(v1,v2,t2)}')
    elif q=='v2':
        t1 =int(input("t1 "))
        v1=int(input('v1 '))
        t2=int(input('t2 '))
        print(f' Your Answer = {v2_constant(v1,t2,t1)}')
    elif q=='t2':
        t1 =int(input("t1 "))
        v1=int(input('v1 '))
        v2=int(input('v2 '))
        print(f' Your Anwser = {t2_constant(v1,t1,v2)}')
    else:
        print('INVALID INPUT')

def gas_equation():
    def p1_constant(v1,t1,p2,v2,t2):
        p1 =p2*v2*t1/t2*v1
        return p1

    def v1_constant(p1,t1,p2,v2,t2):
        v1=p2*v2*t1/t2*p1
        return v1

    def t1_constant(p1,v1,p2,v2,t2):
        t1=p2*v2/t2*p1*v1
        return t1

    def p2_constant(p1,v1,t1,v2,t2):
        p2=p1*v1*t2/v2*t1
        return p2
    
    def v2_constant(p1,v1,t1,p2,t2):
        v2 =p1*v1*t2/t1*p2
        return v2
    
    def t2_constant(p1,v1,t1,p2,v2):
        t2=p1*v1/t1*p2*v2
        return t2

    q=input(' enter your constant as p1 v1 t1 p2 v2 t2 ').lower
    if q=='p1':
            v1=float(input("v1 "))
            t1=float(input("t1 "))
            p2=float(input("p2 "))
            v2=float(input("v2 "))
            t2=float(input("t2 "))
            print(f'Your Anwser = {p1_constant(v1,t1,p2,v2,t2)}')
    if q=="v1":
        p1=float(input("p1 "))
        t1=float(input("t1 "))
        p2=float(input("p2 "))
        v2=float(input("v2 "))
        t2=float(input("t2 "))
        print(f'Your anser = {v1_constant(p1,t1,p2,v2,t2)}')
    if q=="t1":
        v1=float(input("v1 "))
        p1=float(input("p1 "))
        p2=float(input("p2 "))
        v2=float(input("v2 "))
        t2=float(input("t2 "))
        print(f'Your Anwser = {t1_constant(p1,v1,p2,v2,t2)}')
    if q=="p2":
        v1=float(input("v1 "))
        t1=float(input("t1 "))
        p1=float(input("p1 "))
        v2=float(input("v2 "))
        t2=float(input("t2 "))
        print(f'Your Anwser = {p2_constant(p1,v1,t1,v2,t2)}')
    if q=="v2":                
        v1=float(input("v1 "))
        t1=float(input("t1 "))
        p2=float(input("p2 "))
        p1=float(input("p1 "))
        t2=float(input("t2 "))
        print(f'Your Anwser = {v2_constant(p1,v1,t1,p2,t2)}') 
    elif q=="t2":
        t1=float(input("t1 "))
        p2=float(input("p2 "))
        p1=float(input("p1 "))
        p1=float(input("p1 "))
        print(f'Your Anwser = {t2_constant(p1,v1,t1,p2,v2)}')  


print('Enter 1 for Boyle\'s law Equation \nEnter 2 for Charles\' law equation \nEnter for gas Equation')
choice =int( input())
if choice==1:
    boylesLAW()
elif choice == 2:
    charlesLAW()
elif choice==3:
    charlesLAW()
else :
    print('INVALID INPUT!!!!!!!')
