package Statement;

public class SwitchLabel {
    public static void main(String[] args) {
        int day = 3;
        // SwitchLabel代表Switch中的判断标签， case 1:, case 2:, case 3:, default: 这些
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
