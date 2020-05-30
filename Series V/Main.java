#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a = 121;
  cout<<a<<" ";
  int add = 104;
  
  for(int i = 1;i<n;i++)
  {
    a = a + add;
    cout<<a<<" ";
    add = add + 32;
  }
  
  return 0;
}