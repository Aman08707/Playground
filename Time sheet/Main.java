#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tue,wed,thrus,fri,sat;
  cin>>sun>>mon>>tue>>wed>>thrus>>fri>>sat;
  int rate1=sun*150;
  int rate2=sat*125;
  int rate3,rate4,rate5,rate6,rate7,rate8=0,exh;
  if (mon<=8)
  {
    rate3=mon*100;
  }
  else
  {
    exh=mon-8;
    rate3=(exh*115)+800;
  }
  if (tue<=8)
  {
    rate4=tue*100;
  }
  else
  {
    exh=tue-8;
    rate4=(exh*115)+800;
  }
  if (wed<=8)
  {
    rate5=wed*100;
  }
  else
  {
    exh=wed-8;
    rate5=(exh*115)+800;
  }
  if (thrus<=8)
  {
    rate6=thrus*100;
  }
  else
  {
    exh=thrus-8;
    rate6=(exh*115)+800;
  }
  if (fri<=8)
  {
    rate7=fri*100;
  }
  else
  {
    exh=fri-8;
    rate7=(exh*115)+800;
  }
  int edays=mon+tue+wed+thrus+fri;
  if (edays>40)
  {
    rate8=(edays-40)*25;
  }
  int sal=rate1+rate2+rate3+rate4+rate5+rate6+rate7+rate8;
  cout<<sal;
}