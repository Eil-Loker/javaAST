package Expression;

public class Lambda {
    public static void main(String[] args) {
        // (x, y) -> x + y是一个Lambda节点，代表Lambda表达式
        MyInterface myLambda = (x, y) -> x + y;
        int result = myLambda.calculate(5, 3);
        System.out.println(result); // Output: 8
    }
}

interface MyInterface {
    int calculate(int a, int b);
}