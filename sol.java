class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        int n=matrix.length,m=matrix[0].length,k=0;
        int[] ans=new int[m*n];
        for(int i=0;i<m;i++){
            int r=0,c=i;
            while(c>=0){
                ans[k++]=matrix[r][c];
                r++;
                c--;
            }
        }
        for(int i=1;i<n;i++){
            int r=i,c=m-1;
            while(r<n){
                ans[k++]=matrix[r][c];
                r++;
                c--;
            }
        }
        return ans;
    }
}
