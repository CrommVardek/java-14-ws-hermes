package hermes.ws.records;

public class OldRange {

    private final int lo;
    private final int hi;

    public OldRange(int lo, int hi) {
        if(lo>hi){
            throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
        } else {
            this.lo = lo;
            this.hi = hi;
        }
    }

    public int lo(){
        return lo;
    }

    public int hi(){
        return hi;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof OldRange oldRange
                && oldRange.hi() == this.hi()
                && oldRange.lo() == this.lo();
    }

    @Override
    public int hashCode(){
        //dunno the details of implementation of a record hashcode
        return 42;
    }

}
