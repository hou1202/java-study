package InheritDemo;

public class Compute extends Parents{
    private String board;

    public Compute() {}

    public Compute(String board) {

        this.board = board;
    }

    public String getBoard() {

        return board;
    }

    public void setBoard(String board) {

        this.board = board;
    }
}
