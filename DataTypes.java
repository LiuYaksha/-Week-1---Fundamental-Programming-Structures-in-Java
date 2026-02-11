import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String input = scanner.nextLine();
            try {
                long num = Long.parseLong(input);
                StringBuilder result = new StringBuilder();
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    result.append("byte ");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    result.append("*short\n ");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    result.append("*int\n ");
                }
                result.append("*long\n");
                System.out.println(input + " can be fitted in: \n " + result.toString());
            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.\n");
            }
        }
        scanner.close();
    }
}