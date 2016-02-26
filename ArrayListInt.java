
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] lista;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        lista  = new int[0];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void add(int elemento)
    {
        int[] lista2 = new int[lista.length + 1];
        for(int a = 0; a < lista2.length ; a++)
        {
            lista2[a]= elemento;
            lista = lista2.clone();
            int[] lista2 = new int[lista.length + 1];
        }
    }
        
    }

