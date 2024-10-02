public class doublylinkedlist{
    private Node head;
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node prev,Node next){
            this.value=value;
            this.next=next;
            this.prev=prev;

        }
    }
    public void insertfirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev= node;
        }
        head=node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value+"->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("ptint in reverse");
        while (last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("START");
    }
    public void insertlast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next=null;
        if (head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
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
    public void insert(int after,int value){
        Node p = find(after);
        if (p==null){
            System.out.println("does not exisit");
        }
        Node node = new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null){
            node.next.prev=node;
        }

    }


    public static void main(String[] args) {
        doublylinkedlist list = new doublylinkedlist();
        list.insertfirst(2);
        list.insertfirst(45);
        list.insertfirst(48);
        list.insertfirst(9);
        list.display();
        list.insertlast(99);
        list.display();
        list.insert(45,34);
        list.display();

    }

}