/**
 * A class to hold a list of int data, by
 * storing them as a linked list.
 */
public class IntLinkList {
  
  private IntNode top; //The reference to the first Node
  
  //=========== Supplied code =============================

  public IntLinkList() {
    //A constructor that creates an empty list.
    top = null;
  }
  
  public void add(int newItem) {
    //Add the newItem at the FRONT of the list.
    top = new IntNode(newItem,top);
  }
  /*Q1 part a
  here this constructor IntLinkedList create a linked list havingg the 
  same data from int array.
  */
  public IntLinkList(int[] data){
    top=new IntNode(data[0]);
    IntNode current=top;
    int n=data.length;
    for(int i=1;i<n;i++){
      current.n=new IntNode(data[i],null);
      current=current.n;
    }
  }
  /*Q1 part b
  this is a simple metthod which return true when linked list is null.
    */
  public boolean empty(){
    if(top==null){
      return true;
    }
    else{
      return false;
    }
  }
  /*Q1 part c
  here this metthod will return the top of the data.
  */
  public int first(){
    return top.data;
  }
  /*Q1 part d
  this will remove the first integer from the list.
  */
  public void removeFirst(){
    if(top==null){
      return ;
    }
    else{
      top=top.n;
      return;
    }
  }
  /*Q1 part e
  this will retun a new set of node witha s the same data
   from the original list.
  */
  public IntLinkList clone(){
    IntNode current=top;
    IntNode ans=new IntNode(-1);
    IntNode temp=ans;
    while(current!=null){
      temp.n=new IntNode(current.data);
      current=current.n;
      temp=temp.n;
    }
    IntLinkList linkedlist=new IntLinkList();
    linkedlist.top=ans.n;
    return linkedlist;
  }
  /*Q1 part f 
  (This took a bit long to think about Just a feeling It took me around a day)
  The List will remain in ascending order even if we adsd new int to it.
    */
  public void ordInsert(int newItem){
    IntNode insert=new IntNode(newItem,top);
    if(newItem<top.data){
      top=insert;
      return;
    }
    IntNode previous=top;
    IntNode current=top.n;
    while(current!=null){
        if(current.data<newItem){
          previous=previous.n;
          current=current.n;
        }
        else{
          previous.n=insert;
          insert.n=current;
          return ;
        }
    }
    previous.n=insert;
  }
  public String toString() {
    String answer = "<<";
    IntNode next = top;
    while(next!=null){
      answer += next.getData()+" ";
      next = next.getLink();
    }
    return answer+">>";
  }
  /* Q2
   it will return true if  top and other are identical 
   and   inevery other condition like any difference bw then it will 
   return false
  */
  public boolean equals(IntLinkList other){
    if(this.top==null && other.top ==null){
      return true;
    }
    if(this.top==null || other.top==null){
      return false;
    }
    if(this.top.data!=other.top.data){
      return false;
    }
    else{
      IntLinkList linklist1=new IntLinkList();
      IntLinkList linklist2=new IntLinkList();
      linklist1.top=this.top.n;
      linklist2.top=other.top.n;
      return linklist1.equals(linklist2);
    }
  }
  // just ignore this, its part of the marking process. 
  public void mult2(){
    IntNode next = top;
    while(next!=null){
      next.setData(2*next.getData());
      next = next.getLink();
    }//while
  }//mult2()
  
}