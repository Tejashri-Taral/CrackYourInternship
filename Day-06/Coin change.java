class Solution {
    public int rec(int i,int amount,int coin[],int dp[][])
    {
        if(amount<0 || i==coin.length)
        {
            return (int)1e9;
        }
        if(amount==0)
        {
            return 0;
        }
        if(dp[i][amount]!=-1)
        {
            return dp[i][amount];
        }
        int c1=rec(i+1,amount,coin,dp);
        int c2=1+rec(i,amount-coin[i],coin,dp);
        int val=Math.min(c1,c2);
        dp[i][amount]=val;
        return dp[i][amount];
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                dp[i][j]=-1;
            }
        }
        int ans= rec(0,amount,coins,dp);
        if(ans==1e9)
        return  -1;
        else 
        return ans;

    }
}
