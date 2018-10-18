public class SwitchCaseStatement {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) 
        {
            case 'A' :
                System.out.println("grade");
                break;
            case 'B' :
            case 'C' :
                System.out.println("good");
                break;
            case 'D' :
                System.out.println("normal");
                break;
            case 'F' :
                System.out.println("you need study hardly");
                break;
            default :
                System.out.println("unknown level");
        }
        System.out.println("your leave is " + grade);
    }
}