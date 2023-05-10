package Statement;

public class StatementExpression {
    public static void main(String[] args) {
        // 与Statement的区别在于Statement是一条完整的语句，而StatementExpression则仅代表一个表达式，int x = 5;是一个Statement，int x和 x = 5分别都是一条表达式
        int x = 5;
        x++; // StatementExpression
        System.out.println(x); // StatementExpression
    }
}
