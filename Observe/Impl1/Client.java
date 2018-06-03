package Observe.Impl1;

/**
 * 充当观察者
 */
public class Client implements Observer{

    private String id;
    private String message;

    public Client(String id) {
        this.id = id;
    }

    @Override
    public void update(String message) {
        this.message = message;
        readMessage();
    }

    public void readMessage(){
        System.out.println("Client" + id + "receive message: " + message);
    }
}
