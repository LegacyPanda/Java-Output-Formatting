# Java Output Formatting

## What to do 
- The java System.out.printf function can be used to print formatted output.
- Every line of input will contain a String followed by an integer.
- Each String will have a maximun of 10 alphabetic characters.
- Each Integer will be inclusive range from 0 to 999.
- In each line of output there should be two columns:
    - The first column contains the String and is left justified using exactly 15 characters.
    - The second column contains the integer, expressed in 3 exactly  digits; if the original input has less than three digits, you must 
      pad your output's leading digits with zeroes.
- Sample intput:
    - java 100
    - cpp 65
    - python 50
- Sample output
    - ================================
    - java 100
    - cpp 065
    python 050
    - ================================

## Libraries used
- java.util.Scanner

## 2025-03-01
- I created my own class to return the number of integers in a whole integer.
- To ensure that the restrictions were followed, if the user inputs out of range inputs, the program will shut down
    - System.exit(0)
- When a file has been declared static in a class, it means it will operate independent of an instance but the name of the class will have to be in front
    - NumberInWhole.numbersInWhole();

