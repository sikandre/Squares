package model.square;


public class HorizotalSquare extends Square{
    protected char type;

    public HorizotalSquare(char type) {
        this.type = type;
    }

    @Override
    public boolean isMoveble() {
        return true;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    @Override
    public boolean touch(int line, int col) {

        checkAroundSquares(line, col);
        return true;
    }

    public void checkAroundSquares(int line, int col){
        for (int c = 0; c < model.WIDTH; c++) {
            Square sq = model.getSquare(line, c);
            //TODO modifica instanceof por getcolor
            if (!(sq instanceof EmptySquare)) {
                sq.selected = true;
            }
        }
    }

    @Override
    public int getColor() {
        return NO_COLOR;
    }

    @Override
    public boolean isSpecial(){ return true; }

}
