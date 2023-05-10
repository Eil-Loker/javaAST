package Expression;

public class ArgumentList {
    public static void main(String[] args) {
        printMessage("Hello", 42);
    }

    // (String message, int count)就是ArgumentList节点，代表参数列表
    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
