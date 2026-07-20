class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> res = new ArrayList<>();
        if(m==1 && n==1){
            res.add(Arrays.asList(grid[0][0]));
            return res;
        }

        int[][] ans = new int[m][n];
        int idx=1;
        while (idx<=k) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == n - 1 && i != m - 1) {
                        ans[i + 1][0] = grid[i][j];
                    } else if (j == n - 1 && i == m - 1) {
                        ans[0][0] = grid[i][j];
                    } else {
                        ans[i][j + 1] = grid[i][j];
                    }

                }

            }
            
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    grid[i][j]=ans[i][j];
                }
            }
        

            idx++;
        }

        
        for (int i = 0; i < m; i++) {
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                t.add(ans[i][j]);
            }
            res.add(t);
        }
        return res;
    }
}