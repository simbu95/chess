package chesscs5400;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ChessGUI extends JPanel{
    CP test;
    CP[][] Boa;
    Boolean Pressed=false;
    ChessGUI(CB bo){
        Boa=bo.Board;
    }
    @Override
    public void paintComponent(Graphics g){
        int r,R,x,y;
        if(getWidth()>getHeight()){r=getHeight()/8;R=getHeight();}
        else{r=getWidth()/8;R=getWidth();}
        g.setColor(Color.white);
        g.fillRect(0, 0, R, R);
        g.setColor(Color.red);
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if((i+j)%2==0){
                    g.fillRect(i*r, j*r, r, r);
                }
                if(Boa[i][j]!=null){
                g.drawImage(Boa[i][j].getImage(), i*r, j*r,r,r, this);}
            }
        }
        if(Pressed){
            
        }
    }
    public void ProcessPress(){
        int x=getMousePosition().x;
        int y=getMousePosition().y;
        int r,R;
        if(getWidth()>getHeight()){r=getHeight()/8;R=getHeight();}
        else{r=getWidth()/8;R=getWidth();}
        if(x<R && y<R && x>0 && y>0){
            
        }
    }
    public void ProcessRelease(){
        
    }
    public void ProcessMove(){
        
    }
    
    
}
