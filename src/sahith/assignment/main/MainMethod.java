package sahith.assignment.main;

import sahith.assignment.data.Data;
import sahith.assignment.singleton.Singleton;

public class MainMethod {
    public static void main(String[] args) {
        Data d = new Data();
        d.myFunction2();
        d.myFunction();
        System.out.println();
        Singleton s = Singleton.init("hello");
        s.getString();
    }
}


