#!/bin/bash

echo " " > op.txt

for i in $(cat f.txt)
do
    num=${i}
    echo $num
    
    echo $i >>  op.txt
done
cat -n op.txt > cat