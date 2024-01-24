import java.util.ArrayList;


/**
 * @author shimron
 *Connected info between two threads 
 */
public class SharedData 
{
	
	private ArrayList<Integer> array = new ArrayList<>();
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	public ThreadData Thread1,Thread2;
	
	/** the constructor of the class
	 * @param array2     the array that we got from the user	
	 * @param b			the number that the user chose to check
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		
		this.array = array2;
		this.b = b;
		Thread1=new ThreadData();
		Thread2=new ThreadData();
	}

	/**  getter - method that return the boolean array
	 * @return a boolean array - every index in the array
	 * can get 0/1 1 if the number is used for the solution else 0 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** setter - a method that set the boolean array to be the given array
	 * @param winArray   the array that we got after we found the solution
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** getter - a method that return array 
	 * @return 	array of the numbers from the input
	 */
	public ArrayList<Integer>getArray() 
	{
		return array;
	}

	/** getter - a method that return integer number	
	 * @return the number that the user chose to check
	 */
	public int getB() 
	{
		return b;
	}

	/** getter - a method that return boolean value	
	 * @return flag that inform that one of the threads found the solution
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** setter - set the flag to be the given value
	 * @param flag flag that inform that one of the threads found the solution
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	/** the ThreadData of the class
	 * provide data on each thred
	 */	
	class ThreadData
	{
		boolean winner=false;
		long endTime=0;
		
		/** setter - set the end time of thread 1 to be the given value
		 * @param long time the end time of the thread1 when solution was found
		 */
		public void setTime(long time)
		{
			endTime=time;
		}
		
		/** getter - a method that return long value that represent time in nano seconds	
		 * @return return the time of thread when solution was found
		 */
		public long getTime() 
		{
			return endTime;
		}
		
		/** getter - a method that return boolean value	
		 * @return winner that indicate if the thread is winner(winner=true)
		 */
		public boolean getWinner() 
		{
			return winner;
		}

		/** setter - set the wiiner flag to be the given value
		 * @param winner flag = true  indicate that this thread found the solution 
		 */
		public void setWinner(boolean winner) 
		{
			this.winner = winner;
		}
	}

}
