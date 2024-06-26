package src;

public class Node {
  private String str;
  private Node next;

  public Node (String str){
    this.str=str;
  }
  public Node(String str, Node next){
    this.str=str;
    this.next=next;
  }

  public void setNext(Node next){
    this.next=next;
  }

  public void setStr (String str){
    this.str=str;
  }

  public Node getNext(){
    return this.next;
  }

  public String getStr(){
    return this.str;
  }

  public static void main(String[] args) {
    Node head = new Node("hello", new Node("abc", new Node("def")));

  
    Node temp = head;
    boolean result = false;
    while (temp !=null) {
      if ("def".equals(temp.getStr())){
        result=true;
        break;
      }
      temp = temp.getNext();
    }
    System.out.println(temp.getNext());
    System.out.println(temp.getStr());
    System.out.println(result);
    System.out.println("hello".equals(null));
  }
}
