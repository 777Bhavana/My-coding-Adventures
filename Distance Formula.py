#  distance formula \/-----(x2-x1)^2 + (y2-y1)^2
import math
print('TO FIND Euclidian DISTANCE ENTER THE FOLLOWING')
print('enter the value of x1')
x1 = float(input())
print('enter the value of x2')
x2 = float(input())
print('enter the value of Y1')
y1 = float(input())
print('enter the value of y2')
y2 = float(input())
point1 = (x1, y1)
point2 = (x2, y2)
diffOFx = x2 - x1
diffOFy = y2 - y1
distance = math.sqrt(math.pow(diffOFx, 2) + math.pow(diffOFy, 2))
print('Your Euclidian Distance = '+ str(distance ))

