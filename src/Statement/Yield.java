package Statement;

public class Yield {
    public static void main(String[] args) {
        int day = 3;
        // Java15引入，Java8不支持此类型表达式 switch 表达式使用 yield 语句来指定根据匹配大小写返回的值。AST 节点“Yield”表示此 yield 语句并捕获要生成的表达式或值
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid day";
        };
        System.out.println(result);
    }
}
