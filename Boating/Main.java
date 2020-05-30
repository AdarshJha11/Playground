#include<iostream>
using namespace std;
int main()
{
  int maxWeight,adult,child;
  cin>>maxWeight>>adult>>child;
  
  int totalWeight = adult*75 + child*30;
  
  if(totalWeight<=maxWeight)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
  
  return 0;
}