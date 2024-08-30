#!/bash/bin
echo "Enter the limit :"
read limit
for((i=0;i<limit;i++))
    do 
        echo "Enter the $((i+1)) th element :"
        read arr[i]
    done

for((i=0;i<limit;i++))
do
    for((j=i+i;j<limit;j++))
    do
        if((${arr[i]}>${arr[j]}))
        then
            temp=${arr[i]}
            arr[i]=${arr[j]}
            arr[j]=${temp}
        fi
    done
done



for((i=0;i<limit;i++))
    do
        echo ${arr[i]}
    done
