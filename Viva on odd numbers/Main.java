#include<iostream>
using namespace std;
int main()
{
  float score = 0;
  int i;
  int count = 0;
 
  do
  { 
    cin>>i;
    if(i < 0 )
    {
      score = score - 1;
    }
    else
    {
       if(i%2 != 0)
       {
         score = score + 1;
         count++;
       }
       else
       {
         score = score - 0.5;
       }
    }
  }while(i>0 && count < 3);
  
  printf("%.1f",score);
  
  return 0;
  
  
}