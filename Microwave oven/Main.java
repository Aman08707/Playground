#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int items;
  float time,ttime;
  cin>>items>>time;
  if (items == 2)
  {
    ttime=(150*time)/100;
    cout<<fixed<<setprecision(2)<<ttime;
  }
  else if(items == 3)
  {
    ttime=2*time;
    cout<<fixed<<setprecision(2)<<ttime;
  }
  else
    cout<<"Number of items is more";
  return 0;
}