package gameLogic;

public class Board {
    private final int DIM = 4 * 4;
    private Piece[] fields;

    /**
     * Constructs the Board object.
     */
    public Board(){
        this.fields = new Piece[DIM * DIM];
        for (Piece field: this.fields) {
            field = null;
        }
    }



}
