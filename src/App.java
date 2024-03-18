public class App {
    public static void main(String[] args) throws Exception {
        int N = 2;
        switch (N){
            case 1:
                System.out.println("Its SUNDAY!");break;
            case 2:
                System.out.println("Its MONDAY!");break;
            case 3:
                System.out.println("Its THUESDAY!");break;
            case 4:
                System.out.println("Its WEDNESDAY!");break;
            case 5:
                System.out.println("Its THURSDAY!");break;
            case 6:
                System.out.println("Its FRIDAY!");break;
            case 7:
                System.out.println("Its SATURDAY!");break;
            
            default : System.err.println("no days of this number!");
        }
        System.out.println("Hello, World!");
    }
}
