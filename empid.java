import java.util.Scanner;
class empid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String dep = sc.next();
        switch (n) {
            case 1:
                System.out.println("Anurag");
                break;
            case 2:
                System.out.println("Aditya");
                break;
            case 3:
                System.out.println("Virendra");
                switch (dep) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("Invalid department");
                }
                break;
            default:
                System.out.println("Invalid empID");
                break;
        }
    }
}