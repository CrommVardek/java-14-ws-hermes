package hermes.ws.PatternMatching;

public class NewPatternMatching {

    public static void consumeMyInterface(MyInterface i){
        if(i instanceof MyImplementation mi) {
            mi.makeTaskOne();
            return;
        }
        if(i instanceof MyOtherImplementation moi) {
            moi.makeOtherTask();
            return;
        }
        i.makeUpperTask();
    }

}
