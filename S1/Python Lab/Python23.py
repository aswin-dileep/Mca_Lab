#write a program tocreate an inverted dictionary

d={'India':1,'is':1,'my':2,'country':2,'I':1,'love':1}

invert ={v:k for k,v in d.items()}

print(invert)