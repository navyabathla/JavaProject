public class linkedlist{

    private Node head;
    private Node tail;
    private int size;
    public linkedlist(){
        this.size=0;
    }

    private class Node{

        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertfirst(int value){
        Node node = new Node(value);
        node.next=head;
        head = node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void insertlast(int value){
        if (tail==null){
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;

    }
    private void insert(int value,int index){
        if (index==0){
            insertfirst(value);
            return;
        }
        if (index==size){
            insertlast(value);
            return;
        }
        Node temp=head;
        for (int i = 1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    public int delfirst(){
        int value = head.value;
        head = head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public Node get(int index){
        Node node = head;
        for (int i=0;i<=index;i++){
            node = node.next;
        }
        return node;
    }
    public int dellast(){
        if (size<=1){
            return delfirst();
        }
        Node secondlast = get(size-2);
        int value = tail.value;
        tail= secondlast;
        tail.next=null;

        return value;
    }
    public int delete(int index){
        if (index==0){
            return delfirst();
        }
        if (index==size-1){
            return dellast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next=prev.next.next;
        return value;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if (node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertfirst(3);
        list.insertfirst(5);
        list.insertfirst(23);
        list.insertfirst(7);
        list.insertlast(98);
        list.insert(100,3);
        list.display();
        System.out.println(list.delfirst());
        list.display();
        System.out.println(list.dellast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}