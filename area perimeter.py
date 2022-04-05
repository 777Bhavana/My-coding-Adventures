import math
print('Area perimeter diagonal calC of a rectangle')
print('Enter the length of the rectangle')
length = float(input())
print('Enter the breath of the rectangle')
breadth = float(input())
area = length * breadth
peri = 2 * (length + breadth)
diagonal = math.sqrt(length + breadth)
print('PERIMETER of your rectangle = ' + str(peri))
print('AreA of your rectangle = ' + str(area))
print('DIAGONAL of your rectangle = ' + str(diagonal))
