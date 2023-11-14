# Ex01 
Crie uma classe funcionário, com os campos CPF, Nome e Salário. Faça todos os métodos esperados para tratar desses atributos.

Adicionalmente

- Acrescente um novo atributo privado em Funcionário que armazene o teto salarial. Por padrão, todos os objetos da classe Funcionário são inicializados com o teto de R$ 40 mil. Permita ao usuário da classe atribuir e consultar os valores desse novo atributo. 

- Crie um método para aumentar o salário, passando como parâmetro um valor porcentual.
- Note que o método pode gerar valores inválidos. É possível que o salário fique negativo ou que atinja um valor acima do teto. Não deixe que isso ocorra. Para retornar o erro, crie uma classe de exceção que herde a classe .IllegalArgumentException (essa classe, por sua vez, herda RuntimeException). 

- Caso o erro seja de valor negativo, mostrar a mensagem "Valor inválido de salário";

- Caso o erro seja de valor maior que o teto, mostrar a mensagem "Valor ultrapassa o teto";

- Na classe principal inclua um código que chama um dos métodos que pode acionar a exceção criada e nesse caso mostre na tela a mensagem do erro emitida pela exceção.

- Independentemente de a exceção ser ou não acionada, mostrar ao final da chamada do método qual o valor do salário atual

# Ex02
 
- Qual a diferença entre o throw e throws ? Throws é o comando que permite coletar o erro e enviar ele para a classe que chamou o método. Ele recebe o erro e passa pro próximo.
O throw é o comando que permite "personalizar" o erro. É como se o programador pudesse criar seus próprios erros personalizados.

- Indique a diferença entre checked e uncheked exceptions:
Checked: São exceções que devem OBRIGATÓRIAMENTE ser capturadas para que o programa funcione.
Unchecked: São excecões que não precisam OBRIGATÓRIAMENTE ser capturadas. O programa pode funcionar sem que esse tipo de exceção seja capturada.