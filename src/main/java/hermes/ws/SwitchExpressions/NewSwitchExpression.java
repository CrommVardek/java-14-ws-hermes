package hermes.ws.SwitchExpressions;

public class NewSwitchExpression {

    public static int testSwitch(Day day){
        int temp = switch (day){
            case MONDAY, TUESDAY -> 1;
            case WEDNESDAY, THURSDAY -> 5;
            default -> 0;
        };

        System.out.println(temp);

        return temp;
    }

    public static int thisWillReturnAPositiveValue(Day day){
        int j = switch (day) {
            case MONDAY  -> 1;
            case TUESDAY -> 2;
            default      -> {
                int k = day.toString().length();
                int result = f(k);
                yield result;
            }
        };

        return j;
    }

    private static int f(int k) {
        return k*2;
    }

}
