package observer;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        service.subscribe(user1);
        service.subscribe(user2);

        service.addNotification("New article published!");

        service.unsubscribe(user1);

        service.addNotification("System maintenance scheduled.");
    }
}
