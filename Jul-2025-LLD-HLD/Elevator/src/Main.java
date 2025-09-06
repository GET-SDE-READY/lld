import com.getsdeready.lld.elevator.Elevator;
import com.getsdeready.lld.elevator.ProcessJobWorker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        ProcessJobWorker processJobWorker = new ProcessJobWorker(elevator);
        Thread processJobThread = new Thread(processJobWorker);

        processJobThread.start();

        // add job worker
    }
}