package bridgelabz;

public class MyLinkedList<K> {

    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //Add
    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //Append
    public void append(INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    //Insert
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    //Delete 1st Element
    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    //Delete Last Element
    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        tail.setNext(tempNode);
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    //Search element
    public INode search(K key) {
        INode tempNode = this.head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getNext().equals(key)) {
                tempNode = tempNode.getNext();
                return tempNode;
            }
        }
        return null;
    }

    public int size() {
        INode tempNode = this.head;
        int size = 0;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }

    //Insert a new number
    public void insertNew(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    
    //Delete middle element
    public void deleteMiddleElement(MyNode<Integer> key) {
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(key)) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
        System.out.println("size of linklist:" + size());
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
