#include<iostream>
using namespace std;

int gcd(int a, int b, int min)
{
  if(min == 0)
  {
    return 0;
  }
  else if(a%min==0&& b%min==0)
  {
    return min;
  }
  else
  {
    gcd(a,b,min-1);
  }
}

int main()
{
  int a,b;
  cin>>a>>b;
  
  int min = (a<b)?a:b;
  
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b,min);
  
  return 0;
}