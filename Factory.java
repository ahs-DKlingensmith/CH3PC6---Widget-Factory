
/*
 * Factory Class
 */


public class Factory {
    
    //Establish attributes
    private int quota;
    private int days;
    
    /**
     * The setQuota method accepts an argument
     * for the quota field
     */
    public void setQuota(int q) {
        quota = q;
    }
    
    /**
     * The getTime method returns the amount of time
     * needed to produce the number of widgets entered
     * in the quota field
     */
    public int getTime()    {
        while (quota > 0)  {
            quota -= 160;
            days++;
        }
        return days;
    }
    
    
}
