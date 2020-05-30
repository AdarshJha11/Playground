#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  
  int dollors = d1 + d2;
  int cents = c1 + c2;
  
  if(cents >= 100)
  {
    dollors = dollors + 1;
    cents = cents - 100;
  }
    
  cout<<dollors<<endl<<cents;
}