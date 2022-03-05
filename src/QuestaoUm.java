import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) throws Exception {
       
        //Recebendo parâmetros de entrada.
        int aux=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do array *apenas números impares: ");   
        int size = input.nextInt();
        int[] array = new int[size];

        //Caso o usuário digite um número par, o sistema interrompe o processo. 
        if(size % 2 == 0){
            System.out.println("Que pena! O número que você colocou é par. Permitimos apenas números impares");
            System.out.println("Tente novamente!");
            System.exit(0);
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Digite o " + (i + 1) +"º número: ");
            array[i] = input.nextInt();
        }

        // Printa array recebido
        System.out.println("Array recebido: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
		}
		
        //Ordena em ordem crescente array recebido.
        for(int i=0; i<(size - 1);i++){
            for(int j=(i+1); j<size;j++){

                if(array[i]>array[j]){
                    aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                
                }
            }
        }

        //Printa o array recebido em ordem crescente.
        System.out.println("\nOrdenando array recebido: ");
        for (int i = 0;i < size; i++){
            System.out.print(array[i] + " ");
        }
        input.close();

        //Calcula a mediana do array.
        int mediana = size / 2;
        System.out.println("\nA mediana do array é: " + array[mediana]);

    }
}
