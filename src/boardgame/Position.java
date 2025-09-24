package boardgame;

public class Position {
    private Integer row;
    private Integer columns;

    public Position(Integer row, Integer columns) {
        this.row = row;
        this.columns = columns;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setValues(int row, int columns) {
        this.row = row;
        this.columns = columns;
    }

    @Override
    public String toString() {
        return row + ", " + columns; 
    }
}
