#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        int a[n];

        for(int i=0;i<n;i++)
        cin>>a[i];
        int maxi=-1;
        // int a=-1 ,b=5;
        // cout<<(a%b + b)%b;
        
      for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int k=a[i]-a[j];
                int ans=a[i]+a[j] +(k%m + m)%m;
                
                if(ans>maxi)
                maxi=ans;

            }
        }
        cout<<maxi<<endl ;

    }

    return 0;
}