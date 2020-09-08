#include<iostream>
using namespace std;
int prime(int,int);
int main()
{
	int num,recur=2;
	cin>>num;
	prime(num,recur);
	return 0;
}
int prime(int n,int recur)
{
	if (recur<n)
	{
		if(n%recur==0)
		{
			cout<<"Not a Prime Number";
			return 0;
		}
		else
		{
			prime(n,recur+1);
		}
	}
	else
	{
		cout<<"Prime Number";
	}
}