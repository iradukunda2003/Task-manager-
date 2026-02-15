public class Main {

    public static void main(String[] args) {

        System.out.println("-Task Manager System -");

        TaskManager manager = new TaskManager();

        try {

            manager.addTask("Do homework");
            manager.addTask("Attend Java class");
            manager.addTask("Buy groceries");

            manager.addTask("");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InvalidTaskException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finished adding tasks.\n");
        }

        manager.displayTasks();

        manager.sortTasks();
        manager.displayTasks();

        manager.searchTask("Buy groceries");
        manager.searchTask("Sleep");

        manager.removeTask("Do homework");
        manager.displayTasks();

        manager.findLongestTask();


        manager.getTaskByIndex(1);
        manager.getTaskByIndex(10);
    }
}