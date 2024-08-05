/*Example 1
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
*/
class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        if(n==0) {
            return ans;
        }
        ans[0]=0;
        if(n>=1) {
            ans[1]=1;
        }

        for(int i=2;i<=n;i++) {
            if(i%2==0) {
                ans[i]=ans[i/2];
            } else {
                ans[i]=ans[i/2]+1;
            }
        }
        return ans;
    }
}
