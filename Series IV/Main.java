#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  cout<<0<<" ";
  int a = 2;
  int add = 6;
  
  for(int i = 1; i<n; i++)
  {
    if(i==1)
    {
      cout<<2<<" ";
    }
    else
    {
    a = a + add;
    cout<<a<<" ";
    if(i%2!=0)
    {
      add = add + 4; 
    }
    }  
  }
  
  return 0;
}