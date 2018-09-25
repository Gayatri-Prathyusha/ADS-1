// public class Percolation {
//    public Percolation(int n)                // create n-by-n grid, with all sites blocked
//    public    void open(int row, int col)    // open site (row, col) if it is not open already
//    public boolean isOpen(int row, int col)  // is site (row, col) open?
//    public boolean isFull(int row, int col)  // is site (row, col) full?
//    public     int numberOfOpenSites()       // number of open sites
//    public boolean percolates()              // does the system percolate?
// }


// You can implement the above API to solve the problem
class Percolation {
    private boolean[][] grid;
    private WeightedQuickUnionUF weightqfind;
    private int gridSize;

    public Percolation(int N)              // create N-by-N grid, with all sites blocked
    {
        gridSize = N;
        grid = new boolean[N][N];
        weightqfind = new WeightedQuickUnionUF((N*N));
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {  
                grid[i][j] = false;
            }
        }
    }
    public void open(int i, int j)         // open site (row i, column j) if it is not already
    {
        int row = i-1;
        int column = j - 1;
        grid[row][column] = true;
        if (row-1 >= 0 && isOpen(i-1 , j))  
        {
            weightqfind.union(to2D(i,j),to2D(i-1,j));
        }
        if (row+1 < gridSize && isOpen(i+1, j))         
        {
            weightqfind.union(to2D(i,j),to2D(i+1,j));
        }
        if (column-1 >= 0 && isOpen(i, j-1))     
        {
            weightqfind.union(to2D(i,j),to2D(i,j-1));
        }
        if (column+1 < gridSize && isOpen(i, j+1))     
        {
            weightqfind.union(to2D(i,j),to2D(i,j+1));
        }
    }
    public boolean isOpen(int i, int j)    // is site (row i, column j) open?
    {
        return grid[i-1][j-1];
    }
    public boolean isFull(int i, int j)    // is site (row i, column j) full?
    {
        if(isOpen(i,j))
        {
            for(int k = 0; k < gridSize; k++)
            {

               if(weightqfind.connected(to2D(i,j),k)) return true;
            }
        }
        return false;
    }
    public boolean percolates()            // does the system percolate?
    {
        if (gridSize == 1)
        {
            if (isOpen(1,1))
            {
                return true;
            }
            return false;
        }
        if(gridSize == 2)
        {
            if (weightqfind.connected(0,3)) return true;
            if (weightqfind.connected(1,2)) return true;
            if (weightqfind.connected(0,2)) return true;
            if (weightqfind.connected(1,3)) return true;
            return false;
        }


        for (int i = (gridSize * (gridSize - 1))-1; i < (gridSize * gridSize); i++)
        {
           // System.out.println((gridSize * (gridSize - 1))-1);
            //System.out.println(gridSize * gridSize-1);
            for (int i2 = 0; i2 < gridSize; i2++)
            {
                //System.out.println(i);
                //System.out.println(i2);
                //System.out.print(weightqfind.connected(i, i2));
                if (weightqfind.connected(i, i2)) return true;

            }
        }
        return false;
    }
    private int to2D(int i, int j)
    {
        return (i-1)*gridSize+(j-1);
    }

}