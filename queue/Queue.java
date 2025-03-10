class Queue {
    int array[], capacity, size;

    Queue(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            this.size = 0;
            this.array = new int[this.capacity];
        }
    }

    public boolean isFull() {
        return this.capacity == this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else {
            array[size] = item;
            size++;
            System.out.println(item + " enqueued");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        int first = array[0];
        for (int i = 0; i < size - 2; i++) {
            array[i] = array[i + 1];
        }
        size--;
        System.out.println("Popped element: " + first);
    }
}
