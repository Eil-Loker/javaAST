package Type;

import java.util.List;

public class TypeArgument {
    public static void main(String[] args) {
        // TypeArgument代表通泛型实现的类型 List<String>中的String、List<? extends Number>中的? extends Number
        List<String> myList;
        List<? extends Number> myNumbers;
    }
}
