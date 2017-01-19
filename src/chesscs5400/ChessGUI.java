package chesscs5400;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ChessGUI extends JPanel{
    CP test;
    ChessGUI(CP p){
        test=p;
    }
    @Override
    public void paintComponent(Graphics g){
        int r,R,x,y;
        if(getWidth()>getHeight()){r=getHeight()/8;R=getHeight();}
        else{r=getWidth()/8;R=getWidth();}
        x=r/7;y=r/6;
        g.setColor(Color.white);
        g.fillRect(0, 0, R, R);
        g.setColor(Color.red);
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if((i+j)%2==0){
                    g.fillRect(i*r, j*r, r, r);
                    g.drawImage(test.getImage(), i*r+x, j*r+y, this);
                }
            }
        }
    }
    
    
}
