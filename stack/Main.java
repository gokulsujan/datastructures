import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stack capacity: ");
        int capacity = sc.nextInt();
        Stack stack = new Stack(capacity);
        int option = 0;

        while (option != 4) {
            selectOption();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Data: ");
                    int data = sc.nextInt();
                    if (stack.push(data)) {
                        System.out.println("Data pushed to stack");
                    } else {
                        System.out.println("Stack capacity exceeds");
                    }
                    continue;
                case 2:
                    System.out.println("Data: " + stack.pop());
                    continue;
                case 3:
                    System.out.println("Data: " + stack.peek());
                    continue;
                case 4:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid option. Try again!!");
                    continue;
            }
        }
    }

    public static void selectOption() {
        System.out.println("Select an option");
        System.out.println("Option 1: Push");
        System.out.println("Option 2: Pop");
        System.out.println("Option 3: Peek");
        System.out.println("Option 4: Exit Program");
        System.out.print("Option: ");
    }
}
