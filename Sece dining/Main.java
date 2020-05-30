#include<iostream>
using namespace std;
int main()
{
  string door;
  int rail;
  
  getline(cin,door);
  cin>>rail;
  
  if(rail == 1)
  {
    if(door == "front")
    {
     cout<<"Left Handed"; 
    }
    else
    {
      cout<<"Right Handed";
    }
  }
  else
  {
    if(door == "rear")
    {
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
  
  return 0;
}