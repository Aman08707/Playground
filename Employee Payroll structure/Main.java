#include<iostream>
using namespace std;
#include<string.h>
struct Emp
{
    int id;
    char name[20];
    int sal;
    int hra;
    int da;
    int med;
    int pf;
    int ins;
};
int main()
{
    int a,i,search;
    float salary,deduct;
    cout<<"Enter the number of employees: \n";
    cin>>a;
    cout<<"Enter your input for every employee: \n";
    struct Emp e[a];
    for(i=0;i<a;i++)
    {
        cout<<"Employee ID: \n";
        cin>>e[i].id;
        cout<<"Employee Name: \n";
        cin>>e[i].name;
        cout<<"Basic Salary, HRA: \n";
        cin>>e[i].sal;
        cin>>e[i].hra;
        cout<<"DA, Medical Allowance: \n";
        cin>>e[i].da;
        cin>>e[i].med;
        cout<<"PF and Insurance: \n";
        cin>>e[i].pf;
        cin>>e[i].ins;
    }
    cout<<"Enter employee ID to get payslip: \n";
    cin>>search;
    for(i=0;i<a;i++)
    {
        if(search==e[i].id)
        {
            
            cout<<"Salary Slip of "<<e[i].name<<"\n";
            cout<<"Employee ID: "<<e[i].id<<"\n";
            cout<<"Basic Salary: "<<e[i].sal<<"\n";
            cout<<"House Rent Allowance: "<<e[i].hra<<"\n";
            cout<<"Dearness Allowance: "<<e[i].da<<"\n";
            cout<<"Medical Allowance: "<<e[i].med<<"\n";
            salary=((e[i].sal*12)+(e[i].hra*12)+(e[i].da*12)+(e[i].med*12));
            cout<<"Gross Salary: "<<salary<<" Rupees\n";
            cout<<"Deductions:\n";
            cout<<"Provident fund: "<<e[i].pf<<"\n";
            cout<<"Insurance: "<<e[i].ins<<"\n";
            deduct=(e[i].pf*12)+(e[i].ins*12);
            cout<<"Net Salary: "<<salary-deduct<<" Rupees"<<"\n";
        }
    }
    return 0;
}