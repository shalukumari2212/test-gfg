/*
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node deepCopy(Node head1){
        Node temp1=head1;
        Node head2= new Node(-1);
        Node temp2=head2;
        while(temp1!=null){
             Node temp= new Node(temp1.data);
             temp2.next=temp;
             temp1= temp1.next;
             temp2= temp2.next;
        }
        return head2.next;
    }
    public Node cloneLinkedList(Node a) {
        // code here
        Node b= deepCopy(a);
        HashMap<Node,Node>map=new HashMap<>();
        Node t1=a;
        Node t2=b;
        map.put(null,null);
        while(t1!=null){
            map.put(t1,t2);
            t1= t1.next;
            t2= t2.next;
        }
        t1=a;
        while(t1!=null){
            map.get(t1).random= map.get(t1.random);
            // t2=map.get(t1);
            // t2.random=map.get(t1.random);
            t1= t1.next;
        }
        return b;
        
    }
}