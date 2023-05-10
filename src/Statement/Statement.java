package Statement;

public class Statement {
    public static void main(String[] args) {
        // 每一条语句都是一个Statement节点
        int x = 5; // Statement: Variable declaration and initialization
        System.out.println(x); // Statement: Method invocation
        x++; // Statement: Increment operation
        if (x > 10) { // Statement: Conditional statement
            System.out.println("x is greater than 10");
        } else { // Statement: Conditional statement
            System.out.println("x is less than or equal to 10");
        }
    }
}
