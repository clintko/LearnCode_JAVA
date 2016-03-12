# initialization
numHead=0
numTail=0
echo Counting...

# loop through the file 
# and count the number of Head and Tail
while read res; do
    #echo $res
    if [ "$res" == "Heads" ]; then
        let "numHead += 1"
    else
        let "numTail += 1"
    fi
done

echo Finish
echo "Number of Heads: $numHead"
echo "Number of Tails: $numTail"
