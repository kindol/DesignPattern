package Observe.Impl1;

/**
 * 观察者，当被观察者有事件触发的时候，将会回调观察者的update
 */
public interface Observer {

    void update(String message);

}
