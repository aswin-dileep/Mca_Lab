#wite a program to accept percentage of marks from user and display the grade

def Calculate_grade(percentage):
    if percentage>=90:
        return 'A+'
    elif percentage>=80:
        return 'A'
    elif percentage>=70:
        return 'B'
    elif percentage>=60:
        return 'C'
    elif percentage>=50:
        return 'D'
    else:
        return 'F'

percentage =float(input("Enter the percentage of marks :"))

if 0<= percentage<=100:
    grade = Calculate_grade(percentage)
    print("Your grade is :",grade)
else:
    print("Invalid percentage !!")