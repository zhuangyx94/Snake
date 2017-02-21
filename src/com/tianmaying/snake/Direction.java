package com.tianmaying.snake;

/**
 *  贪吃蛇前进的方向
 */
public enum Direction {
    UP(0),
    RIGHT(1),
    DOWN(2),
    LEFT(3);
    //成员变量
    private final int directionCode;
    //构造方法
    Direction(int directionCode) {
        this.directionCode = directionCode;
    }
    //成员方法
    public int directionCode(){
        return directionCode;
    }
}
