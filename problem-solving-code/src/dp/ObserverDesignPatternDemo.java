package dp;

import java.util.ArrayList;
import java.util.List;

abstract class Observer {
    protected Subject subject = null;

    public abstract void publishPost();
}

class Subject {
    List<Observer> observers = new ArrayList<>();
    String post;

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void writePost(String message) {
        post = message;
        notifyAllObservable();

    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    private void notifyAllObservable() {
        observers.forEach(observer -> observer.publishPost());
    }
}

class observer1 extends Observer {
    public observer1(Subject subject) {
        this.subject = subject;
        subject.attachObserver(this);
    }

    @Override
    public void publishPost() {
        System.out.println("observer1 :" + subject.post);
    }
}

class observer2 extends Observer {
    public observer2(Subject subject) {
        this.subject = subject;
        subject.attachObserver(this);
    }

    @Override
    public void publishPost() {
        System.out.println("observer2 :" + subject.post);
    }
}

class observer3 extends Observer {
    public observer3(Subject subject) {
        this.subject = subject;
        subject.attachObserver(this);
    }

    @Override
    public void publishPost() {
        System.out.println("observer3 :" + subject.post);
    }
}

public class ObserverDesignPatternDemo {
    public static void main(String arg[]) {
        Subject subject = new Subject();
        Observer observer1 = new observer1(subject);
        Observer observer2 = new observer2(subject);
        Observer observer3 = new observer3(subject);
        subject.writePost("Modi government is working hard");
        subject.removeObserver(observer1);
        subject.writePost("Awesome weather today");
    }
}
