x=$1
y=$2
for i in $(seq $x 1 $y)
do
echo $i
if [ $i -eq $y ]
then
break
fi
done
exit
