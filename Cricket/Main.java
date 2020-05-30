#include<iostream>
using namespace std;
int main()
{
  int totalBalls,totalRuns,runsScored,ballsBowled;
  cin>>totalBalls>>totalRuns>>runsScored>>ballsBowled;
  
  int oversTotal = totalBalls/6;
  cout<<oversTotal<<"\n";
  int oversBowled = ballsBowled/6;
  float balls = (ballsBowled%6);
  float overs = (float) (oversBowled + balls/10);
  
  cout<<overs<<"\n";
  
  float currentRate = (float) runsScored/overs;
  printf("%.1f\n",currentRate);
  
  float reqRate = (float) (totalRuns+1)/oversTotal;
  printf("%.1f\n",reqRate);
  
  if(currentRate>reqRate)
  {
    cout<<"Eligible to Win";
  }
  else
  {
    cout<<"Not Eligible to Win";
  }
  
  return 0;
  
  
}