package Statement;

public class SwitchBlock {
    public static void main(String[] args) {
        int day = 3;
        // SwitchBlock与Switch的区别在于，Switch指Switch语句，而SSwitchBlock代表Switch块中的代码包含(case 1:, case 2:, case 3:, default:)等等及其相关代码
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
