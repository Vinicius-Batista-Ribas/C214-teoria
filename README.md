Este código Java representa um programa simples para interagir com o usuário e gerar um arquivo JSON com informações sobre um professor. Abaixo está uma explicação de como o código funciona e como usá-lo:

1. Importações:
   ```java
   import java.util.Scanner;
   ```

   O código começa com importações necessárias, incluindo a importação da classe `Scanner`, que é usada para receber entradas do usuário.

2. Classe `Main`:
   ```java
   public class Main {
       public static void main(String[] args) {
   ```

   Aqui, estamos declarando a classe `Main` e seu método `main`. Este método é o ponto de entrada do programa Java.

3. Instância do Validador:
   ```java
   new Validador();
   ```

   Uma instância da classe `Validador` é criada, mas não é clara como essa classe funciona, pois seu código não está incluído aqui. Presumivelmente, a classe `Validador` contém métodos para validar informações inseridas pelo usuário.

4. Declaração de Variáveis:
   ```java
   String jsonFile = null;
   String nome;
   String dia;
   String horario;
   String atendimento = null;
   String periodo;
   int sala;
   ```

   Aqui, várias variáveis são declaradas para armazenar informações sobre o professor e o horário de atendimento.

5. Configuração do Scanner:
   ```java
   Scanner scanner = new Scanner(System.in);
   ```

   Um objeto `Scanner` é criado para receber entradas do usuário a partir da entrada padrão (geralmente o teclado).

6. Coleta de Informações do Usuário:
   ```java
   System.out.print("Nome do Professor: ");
   nome = scanner.nextLine();
   ```

   O programa solicita que o usuário insira o nome do professor e armazena a entrada na variável `nome`.

   Esse processo se repete para coletar o dia da semana, o horário de atendimento, o período e o número da sala.

7. Validação de Entradas:
   ```java
   if(!Validador.validaNome(nome)){
       System.out.println("Nome invalido");
       return;
   }
   ```

   Após cada entrada ser coletada, ela é validada usando métodos da classe `Validador`. Se a validação falhar (retornando `false`), uma mensagem de erro é exibida e o programa é encerrado.

8. Montagem da String de Atendimento:
   ```java
   atendimento = dia +" "+ horario;
   ```

   Uma string que representa o horário de atendimento é montada combinando o dia e o horário.

9. Geração do Arquivo JSON:
   ```java
   jsonFile = Json.createJson(nome, atendimento, periodo, sala);
   ```

   É chamado o método `createJson` da classe `Json` para criar um arquivo JSON com as informações coletadas do usuário.

10. Exibição do Arquivo JSON:
    ```java
    System.out.println(jsonFile);
    ```

    O conteúdo do arquivo JSON é exibido no console.

11. Salvando o Arquivo JSON:
    ```java
    Json.save(jsonFile);
    ```

    O arquivo JSON é salvo em algum local, dependendo da implementação da classe `Json`.

12. Fechando o Scanner:
    ```java
    scanner.close();
    ```

    Finalmente, o objeto `Scanner` é fechado para liberar recursos.

Para usar este programa, compile-o e execute-o. Ele solicitará que você insira informações sobre um professor, como nome, dia da semana, horário de atendimento, período e número da sala. O programa então gerará um arquivo JSON com essas informações e o exibirá no console. Certifique-se de que as classes `Validador` e `Json` estejam implementadas corretamente para que o programa funcione conforme o esperado.

Para rodar os testes unitários no Maven, siga as etapas abaixo:

1. Certifique-se de que você tem o Maven instalado em sua máquina. Se você não tiver o Maven instalado, você pode baixá-lo e instalá-lo a partir do site oficial do Maven: [Apache Maven](https://maven.apache.org/download.cgi).

2. Navegue até o diretório raiz do projeto onde estão localizados os arquivos de código-fonte e o arquivo `pom.xml` (arquivo de configuração do Maven).

3. Abra um terminal de linha de comando ou prompt de comando no diretório do projeto.

4. Execute o seguinte comando Maven para compilar e executar os testes:
   ```
   mvn test
   ```

Com essas etapas, você será capaz de compilar e executar todos os testes unitários em seu projeto Maven. Certifique-se de que os testes tenham resultados positivos antes de implantar seu código em produção.

Claro! Aqui está uma descrição similar para ser incluída em um arquivo README.md:

# Professor Information Generator

## Descrição
Este é um programa Java simples que permite aos usuários inserir informações sobre um professor e gera um arquivo JSON correspondente a essas informações. O programa também inclui validações para garantir que as entradas fornecidas sejam válidas.

## Como Usar
1. Clone este repositório em sua máquina local.

2. Compile o programa Java usando o compilador Java padrão (Javac):
   ```
   javac Main.java
   ```

3. Execute o programa compilado:
   ```
   java Main
   ```

4. Siga as instruções exibidas no console para inserir as informações do professor, incluindo nome, dia da semana, horário de atendimento, período e número da sala.

5. O programa validará as entradas fornecidas e, se forem válidas, criará um arquivo JSON com as informações inseridas.

6. O arquivo JSON gerado será exibido no console e também pode ser encontrado no diretório onde o programa foi executado.

7. Certifique-se de que as classes `Validador` e `Json` estejam implementadas corretamente para garantir o funcionamento adequado do programa.
## Autores
[
Vinicius Batista Ribas -1508
Gustavo Romos L. Torres -1539
]

