import java.util.ArrayList;

public class SharedData 
{
<<<<<<< HEAD
	private ArrayList<Integer> array;
=======
	private ArrayList<Integer> array ;
>>>>>>> branch 'master' of https://github.com/Tzachibenyair/nreRepo
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
<<<<<<< HEAD
	public SharedData(ArrayList<Integer> array2, int b) {
=======
	public SharedData(ArrayList<Integer> array , int b) {
>>>>>>> branch 'master' of https://github.com/Tzachibenyair/nreRepo
		
		this.array = array2;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
