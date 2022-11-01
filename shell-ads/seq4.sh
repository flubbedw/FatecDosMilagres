x=$1
for i in $(seq 0 10)
do
echo $i
if [ $i -eq $x ]
then
break
fi
done
exit
