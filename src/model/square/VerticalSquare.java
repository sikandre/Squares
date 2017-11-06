package model.square;

public class VerticalSquare extends Square{

    protected char type;

    protected VerticalSquare(char type) {
        this.type = type;
    }

    @Override
    public boolean touch(int line, int col) {
        checkAroundSquares(line,col);
        return true;
    }

    public void checkAroundSquares(int line, int col){
        for (int l = 0; l < model.HEIGHT; l++) {
            Square sq = model.getSquare(l, col);
            if(sq!=null && sq.isMoveble())
                sq.selected = true;
        }
    }

    @Override
    public int getColor() {
        return NO_COLOR;
    }

    @Override
    public boolean isMoveble() {
        return true;
    }

    @Override
    public boolean isSelected() { return selected; }

    @Override
    public boolean isSpecial(){ return special=true; }

}
