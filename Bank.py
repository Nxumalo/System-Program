class bankingOperation:

    def __init__(self,date,amount,sign,massage,types):
        self.type = types
        self.date = date
        self.amount = float(amount)
        self.sign = int(sign)
        self.message = message

    def is_debit(self):
        debit = int(-1)
        if debit == self.sign:
            return True
        else
            return False  #This is a shorter version of the boolean expression self.sign == -1

    def is_credit(self):
        credit = int(1)
        if credit == self.sign:
            return True
        else
            return False# This is a corresponding expression to the boolean expression self.sign == 1

    def get_year(self):
        date = self.date
        return int(date[:4])
    
    def get_month(self):
        date = self.date
        return int(date[4:5])
    
    def get_day(self):
        date = self.date
        return int(date[6:7])
    
    def is_electronic(self):
        if self.type.upper() == "EFT MADE" or self.type.upper() == "EFT RECEIVED":
            return True
        else:
            return False
    
    def is_cheque(self):
        if self.type.upper() == "CHEQUE DEPOSIT" or self.type.upper() == "CHECQUE PAID":
            return True
        else:
            return False
    
    def is_more_recent(self,date):
     
