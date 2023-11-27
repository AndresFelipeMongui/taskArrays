package logic;

import java.util.Arrays;
import java.util.Random;

public class ServiceArrays {
	
	  //Arreglo
    private int[] numbers;
    //variable que controla la posición del siguiente elemento
    private int position;

    public static final int BURBBLE = 0;

    public static final int SELECTION=1;
    public static final int INSERTION=2;
    public static final int SHELL=3;
    
    private static final int size_Default=10;
    
    /**
     * Constructor vació
     */

    public ServiceArrays(int begin, int end) {
        // Instanciar el arreglo de un tamaño de 10 elemetos
    	 numbers=new int [size_Default];
    	 loadElements(begin,end);
    	 position=size_Default;
    }

    /**
     * Constructor que inicializa el arreglo
     * @param size tamaño del arreglo
     */
    public ServiceArrays(int size,int begin,int end) {
    	//TODO Instanciar el arreglo de un tamaño del parámetro
        numbers=new int[size];
        loadElements(begin,end);
        position=size;
        //limite superior menos limite inferior +1
    }

    public ServiceArrays(int[] numbers) {
        this.numbers = numbers;
        position=numbers.length;
    }
    

    /**
     * Permite cargar los valores del arreglo
     * @param begin:
     * @param end:
     */
    public void loadElements(int begin, int end ){
    	int minimo=begin<=end ? begin:end;
    	int maximo=begin >= end ?begin:end;
    	
    	for(int index=0;index<numbers.length;index++) {
    		 numbers[index] = new Random().nextInt(maximo - minimo + 1 ) + minimo;
    	}


    }

    public void addElement( int element){
    	
    	if(position >=numbers.length) {
    		numbers=sureCapacity();
    	}
    	numbers[position]=element;
		position++;
    }

    private int[] sureCapacity(){
    	 int newSize=numbers.length + numbers.length/2;
    	 int[] newArray=Arrays.copyOf(numbers, newSize);
    	

        return newArray;
    }
    public String showNumber(int[]numbers)	{
    	StringBuilder string=new StringBuilder();
    	string.append("[ ");
    	for (int i=0;i<numbers.length;i++)	{
    		
    		string.append(numbers[i]);
    		if (i !=position -1)	{
    			string.append(", ");
    		}
    		
    		
    	}
    	string.append("]");
    	
    	return string.toString();
    }
    /*
     * permite dar la posicion de un elemento ingresado y en caso de no estar el elemento imprime -1
     */
    public int findElement(int[] numbers,int value)	{
    	boolean encontrado=false;
    	for(int i=0;i<numbers.length;i++)	{
    		
    		if(value==numbers[i])	{
    			System.out.println("el numero ingresado se encuentra en la posicion: "+ i );
    			encontrado=true;
    			break;
    		}
    		
    	}
    	if(!encontrado)		{
    		System.out.println("");
    	}
    	return 0;
    }
    public int sortNumbers() {
    	
    	return 0;
    }
    
    private int[] sortBurbble()	{
    	return null;
    }
    
    private int[] sortSlelection()	{
    	return null;
    }
    private int[] sortInsertion()	{
    	return null;
    }
    private int[] sortShell()	{
    	return null;
    }
    /*
     * Permite obtener el valor minimo del arreglo
     */
    
    public int getMin(int[] numbers)	{
    	int min=numbers[0];
    	for(int i=0;i<numbers.length;i++) {
    		if(min>numbers[i])	{
    			min=numbers[i];
    		}
    	}
    	return min;
    }
    /*
     * permite obtener el valor maximo del arreglo
     */
    public int getMax(int[] numbers)	{
    	int max=numbers[0];
    	for(int i=0;i<numbers.length;i++)	{
    		if(max<numbers[i]) {
    			max=numbers[i];
    		}
    	}
    	return max;
    }
    public int sum(int[]numbers)	{
    	int sum=0;
    	for(int i=0;i<numbers.length;i++)	{
    		sum +=numbers[i];
    	}
    	return 0;
    }
    /*
     * obtiene el producto punto de dos vectores
     */
    
 private int productPoint(int[] numbers, int[] arrays2)	{
	 int product=0;
	 
    	
    	for (int i=0; i<numbers.length;i++)	{
    		product +=numbers[i]*arrays2[i];
    		
    	}
		return product;
    	
    }
    
    public double getAverage(int[] numbers)	{
    	
    	int cont=0;
    	int sum=0;
    	for(int i=0;i<numbers.length;i++)	{
    		cont++;
    		sum +=numbers[i];
    	}
    	double average=sum/cont;
   
		return average;
    	
    }
    public int[] replace(int []numbers ,int value,int position )		{
    	for(int i=0;i<numbers.length;i++) {
    		if (position==numbers[i])	{
    			numbers[i]=value;
    			break;
    		}
    	}
    	return numbers;
    }
    public void delete(int[] numbers,int position)	{
    	for(int i=0;i<numbers.length;i++) {	
    		if(numbers[i]==position)	{
    			numbers[i]=0;
    			break;
    		}
    		
    	}
   		
    	
    }
    public int[] sumArrays(int []numbers,int[] arrays2)	{
    	int []sumArrays = null;
    	for(int i=0;i<numbers.length;i++) {
    		sumArrays[i]=numbers[i]+arrays2[i];
    	}
    	return null;
    }
    
    public int[] getNumbers() {
		// TODO Auto-generated method stub
		return numbers.clone();
	}
}

