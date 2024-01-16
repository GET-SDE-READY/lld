import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        Scoreboard subject = new Scoreboard();

        OverTracker overTracker = new OverTracker("Observer 1");
        ScoreTracker scoreTracker = new ScoreTracker("Observer 2");

        subject.addObserver(overTracker);
        subject.addObserver(scoreTracker);

        subject.setState(new TrackerMessage(1, 1));
        subject.setState(new TrackerMessage(1, 2));

        System.out.println(overTracker.getOvers());
        System.out.println(scoreTracker.getTotalScore());
    }
}

// Observer interface
interface Observer {
    void update(TrackerMessage message);
}

// Subject interface
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(TrackerMessage message);
}

// ConcreteSubject
class Scoreboard implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private TrackerMessage state;

    public void setState(TrackerMessage newState) {
        this.state = newState;
        notifyObservers(newState);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(TrackerMessage message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// ConcreteObserver
class OverTracker implements Observer {
    private String name;
    private int totalBalls;

    public OverTracker(String name) {
        this.name = name;
    }

    @Override
    public void update(TrackerMessage message) {
        System.out.println(name + " received message: " + message);
        this.totalBalls += message.getBall();
    }

    public String getOvers() {
        return (this.totalBalls/6) + "." + (this.totalBalls%6);
    }
}

class ScoreTracker implements Observer {
    private String name;
    private int totalScore;

    public ScoreTracker(String name) {
        this.name = name;
        this.totalScore = 0;
    }

    @Override
    public void update(TrackerMessage message) {
        System.out.println(name + " received message: " + message);
        this.totalScore += message.getScore();
    }

    public int getTotalScore() {
        return this.totalScore;
    }
}

class TrackerMessage {
    private int ball;
    private int score;

    public TrackerMessage(int ball, int score) {
        this.ball = ball;
        this.score = score;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


