#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  int sum = 0;
  int rem = n%10;

  n = n/10;
  n = n/10;
  n = n/10;
  
  
  sum = rem + n;
  cout<<sum;
  
  
}