package oop;

//Listener
class Main {

    private OnAddListener listener;

    public Main(OnAddListener onAddListener){
        this.listener = onAddListener;
    }

    public void add(int num1, int num2) {
        this.listener.onSuccess(num1+num2);
    }
}

// สร้างตัวกลางไว้คุยกันระหว่าง class
interface OnAddListener {
    void onSuccess(int result);
    void onFail();
}

public class Calculator implements OnAddListener{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }

    private void start(){
        Main main = new Main(this);
        main.add(1,2);
    }

    @Override
    public void onSuccess(int result) {
        System.out.println(result);
    }

    @Override
    public void onFail() {

    }
}
