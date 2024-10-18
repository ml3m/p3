public class Main {

    // Function 1: Sum all values in C array of B
    public static int sumCValues(B b) {
        int sum = 0;
        for (C c : b.getCArray()) {
            sum += c.getValue();
        }
        return sum;
    }

    // Function 2: Concatenate A's property with all values in C array
    public static String concatenateAWithC(B b) {
        StringBuilder result = new StringBuilder(b.getA().getProperty());
        for (C c : b.getCArray()) {
            result.append(c.getValue());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        A a = new A("Hello, A!");
        C[] cArray = {new C(1), new C(2), new C(3)};
        B b = new B(a, cArray);

        if (args.length > 0) {
            switch (args[0]) {
                case "sum":
                    System.out.println("Sum of C values: " + sumCValues(b));
                    break;
                case "concat":
                    System.out.println("Concatenation of A's property with C values: " + concatenateAWithC(b));
                    break;
                default:
                    System.out.println("Invalid argument. Use 'sum' or 'concat'.");
            }
        } else {
            System.out.println("No function specified.");
        }
    }
}