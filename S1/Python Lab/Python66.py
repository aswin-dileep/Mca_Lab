#create a Bank account with member account number, name,type of account
#and balance. write constructor and methods to deposit at the bank and withdraw an amount from the bank

class Bank:
    def __init__(self,ac=0,n='nil',t='nil',b=0):
        self.ac=ac
        self.n=n
        self.t=t
        self.b=b

    def deposit(self,amount=0):
        self.b+=amount
        print("New balance of ",self.ac,":",self.b)

    def withdraw(self,amount=0):
        if(amount==self.b):
            print("insufficient Balance")
        else:
            self.b=amount
            print("New balance of ",self.ac," :",self.b)


    def __str__(self):
        return "Ac no :"+str(self.ac)+"Name :"+str(self.n)
        print("Type :",self.t)
        print("Balance :",self.b)

c1=Bank(11,'Aswin','Savings')
print(c1)
c1.deposit(1000)
c1.withdraw(600)
