#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  
  int res;
  if(n<m)
  {
    res = n;
  }
  else
  {
    res = m;
  }
  
  if(res%2==0)
  {
    cout<<"Mani Iyer";
  }
  else
  {
    cout<<"Arun Gupta";
  }
  
  return 0;
}