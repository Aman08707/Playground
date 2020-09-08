#include<iostream>
using namespace std;
int addition(int);
int main()
{
  int num;
  cin>>num;
  cout<<addition(num);
  return 0;
}
int addition(int n)
{
  if(n!=0)
    return n+addition(n-1);
  else
    return 0;
}