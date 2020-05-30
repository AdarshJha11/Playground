#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  int arr[n];
  
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  
  int m;
  cin>>m;
  
  int flag = 0;
  
  for(int i=0;i<n;i++)
  {
    if(arr[i] == m)
    {
      flag = 1;
      break;
    }
  }
  
  if(flag)
  {
    cout<<"She passed her exam";
  }
  else
  {
    cout<<"She failed";
  }
  
  return 0;
}