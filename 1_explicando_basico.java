import java.util.ArayList; //importando a classe ArrayList (explicada na linha 111).

public class 1_explicando_basico {
    no usages
    public static void 1_explicando_basico(String[] args) {
        
        // As variáveis em Java são organizadas da seguinte maneira: 
        
        // "tipo" -> que vai dizer como que a variável vei ser tratada (int, float, str, etc...).
        // "nome" -> o nome da variável (pode ser qualquer coisa, evite caracteres especiais, essa linguagem também é CASE-SENSITIVE então se colocar algum caractere maiúsculo ou minúsculo lembre-se de referir-se a ele da mesma forma para não quebrar o programa).
        // "=" -> esse "sinal de igual" é um caractere de atribuição de valor (sempre deve ser utilizado para isso).
        // "valor" -> é literalmente o valor que você vai atribuir a sua variável ("Fernanda", 345, 3.45, etc...).
        // ";" -> esse "sinal de ponto e vírgula" indica para a linguagem onde que uma linha acaba, nem sempre vai ser utilizado pois depende da necessidade, ou do caso mas é importante para a sintaxe. 
        
        // Exemplo:
        
        int idade = 22;

        // Eu posso definir o "Tipo" e o "Nome" da variável e só depois atribuir o "Valor" para a variável, exatamente como nesse exemplo:

        int salario;
        salario = 400;

        // O argumento "public static void main(String[] args)" é um escopo local, a atribuição de uma variável pode ser feita de duas formas, a forma que mostrei anteriormente e de forma exclusiva ao escopo local utilizando a variável "var" antecedendo o nome da SUA variável, nesse caso não é necessário inferir o tipo à sua variável por que o "Java" vai inferir automaticamente o tipo de acordo com o valor que você atribuir à sua variável, Exemplo:

        var nome = "Fernando";

        // Agora o java sabe que o tipo da variável à cima é "String".

        var salario = 450;

        // Nesse caso à cima o java identifica a variável como o tipo "Inteiro".
        
        // TIPOS PRIMITIVOS:

        // Em java temos 8 tipos primitivos, 4 deles são para representação de números interos:

        // "byte" -> FORMATO: 8 bits / TAMANHO: -128 ATÉ 127
        // "short" -> FORMATO: 16 bits / TAMANHO: -32,768 ATÉ 32,767
        // "int" -> FORMATO: 32 bits / TAMANHO: -2,147,483,648 ATÉ 2,147,483,647
        // "long" -> FORMATO: 64 bits / TAMANHO: -9,223,372,036,854,775,808 ATÉ 9,223,372,036,854,775,807

        // Veja um exemplo:

        byte idade = 22; // Esse caso está correto, já que o valor a ser armazenado é pequeno.
        long salario = 1500; // Esse caso está incorreto, já que o tipo "long" é para armazenar valores altos (desperdício de espaço na memória).

        // Caso correto:

        short salario = 1500; // Esse valor é grande o suficiênte para necessitar de uma atribuição maior que "byte", portanto, "short" é o correto.

        // Explicações e aplicações dos outros tipos primitivos:

        // "boolean" -> Declara variáveis bouleanas. (é intuitivo):

        boolean ebrasileiro = true;

        // "char" -> Guarda um único caractere:

        char letra = "A"; // Observe que ao tentar colocar mais um caratere nessa tipagem o comando não irá funcionar, pois o armazenamento do tipo "char" se resume a um único caractere.

        // "float" -> Como de costume ele armazena números com pontos flutuantes, números quebrados se preferir:

        float salario = 400.60F; // A atribuição da letra "F" ao final do valor, se dá por necessidade de especificação de valor float. (Se remover a letra "F" o código irá parar de funcionar, pois o java vai entender que foi atribuido um valor "double" à um "float").

        // "double" -> Funciona da mesma forma que o "float", porém, é mais preciso:

        double idade = 22.50;

        // CONDICIONAIS:

        if(idade > 22.60){
            System.out.println("Maior.");
        } else if (idade == 22.60){
            System.out.println("Igual.")
        } else {
            System.out.println("Menor.");
        }

        // Explicando essa linha de código, "if" é a condicional "se", ou seja, o que está escrito no código é, Se a idade for maior que 22.60, escreva "Maior.", já o "else if" é uma condicional à mais a ser aplicada na sintaxe (caso necessário, claro.), Se idade for igual a 22.60, escreva "Igual.", e o "else" é "caso contrário", ou seja, Caso contrário escreva "Menor."

        // A sintaxe "System.out" fala pro java que ele vai executar a próxima ação no prompt de comando, já, "print" é escrever, "ln" significa nova linha, "System.out.println" significa que o java deverá escrever algo no prompt pulando uma linha. No caso da primeira linha do código apresentado anteriormente, ele vai escrever a palavra "Maior." no prompt de comando. 

        // Entendeu, é bem simples, funciona de forma parecida com as outras linguagens. Sem mistérios.

        // ARRAYS:

        // Uma "Array" é uma coleção ordenada de elementos do mesmo tipo, armazenados em um bloco contíguo de memória. Permite armazenar múltiplos valores em uma única variável, acessíveis por um índice (ou lista, o que facilitar o seu entendimento é melhor). 

        // Uma declaração de "Array" funciona de forma parecida a declaração de uma "variável", como pode ser observado no exemplo:

        tipo[] nome;

        // Dessa forma sendo mais específico:

        int[] idade;

        // Para usar a "Array" é necessário inicializar ela. Existem duas maneiras de fazer isso:
        // De forma direta (Já usando a Array):

        int[] idades = {2, 3, 4};
        
        idades[0] = 4; // Uso de substituição do valor dentro da "Array", nesse caso, o número inteiro "2" dentro da Array será substituido pelo número 4 (isso só é possível quando você já diz para o Java quais os conteúdos que vão estar dentro da "Array").

        // E denominando o tamanho dela desde o início sem informar o conteúdo dentro dela:

        int[] idades = new int[10]; // Números inteiros de longevidade de 0 à 9 inferido na indexação "[10]".a
        String[] nomes = new String[10]; // Caracteres do tipo "String" de longevidade de 0 à 9 inferido na indexação "[10]".
        boolean[] saoBrasileiros = new boolean[10]; // Comandos do tipo "booleano" de longevidade de 0 à 9 inferido na indexação "[10]".

        // Para descobrir o tamanho da Array:

        idades.length

        // ARRAYLIST's:

        // "ArrayList" é a mesma coisa que uma Array só que no formato de uma lista, onde vc conseguei adicionar e remover as Indexações sem problemas.

        // Exemplo de abertura de ArrayList:

        ArrayList<Integer> idades = new ArrayList<Integer>();
        
        // Adicionando os index para a ArrayList:
        
        idades.add(22);
        idades.add(50);
        idades.add(30);

        // Removendo os index da ArrayList:

        idades.remove( index: 0 );
        
        // Para pegar uma informação é simples:

        idades.get(2);

        // Para descobrir o tamanho da ArrayList:

        idades.size();

        // LOOP's: (Explicar depois)

        int idade = 10;
        for(var i = 0; i < idades; i++){
            System.out.println("oi");
        }

        int i = 0;
        while(i < idade){
            i++;
        }

        // CASTING: (Explicar depois)

        //Implícito:

        int idade1 = 22;
        double idade2 = idade1;
        
        //Explícito:
        
        char letra = 'a';
        String nome = String.valueOf(letra);
        letra = nome.charAt(0);
        String nome2 = String.valueOf(idade1);
        idade1 = Integer.parseInt(nomes2);

        // ORIENTAÇÃO A OBJETOS: (Explicar depois)

        //Medo de estudar isso...
    }
}