#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
void fun(string a[])
{
    a[0]="mita";
}

int main()
{
    string a[]= {"sam","Ran"};
    cout<<a<<" ";
    fun(a);

    for(string s: a)
    cout<<s<<" ";

    return 0;
}