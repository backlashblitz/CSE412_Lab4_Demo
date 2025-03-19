public class SubtractTwoNumbersInJavaFromUsersInput {
    public static void main(String[] args) {
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print("enter first Number  : ");
           int firstNumber = scan.nextInt();
 
           System.out.print("enter second Number  : ");
           int secondNumber = scan.nextInt();
 
           System.out.println("firstNumber - secondNumber = "
                        + (firstNumber - secondNumber));
    }
}
