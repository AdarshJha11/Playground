#include<iostream>
using namespace std;
int main()
{
  int amountF,discountF,shippingF,amountS,discountS,shippingS,amountA,discountA,shippingA;
  cin>>amountF>>discountF>>shippingF>>amountS>>discountS>>shippingS>>amountA>>discountA>>shippingA;
  
  int priceF = amountF - (discountF*amountF)/100 + shippingF;
  int priceS = amountS - (discountS*amountS)/100 + shippingS;
  int priceA = amountA - (discountA*amountA)/100 + shippingA;
  
  cout<<"In Flipkart Rs."<<priceF<<"\n";
  cout<<"In Snapdeal Rs."<<priceS<<"\n";
  cout<<"In Amazon Rs."<<priceA<<"\n";
  
  if(priceS<priceF)
  {
    if(priceS<priceA)
    {
      cout<<"He will prefer Snapdeal"<<"\n";
    }
    else
    {
      cout<<"He will prefer Amazon"<<"\n";
    }
  }
  else
  {
    if(priceF<priceA)
    {
      cout<<"He will prefer Flipkart"<<"\n";
    }
    else
    {
      cout<<"He will prefer Amazon"<<"\n";
    }
  }
  
  return 0;
  
  
}