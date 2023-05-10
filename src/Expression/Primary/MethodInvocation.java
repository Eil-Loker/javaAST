package Expression.Primary;

public class MethodInvocation {
    public static void main(String[] args) {
        String message = "Hello";
        // message.length()是一个方法实例
        int length = message.length();
        System.out.println("Length: " + length);
    }
}
