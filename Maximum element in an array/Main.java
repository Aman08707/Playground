#include<iostream>
using namespace std;
int max(int n,int s,int maxi,int a[])
{
  if(s<n)
  {
    if(a[s]>maxi)
    {
      maxi=a[s];
      return max(n,s+1,maxi,a);
    }
    else
      return max(n,s+1,maxi,a);
  }
  else
    return maxi;
}
  
int main()
{
  int n,s=0,maxi=0;
  cout<<"Enter the size of the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter "<<n<<" elements of an array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Maximum element in the array is "<<max(n,s,maxi,a);
  return 0;
  
}