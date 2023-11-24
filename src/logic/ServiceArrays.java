package logic;

public class ServiceArrays {
	
	private int[] numbers;
	private int position;
    int BURBBLE=0;
    int SELECTORN=1;
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
     * @param begin
     * @param end
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
    public int getMin(int[] numbers)	{
    	int min=numbers[0];
    	for(int i=0;i<numbers.length;i++) {
    		if(min>numbers[i])	{
    			min=numbers[i];
    		}
    	}
    	return min;
    }
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
    
    private int productpoint(int[] numbers)	{
    	
    	int cont=0;
    	int sum=0;
    	for(int i=0;i<numbers.length;i++)	{
    		cont++;
    		sum +=numbers[i];
    	}
    	int average=sum/cont;
   
		return average;
    	
    }
}
