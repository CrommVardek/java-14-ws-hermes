package hermes.ws.records;

public record Range(int lo, int hi){

    public Range {
        if(lo>hi){
            throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
        }
    }

}

