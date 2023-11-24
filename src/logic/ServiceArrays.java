package logic;

public class ServiceArrays {
	
	private int[] numbers;
	private int position;
	 public static final int BURBBLE = 0;
    int SELECTION=1;
    int INSERTION=2;
    int SHELL=3;
    
    public ServiceArrays() {
        //TODO Instanciar el arreglo de un tamaño de 10 elemetos
    }

    /**
     * Constructor que inicializa el arreglo
     * @param size tamaño del arreglo
     */
    public ServiceArrays(int size) {
        //TODO Instanciar el arreglo de un tamaño del parámetro
        this.position = position;
    }

    public ServiceArrays(int[] numbers) {
        this.numbers = numbers;
    }
    

    /**
     * Permite cargar los valores del arreglo
     * @param begin:
     * @param end:
     */
    public void loadElements(int begin, int end ){

    }

    public void addElement( int element){

    }

    private int[] sureCapacity(){

        return null;
    }
    public String showNumber(int[]numbers)	{
    	
    	return null;
    }
    /*
     * permite dar la posicion de un elemento ingresado y en caso de no estar el elemento imprime -1
     */
    public int findElement(int[] numbers,int value)	{
    	boolean encontrado=false;
    	for(int i=0;i<numbers.length;i++)	{
    		
    		if(value==numbers[i])	{
    			System.out.println("el numero ingresado se encuentra en la posicion: "+i );
    			encontrado=true;
    			break;
    		}
    		
    	}
    	if(!encontrado)		{
    		System.out.println("");
    	}
    	return 0;
    }
    public int sortNumbers(int s) {
    	
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
    
    private int getAverage(int[] numbers)	{
    	
    	int cont=0;
    	int sum=0;
    	for(int i=0;i<numbers.length;i++)	{
    		cont++;
    		sum +=numbers[i];
    	}
    	int average=sum/cont;
   
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
}
