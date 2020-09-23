package hermes.ws.records;

import org.junit.Assert;
import org.junit.Test;

public class RangeTest {

    // If two records are equals, their hashCode is equal as well.
    @Test
    public void twoRangesWithSameValuesAreEquals(){
        Range range1 = new Range(1,2);
        Range range2 = new Range(1,2);

        Assert.assertEquals(range1, range2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongConstructorArgumentsShouldThrowIllegalArgumentException(){
        Range range = new Range(5, 1);
    }

}
