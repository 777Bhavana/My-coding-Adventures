p=float(input('\f enter your principle '))
t=float(input('enter your time  '))
r=float(input('enter your rate of interest '))
yea_of_amt =1
while t>0:
    t=t-1
    p=p+(p*r*1)/100
    print('amount for the  '+str(yea_of_amt)+'years '+'is =\t'+str(p))
    yea_of_amt=yea_of_amt+1
print('done')
print('\n\n\n\n\n YOUR FINAL AMOUNT +\t'+str(p))

