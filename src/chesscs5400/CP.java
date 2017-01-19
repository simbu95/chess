package chesscs5400;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CP { //ChessPiece
    int type;
    int x;
    int y;
    boolean color;
    boolean hasMoved;
    boolean[] moves;
    boolean[] attacks;
    Image icon;
    CP(){
       icon=null;
       type=0;
    }
    CP(int t,boolean c, boolean[] m,boolean[] a,String i){
        type=t;
        color=c;
        hasMoved=false;
        moves=m.clone();
        attacks=a.clone();
        try {icon=ImageIO.read(new File(i));} 
        catch (IOException ex) { System.out.println("Image not Found");}
    }
    public Image getImage(){
        return icon;
    }
    public int getType(){
        return type;
    }
    public boolean getColor(){
        return color;
    }
    public boolean getMove(int i){
        return moves[i];
    }
    public boolean getAttack(int i){
        return attacks[i];
    }
    public boolean getMoved(){
        return hasMoved;
    }
    public void Moved(){
        hasMoved=true;
    }
    public void setPosition(int a,int b){
        x=a;y=b;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
}
