#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol,distance;
  
  cin>>mileage>>petrol>>distance;
  
  float canGo = (float) mileage*petrol;
  
  if(distance<=canGo)
  {
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }
  
  return 0;
}