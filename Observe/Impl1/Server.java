package Observe.Impl1;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务端充当被观察者，负责发布消息
 */
public class Server implements Observerable{

    //观察者注册在被观察者身上，但事实上观察者与被观察者解耦合
    private List<Observer> observers;
    private String message;

    public Server() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Object object) {
        observers.add((Observer) object);
    }

    @Override
    public void removeObserver(Object object) {
        if (!observers.isEmpty())
            observers.remove(object);
    }

    //通过这里通知观察者
    @Override
    public void notifyOfObserver() {
        for (Observer observer: observers)
            observer.update(message);
    }

    public void updateMessage(String newMessage){
        this.message = newMessage;
        //在这里回调通知观察者
        notifyOfObserver();
    }
}
