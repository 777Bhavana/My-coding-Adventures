print("choose your option")
print("to find constant with Boyle's Law's P1v1 = P2V2 = K")
print("to find constant with Charles Law's v1/t1 = v2/t2 = k")
print("to find the constant with GAS EQUATION p1*v1/t1 =p2*v2/t2 ")
ch = int(input())
if ch == 1:
    print("to find constant with Boyle's Law's P1v1 = P2V2 = K")
    print(
        "What do you want to keep as x constant enter that as lower case letter followed by 1or2 like p1 p2 v1 v2 t1 t2")
    print("p1\np2\nv1\nv2")
    print(
        "enter the other values in STP conditions only \n in this order p1,v1,p2,v2\n your chosen constant value will "
        "be ignored;")
    ch2 = input('enter here ')
    if 'p1' in ch2:  # p1
        v1 = float(input('enter v1'))
        p2 = float(input('enter p2'))
        v2 = float(input('enter v2'))
        p1 = (p2 * v2) / v1
        print("value of preassure 1 =" + str(p1))
    if 'v1' in ch2:
        p1 = float(input('enter p1'))
        p2 = float(input('enter p2'))
        v2 = float(input('enter v2'))
        v1 = p2 * v2 / p1
        print("value of volume 1 =" + str(v1))
    if 'p2' in ch2:
        v1 = float(input('enter v1'))
        p1 = float(input('enter p1'))
        v2 = float(input('enter v2'))
        p2 = p1 * v1 / v2
        print("value of preassure 2 =" + str(p2))
    if 'v2' in ch2:
        v1 = float(input('enter v1'))
        p2 = float(input('enter p2'))
        p1 = float(input('enter p1'))
        v2 = p1 * v1 / p2
        print("value of volume 2 =" + str(v2))
    else:
        print('wrong input')
        exit(0)
if ch == 2:
    print("to find constant with Charles Law's v1/t1 = v2/t2 = k")
    print(
        "What do you want to keep as x constant enter that as lower case letter followed by 1or2 like p1 p2 v1 v2 t1 t2")
    print("t1\nt2\nv1\nv2")
    ch2 = input('enter here')
    print(
        "enter the other values in STP conditions only \n in this order t1,v1,t2,v2\n your chosen constant value will "
        "be ignored;")
    if 't1' in ch2:
        v1 = float(input())
        t2 = float(input())
        v2 = float(input())
        t1 = v2 / t2 * v1
        print("value of tempature 1 =" + str(t1))
    if 'v1' in ch2:
        t1 = float(input())
        t2 = float(input())
        v2 = float(input())
        v1 = v2 / t2 * t1
        print("value of volume1 =" + str(v1))
    if 'v2' in ch2:
        t1 = float(input())
        v1 = float(input())
        t2 = float(input())
        v2 = v1 / t1 * t2
        print("value of volume2 =" + str(v2))
    if 't2' in ch2:
        t1 = float(input())
        v1 = float(input())
        v2 = float(input())
        t2 = t1 * v2 / v1
        print("value of temperature 2 =" + str(t2))
    else:
        print('wrong input')
        exit(0)
if ch == 3:
    print("to find the constant with GAS EQUATION p1*v1/t1 =p2*v2/t2 ")
    print("the values should be entered in the order t1 v1 t2 v2 p1 p2 in stp conditions only")
    print("enter your constant value as p1 t1 v1 t2 v2 p1 p2  only no upper case or spaces")
    ch2 = input()
    if 'p1' in ch2:
        t1 = float(input())
        v1 = float(input())
        t2 = float(input())
        v2 = float(input())
        p2 = float(input())
        p1 = p2 * v2 * v1 / t2 * t1
        print("p1 =" + str(p1))
    if 'p2' in ch2:
        t1 = float(input())
        v1 = float(input())
        t2 = float(input())
        v2 = float(input())
        p1 = float(input())
        p2 = (p1 * v1 * t2) / (t1 * v2)
        print("p2 =" + str(p2))
    if 'v1' in ch2:
        t1 = float(input())
        t2 = float(input())
        v2 = float(input())
        p1 = float(input())
        p2 = float(input())
        v1 = (p2 * v2 * t1) / (t2 * p1)
        print("v1 =" + str(v1))
    if 'v2' in ch2:
        t1 = float(input())
        v1 = float(input())
        t2 = float(input())
        p1 = float(input())
        p2 = float(input())
        v2 = (p1 * v1 * t2) / (t1 * p2)
        print("v2 =" + str(v2))
    if 't1' in ch2:
        v1 = float(input())
        t2 = float(input())
        v2 = float(input())
        p1 = float(input())
        p2 = float(input())
        t1 = (p2 * v2) / (t2 * p1 * v1)
        print("t1 =" + str(t1))
    if 't2' in ch2:
        t1 = float(input())
        v1 = float(input())
        v2 = float(input())
        p1 = float(input())
        p2 = float(input())
        t2 = (p1 * v1) / (t1 * p2 * v2)
        print("t2 =" + str(t2))
    else:
        print('\u000C')
        print("wrong input\n program terminates")
else:
    print('\u000C')
    print("wrong input\n program terminates")
