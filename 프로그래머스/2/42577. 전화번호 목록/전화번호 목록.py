def solution(phone_book):

    dic = {}
    for phone_number in phone_book:
        dic[phone_number] = 1
    
    for phone_number in phone_book:
        prefix = ""
        for digit in phone_number:
            prefix += digit
            if prefix in dic and prefix != phone_number:
                return False
    
    return True
    