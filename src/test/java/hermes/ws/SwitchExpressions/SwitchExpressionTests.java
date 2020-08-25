package hermes.ws.SwitchExpressions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SwitchExpressionTests {

    @Parameters
    public static Collection<Object[]> data() {
        Day[] days = Day.values();
        List<Object[]> data = new ArrayList<>();
        for(Day day: days){
            data.add(new Object[]{day});
        }
        return data;
    }

    @Parameter
    public Day day;

    @Test
    public void bothSwitchExpressionShouldReturnSameValue(){
        int oldValue = OldSwitchExpression.testSwitch(day);
        int newValue = NewSwitchExpression.testSwitch(day);

        Assert.assertEquals(oldValue, newValue);
    }

    @Test
    public void yieldShouldReturnPositiveValue(){
        int val = NewSwitchExpression.thisWillReturnAPositiveValue(day);

        Assert.assertTrue(val>=0);
    }

}
