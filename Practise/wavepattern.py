def is_z_number(n):
    digits = list(map(int, str(n)))
    length = len(digits)
    
    if length < 2:
        return False 

    for i in range(1, length - 1):
        if i % 2 == 1:
           
            if not (digits[i - 1] > digits[i] < digits[i + 1]):
                return False
        else:
            
            if not (digits[i - 1] < digits[i] > digits[i + 1]):
                return False
    return True 


a=int(input("Enter a number: "))
for i in range(1,a+1):
    if is_z_number(i):
        print(i,end=" ")