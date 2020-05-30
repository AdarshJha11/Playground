#include<iostream>
using namespace std;

int fibonacci(int n)
{
  int x,y,temp;
  if(n==1)
  {
    return 0;
  }
  else if(n==2)
  {
    return 1;
  }
  else
  {
    x = fibonacci(n-1) + fibonacci(n-2);
    return x;
  }
}

int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fibonacci(n);
}