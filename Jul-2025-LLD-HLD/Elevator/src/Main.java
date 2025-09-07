import com.getsdeready.lld.elevator.AddJobWorker;
import com.getsdeready.lld.elevator.Elevator;
import com.getsdeready.lld.elevator.ProcessJobWorker;
import com.getsdeready.lld.elevator.model.Direction;
import com.getsdeready.lld.elevator.model.ExternalRequest;
import com.getsdeready.lld.elevator.model.InternalRequest;
import com.getsdeready.lld.elevator.model.Request;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        ProcessJobWorker processJobWorker = new ProcessJobWorker(elevator);
        Thread processJobThread = new Thread(processJobWorker);

        processJobThread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // add job worker
        ExternalRequest er = new ExternalRequest(0, Direction.UP);
        InternalRequest ir = new InternalRequest(7);
        Request request = new Request(er, ir);

        new Thread(new AddJobWorker(elevator, request)).start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}