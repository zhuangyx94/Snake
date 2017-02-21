package com.tianmaying.snake;
import java.util.Arrays;

/**
 * Created by zyx on 2017/2/21.
 */
public class Grid {
    public final boolean status[][];
    private final int width;
    private final int height;

    private Snake snake;
    private Node food;

    public Grid(int width, int height){
        this.width = width;
        this.height = height;
        status = new boolean[width][height];
    }
    //初始方向设置为左
    private Direction snakeDirection = Direction.LEFT;
    private Snake initSnake(){
        snake = new Snake();
        //设置Snake的Body
        //更新棋盘的覆盖状态
        return snake;
    }
    public Node creatFood(){
        int x, y;
        //使用Random设置x和y
        food = new Node(x, y);
    }
    //外部修改贪吃蛇方向的方法
    public void changeDirection(Direction newDirection){
    }
    public boolean nextRound(){
        //按当前方向移动贪吃蛇
        if(头部的位置是否有效){
            if(头部是食物){
                //把原来move删掉的尾部添加回来
            }
            // 更新棋盘状态并返回游戏是否结束的标志
        }
    }
}
