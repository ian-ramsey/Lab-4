
/**
 * Write a description of class LoopOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopOne
{
    int[] nums = new int [10];
    public LoopOne(){
    
    }
    public void loadArray(){
        for (int i=0;i<10;i++)
        nums[i] = (int)(Math.random()*10+1);
    }
    public void printArray(){
        for (int i=0;i<10;i++)
        System.out.print("\t" + nums[i]);
    }
}
