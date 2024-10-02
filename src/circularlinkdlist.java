public class circularlinkdlist{
    private Node head;
    private Node tail;
    public circularlinkdlist(){
        this.head=null;
        this.tail=null;
    }
    private class Node{
        int value;
        Node next;
        public Node(int vlaue){
            this.value=value;
        }
    }
    public void insert(int value){
        Node node = new Node(value);
        if (head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next =node;
        node.next=head;
        tail=node;
    }
    public void display(){
        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.value+"->");
                node=node.next;
            }while (node!=head);
        }
        System.out.println("START");
    }
    public void del(int value){
        Node node = head;
        if (node==null){
            return;
        }
        if (node.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            Node n = node.next;
            if (n.value==value){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while (node!=head);
    }

    public static void main(String[] args) {
        circularlinkdlist list = new circularlinkdlist();
        list.insert(23);
        list.insert(2);
        list.insert(6);
        list.insert(10);
        list.display();
        list.del(6);
        list.display();
    }

}