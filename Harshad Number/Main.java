#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int sum = 0;
  int temp = n;
  int rem;
  while(n>0)
  {
    rem = n % 10;
    sum = sum + rem;
    n = n / 10;
  }
  
  if(temp%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
  
  return 0;
}