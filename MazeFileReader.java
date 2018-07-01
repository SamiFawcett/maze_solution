public class MazeFileReader extends Reader
{
    private CellGenerator cg;
    public String fileName;
    
    public MazeFileReader(int rows, int cols){
        super("livecells.txt");
        this.fileName = "livecells.txt";
        cg = new CellGenerator(this.fileName, (int)(.95 * rows * cols), rows, cols);
        this.read(fileName);
    }
}
