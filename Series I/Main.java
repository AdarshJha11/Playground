#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float a = 0.5;
  cout<<a<<" ";
  
  for(int i = 1; i<n; i++)
  {
    a = a*3;
    cout<<a<<" ";
  }
  
  return 0;
}