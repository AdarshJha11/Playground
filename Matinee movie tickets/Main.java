#include<iostream>
using namespace std;
int main()
{
  int age;
  float timing;
  
  cin>>age>>timing;
  
  if(timing > 12 && timing <17)
  {
    if(age>13)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$2.00";
    }
  }
  else
  {
    if(age>13)
    {
      cout<<"$8.00";
    }
    else
    {
      cout<<"$4.00";
    }
  }
  
  return 0;
}