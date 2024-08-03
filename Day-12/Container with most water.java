class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int maxArea=0;
        int j=arr.length-1;
        
        while(i<j)
        {
           int height=Math.min(arr[i],arr[j]);
           int width=j-i;
            int area=height*width;
            maxArea=Math.max(area,maxArea);

            if(arr[i]<arr[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return maxArea;
    }
}
