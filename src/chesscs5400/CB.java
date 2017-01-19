package chesscs5400;

public class CB { //ChessBoard
    CP[][] Board;
    CB(){
        Board=new CP[8][8];
        CP temp=new CP(1,false,new boolean[2],new boolean[2],"BlackKnight.png");
        Board[6][0]=temp;Board[1][0]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"BlackPawn.png");
        Board[7][1]=temp;Board[0][1]=temp;Board[6][1]=temp;Board[5][1]=temp;Board[4][1]=temp;Board[3][1]=temp;Board[2][1]=temp;Board[1][1]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"BlackBishop.png");
        Board[5][0]=temp;Board[2][0]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"BlackKing.png");
        Board[4][0]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"BlackQueen.png");
        Board[3][0]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"BlackRook.png");
        Board[7][0]=temp;Board[0][0]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"WhiteKnight.png");
        Board[6][7]=temp;Board[1][7]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"WhiteRook.png");
        Board[7][7]=temp;Board[0][7]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"WhiteBishop.png");
        Board[5][7]=temp;Board[2][7]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"WhiteQueen.png");
        Board[3][7]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"WhiteKing.png");
        Board[4][7]=temp;
        temp=new CP(1,false,new boolean[2],new boolean[2],"WhitePawn.png");
        Board[7][6]=temp;Board[0][6]=temp;Board[6][6]=temp;Board[5][6]=temp;Board[4][6]=temp;Board[3][6]=temp;Board[2][6]=temp;Board[1][6]=temp;
        
        
    }
}
