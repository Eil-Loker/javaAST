package Expression;

public class Conditional {
    public static void main(String[] args) {
        int x = 10;
        // (x > 5) ? "Greater than 5" : "Less than or equal to 5"是一个Conditional节点，代表条件或三目运算符
        String message = (x > 5) ? "Greater than 5" : "Less than or equal to 5";
        System.out.println(message);
    }
}
