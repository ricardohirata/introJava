// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import java.util.Scanner;

// 3 - Classes
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e funções
    public static void main(String[] args){
        System.out.println("Digite SOUT e dar enter que aparece System.out.println!!!");
        /* Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou um software
        ** Utilizar a classe Scanner do java para ler a escolha do usuario no console
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("M E N U");
        System.out.println("1 - Calcular area no modo curto.");
        System.out.println("2 - Calcular area no modo longo.");
        System.out.println("3 - Executar o metodo ifSimples.");
        System.out.println("4 - Executar o metodo contarAteDez.");
        System.out.println("5 - Executar o metodo contagemRegressiva de 10 a 0.");
        System.out.print("Digite a opcao desejada: ");
        int opcao = scanner.nextInt();

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software
        switch (opcao){
            case 1:
                System.out.println("\nVoce escolheu executar o metodo calcularAreaModoCurto.");
                calcularAreaModoCurto();
                break;
            case 2:
                System.out.println("\nVoce escolheu executar o metodo calcularAreaModoLongo.");
                calcularAreaModoLongo();
                break;
            case 3:
                System.out.println("\nVoce escolheu executar o metodo ifSimples.");
                ifSimples();
                break;
            case 4:
                System.out.println("\nVoce escolheu executar o metodo contarAteDez.");
                contarAteDez();
                break;
            case 5:
                System.out.println("\nVoce escolheu executar o metodo contagemRegressiva.");
                contagemRegressiva();
                break;
            default:
                System.out.println("\nVoce escolheu outro valor que nao tem acao associada.");
                break;
        }
    }

    public static void ifSimples(){
        /* if = se
         ** else = senão
        */
        String opcao = "curto";

        if (opcao == "curto") {
            calcularAreaModoCurto();
        } else{
            calcularAreaModoLongo();
        }

    }

    public static void calcularAreaModoCurto(){
        //Calcular a área - Exemplo: o tamanho do tapete ou do piso
        int largura=4, comprimento=3;

        System.out.printf("Para a largura de %dm e o comprimento de %dm a area e de %dm².", largura, comprimento, largura * comprimento);

    }

    public static void calcularAreaModoLongo(){
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;
        resultado = largura * comprimento;
        System.out.printf("Para a largura de %dm e o comprimento de %dm a area e de %dm².", largura, comprimento, resultado);
    }

    public static void contarAteDez(){
        /* Loop ou repeticao
        ** for = repeticao incondicional
         */
        System.out.println("Contagem crescente: ");

        for (int i= 1; i <= 10; i++){
            System.out.print(Integer.toString(i) + "; ");
        }
    }

    public static void contagemRegressiva(){
        System.out.println("Contagem regressiva: ");

        for (int i=10; i >= 0; i--){
            System.out.print(Integer.toString(i) + "; ");
        }
    }
}
