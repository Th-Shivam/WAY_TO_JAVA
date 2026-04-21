class countneg {
    public int countNegatives(int[][] grid) {
        int count_negative=0;
        int col=grid[0].length;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<col;j++ )
            {
                if(grid[i][j]<0){count_negative+=(col-j);
                break;}
            }
        }

        return count_negative;
    }
}
