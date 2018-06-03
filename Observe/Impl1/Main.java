package Observe.Impl1;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client("1");
        server.registerObserver(client);

        server.updateMessage("message 1");
    }

}
