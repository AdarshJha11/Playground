#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int count = 0;
  
  cout<<n<<endl;
  
  for(int i = n; i>1 ; )
  {
    if(i%2 == 0)
    {
      i = i / 2;
    }
    else
    {
      i = 3*i + 1;
    }
    
    cout<<i<<endl;
    count++;
  }
  
  cout<<count<<endl;
  
  return 0;
  
}