public class MazeFileReader
{
    private CellGenerator cg;
    public String fileName;
    private Reader r;
    
    public MazeFileReader(int rows, int cols){
        this.fileName = "livecells.txt";
        cg = new CellGenerator(this.fileName, 100, rows, cols);
        r = new Reader(this.fileName);
        
    }
}
