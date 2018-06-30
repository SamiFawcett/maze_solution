public class Maze
{
    private Grid g; 
    private int HEIGHT;
    private int WIDTH;
    
    public Maze(int HEIGHT, int WIDTH){
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        this.g = new Grid(this.HEIGHT, this.WIDTH);
    }
    
    public static void main(String[] args){
        Maze m = new Maze(100, 100);
        
    }
}
