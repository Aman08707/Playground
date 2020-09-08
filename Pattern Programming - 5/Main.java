#include <iostream>
using namespace std;

int main()
{
	int n,space;
	cin>>n;
	for(int i=1;i<=n;i++)
	{
		for(int space=1;space<=n-i;space++)
			cout<<' ';
		for(int j=1;j<i*2;j++)
		{
			cout<<"*";
		}
		cout<<endl;
	}
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=3;j++)
			cout<<"*";
		for(int j=1;j<(2*n)-6;++j)
			cout<<' ';
		for(int j=1;j<=3;j++)
			cout<<"*";
		cout<<endl;
			
	}
	return 0;
}