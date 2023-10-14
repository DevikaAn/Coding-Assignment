public class Program_1
{
    public static void shuffle(Object[] array) 
    {
        int len_array=array.length;
        for(int i=0;i<len_array;i++) 
        {
            int s=i+(int)(Math.random()*(len_array-i));
            Object temp=array[s];
            array[s]=array[i];
            array[i]=temp;
        }
    }
    public static void main(String[] args) 
    {
        Integer[] intArray={1,2,3,4,5,6,7};
        Object[] objArray=new Object[intArray.length];
        for (int i=0;i<intArray.length;i++)
        {
            objArray[i]=intArray[i];
        }
        shuffle(objArray);
        for (int i=0;i<objArray.length;i++) 
        {
            System.out.print(objArray[i]+" ");
        }
    }
}
