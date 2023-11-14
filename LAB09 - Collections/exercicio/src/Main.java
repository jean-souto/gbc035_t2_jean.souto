import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Estudante> UniAlunos = new ArrayList<>();
        Stack<Estudante> PilhaAlunos = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int option = -1;
        Estudante e;

        while (option != 0) {
            System.out.println("""

                    Selecione uma opção:
                    1. Cadastar novo aluno de graduação
                    2. Cadastrar novo aluno de mestrado
                    3. Cadastrar novo aluno de doutorado
                    4. Mostrar todos os alunos
                    5. Excluir aluno por índice
                    6. Ordenar lista de alunos por nome
                    7. Adicionar aluno na pilha de alunos
                    8. Remover aluno da pilha de alunos
                    9. Mostrar pilha de alunos
                    0. Sair e encerrar""");
            option = scan.nextInt();

            try {

                switch (option) {
                    case 0 -> System.out.println("Adeus!");
                    case 1 -> {
                        System.out.println("\nDigite nome, endereço e título do TCC do estudante de graduação:");
                        e = new EstudanteGraduacao(scan.next(), scan.next(), scan.next());
                        UniAlunos.add(e);
                        System.out.println("Aluno número " + UniAlunos.size() + " da Universidade cadastrado com sucesso.");
                    }
                    case 2 -> {
                        System.out.println("\nDigite nome, endereço, formação, linha de pesquisa, tipo e título da dissertação do estudante de mestrado:");
                        e = new EstudanteMestrado(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
                        UniAlunos.add(e);
                        System.out.println("Aluno número " + UniAlunos.size() + " da Universidade cadastrado com sucesso.");
                    }
                    case 3 -> {
                        System.out.println("\nDigite nome, endereço, formação, linha de pesquisa e título da tese do estudante de doutorado:");
                        e = new EstudanteDoutorado(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
                        UniAlunos.add(e);
                        System.out.println("Aluno número " + UniAlunos.size() + " da Universidade cadastrado com sucesso.");
                    }
                    case 4 -> {
                        for (Estudante est : UniAlunos) {
                            est.print();
                        }
                    }
                    case 5 -> {
                        System.out.println("\nDigite o índice do aluno que deve ser excluído:");
                        int ind = scan.nextInt();
                        UniAlunos.remove(ind);
                    }
                    case 6 -> {
                        try {
                            //noinspection unchecked
                            Collections.sort(UniAlunos);
                        } catch (ClassCastException e1) {
                            System.out.println("Erro 1: " + e1);
                        } catch (UnsupportedOperationException e2) {
                            System.out.println("Erro 2: " + e2);
                        } catch (IllegalArgumentException e3) {
                            System.out.println("Erro 3: " + e3);
                        } finally {
                            for (Estudante est : UniAlunos) est.print();
                        }
                    }
                    case 7 -> {
                        System.out.println("\nDigite o índice do aluno que será adicionado:");
                        int ind = scan.nextInt();

                        try {
                            Estudante push = PilhaAlunos.push(UniAlunos.get(ind));
                            if (push == null) {
                                throw new Exception("ERRO!");
                            }else{
                                System.out.println("Adicionado com sucesso.");
                            }
                        } catch (Exception error) {
                            System.out.println("ERRO ao adicionar: " + error);
                        }
                    }

                    case 8 -> {
                        System.out.println("\nRemovendo...");

                        try {
                            Estudante pop = PilhaAlunos.pop();
                            if (pop == null) {
                                throw new Exception("ERRO!");
                            }else{
                                pop.print();
                                System.out.println("removido com sucesso.");
                            }
                        } catch (Exception error) {
                            System.out.println("ERRO ao remover: " + error);
                        }
                    }

                    case 9 -> {
                        for (Estudante est : PilhaAlunos) {
                            est.print();
                        }
                    }
                    default -> throw new IllegalStateException();
                }
            } catch (IllegalStateException error) {
                System.out.println("ERROR! Unexpected value: " + option);
            }
        }
    }
}