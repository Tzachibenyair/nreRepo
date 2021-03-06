import java.util.ArrayList;
/** The class represent the array of number  
 * and array of boolean ,they are share between 
 * two different threads.
 * @author Tzachi
 * @author Eden*/

public class SharedData 
{

	
	private ArrayList<Integer> array;

	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	
	/**The constructor get list of integer numbers and another number
	 * and initialize the array and b
	 * @param ArrayList<Integer> array
	 * @param int b*/

	
	public SharedData(ArrayList<Integer> array , int b) {

		
		this.array = array;
		this.b = b;
	}
	
	/**getWinArray method 
	 * @return boolean array */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	
	/**setWinArray method initialize the boolean array with given array
	 * @param boolean[] winArray*/
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	/**getArray method 
	 * @return integer list */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
	/**getB method
	 * @return integer variable*/
	public int getB() 
	{
		return b;
	}
	/**getFlag method 
	 @return boolean flag*/
	public boolean getFlag() 
	{
		return flag;
	}
	/**setFlag method set on the flag
	 * 
	 * @param boolean flag */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
