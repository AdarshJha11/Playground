#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x;
  cin>>y;
  
  int steps = 0;
  
  x = x - 3;
  y = y - 4;
  
  if(x>y)
  {
    cout<<x;
  }
  else
  {
    cout<<y;
  }
  
}