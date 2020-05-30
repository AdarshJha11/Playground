#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a = 1;
  
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(int j=1;j<n;j++)
      {
        cout<<a;
      }
      cout<<++a<<endl;
      
    }
    else
    {
      cout<<++a;
      a--;
      for(int j=1;j<n;j++)
      {
        cout<<a;
      }
      cout<<endl;
      a++;
    }
  }
  
  return 0;
}