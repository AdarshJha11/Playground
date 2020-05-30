#include<iostream>
using namespace std;
int main()
{
  int rows,columns,tree;
  cin>>rows>>columns>>tree;
  
  if(tree<=rows)
  {
    cout<<"Yes";
  }
  else if(tree > rows*(columns-1))
  {
    cout<<"Yes";
  }
  else if(tree%rows==1)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  
  return 0;
  
}