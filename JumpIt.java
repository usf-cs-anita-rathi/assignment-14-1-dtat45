import java.util.Random;

public class JumpIt 
{
	private int cost=0;
	public int n;
	public int i;
	public int currentColumn=0;
	public int adjacentColumn=1;
	public int jumpColumn=2;
	//private int randomNum;
	Random random=new Random();
	
	public int checkCost(int[] board)
	{
		if(currentColumn==(board.length-2)) {
			currentColumn++;
			return (board[currentColumn]);
		}
		else if(board.length<=jumpColumn) { //Handles the case when there is no "jumpColumn" space
			return 0;
		}
		else if(board[adjacentColumn]<board[jumpColumn]) { //Chooses the adjacent space
			adjacentColumn++;
			jumpColumn++;
			currentColumn++;
			return (board[currentColumn]+checkCost(board));
		}
		else { //Chooses the adjacent space
			adjacentColumn+=2;
			jumpColumn+=2;
			currentColumn+=2;
			return (board[currentColumn]+checkCost(board));
		}
		
	}
	/**public void createBoard(int num)
	{
		n=(num-1);
		int[] board=new int[n];
		System.out.print("0 ");
		for(int i=0;i<n;i++) {
			randomNum=random.nextInt(100);
			board[i]=randomNum;
		}
		for(int i=0;i<n;i++) {
			System.out.print(board[i]+" ");
		}
		System.out.println();
	}*/

	public static void main(String args[]) {
		JumpIt game=new JumpIt();
		int[] board=new int[]{0,10,9,3,14,4,19,12,13};
		
		System.out.print("Board: ");
		for(int i=0;i<board.length;i++) {
			System.out.print(board[i]+" ");
		}
		System.out.println();
		System.out.print("The cheapest cost of the game: ");
		System.out.println(game.checkCost(board));
	}
}
