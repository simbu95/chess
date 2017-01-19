package chesscs5400;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class ChessCS5400 {
    static ChessGUI UI;
    public static void main(String[] args) {
        JFrame GUI=new JFrame();
        CB test = new CB();
        UI=new ChessGUI(test);
        GUI.add(new ChessGUI(test));
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setPreferredSize(new Dimension(800,600));
        GUI.pack();
        GUI.setVisible(true);
        GUI.addMouseListener(MM());
    }
    public static MouseListener MM(){
        MouseListener Mousey=new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        return Mousey;
    }
    
}
