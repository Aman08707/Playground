#include<iostream>
using namespace std;
int search(int,int,int [],int);
int main()
{
	int num,start=0;
	cin>>num;
	int arr[num];
	for (int i=0;i<num;i++)
		cin>>arr[i];
	int ele;
	cin>>ele;
	search(start,num,arr,ele);
	return 0;
}
int search(int start,int num,int arr[],int ele)
{
	if (start!=num)
	{
		if(arr[start]==ele)
		{
			cout<<ele;
			return 0;
		}
		else
		{
			search(start+1,num,arr,ele);
		}
	}
	else
	{
		cout<<"The number is not present in the list";
		return 0;
	}
}