import java.util.Scanner;

public class QuestaoDois {
    
    public static void main(String[] args) throws Exception {
        
        //Recebendo parâmetros de entrada.
        Scanner n = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        int x = n.nextInt();
        System.out.println("Digite o tamanho do array: ");   
        int size = n.nextInt();
        int[] array = new int[size];
 
        for (int i = 0; i < size; i++) {
            System.out.println("Digite o " + (i + 1) +"º número: ");
            array[i] = n.nextInt();
        }
 
        //Printa array recebido.
        System.out.println("Array recebido: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
 
        //Calcula diferença entre vetores.
        int count = 0;
        for(int i=0; i<size; i++){
            for(int j=(i+1); j < size ;j++){
                if(array[i] - array[j] == x || array[j] - array[i] == x){               
                    count++;
                }
            }
        }
 
        System.out.println("\nExistem " + count + " pares de inteiros com uma diferença de " + x);
        n.close();
    }
}
