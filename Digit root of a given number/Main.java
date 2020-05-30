#include<iostream>
using namespace std;

int sumOfDigit(int n)
{
  if(n<=9)
  {
    return n;
  }
  
  int sum = 0;
  int rem;
  
  while(n>0)
  {
    rem = n%10;
    sum = sum + rem;
    n = n/10;
  }
  
  return sumOfDigit(sum);
}

int main()
{
  int n;
  cin>>n;
  
  cout<<sumOfDigit(n);
  
  return 0;
}