import java.util.Scanner;
class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Creating a stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("##########################################");
        System.out.println("WELCOME TO DHAKA INTERNATION UNIVERSITY");
        System.out.println("        DATA STRUCTURE LAB-3");
        System.out.println("              STACK");
        System.out.println("#########################################");
        System.out.print("Enter the size of the Stack: ");;
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true){
            System.out.println("1. To push an element");
            System.out.println("2. To pop an element");
            System.out.println("3. Show Stack");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            System.out.println("================================================");
            switch (choice){
                case 1:
                    System.out.print("Enter your element: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    if (!stack.isFull()) {
                        System.out.println("After adding element your stack now");
                        System.out.println("================================================");
                        stack.printStack();
                        System.out.println("================================================");
                    }
                    break;
                case 2:
                    stack.pop();
                    if (!stack.isEmpty()) {
                        System.out.println("\nAfter popping out/ removing element stack now");
                        System.out.println("================================================");
                        stack.printStack();
                        System.out.println("================================================");
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack Empty");
                        System.out.println("================================================");
                    }else {
                        stack.printStack();
                        System.out.println("================================================");
                    };
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

    }

    // Add elements into stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("================================================");
            System.out.println("Stack OverFlow\nYou can not add element, remove first then try again");
            System.out.println("================================================");
            return;
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.out.println("================================================");
            return 1;
        }
        return arr[top--];
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
