#create a class publisher(name) Derive class Book (titile,author) from
#publisher Berive class python (price,no_of_pages) from Book write a program
#that didplays information about a python book . use base class as constructor invocation
#method Overriding

class Publisher:
    def __init__(self,n='nil'):
        self.name=n
        
    def display(self):
        print('Name : ',self.name)

class Book(Publisher):
    def __init__(self,n='nil',t='nil',a='nil'):
        super().__init__(n)
        self.title=t
        self.author=a

    def display(self):
        super().display()
        print('title : ',self.title)
        print('author : ',self.author)

class Python(Book):
    def __init__(self,n='nil',t='nil',a='nil',p=0,nop=0):
        super().__init__(n,t,a)
        self.price=p
        self.nop=nop

    def display(self):
        super().display()
        print('price : ',self.price)
        print('no of pages : ',self.nop)

p1=Python('publisher1','title1','author1',150,500)
p2=Python('publisher2','title2','author2',250,600)
print('BOOK 1')
p1.display()
print('BOOK 2')
p2.display()
