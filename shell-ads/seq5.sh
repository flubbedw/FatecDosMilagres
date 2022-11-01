x=$1
for i in $(seq 20 -1 0)
do
echo $i
if [ $i -eq $x ]
then
break
fi
done
exit
