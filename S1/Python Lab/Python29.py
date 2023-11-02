#write a program to sort the dictioary in ascending and  descending order.


my_dict = {'b': 3, 'a': 1, 'd': 4, 'c': 2}


sorted_dict_asc = dict(sorted(my_dict.items(), key=lambda item: item[0]))


print("Dictionary sorted in ascending order:", sorted_dict_asc)

sorted_dict_desc = dict(sorted(my_dict.items(), key=lambda item: item[0], reverse=True))


print("Dictionary sorted in descending order:", sorted_dict_desc)
