#include <iostream>
using namespace std;

int main() 
{
  int n,value=1;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
      cout<<value<<' ';
    ++value;
    if(i!=n)
      cout<<endl;
  }
    return 0;
}