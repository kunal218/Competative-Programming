#include <iostream>
using namespace std;
int main()
{
     int copy, Number, 
     currentDigit, reversedNumber = 0;
     Number = 121; 
     copy = Number;
     do
     {
         currentDigit = copy % 10;
         reversedNumber = (reversedNumber * 10) + currentDigit;
         copy= copy / 10; 
     } while (copy != 0);
     cout << " The reverse of the number is: " << reversedNumber << endl;
     if (Number == reversedNumber)
         cout << " The number is a palindrome.";
     else
         cout << " The number is NOT a palindrome.";
    return 0;
}