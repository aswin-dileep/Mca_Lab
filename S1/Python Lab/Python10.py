#Create a list of colors from a list of comma seperated comma seperated color name 
#enterd by the user print alternative color

colorList = input("Enter color seperated by commas :")
color = list(colorList.split(","))
print(color[::2])
