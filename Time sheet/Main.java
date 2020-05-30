#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tues,wed,thurs,fri,sat;
  cin>>sun>>mon>>tues>>wed>>thurs>>fri>>sat;
  
  int totalHours = sun + mon + wed + thurs + fri + sat;
  int sum = 0;
  if(totalHours>40)
  {
    int extraHours = totalHours - 40;
    sum = sum + extraHours*25;
  }
  int extra = 0;
  
  sum = sum + (mon+tues+wed+thurs+fri+sat+sun)*100;
  if(mon>8)
  {
    extra = mon - 8;
    sum = sum + extra*15;
  }
 
    if(tues>8)
  {
    extra = tues - 8;
      sum = sum + extra*15;
  }
    if(wed>8)
  {
    extra = wed - 8;
    sum = sum + extra*15;
  }
    if(thurs>8)
  {
    extra = thurs - 8;
    sum = sum + extra*15;
  }
    if(fri>8)
  {
    extra = fri - 8;
    sum = sum + extra*15;
  }
    if(sat>8)
  {
    extra = sat - 8;
     sum = sum + extra*15;
  }
    if(sun>8)
  {
    extra = sun - 8;
    sum = sum + extra*15;
  }
  if(sat>0)
  {
    int pay = (sat*100*25)/100;
    sum = sum + pay;
    pay = 0;
  }
  
  
  if(sun>0)
  {
    int pay = (sun*100*50)/100;
    sum = sum + pay;
    pay = 0;
  }
  
  cout<<sum;
  return 0;
}