
abstract class Furniture {
    protected String kind;
    protected int minSquare;
    protected int maxSquare;


    public Furniture(String kind, int minSquare,int maxSquare) {
        this.kind = kind;
        this.minSquare = minSquare;
        this.maxSquare = maxSquare;
    }

    public int getMinSquare() {
        return minSquare;
    }

    public int getMaxSquare() {
        return maxSquare;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public  String getKind (){
        return kind;
    }
}