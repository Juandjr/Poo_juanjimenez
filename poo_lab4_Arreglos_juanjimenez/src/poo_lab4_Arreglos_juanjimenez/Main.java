package poo_lab4_Arreglos_juanjimenez;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int generados = 0;
     int[] nums = new int[6];
     int n;
     do {
    	 
     
     //generamos un numero aleatorio
    n=(int) (Math.random()*49+1);	 
     //si no esta repetido, lo guardamos en el array
    if(!repetido(n,nums,generados)) {
    	nums[generados]=n;
    	generados++;
    }
    }while(generados<6);
     ordenar(nums);
     mostrar(nums);
	}
	private static boolean repetido(int n, int[] nums, int generados){
		boolean res = false;
		for(int i=0; i<generados; i++) {
			if(n==nums[i]) {
				res=true;
				break;
			}
		}
		return res;
	}
	private static void ordenar(int[]nums) {
		int aux;
		for(int i=0;i<nums.length;i++)
		for(int k=i;k<nums.length;k++) {
			aux=nums[i];
			nums[i]=nums[k];
			nums[k]=aux;
		}
	}
	private static void mostrar(int[]nums) {
		for(int num:nums)
			System.out.println(num+",");
	}

}
