class Solution {
    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};
    public void dfs(int x,int y,char[][]grid,int[][]vis)
    {
        vis[x][y]=1;
        for(int i=0;i<4;i++)
        {
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=0&&nx<grid.length&&ny<grid[0].length)
            {
                if(vis[nx][ny]==0&&grid[nx][ny]=='1')
                {
                    dfs(nx,ny,grid,vis);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]vis=new int[m][n];
        int ans=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==0&&grid[i][j]=='1')
                {
                    ans++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return ans;

    }
}