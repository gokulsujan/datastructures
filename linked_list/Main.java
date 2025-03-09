import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int option = 0;
        Scanner sc = new Scanner(System.in);

        while (option != 5) {
            selectOption();
            System.out.print("Option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    ll = insert(ll);
                    continue;
                case 2:
                    search(ll);
                    continue;
                case 3:
                    ll = delete(ll);
                    continue;
                case 4:
                    traverse(ll);
                    continue;
                case 5:
                    System.out.println("Exiting from linked list.");
                    break;
                default:
                    System.out.println("That was an invalid option");
                    continue;
            }
        }
    }

    public static void selectOption() {
        System.out.println("Select an option");
        System.out.println("Option 1: Add data to the linked list");
        System.out.println("Option 2: Check data exists in the linkedlist");
        System.out.println("Option 3: Delete a data in the linked list");
        System.out.println("Option 4: Print all the datas in the linked list");
        System.out.println("Option 5: Exits");
    }

    public static LinkedList insert(LinkedList ll) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        ll.insert(data);
        System.out.println("Data inserted successfully!!");
        return ll;
    }

    public static void search(LinkedList ll) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        if (ll.isPresent(data)) {
            System.out.println("Data present in the linked list.");
        } else {
            System.out.println("Data not present in the linked list.");
        }
    }

    public static LinkedList delete(LinkedList ll) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        ll.delete(data);
        System.out.println("Data delete successfully!!");
        return ll;
    }

    public static void traverse(LinkedList ll) {
        Node currentNode = ll.Head;

        System.out.println("Printing linked list values: ");
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
