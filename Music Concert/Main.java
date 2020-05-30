#include<iostream>
#include<cstdlib>
using namespace std;

int main()
{
  int *ptr;
  int n;
  cin>>n;
  
  ptr = (int*)malloc(n*sizeof(int));
  
  for(int i=0;i<n;i++)
  {
    cin>>*(ptr+i);
  }
  
  int male = 0, female = 0;
  
  for(int i=0;i<n;i++)
  {
    if(*(ptr+i)%2!=0)
    {
      male++;
    }
    else
    {
      female++;
    }
  }
  
  cout<<male<<"\n"<<female;
  
  free(ptr);
  return 0;
}