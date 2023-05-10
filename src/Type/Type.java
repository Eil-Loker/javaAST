package Type;

import java.util.List;

public class Type {
    // Type包含基本类型，引用类型，参数化类型，void类型等，用包含参数类型方法返回类型等
    public static void main(String[] args) {
        int count; // Type: PrimitiveType (int)
        String name; // Type: SimpleType (String)
        List<Integer> numbers; // Type: ParameterizedType (List<Integer>)
        voidMethod(); // Type: PrimitiveType (void)
    }

    public static void voidMethod() {
        // Method with void return type
    }
}
