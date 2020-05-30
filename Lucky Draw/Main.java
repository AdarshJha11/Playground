#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  bool prime = true;
  for(int i = 2; i<=sqrt(n); i++)
  {
    if(n%i==0)
    {
      prime = false;
      break;
    }
  }
  if(n<=1)
  {
    prime = false;
  }
  
  
  if(prime)
  {
    cout<<"Eligible";
  }
  else
  {
    cout<<"Not eligible";
  }
  
  return 0;
}