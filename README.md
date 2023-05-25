Tutorial simples e completo de como criar uma linguagem de programação do zero com o ANTLR4, Windows e o ChatGPT.

# Aa.aa

Aa é uma linguagem de programação simples, apenas para efeito de aprendizado de como criar na prática 
uma linguagem de programação com o ANTLR4 do zero, sem IDE, apenas usando o prompt de comando do Windows. 
Por que não usar IDE? É simples, as versões do ANTLR4 estão sendo atualizadas 
(hoje está no Antlr-4.13.0-completo.jar) e os plugins do Antlr4 nas IDEs estão todos defasados e quando
é necessário gerar arquivos do Antlr4 no PC de vido a ausência de algum comando na IDE e às vezes isso gera
diversos erros, alguns devido à diferença de versões do Antlr4 do PC para a da IDE. Os erros de 
imports são muito difíceis de corrigir às vezes, principalmente para os que não sabem programar como eu! 

# Desenvolvimento da Linguagem Aa

Ao digitar a, automaticamente vira A

## Passo 1: Definição da Linguagem

A proposta é tão simples quanto a linguagem; testar como é completar todo o processo de criação de uma linguagem de 
programação simples. O objetivo real é aprender as etapas do processo. Isso facilitará e muito ao usar uma IA no 
auxílio da criação de uma linguagem mais complexa.

## Passo 2: Gramática ANTLR

Gramatica da linguagem Aa definida no modelo aceito pelo ANTLR4:

grammar Aa;

start: 'a' { System.out.println("A"); }; 

OBS: abra um arquivo .txt copie e cole a gramatica dentro dele, salve como Aa.g4 (.g4 é a extensão do Antlr4). 
Coloque esse arquivo Aa.g4 dentro de uma pasta no C: da máquina, junto com todos os arquivos futuros gerados e programas, 
como o ANTLR-4.12.0-complete.jar e suas pastas extraídas dele. Isso facilitará a geração dos arquivos e diminuirá erros. 

## Passo 3: Geração dos arquivos Java

Utilizamos o ANTLR para gerar os arquivos Java correspondentes à gramática, digitando comandos no prompt do Powershell ou 
CMD do Windows. Criamos dois arquivos na mão e executamos os seguintes comandos:

1 - java -jar antlr-4.12.0-complete.jar Aa.g4

2 - Criamos na mão os arquivos: Main.java e MyAaVisitor.java (ambos a IA criou os códigos, eu criei arquivos txt, copiei, 
joguei dentro dos arquivos os códigos e os salvei com os nomes e extensões corretos .java)

3 - javac Aa*.java
4 - antlr4 Aa.g4 -visitor
5 - javac *.java
6 - java Main

## Passo 4: criação da linguagem Aa detalhada:

ChatGPT
No PowerShell ou Cmd, execute o seguinte comando para gerar o código do interpretador usando o ANTLR:

java -jar antlr-4.12.0-complete.jar Aa.g4

Isso criará os arquivos Java necessários para o interpretador.

User
Abri o PowerShell ou CMD, Naveguei até a pasta aonde todos os arquivos estão com o comando: cd C:\antlr4 (enter) depois 
digitei o código citado acima, exemplo; C:\antlr4 java -jar antlr-4.12.0-complete.jar Aa.g4 (enter)

A nossa gramatica Aa.g4 na pasta C:\antlr4, gerou 8 arquivos e mais a gramatica, temos 9 arquivos no total. Qual o 
segundo passo para gerar o interpretador IA?

ChatGPT
Você pode prosseguir com a compilação dos arquivos Java usando o comando javac Aa*.java.

Portanto, o próximo passo é compilar os arquivos Java gerados. Após a compilação bem-sucedida, você poderá executar o 
interpretador Java usando o comando java NomeDaClasse, onde "NomeDaClasse" é o nome da classe principal do seu interpretador.

User
Acabei de gerar esse comando: javac Aa*.java e ao total temos 13 arquivos e mais a gramatica =14. Qual o próximo passo?

ChatGPT
Após a compilação dos arquivos Java gerados, o próximo passo é executar o interpretador Java para testar a sua linguagem.

É necessário criar sua própria classe principal para executar o interpretador. Você pode criar uma nova classe Java que será 
responsável por iniciar a execução do interpretador e interagir com ele.

Aqui está um exemplo básico de como criar uma classe principal para o seu interpretador chamada Main.java:

OBS: Para criar, escreva o código dentro de um bloco de notas e salve o arquivo com o nome Main.java.

## Implementação do arquivo Main.java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Crie um analisador léxico
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        AaLexer lexer = new AaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crie um analisador sintático
        AaParser parser = new AaParser(tokens);

        // Execute o analisador sintático para obter a árvore de análise
        ParseTree tree = parser.start();

        // Crie um visitante para percorrer a árvore de análise
        ParseTreeWalker walker = new ParseTreeWalker();
        MyAaVisitor visitor = new MyAaVisitor();
        walker.walk(visitor, tree);
    }
}

Você precisará criar a classe "MyAaVisitor.java" para implementar o comportamento desejado quando a letra "a" for digitada.

Após criar a classe principal Main.java e o visitante MyAaVisitor.java, você pode compilar e executar o seu interpretador 
usando o comando javac para compilar todos os arquivos .java relevantes e, em seguida, java para executar a classe principal Main.

O código no seu Main.java cria o analisador léxico (AaLexer) e o analisador sintático (AaParser) usando os arquivos gerados pelo 
ANTLR (AaLexer.java e AaParser.java). Então, você pode prosseguir com a compilação e execução do arquivo Main.java.

Vou ajudá-lo a criar a classe MyAaVisitor.java. Essa classe será responsável por visitar os nós da árvore de análise e implementar o 
comportamento desejado quando a letra "a" for encontrada. Aqui está um exemplo de como você pode implementar essa classe:

## Implementação do arquivo MyAaVisitor.java
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public class MyAaVisitor extends AaBaseVisitor<Void> {
    @Override
    public Void visitStart(AaParser.StartContext ctx) {
        Token token = ctx.getStart();
        if (token.getText().equals("a")) {
            System.out.println("A");
        }
        return null;
    }
}

Nesse exemplo, a classe MyAaVisitor estende a classe gerada pelo ANTLR AaBaseVisitor. Sobrescrevemos o método visitStart, que é 
  responsável por visitar o nó start definido na gramática.

Dentro desse método, verificamos se há um nó terminal A presente. Se sim, imprimimos "A". Note que isso é apenas um exemplo de ação 
  a ser executada quando a letra "a" é encontrada. Você pode substituir o System.out.println("A") pela lógica ou comportamento que desejar.

Depois de criar a classe MyAaVisitor, você pode substituir a linha MyAaVisitor visitor = new MyAaVisitor(); no seu Main.java pelo seguinte 
  código:

MyAaVisitor visitor = new MyAaVisitor();
visitor.visit(tree);
Dessa forma, o visitante que você acabou de criar será usado para percorrer a árvore de análise e executar o comportamento desejado quando 
  a letra "a" for encontrada.

No exemplo acima, a classe MyAaVisitor estende a classe AaBaseVisitor, que é gerada automaticamente pelo ANTLR. A implementação do método 
  visitStart é responsável por executar a ação desejada quando a regra start (representando a letra "a") é encontrada durante a análise.

No exemplo, a ação simplesmente verifica se o texto do token é igual a "a" e, se for, imprime "A". Você pode ajustar essa ação de acordo com 
  suas necessidades.

User
Pronto, MyAaVisitor.java salvo conforme você descreveu acima, qual o próximo passo?

ChatGPT
Agora que você tem o arquivo MyAaVisitor.java pronto, o próximo passo é compilar todos os arquivos .java do seu projeto, incluindo a 
  classe Main, AaLexer, AaParser e MyAaVisitor. Isso pode ser feito usando o comando javac no terminal.

javac *.java

Se não houver erros de compilação, esse comando gerará os arquivos .class correspondentes.

Após a compilação, você pode executar o programa chamando a classe Main. Para isso, utilize o comando:

java Main

Isso iniciará a execução do seu programa e você poderá começar a digitar a letra "a" para ver a transformação em "A" acontecer.

OBS: Ao aplicar o comando Javac *.java deu erro, a IA identificou que necessitava incluir alguns dados na gramatica.g4 para poder criar 
  o AaBaseVisitor.java.

ChatGPT
Aqui está a gramática Aa.g4 atualizada para gerar o AaBaseVisitor.java:

## Alteração do arquivo da gramatica para gerar o AaBaseVisitor.java
grammar Aa;

@header {
import java.util.*;
}

@members {
// Criação do AaBaseVisitor
public abstract class AaBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements AaVisitor<T> {

}

// Definição da interface AaVisitor
public interface AaVisitor<T> extends ParseTreeVisitor<T> {

}
}

start: 'a' { System.out.println("A"); };

Agora você pode executar o comando java -jar antlr-4.12.0-complete.jar Aa.g4 novamente para gerar os arquivos atualizados, 
  incluindo o AaBaseVisitor.java. Certifique-se de que o arquivo AaBaseVisitor.java tenha sido gerado corretamente antes de prosseguir.

Lembre-se de atualizar o Main.java para usar a classe AaBaseVisitor como mencionado anteriormente:

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Crie um analisador léxico
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        AaLexer lexer = new AaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crie um analisador sintático
        AaParser parser = new AaParser(tokens);

        // Execute o analisador sintático para obter a árvore de análise
        ParseTree tree = parser.start();

        // Crie um visitante para percorrer a árvore de análise
        ParseTreeWalker walker = new ParseTreeWalker();
        AaVisitor<Void> visitor = new AaBaseVisitor<>();
        walker.walk(visitor, tree);
    }
}
Certifique-se de ter os arquivos AaLexer.java, AaParser.java, AaBaseListener.java, AaVisitor.java, AaBaseVisitor.java e 
  Main.java no mesmo diretório. Em seguida, execute o comando javac *.java para compilar todos os arquivos.

java -jar antlr-4.12.0-complete.jar Aa.g4

User
Ao executar o comando java -jar antlr-4.12.0-complete.jar Aa.g4 foi gerado somente um arquivo novo: AaParser$StartContext.class, 
  não gerou o AaBaseVisitor.java. 

Execute o comando antlr4 Aa.g4 -visitor. Isso deve gerar os arquivos AaLexer.java, AaParser.java, AaBaseListener.java, 
  AaVisitor.java e AaListener.java.

antlr4 Aa.g4 -visitor

ChatGPT
No diretório onde estão os arquivos, execute o comando javac *.java para compilar todos os arquivos Java. Certifique-se de que o 
  comando seja executado corretamente sem erros de compilação.

javac *.java

OBS: Ao gerar o comando javac *.java tivemos 4 erros, demorou bastante mas corrigimos fazendo alterações em alguns arquivos como o 
  Main.java e MyAaVisitor, depois gerou mais erros de imports, adcionamos os imports nos arquivos.

javac *.java

## Cuidado com esse erro se for gerar a sua linguagem com a ajuda do ChatGPT:
  
OBS: Fique atento no erro abaixo após novamente gerar o comando javac *.java, pois é um erro gerado devido a IA está parada no 
  tempo 2021, ela cria os códigos como se o antlr4 fosse a versão de 2021, e devido a esse fator a versão nova do Antlr4 acusou um 
  erro de API obsoleta -Xlint:deprecation (ANTLRInputStream in org.antlr.v4.runtime). Para corrigir a IA teve que trocar essa parte 
  do código dentro do Main.java para uma codificação usando o CharStreams. Antes eu tive que dar o comando javac -Xlint:deprecation *.java 
  para ver mais detalhes para a IA.

javac -Xlint:deprecation *.java

User
PS C:\antlr4\Aa> javac -Xlint:deprecation *.java
Main.java:7: warning: [deprecation] ANTLRInputStream in org.antlr.v4.runtime has been deprecated
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ^
Main.java:7: warning: [deprecation] ANTLRInputStream in org.antlr.v4.runtime has been deprecated
        ANTLRInputStream input = new ANTLRInputStream(System.in);
                                     ^
2 warnings
PS C:\antlr4\Aa>

Com esses dados a IA sabia exatamente em quais arquivos tinha que corrigir: Main.java e o AaLexer.java. Trocando as linhas de 
  códigos e também os imports nos arquivos, excluindo os obsoletos pelos funcionais;

import org.antlr.v4.runtime.CharStreams;

Em seguida, você precisa atualizar a linha em que o ANTLRInputStream é criado, substituindo-a por:

CharStream input = CharStreams.fromStream(System.in);

Depois da correção executei o comando:

javac *.java

User
javac *java sem erro pela primeira. Agora qual o comando final?

ChatGPT
Ótimo! Agora que você compilou com sucesso os arquivos com o comando javac *.java, você pode usar o comando java 
  seguido do nome da classe principal para executar o programa, java Main. 

java Main

## Concluímos a criação da linguagem Aa com uma pequena mudança, mas serve ao nosso propósito.
![Alt text]([Aa.png](https://imgcloud.com.br/share/sQs6RUWd2O86yBUh))

User
Funcionou! Não ficou como eu queria de início como escrevemos na gramatica, mas dá para testar como a nossa 
  linguagem em uma IDE após criar o interpretador. 
Exatamente após o último comando java Main, abre um prompt piscando esperando eu digitar o a, quando eu digito 
  o "a" e dou ENTER no prompt de comando do Windows (powershell ou cmd)desce uma linha e automaticamente aparece um "A" 
  maiúsculo, ficando duas letras aparecendo uma na primeira linha e a outra na linha de baixo, bem abaixo do a minúsculo 
  está o A maiúsculo. Está muito bom para a primeira versão da linguagem Aa, pode ser que eu mexa nela para melhorar no 
  futuro quem sabe! 

## Detalhes importantes, como o fato de eu não saber programar e as dificuldades de se trabalhar com o ChatGPT.

Existe algo que eu preciso esclarecer, eu não sei programar e sem o ChatGPT jamais conseguiria se quer criar essa linguagem 
  Aa de teste, que permitiu que eu acompanhasse todo o processo da criação de uma linguagem simples. 
Se você por algum motivo achar inútil esse tutorial saiba que eu procurei algo assim durante muito tempo e não achei em lugar 
  algum na internet.
 Avançar na criação de uma linguagem de programação usando uma IA muito boa, mas com limitações impostas, como a memória curta 
  demais, tokens limitados que dificultam a manipulação de arquivos extensos como o Parser principalmente de uma linguagem mais 
  complexa, você começa a esbarrar nos desafios (ainda mais quando não se sabe programar). Eu de tanto apanhar ao criar a minha 
  linguagem Solua.solua e a Soluascript.ssai (em desenvolvimento) acabei criando um prompt perfeito para fazer a IA voltar a 
  responder sem erro, continuando exatamente da mesma linha de onde parou e em codificação na mesma linguagem... Em menos de 
  três dias depois a Open Ia criou um botão que faz exatamente o que eu já estava fazendo com o meu prompt. O outro obstáculo 
  é a hora de corrigir erros, deve se mandar a IA corrigir um erro de cada vez, se tentar corrigir todos os erros juntos 
  (nesse caso ela lista as correções em ordem, as vezes até enumerando) pois fatalmente entrará em loop de erros infinitos, 
  pois ela corrige bem alguns dos erros, mas em alguns deles ela só gera erros novos e vira uma bola de neve, corrigindo 
  dois erros e gerando 4 e aí por diante, o pior é que eu estava fazendo isso e sofri muito até aprender. Outra coisa é 
  aprender a observar quando a memória da IA parece repentinamente zerar, sempre que isso ocorre ela responde errado as 
  questões ou de forma aleatória e imprecisa, parece até um ser humano de saco cheio respondendo errado de proposito, ao 
  perceber isso não acate a correção com a memória limpa, espere ela voltar lentamente ao normal, e só aí retome as correções 
  dos erros.

















