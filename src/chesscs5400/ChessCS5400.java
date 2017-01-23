package chesscs5400;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class ChessCS5400 {
    static ChessGUI UI;
    public static void main(String[] args) {
        JFrame GUI=new JFrame();
        CB test = new CB("rnbqkbnr/pppppppp/8/8/4P3/8/PPPP1PPP/RNBQKBNR b KQkq e3 0 1");
        UI=new ChessGUI(test);
        GUI.add(UI);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setSize(800,600);
        GUI.setVisible(true);
        GUI.addMouseListener(MM());
        GUI.addMouseMotionListener(mousy());
    }
    public static MouseListener MM(){
        MouseListener Mousey=new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {UI.ProcessPress();}

            @Override
            public void mouseReleased(MouseEvent e) {UI.ProcessRelease();}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
        return Mousey;
    }
    static MouseMotionListener mousy(){
        MouseMotionListener listen=new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {UI.ProcessMove();}

            @Override
            public void mouseMoved(MouseEvent e) {}
        };
        return listen;
    }
    public Action AI(CB s,boolean minmax,int depth){ // Gives the chosen move, minmax allows choice of black/white move
        return new Action(0,0,0,0);
    }
    public int MiniMaxi(CB s,int alpha,int beta,boolean minmax,int depth ){ // alpha and beta prunning
        //should maybe do something for Quienstience search
        return 0;
    }
    public void Result(CB s,Action a){
        s.move(a);
    }
}
