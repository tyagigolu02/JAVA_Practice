package CollectionFramework;

public class LinkedList01 {
    class Node{
        String data;
        Node next;

        Node(String value){
            data = value;
            next = null;
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
    }

    // remove last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;
    }

    // remove first
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }
    public void show(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    static void main() {
        LinkedList01 obj = new  LinkedList01();
        obj.addFirst("32");
        obj.addFirst("2");
        obj.show();
        obj.addLast("1");
        obj.show();
        obj.deleteLast();
        obj.deleteFirst();
        obj.show();
    }
}
