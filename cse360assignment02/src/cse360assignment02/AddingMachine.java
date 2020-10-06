package cse360assignment01;

public class AddingMachine {
	  
		  private int total;
		  private String calculations;
		  /*
		  * Description: 
		  *@param (name of param and *description of it)
		  *@return (name of what gets returned *and what it is)
		  */
		  public AddingMachine () {
		    total = 0;  // not needed - included for clarity
		  }
		  /*
		   * Description: gets the final int of the calculations 
		   * @param no paramters 
		   * @return an int of the final total
		   */
		  public int getTotal () {
		    return total;
		  }
		  /*
		   * Description:  adds an int
		   * @param int that will be added
		   * @return no return
		   */
		  public void add (int value) {
			  total+=value;
			  calculations= calculations+"+"+value;
		  }
		  /*
		   * Description: subtracts an int
		   * @param int that will be subtracted 
		   * @return no return
		   */
		  public void subtract (int value) {
			  total-=value;
			  calculations= calculations+"-"+value;
		  }
		  /*
		   * Description: displays the calculations 
		   *@param no parameters
		   *@return  the calculatations as a string
		   */
		  public String toString () {
		    return calculations+"="+total;
		  }
		  /*
		   * Description: clears the total
		   * @param no parameters
		   * @return no return
		   */
		  public void clear() {
			  total=0; calculations="";
		  }
		}

		  
		  
		  
		  
		  
