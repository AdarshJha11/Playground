#include<iostream>
using namespace std;
int main()
{
  int birthYear,currentYear;
  int age;
  cin>>birthYear>>currentYear;
  
  
  if(currentYear<birthYear)
  {
    currentYear = 2000 + currentYear;
    birthYear = 1900 + birthYear;
  }
  else if(currentYear>birthYear && birthYear>10)
  {
    currentYear = 1900 + currentYear;
    birthYear = 1900 + birthYear;
  }
  else
  {
    currentYear = 2000 + currentYear;
    birthYear = 2000 + birthYear;
  }
  
  age = currentYear - birthYear;
  cout<<age;
  
  return 0;
}