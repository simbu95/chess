package chesscs5400;

public class CB { //ChessBoard
    CP[][] Board;
    Boolean turn;
    CB(){
        turn=false;
        Board=new CP[8][8];
        CP temp=new CP(1,true,new boolean[2],new boolean[2],"BlackKnight.png");
        Board[6][0]=temp;Board[1][0]=temp;
        temp=new CP(1,true,new boolean[2],new boolean[2],"BlackPawn.png");
        Board[7][1]=temp;Board[0][1]=temp;Board[6][1]=temp;Board[5][1]=temp;Board[4][1]=temp;Board[3][1]=temp;Board[2][1]=temp;Board[1][1]=temp;
        temp=new CP(1,true,new boolean[2],new boolean[2],"BlackBishop.png");
        Board[5][0]=temp;Board[2][0]=temp;
        temp=new CP(1,true,new boolean[2],new boolean[2],"BlackKing.png");
        Board[4][0]=temp;
        temp=new CP(1,true,new boolean[2],new boolean[2],"BlackQueen.png");
        Board[3][0]=temp;
        temp=new CP(1,true,new boolean[2],new boolean[2],"BlackRook.png");
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
    CB(String fen){
        Board=new CP[8][8];
        CP n=new CP(1,true,new boolean[2],new boolean[2],"BlackKnight.png");
        CP p=new CP(1,true,new boolean[2],new boolean[2],"BlackPawn.png");
        CP b=new CP(1,true,new boolean[2],new boolean[2],"BlackBishop.png");
        CP k=new CP(1,true,new boolean[2],new boolean[2],"BlackKing.png");
        CP q=new CP(1,true,new boolean[2],new boolean[2],"BlackQueen.png");
        CP r=new CP(1,true,new boolean[2],new boolean[2],"BlackRook.png");
        CP N=new CP(1,false,new boolean[2],new boolean[2],"WhiteKnight.png");
        CP R=new CP(1,false,new boolean[2],new boolean[2],"WhiteRook.png");
        CP B=new CP(1,false,new boolean[2],new boolean[2],"WhiteBishop.png");
        CP Q=new CP(1,false,new boolean[2],new boolean[2],"WhiteQueen.png");
        CP K=new CP(1,false,new boolean[2],new boolean[2],"WhiteKing.png");
        CP P=new CP(1,false,new boolean[2],new boolean[2],"WhitePawn.png");
        String[] fields=fen.split(" ");
        String[] placement=fields[0].split("/");
        int counter;
        for(int i=0;i<8;i++){
            counter=0;
            for(int j=0;j<placement[i].length();j++)
            if(Character.isDigit(placement[i].charAt(j))){
                counter+=Integer.parseInt(placement[i].substring(j,j+1));
            }
            else {
                switch(placement[i].charAt(j)){
                    case 'n':
                        Board[counter][i]=n;
                        break;
                    case 'q':
                        Board[counter][i]=q;
                        break;
                    case 'b':
                        Board[counter][i]=b;
                        break;
                    case 'k':
                        Board[counter][i]=k;
                        break;
                    case 'p':
                        Board[counter][i]=p;
                        break;
                    case 'r':
                        Board[counter][i]=r;
                        break;
                    case 'N':
                        Board[counter][i]=N;
                        break;
                    case 'Q':
                        Board[counter][i]=Q;
                        break;
                    case 'B':
                        Board[counter][i]=B;
                        break;
                    case 'P':
                        Board[counter][i]=P;
                        break;
                    case 'R':
                        Board[counter][i]=R;
                        break;
                    case 'K':
                        Board[counter][i]=K;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
                   counter++;
            }
        }
        turn="b".equals(fields[1]);
    }
    CB(CB s,Action a){
        Board=s.Board.clone();
        move(a);
    }
    public boolean getTurn(){
        return turn;
    }
    public void move(Action a){
        Board[a.xto][a.yto]=Board[a.xfrom][a.yfrom];
        Board[a.xfrom][a.yfrom]=null;
        turn=!turn;
    }
    boolean validMove(Action act) {
        return true;
    }
    public Action[] Actions(){ //should return the strongest moves first for iterative deepening
        return new Action[1];
    }
}
