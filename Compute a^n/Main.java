#include<iostream>
#include<cmath>
using namespace std;
double power(int a,int n)
{
  if(n!=0)
    return a*power(a,n-1);
  else
  	return 1;
}
int main()
{
  int a,n;
  cout<<"Enter the value of a "<<endl<<"Enter the value of n"<<endl;
  cin>>a>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
  return 0;
}