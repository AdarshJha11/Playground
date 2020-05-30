#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  
  int arr1[m][n];
  int arr2[m][n];
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>arr1[i][j];
    }
  }
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>arr2[i][j];
    }
  }
  
  int sum[m][n];
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      sum[i][j] = arr1[i][j] + arr2[i][j];
    }
  }
  
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cout<<sum[i][j]<<" ";
    }
    cout<<"\n";
  }
  
  return 0;
  
}