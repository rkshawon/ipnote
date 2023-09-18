//create, delete, addlast, addfirst and reverse linked list
import java.util.*;


  public class Main {
    static class Node{
    int data;
    Node next;
    
    Node(int num){
      data = num;
    }
  }
  
  static Node addLast(int num, Node node){
    Node head = node;
    while(node.next != null){
      node = node.next;
    }
    Node newNode = new Node (num);
    node.next = newNode;
    return head;
  }
  
  static Node addFirst(int num, Node node){
    Node newNode = new Node(num);
    newNode.next = node;
    return newNode;
  }
  
  static Node deleteNode(int num, Node node){
    Node head = node, prev = node;

    if(node.data == num){
      head = node.next;
      return head;
    }
    
    while(node != null && node.data != num){
      prev = node;
      node = node.next;
    }
    if(node == null){
      System.out.println("Not found");
      return head;
    }
    prev.next = node.next;
    return head;
  }
  ///reverse list
  static Node reverseList(Node node){
    Node curr=node.next, prev=node, nxt=node.next;
    
    while(nxt != null){
      nxt = nxt.next;
      curr.next = prev;
      prev = curr;
      curr = nxt;
    }
    node.next = null;
    return prev;
  }
  
    public static void main(String[] args) {
      Node list = new Node(5);
      list= addLast(1, list);
      list= addLast(2, list);
      list= addLast(7, list);
      list= addFirst(14, list);
      list= addFirst(70, list);
      
      System.out.println("Before Delete");
      
      Node temp = list;
      while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
      }
      
      list = reverseList(list);
      System.out.println("After reverse");
      
      Node temp1 = list;
      while(temp1 != null){
        System.out.println(temp1.data);
        temp1 = temp1.next;
      }
      
      list = deleteNode(7, list);
      
      System.out.println("After Delete");
      
      while(list != null){
        System.out.println(list.data);
        list = list.next;
      }

  }
}