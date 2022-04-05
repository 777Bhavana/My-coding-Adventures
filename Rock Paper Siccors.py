import random
def play():
    user=input('Enter "p" "s" "r" for paper siccors or rock respectively     ').lower
    computer =random.choice(['p','s','r'])    # choses a random b\w  p r s 
    
    if user==computer:
        return 'IT\'s a tie'
    
    if is_win(user,computer): # if the user won it'll print true else false 
        return 'You won'
    return 'you lost'

# now this fun is made to check if the user/player won or not  so if the user won it'll retuen true else false
def is_win(you,opponent): 
    # r > s, s > p, p > r
    if (you=='r'and opponent=='s') or (you=='s'and opponent=='p') or (you=='p'and opponent=='r'):
        return True
    

print(play())







