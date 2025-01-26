#!bin/bash

# echo "welcome to java compiler"
# file="$1"
# echo $file " === " $1

echo "It will help in compiling and running the java program"
file="$1"
javac $file
echo "compiling for file:" $file
java $file
echo "compiling the program with status of success"
