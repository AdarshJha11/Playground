#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  for(int i = 0; i<4 ; i++)
  {
    for(int j = 0; j<=i; j++)
    {
      cout<<n;
    }
    n++;
    cout<<"\n";
  }
  n--;
  for(int i=0;i<4;i++)
  {
    for(int j=4;j>i;j--)
    {
      cout<<n;
    }
    n--;
    cout<<"\n";
 }
  
  return 0;
}