class Solution {
    static int path(int i, int j , int n, int m, int dp[][])
    {
           if(i==n-1 &&  j==m-1)
           {
                return 1;
           }
           
           if(i==n || j==m)
           {
                return 0;
           }
           
           if(dp[i][j]!=-1)
           {
                 return dp[i][j];
           }
           
           int down = path(i+1,j,n,m,dp);
           
           int right = path(i,j+1,n,m,dp);
           
           int ways= down+ right;
           
           dp[i][j]=ways;
           
           return ways;
            
    }

    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=-1;
            }
        }
        return path(0,0,m,n,dp);
    }
}
