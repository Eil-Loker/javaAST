package Expression;

public class InstanceOf {
    public static void main(String[] args) {
        Object obj = "Hello";
        // obj instanceof String中instanceof关键字代表InstanceOf节点，用于判断对象是否属于某类型的实例或其子类的实例
        boolean isString = obj instanceof String;
        System.out.println("Is String: " + isString);
    }
}
