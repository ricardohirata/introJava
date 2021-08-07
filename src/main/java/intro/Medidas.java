// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classes
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e funções
    public static void main(String[] args){
        System.out.println("Digite SOUT e dar enter que aparece System.out.println!!!");
        calcularAreaModoCurto();
        calcularAreaModoLongo();
    }

    public static void calcularAreaModoCurto(){
        //Calcular a área - Exemplo: o tamanho do tapete ou do piso
        int largura=4, comprimento=3;

        System.out.printf("\nModo Curto!!!\nPara a largura de %dm e o comprimento de %dm a area e de %dm².", largura, comprimento, largura * comprimento);

    }

    public static void calcularAreaModoLongo(){
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;
        resultado = largura * comprimento;
        System.out.printf("\n\nModo Extenso!!!\nPara a largura de %dm e o comprimento de %dm a area e de %dm².", largura, comprimento, resultado);
    }

}
