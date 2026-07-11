class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }

}
public class main{
    public static void main(String[] args){
        node head=new node(1);
        head.next=new node(2);
        head.next.next=new node(3);
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}