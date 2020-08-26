package hermes.ws.pattern_matching;

public class OldInstanceOf {

    public static void consumeMyInterface(MyInterface i){
        if(i instanceof MyImplementation) {
            MyImplementation mi = (MyImplementation) i;
            mi.makeTaskOne();
            return;
        }
        if(i instanceof MyOtherImplementation) {
            MyOtherImplementation moi = (MyOtherImplementation) i;
            moi.makeOtherTask();
            return;
        }
        i.makeUpperTask();
    }

}
