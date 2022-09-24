if [ $1 = 0 ]
then
whoami
fi
if [ $1 = 1 ]
then
ls
fi
if [ $1 = 2 ]
then
cat prog.sh
fi
exit 0
