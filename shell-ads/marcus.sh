if [ $1 -le 200 ]
then
echo 5,00
elif [ 201 -le $1 ] && [ $1 -le 400 ]
then
echo 4,50
else
echo 4,00
fi
exit 0
