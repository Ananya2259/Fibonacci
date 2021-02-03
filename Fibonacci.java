#include <iostream>
using namespace std;
int main() {
int ft = 1;
int st = 0;
cout<<"First term is  : "<<ft<<endl;
int nt = ft + st;
cout<<"Second term is : "<<nt<<endl;
st = ft;
ft = nt;
nt = ft + st;
cout<<"Third term is : "<<nt<<endl;
st = ft;
ft = nt;
nt = ft + st;
cout<<"Fourth term is  : "<<nt<<endl;
st = ft;
ft = nt;
nt = ft + st;
cout<<"Fifth term is : "<<nt<<endl;
st = ft;
ft = nt;
nt = ft + st;
cout<<"sixth term is  : "<<nt<<endl;
}
