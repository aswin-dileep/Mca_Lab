#Program to display leap year from current year to a future year entered by the user

n =int(input("Enter a future year :"))
result = [year for year in range(2023,n) if year %4 ==0 and (year %400==0 or year %100!=0)]
print("\n Leap Years are :",result)