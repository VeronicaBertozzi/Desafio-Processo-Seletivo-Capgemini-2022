import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) throws Exception {
       
        //Recebe parâmetros de entrada.
        double raizDouble=0;
        int count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o texto a ser encriptografado: "); 
        String texto = input.nextLine();

        //Faz replace de espaços e descobre a raiz quadrada do número de caracteres obtido. 
        String result = texto.replaceAll("\\s+","");
        raizDouble = Math.ceil(Math.sqrt(result.length()));
        int raizInt = (int)raizDouble;
       
        //Inclui os valores do array criado com os caracteres da string recebida dentro da matriz. 
        String array[] = result.split("");
        String matriz[][] = new String[raizInt][raizInt];

        for (int i=0; i < raizInt; i++){
            for (int j=0; j < raizInt; j++){
                if (count < result.length()){
                    matriz[i][j] = array[count];
                    count++;
                }
            }
        }
        
        //Inclui a frase já encriptografada na string encripta.
        String encripta = ""; 
       
        for (int i = 0; i < raizInt; i++) {
            for (int j = 0; j < raizInt; j++) {
                if (matriz[j][i] != null) {
                    encripta += matriz[j][i];
                }
            }
            encripta += " ";                                          
        }
       
        // Printa a string encriptografada e exclui espaços no inicio e fim da frase.
        System.out.println(encripta.trim());
       
        input.close();
    }
}
