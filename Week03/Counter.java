import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

public class Counter {
    private int value = 0;

    void Increment() {
        value++;
    }

    int getValue(){
        return value;
    }
}