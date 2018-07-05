package day4;

public class DemoDIP {
    public static void main(String[] args) {
        Callee callee = new Callee();
        /** Dependency injection
         * 1.Method Injection
         * 2.Constructor Injection
         * 3.Properties Injection
         */
        Caller caller = new Caller(); //2
//        caller.setCollee(callee); //3
        caller.call(callee); // 1
    }
}

class Caller {
    Callee callee;
    public void call(Callee callee) {
        this.callee = callee;
        System.out.println("Called Caller.Call");
        if (callee != null)
            callee.process();
    }


}

class Callee {
    public void process() {
        System.out.println("Called Callee.process");
    }
}
