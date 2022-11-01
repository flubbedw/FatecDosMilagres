x=$1
y=$2
if [ $x -lt $y ]
then
for i in $(seq $x 1 $y)
do
echo $i
done
elif [ $x -gt $y ]
then
for i in $(seq $x -1 $y)
do
echo $i
done
fi
exit
