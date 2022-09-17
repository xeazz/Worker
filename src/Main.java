public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener<String> listener = System.out::println;
        OnTaskErrorListener<String> listener1 = System.out::println;
        Worker worker = new Worker(listener, listener1);
        worker.start();
    }
}