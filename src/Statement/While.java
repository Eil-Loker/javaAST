package Statement;

public class While {
    public static void main(String[] args) {
        int count = 0;
        // while语句代表一个While节点
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}
