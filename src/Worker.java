@FunctionalInterface
interface OnTaskDoneListener<String> {
    void onDone(String result);
}

@FunctionalInterface
interface OnTaskErrorListener<String> {
    void onError(String result);
}

public class Worker {
    private OnTaskDoneListener<String> callback;
    private OnTaskErrorListener<String> errorCallback;

    public Worker(OnTaskDoneListener<String> callback, OnTaskErrorListener<String> errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }

        }
    }
}


