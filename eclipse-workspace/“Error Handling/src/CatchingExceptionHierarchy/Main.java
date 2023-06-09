package CatchingExceptionHierarchy;

class MyParentException extends Exception {
}

class MyChildException extends MyParentException {
}

class MyGrandchildException extends MyChildException {
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyGrandchildException();
        } catch (MyChildException c) {
            System.err.println("Caught MyChildException");
        } catch (MyParentException p) {
            System.err.println("Caught MyParentException");
        }
    }
}
