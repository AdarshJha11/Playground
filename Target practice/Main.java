#include<iostream>
using namespace std;
int main()
{
  int n,i,score = 0;
  cin>>n;
  int count = 0;
  do
  {
    cin>>i;
    score = score + i;
    count++;
  }while(score<n);
  
  cout<<"The number of turns is "<<count;
  
  return 0;
}