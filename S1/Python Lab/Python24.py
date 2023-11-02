# Enter 2 collection of integers 

#a) Check whether they are of same length

a = input ("Enter Collection 1 :").split()
map(int,a)
b = input("Enter Collection 2 :").split()
map(int,b)

n = set(map(int ,a))
n1 = set(map(int,b))

print("the length of 2 collection are same :",bool(len(a)==len(b)))


#b) Check the sum to same is same



print("The sum of the 2 collections are same :",bool(sum(n)==sum(n1)))

#c) Check whether any value occure in both

print("same value occure in both :",bool(n&n1))