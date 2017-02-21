package com.tianmaying.snake;
import java.util.LinkedList;

/**
 * Created by zyx on 2017/2/21.
 */
public class Snake {
    private LinkedList<Node>body = new LinkedList<>();
    public Node eat(Node food){
        //如果food与头部相邻，则将food这个Node加到body中，返回food
        //否则不做任何操作，返回null;
        if(!isNeighbor(body.getFirst(), food)){

        }
    }
    private boolean isNeighbor(Node a, Node b){
        return Math.abs(a.getX()-b.getX()) + Math.abs(a.getY()-b.getY()) == 1;
    }
    public Node move(Direction direction){
        //根据方向更新贪吃蛇的body
        //返回之前的尾部Node
    }
    public Node getHead(){
        return body.getFirst();
    }
    public Node addTail(Node area){
        this.body.addLast(area);
        return area;
    }
    public LinkedList<Node>getBody(){
        return body;
    }

}
