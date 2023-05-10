package Type;

// 在 Java 中，称为“TypeParameter”的 AST（抽象语法树）节点表示在泛型类、方法或接口中使用的类型参数。它捕获在尖括号 ( ) 中声明的类型参数的名称和可选类型边界<>
public class TypeParameter<T extends Number> {
    public void myMethod(T value) {
        // Method implementation
    }
}
