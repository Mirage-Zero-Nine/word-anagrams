#!/bin/bash
clear
javac src/Entry.java src/GenerateKey.java src/DictionaryMap.java src/Anagram.java src/Reader.java

# shellcheck disable=SC2164
cd src

echo "Running test case in src/Test"
# add custom char set here with space
java Entry
java Entry edmo AaiLs OALle oplle

while true; do
  echo " "
  echo "Please input char set here: "
  read -r var
  java Entry "$var"
done

exit 0
