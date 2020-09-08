#include<iostream>
using namespace std;
int digits(int n)
{
  if (n==0)
    return 0;
  else
    return n%10 + digits(n/10);
}
int main()
{
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The sum of digits in "<<n<<" is "<<digits(n);

}