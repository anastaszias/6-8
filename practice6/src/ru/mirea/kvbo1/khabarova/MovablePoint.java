package ru.mirea.kvbo1.khabarova;

public class MovablePoint {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint (int x,int y,int xSpeed,int ySpeed){
        this.x  = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "Point("+x+","+y+")";
    }
    public void moveRight() {x++;}
    public void moveLeft() {x--;}
    public void moveUp() {y++;}
    public void moveDown() {y--;}
}
