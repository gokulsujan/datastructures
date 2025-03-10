import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the queue capacity: ");
        int capacity = sc.nextInt();
        Queue queue = new Queue(capacity);

        int option = 0;
        while (option != 4) {
            selectOption();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the data to enqueue: ");
                    int data = sc.nextInt();
                    queue.enqueue(data);
                    continue;
                case 2:
                    queue.pop();
                    continue;
                case 3:
                    if (queue.isFull()) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println("Que can occupy: " + (queue.capacity - queue.size) + " elements");
                    }
                    continue;
                case 4:
                    break;
                default:
                    continue;
            }
        }

    }

    public static void selectOption() {
        System.out.println("Select an option");
        System.out.println("Option 1: Add data to the queue");
        System.out.println("Option 2: Pop data from the queue");
        System.out.println("Option 3: Check the capacity");
        System.out.println("Option 4: Exit Program");
        System.out.print("Option: ");
    }

}
