package Type;

import java.util.List;
// TypeList AST 节点捕获类型参数或类型参数的序列及其顺序。它允许在各种上下文中表示类型列表，例如在声明参数化类型、定义泛型方法或类或指定类型边界时。
public class TypeList<T, U extends Number> {
    public void myMethod(List<T> list, U value) {
        // Method implementation
    }
}
