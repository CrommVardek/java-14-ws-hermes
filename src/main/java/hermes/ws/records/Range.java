package hermes.ws.records;

public record Range(int lo, int hi){

    public Range {
        if(lo>hi){
            throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
        }
    }

    public Range(int hi){
        this(0, hi);
    }

    //Override of methods possible.

    //static methods and field also possible.

    //declaration of other methods possible.


}

