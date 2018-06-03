package Observe.Impl1;

public interface Observerable {

    void registerObserver(Object object);
    void removeObserver(Object object);
    void notifyOfObserver();

}
