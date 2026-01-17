package CollectionFramework;

public class DoubleLinkedList01 {
    class Node{
        String data;
        Node next,prev;

        Node(String value){
            data = value;
            next = null;
            prev = null;
        }
    }
    Node head;
    //    Node tail;
    // add first method
    public void addFirst(String value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // add last method
    public void addLast(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // remove last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next=null;
    }

    // remove first
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public void show(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public void printBack(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp.prev==null){
            System.out.println(temp.data + " --> ");
            temp=temp.prev;
        }
    }
    static void main() {
        DoubleLinkedList01 obj = new DoubleLinkedList01();
        obj.addFirst("32");
        obj.addFirst("2");
        obj.show();
        obj.addLast("1");
        obj.show();
        obj.deleteLast();
        obj.deleteFirst();
        obj.show();
        obj.printBack();
    }
}
