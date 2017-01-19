package chesscs5400;

import java.awt.Dimension;
import javax.swing.JFrame;

public class ChessCS5400 {

    public static void main(String[] args) {
        JFrame GUI=new JFrame();
        CP test = new CP(1,false,new boolean[6],new boolean[6],"BlackPawn.png");
        GUI.add(new ChessGUI(test));
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setPreferredSize(new Dimension(800,600));
        GUI.pack();
        GUI.setVisible(true);
    }
    
}
