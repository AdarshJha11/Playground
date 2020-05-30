#include<iostream>
using namespace std;
int main()
{
  int n;
  float time;
  cin>>n>>time;
  
 switch(n)
 {
   case 1:
     printf("%.2f",time);
     break;
   case 2:
     time = time + 0.50*time;
     printf("%.2f",time);
     break;
   case 3:
     time = 2*time;
     printf("%.2f",time);
     break;
   default:
     cout<<"Number of items is more";
     break;
 }
  
  return 0;
}