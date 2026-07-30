class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }

    }
    Node head;
    
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(index>=c || index<0){
            return -1;
        }
        temp=head;
        int i=0;
        while(i<index){
            temp=temp.next;
            i++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {     
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
    }
    
    public void addAtTail(int val) {
       
        Node newnode=new Node(val);
         if(head==null){
            head=newnode;
            return ;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        Node newnode=new Node(val);
        int i=0;
        Node temp=head;
        while(temp!=null && i<index-1 ){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    
    public void deleteAtIndex(int index) {
         if (index == 0) {
            head = head.next;
            return;
        }
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(index>=c || index<0){
            return ;
        }
        int i=0;
        temp=head;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        
        if(temp.next!=null ){
            temp.next=temp.next.next;
        }
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */