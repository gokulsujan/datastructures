class LinkedList {
    Node Head;

    public void insert(int data) {
        Node node = new Node(data);
        if (Head == null) {
            Head = node;
        } else {
            Node currentNode = Head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }

    }

    public void delete(int data) {
        Node currentNode = Head;
        if (Head.data == data) {
            Head = Head.next;
        }
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
    }

    public boolean isPresent(int data) {
        Node currentNode = Head;

        while (currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void insertAfterTheMember(int member, int data) {
        Node newNode = new Node(data);
        Node currentNode = Head;
        while (currentNode != null) {
            if (currentNode.data == member) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                break;
            } else {
                currentNode = currentNode.next;
            }
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
