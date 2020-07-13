package dp.proxy;

import java.util.HashMap;
import java.util.Map;

interface ExpensiveObject {
    void process();
}

class ExpensiveObjectImpl implements ExpensiveObject {
    public ExpensiveObjectImpl() {
        initializeHeavyObject();
    }

    private void initializeHeavyObject() {
        System.out.println("initialise heavy object");
    }

    @Override
    public void process() {
        System.out.println("processing expensive object");
    }
}

class ExpensiveObjectProxy implements ExpensiveObject {

    ExpensiveObjectImpl expensiveObject;

    @Override
    public void process() {
        if (expensiveObject == null) {
            expensiveObject = new ExpensiveObjectImpl();
        }
        expensiveObject.process();
    }
}

public class ProxyDP {
    public static void main(String a[]) {
        ExpensiveObject expensiveObjectProxy = new ExpensiveObjectProxy();
        expensiveObjectProxy.process();
        expensiveObjectProxy.process();
    }
}
