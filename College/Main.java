#include <iostream>
using namespace std;
#include<string.h>
struct College
{
char name[100];
char city[100];
int establishmentYear;
float passPercentage;
}c[10];
int main()
{
    int i,n;
    cout<<"Enter the number of colleges\n";
    cin>>n;
    for(i=1;i<=n;i++)
    {
        cout<<"Enter the details of college "<<i<<"\n";
        cout<<"Enter name\n";
        cin>>c[i].name;
        cout<<"Enter city\n";
        cin>>c[i].city;
        cout<<"Enter year of establishment\n";
        cin>>c[i].establishmentYear;
        cout<<"Enter pass percentage\n";
        cin>>c[i].passPercentage;
    }
    cout<<"Details of colleges\n";
    for(i=1;i<=n;i++)
    {
        cout<<"College:"<<i<<"\n";
        cout<<"Name:"<<c[i].name<<"\n";
        cout<<"City:"<<c[i].city<<"\n";
        cout<<"Year of establishment:"<<c[i].establishmentYear<<"\n";
        cout<<"Pass percentage:"<<c[i].passPercentage<<"\n";
    }
        return 0;
}