#include<iostream>
using namespace std;
int sum_of_array(int,int[],int);
int main()
{
	int n,start=0;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
		cin>>arr[i];
	cout<<sum_of_array(start,arr,n);
	return 0;
}
int sum_of_array(int start,int a[],int n)
{
	if (start!=n)
	{
		return a[start]+sum_of_array(start+1,a,n);
	}
	else
	{
		return 0;
	}
}