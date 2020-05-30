#include<iostream>
using namespace std;
int main()
{
  int rows,columns,tree;
  cin>>rows>>columns>>tree;
  
  if(tree>columns && tree<=columns+rows)
  {
    cout<<"It is a mango tree";
  }
  else if((tree>(columns*(rows-2))) && (tree<=columns*(rows-1)))
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }
  
  return 0;
    
  
}