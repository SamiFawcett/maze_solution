public class Maze
{
    static Grid g; 
    private int HEIGHT;
    private int WIDTH;
    private int solutions;
    
    public Maze(int HEIGHT, int WIDTH){
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        this.g = new Grid(this.HEIGHT, this.WIDTH);
    }
    
    static Grid getGrid(){
        return g;
    }
    
    public static void solve(){
        Maze m = new Maze(100, 100);
        MazeFileReader mfr = new MazeFileReader(m.HEIGHT, m.WIDTH);
        m.getGrid().draw();
    }
    
}
