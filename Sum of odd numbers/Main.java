#include<iostream>
using namespace std;
int odd(int n,int s,int a[])
{
  if(s<n)
  {
    if(a[s] % 2 !=0)
      return a[s] + odd(n,s+1,a);
    else
      return odd(n,s+1,a);
  }
  else
    return 0;
}
int main()
{
  int n,start=0;
  cout<<"Enter the number of elements in the array "<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for (int i=0;i<n;i++)
    cin>>a[i];
  cout<<"The sum of the odd elements in the array is "<<odd(n,start,a);
  return 0;
}