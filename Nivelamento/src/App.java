// import java.util.ArrayList; // Essa biblioteca é utilizada nas seguintes questões: 1, 3, 4, 5
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    // 1 - Sistema que exibe um menu no terminal para o usuário escolher uma das opções
    /*
        static ArrayList<Integer> vet = new ArrayList<>();
        public static void divideNumeros() {
            System.out.println("Digite dois numeros");
            System.out.print("Numerador: ");
            float n = sc.nextFloat();
            System.out.print("Denominador: ");
            float d = sc.nextFloat();

            if (d != 0) {
                float divisao = n / d;
                System.out.println("Resultado: " + divisao);
            } else {
                System.out.println("Erro: Divisão por zero!");
            }
        }
        public static void mostraMaior(float a, float b, float c) {
            if (a > b && a > c) {
                System.out.println("O numero: " + a + " eh maior");
            } else if (b > a && b > c) {
                System.out.println("O numero: " + b + " eh maior");
            } else if (c > a && c > b) {
                System.out.println("O numero: " + c + " eh maior");
            } else {
                System.out.println("Existem numeros iguais como maiores.");
            }
        }
        public static void armazenaNumeros(int qtd) {
            vet.clear();
            for (int i = 0; i < qtd; i++) {
                System.out.print("Digite um numero: ");
                int num = sc.nextInt();
                vet.add(num);
            }
        }
        public static void mostraNumeros() {
            System.out.println("Numeros armazenados: " + vet);
        }
        public static void somaVet() {
            int soma = 0;
            for (int num : vet) {
                soma += num;
            }
            System.out.println("Soma dos numeros: " + soma);
        }
        public static void parImpar() {
            int par = 0, impar = 0;
            for (int num : vet) {
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            System.out.println("Par: " + par);
            System.out.println("Impar: " + impar);
        }
        public static void main(String[] args) throws Exception {
            int resp;
            do {
                System.out.println("\n1 - Dividir dois numeros.");
                System.out.println("2 – Ler 3 numeros e mostrar qual eh o maior deles.");
                System.out.println("3 – Ler e armazenar N numeros.");
                System.out.println("4 – Mostrar a soma dos numeros armazenados.");
                System.out.println("5 - Contar quantos dos numeros armazenados sao pares e quantos sao impares.");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");
                resp = sc.nextInt();

                switch (resp) {
                    case 1:
                        divideNumeros();
                        break;
                    case 2:
                        System.out.println("Digite 3 numeros:");
                        float a = sc.nextFloat();
                        float b = sc.nextFloat();
                        float c = sc.nextFloat();
                        mostraMaior(a, b, c);
                        break;
                    case 3:
                        System.out.print("Digite quantos numeros quer armazenar: ");
                        int qtd = sc.nextInt();
                        armazenaNumeros(qtd);
                        mostraNumeros();
                        break;
                    case 4:
                        somaVet();
                        break;
                    case 5:
                        parImpar();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opcao invalida!");
                        break;
                }
            } while (resp != 0);

            sc.close();
        }
    */
    // 2 - Programa que pede para o usuário digitar a largura, altura, e o deslocamento, afim de exibir um retângulo no terminal
    // OBS: o deslocamento é a distância do retângulo do inicio da tela
    /* 
    public static void deslocamento(int d) {
        for (int i = 0; i < d; i++) {
            System.out.print(" ");
        }
    }
    public static void largura(int l, int d) {
        deslocamento(d);
        for (int j = 0; j < l; j++) {
                System.out.print("x");
        }
    }
    public static void altura(int a, int l, int d) {
        System.out.println("");
            for (int k = 0; k < (a - 2); k++) {
                deslocamento(d);
                System.out.print("x");
                for (int m = 0; m < (l - 2); m++) {
                    System.out.print(" ");
                }
                System.out.println("x");
            }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Digite a largura, a altura e o deslocamento");
        int l = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        
        
            largura(l, d);
            altura(a, l, d);
            largura(l, d);
            sc.close();
        }
    */
    // 3 - Programa que lê as notas de um aluno, calcula e mostra na tela sua nota final (em 100 pontos), formatada com duas casas decimais 
    /*
    static ArrayList<Float> vet = new ArrayList<>();
    public static void calculaNota() {
        float trabalho = 0;
        float provas = 0;
        float listas = 0;
        for (int i = 0; i < vet.size(); i++) {
             if(i<4){
                listas += vet.get(i);
            }else if(i<6) {
                provas += vet.get(i);
            }else{
                trabalho = vet.get(i);
            }
        }
        float notaFinal = (listas/2) + ((provas*3)/10) + trabalho;
        System.out.printf("NOTA FINAL: %.2f", notaFinal);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("Insira a nota");
            float nota = sc.nextFloat();
            vet.add(nota);
        }
        calculaNota();
    }
    */
    // 4 - Programa que embaralha uma string, de forma que a string se separe em blocos de 5 caracteres, sendo as novas palavras obtidas lendo-se cada coluna resultante, separadas por asteriscos
    // 5 - Continuando o 4, acrescimo de uma função parar descriptografar uma mensagem segundo as mesmas regras da criptografia
    /*     
    static ArrayList<ArrayList<Character>> matriz = new ArrayList<>();
    public static String mensagemCriptografada(String msg) {
        int tam = msg.length();
        if (tam%5 != 0) {
            tam += 5 - (tam%5);
        }
        int linhas = tam/5;
        int pos = 0;
        for (int i = 0; i < linhas; i++) {
            matriz.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) {
                if (pos < msg.length()) {
                    matriz.get(i).add(msg.charAt(pos));
                } else {
                    matriz.get(i).add(' '); 
                }
                pos++;
            }
        }
        StringBuilder resultado = new StringBuilder();
        for (int j = 0; j < 5; j++){
            for (int i = 0; i < linhas; i++){
                resultado.append(matriz.get(i).get(j));
            }
            resultado.append("*");
        }

        return resultado.toString();
    }
    public static String descriptografarMensagem(String msg){
        int tam = msg.length();
        if (tam%5 != 0) {
            tam += 5 - (tam%5);
        }
        int linhas = tam/5;
        int pos = 0;
        for (int i = 0; i < 5; i++) {
            matriz.add(new ArrayList<>());
            for (int j = 0; j < linhas; j++) {
                matriz.get(i).add(msg.charAt(pos));
                pos++;
            }
        }
        StringBuilder resultado = new StringBuilder();
        for (int j = 0; j < linhas - 1; j++){
            for (int i = 0; i < 5; i++){
                resultado.append(matriz.get(i).get(j));
            }
        }

        return resultado.toString();
    } 
    public static void main(String[] args) {
        System.out.println("Digite uma mensagem:");
        String msg = sc.nextLine();
        System.out.println("1 - Criptografar mensagem");
        System.out.println("2 - Descriptografar mensagem");
        int resposta = sc.nextInt();
        switch (resposta) {
            case 1:
                System.out.println(mensagemCriptografada(msg));
                break;
            case 2:
                System.out.println(descriptografarMensagem(msg));
                break;
        }
    }
*/
    // 6 - Programa que verifica se a data no formato DD/MM/AAAA é váliado ou não, e retorna onde está o erro 
    /* 
    public static void main(String[] args) {
        System.out.println("Informe a data no formato DD/MM/AAAA");
        String data = sc.nextLine();
        if (data.length() > 10 || data.length() < 10) {
            System.out.println("Formato inválido");            
        }else{
            String[] armazenaData = data.split("/");

            int dia = Integer.parseInt(armazenaData[0]);
            int mes = Integer.parseInt(armazenaData[1]);
            int ano = Integer.parseInt(armazenaData[2]);
            
            if (dia <= 0 || dia > 31) {
                System.out.println("Dia inválido");
            }

            if(mes <= 0 || mes > 12){
                System.out.println("Mes inválido");
            }

            if (ano <= 0) {
                System.out.println("Ano inválido");
            }
        }
    }
    */
}