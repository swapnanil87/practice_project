package demo5;

class ThrowAndThrow extends Exception {
    public ThrowAndThrow(String message) {
        super(message);
    }
}

class Example {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ThrowAndThrow e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws ThrowAndThrow {
        if (divisor == 0) {
            throw new ThrowAndThrow("Cannot divide by zero!");
        }
        return dividend / divisor;
    }
}