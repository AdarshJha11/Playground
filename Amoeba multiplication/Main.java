#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  int a = 0;
  int b = 1;
  int sum = 0;
  
  for(int i = 2; i<n ; i++)
  {
    sum = a + b;
    a = b;
    b = sum;
  }
  
  cout<<sum;
  
  return 0;
}