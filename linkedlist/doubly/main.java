class node{
    int data;
    node prev;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class main{
    public static void main(String[] args) {
        node head =new node(10);
        head.next=new node(20);
        head.next.prev=head;
        head.next.next=new node(30);
        head.next.next.prev=head.next;
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            if(temp.next!=null){
                System.out.print("<->");
            }
        }
    }
}