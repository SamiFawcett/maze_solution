public class MazeFileReader
{
    private CellGenerator cg;
    public String fileName;
    private Reader r;
    
    public MazeFileReader(){
        this.fileName = "livecells.txt";
        cg = new CellGenerator(this.fileName, 100, Maze.getGrid().rows, Maze.getGrid().cols);
        r = new Reader(this.fileName);
    }
}
