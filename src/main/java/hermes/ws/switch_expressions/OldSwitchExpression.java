package hermes.ws.switch_expressions;

public class OldSwitchExpression {

    public static int testSwitch(Day day){

        switch (day) {
            case MONDAY:
            case TUESDAY:
                int temp = 1;     // The scope of 'temp' continues to the }
                return temp;
            case WEDNESDAY:
            case THURSDAY:
                int temp2 = 5; // Can't call this variable 'temp'
                return temp2;
            default:
                int temp3 = 0; // Can't call this variable 'temp'
                return temp3;
        }
    }

}
