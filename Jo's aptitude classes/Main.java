#include<bits/stdc++.h>
using namespace std;

int gcd(int a,int b,int c,int min)
{
  int gcd = 0;
  for(int i = min;i>=1;i--)
  {
    if(a%min==0 && b%min==0 && c%min==0)
    {
      gcd = min;
    }
  }
  
  return gcd;
}

int main()
{
 
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int min = (a<b)?a:b;
  min = (min<c)?min:c;
  
  if(gcd(a,b,c,min)==d)
  {
    cout<<"Answer is correct.";
  }
  else
  {
    cout<<"Answer is wrong.";
  }
  
  return 0;
}