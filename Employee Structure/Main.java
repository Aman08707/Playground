#include<iostream>
using namespace std;
struct employee
{
  string s;
  int id,age;
  string desig;
  double sal;
};
int main()
{
  employee s1;
  cout<<"Enter name:"<<endl;
  cin>>s1.s;
  cout<<"Enter ID:"<<endl;
  cin>>s1.id;
  cout<<"Enter age:"<<endl;
  cin>>s1.age;
  cout<<"Enter designation:"<<endl;
  cin>>s1.desig;
  cout<<"Enter Salary:"<<endl;
  cin>>s1.sal;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<s1.s<<endl;
  cout<<"ID of the Employee : "<<s1.id<<endl;
  cout<<"Age of the Employee : "<<s1.age<<endl;
  cout<<"Designation of the Employee : "<<s1.desig<<endl;
  cout<<"Salary of the Employee : "<<s1.sal;
  return 0;
}