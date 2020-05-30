#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  int a = 6;
  int add = 5;
  
  cout<<a<<" ";
  
  for(int i = 1;i<n;i++)
  {
    a = a + add;
    cout<<a<<" ";
    add = 5*(i+1);
  }
  
  return 0;
}