#include<iostream>
using namespace std;
struct student
{
  int rn;
  int m[5];
};
int main()
{
  int i,j,n,sum=0;
  float avg;
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cin>>n;
  student s[n];
  for(i=0;i<n;i++)
  {
    cin>>s[i].rn;
    for(j=0;j<5;j++)
      cin>>s[i].m[j];
  }
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  for(i=0;i<n;i++)
    {
      cout<<s[i].rn<<" ";
      for(j=0;j<5;j++)
      {
        cout<<s[i].m[j]<<" ";
        sum+=s[i].m[j];
      }
      avg=sum/5;
      cout<<avg<<" ";
      if (avg>70)
        cout<<'1'<<endl;
      else if(50<=avg<=70)
        cout<<'2'<<endl;
      else
        cout<<'3'<<endl;
      sum=0;
    }
    return 0;
      
}