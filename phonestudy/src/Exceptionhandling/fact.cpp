#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
int fact(int i )
{
    if(i==1)
    {   
        cout<<"End REeached "<<endl;
        return i;
    } 
    cout<<"waitin Before"<<i<<endl;
    int ans= i * fact(i-1);
    cout<<"executed After " <<i<<endl ;
    return ans;
}
int main()
{
    int i;
    cin>>i;
    int ans=fact(i);
    cout<<ans;
    return 0;
}