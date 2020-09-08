#include<iostream>
using namespace std;
int num(int n)
{
  if (n>9)
    return 1 + num(n/10);
  else
    return 1;
}
int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The number of digits in "<<n<<" is "<<num(n);
  return 0;
}