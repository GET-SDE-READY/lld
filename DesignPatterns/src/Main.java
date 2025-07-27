import com.getsdeready.designpatterns.creational.MySingleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MySingleton object1 = MySingleton.getInstance();
        MySingleton object2 = MySingleton.getInstance();

        System.out.println(object1 == object2);
    }
}


class SingletonThread implements Runnable {

    @Override
    public void run() {
        MySingleton object = MySingleton.getInstance();
        System.out.println(object);
    }
}