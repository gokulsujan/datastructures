class Stack {
    int array[], top, capacity;

    Stack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = 0;
    }

    public boolean push(int data) {
        if (top == capacity) {
            return false;
        } else {
            top++;
            array[top] = data;
            return true;
        }
    }

    public int pop() {
        int data = array[top];
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }

        return data;
    }

    public int peek() {
        if (top == 0) {
            System.out.println("Stack is empty");
        }

        return array[top];
    }
}
