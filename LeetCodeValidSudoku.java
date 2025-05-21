import java.util.HashSet;

public class LeetCodeValidSudoku {
    public static void main(String[] args) {
         char[][] board = {
    {'1','2','.','.','3','.','.','.','.'},
    {'4','.','.','5','.','.','.','.','.'},
    {'.','9','8','.','.','.','.','.','3'},
    {'5','.','.','.','6','.','.','.','4'},
    {'.','.','.','8','.','3','.','.','5'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','.','.','.','.','.','2','.','.'},
    {'.','.','.','4','1','9','.','.','8'},
    {'.','.','.','.','8','.','.','7','9'}

};

        System.out.println(isValid(board));
    }
    public static boolean isValid(char[][] board){
        boolean isV=true;
        for(int i =0 ;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
               for(int k=j+1;k<board[i].length;k++){
                if(board[i][j]=='.'){
                    break;
                }
                if(board[i][j]==board[i][k]){
                    isV=false;
                    break;
                }
               }
            }
        }
        if(isV==false){
            return false;
        }
        for(int i =0 ;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
               for(int k=j+1;k<board[i].length;k++){
                if(board[j][i]=='.'){
                    break;
                }
                if(board[j][i]==board[k][i]){
                    isV=false;
                    break;
                }
               }
            }
        }
         if(isV==false){
            return false;
        }

       for (int boxRow = 0; boxRow < board.length; boxRow += 3) {
        for (int boxCol = 0; boxCol < board.length; boxCol += 3) {
            HashSet<Character> boxSet = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char val = board[boxRow + i][boxCol + j];
                    if (val == '.') continue;
                    if (boxSet.contains(val)) return false;
                    boxSet.add(val);
                }
            }
        }
    }



        return isV;
    }
}
