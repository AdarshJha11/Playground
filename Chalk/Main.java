#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float days = n;
  
  float chalk = 1 / sqrt(n);
  float count = chalk * n;
  days =  days + count;
  count = count * chalk;
  days = days + count;
  
  int d = (int) days;
  cout<<d;
  
}