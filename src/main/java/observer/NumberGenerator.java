package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    /**
     * Observer 저장
     */
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     *
     * @param observer
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     *
     * @param observer
     */
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * observer에 알림
     */
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()) {
            Observer o = it.next();
            o.update(this);
        }
    }

    /**
     * 수를 취득한다.
     *
     * @return
     */
    public abstract int getNumber();

    /**
     * 수를 생성한다.
     */
    public abstract void execute();
}
