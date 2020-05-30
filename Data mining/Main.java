#include<iostream>
using namespace std;
int main()
{
  int n,rem;
  cin>>n;
  int sumEven = 0;
  int sumOdd = 0;
  while(n>0)
  {
    rem = n % 10;
    if(rem%2 == 0)
    {
      sumEven = sumEven + rem;
    }
    else
    {
      sumOdd= sumOdd + rem;
    }
    
    n = n/10;
  }
  
  if(sumEven == sumOdd)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  
  return 0;
}