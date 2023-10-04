#Accept a filename from user and print extension of that file file

file = input("Enter the filename with extension :")

exe = file.split('.')[-1]

print(exe)