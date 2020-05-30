#include<bits/stdc++.h>
using namespace std;

int reqBac(int m, int n, int req)
{
  int value = pow(m,n);
  if(value>=req)
  {
    return 1;
  }
  else
  {
    return 0;
  }
  
}

int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  
  if(reqBac(m,n,req))
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  
  
}