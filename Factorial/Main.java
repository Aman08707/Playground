#include<iostream>
using namespace std;
int factorial(int);
int main()
{
  int n,fac;
  cin>>n;
  fac=factorial(n);
  cout<<"The factorial of "<<n<<" is "<<fac;
  return 0;
}
int factorial(int n)
{
  if (n!=0)
    return n*factorial(n-1);
  else
    return 1;
}