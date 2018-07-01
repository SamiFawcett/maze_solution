import java.awt.event.KeyEvent;
public class Maze
{
    static Grid g; 
    private int HEIGHT;
    private int WIDTH;
    private int solutions;
    private boolean solved = false;
    private Grid old_board;
    private Grid new_board; 

    public Maze(int HEIGHT, int WIDTH){
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        MazeFileReader mfr = new MazeFileReader(this.HEIGHT, this.WIDTH);
        this.g = new Grid(this.HEIGHT, this.WIDTH, mfr.getLiveCells());
        this.g.draw();
        old_board = this.g;
        new_board = old_board;
    }

    static Grid getGrid(){
        return g;
    }

    private void tick(){
        this.update();
        new_board.draw();
        old_board = new_board;
    }

    private void update(){
        boolean[][] old_boardGridValues = old_board.getGridValues();

        for(int i = 0; i < this.HEIGHT; i++){
            for(int j = 0; j < this.WIDTH; j++){
                if(i == 0 || i == this.WIDTH - 1 || j == 0 || j == this.WIDTH - 1){

                } else {
                    boolean[] neighboringCells = new boolean[8];
                    boolean CV = old_boardGridValues[i][j];
                    neighboringCells[0] = old_boardGridValues[i][j + 1];
                    neighboringCells[1] = old_boardGridValues[i + 1][j];
                    neighboringCells[2] = old_boardGridValues[i][j - 1];
                    neighboringCells[3] = old_boardGridValues[i - 1][j];
                    int count = 0;
                    for(boolean cellValue : neighboringCells){
                        if(cellValue){
                            count++;
                        }
                    }
                    System.out.println("count: " + count);
                    if(CV){
                        if(count < 2){
                            new_board.dead(new Coordinate(i, j));
                        }
                    }
                }
            }
        }
    }

    public static void solve() throws InterruptedException{
        Maze m = new Maze(50, 50);
        while(!m.solved){
            m.tick();
            Thread.sleep(60);
        }

    }

}
