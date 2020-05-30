#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  cin>>w;
  cin>>x;
  cin>>y;
  
  int profit = w*x -w*y - 100;
  
  cout<<profit;
  
  return 0;
}