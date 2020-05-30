#include<iostream>
using namespace std;
int main()
{
  int k;
  cin>>k;
  
  int temp = k;
  int n = 0;
  while(k>0)
  {
    k = k/10;
    n++;
  }
  
  int square = temp * temp;
  
  int rem, sum = 0;
  int div = 1;
  for(int i = 0; i < n; i++)
  {
    div = div*10;
  }
  
  rem = square % div;
  square = square / div;
  
  sum = rem + square;
  
  if(sum==temp)
  {
    cout<<"Kaprekar Number";
  }
  else
  {
    cout<<"Not a Kaprekar Number";
  }
  
  return 0;
}