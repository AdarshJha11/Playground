#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a = 121;
  int add = 104;
  int add2 = 0;
  cout<<a<<" ";
  for(int i = 1; i<n; i++)
  {
    add = add + add2;
    a = a + add;
    cout<<a<<" ";
    add2 = 32;
  }
  
  return 0;
}