package singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();

        System.out.println("Config 1: " + configManager1.getConfiguration());
        System.out.println("Config 2: " + configManager2.getConfiguration());

        // Update configuration via one instance
        configManager1.setConfiguration("Updated Configuration");

        // Both instances should reflect the same configuration
        System.out.println("Config 1 after update: " + configManager1.getConfiguration());
        System.out.println("Config 2 after update: " + configManager2.getConfiguration());
    }
}
