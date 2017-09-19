package com.lxr.practice.fengzhuang;

/**
 * Created by liuxr on 2017/7/27.
 */
class Node {
    private String data ;	// 假设要保存的数据类型是字符串
    private Node next ;
    public Node(String data) {
        this.data = data ;
    }
    public String getData() {
        return this.data ;
    }
    public void setNext(Node next) {
        this.next = next ;
    }
    public Node getNext() {
        return this.next ;
    }
    public void addNode(Node newNode) {	// 操作的是节点关系
        if (this.next == null) {	// 当前节点的next为null
            this.next = newNode ;	// 保存新节点
        } else {
            this.next.addNode(newNode) ;
        }
    }
    public void printNode() {
        System.out.println(this.data) ;
        if (this.next != null) {	// 还有下一个节点
            this.next.printNode() ;
        }
    }
}
class Link {	// 处理节点关系
    private Node root ;	// 根节点
    public void add(String data) {	// 处理数据保存
        if (data == null) {	// 没有数据
            return ;	// 直接返回
        }
        // 每一个数据如果要想保存在链表之中，必须将其封装为节点
        // 这一操作的过程外部（用户）不需要知道
        Node newNode = new Node(data) ;
        if (this.root == null) {	// 现在没有根节点
            this.root = newNode ;	// 第一个作为根节点
        } else {
            this.root.addNode(newNode) ;
        }
    }
    public void print() {
        if (this.root != null) {	// 现在有根节点
            this.root.printNode() ;	// Node类处理
        }
    }
}
public class Test7 {
    public static void main(String args[]) {
        Link all = new Link() ;
        all.add("Hello") ;
        all.add("World") ;
        all.add("MLDN") ;
        all.print() ;

    }
}