import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("olá, quantos alunos voce deseja cadastrar");
        int n = s.nextInt();
        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            System.out.println("qual o nome do aluno?");
            String nome = s.next();
            System.out.println("qual a idade do aluno?");
            int idade = s.nextInt();
            System.out.println("qual a nota do aluno?");
            double nota = s.nextDouble();
            alunos[i] = new Aluno(nome, idade, nota);
        }

        for(int i = 0; i < alunos.length; i++) {
            //formar de indentificar se aluno foi aprovado ou nao
            if (alunos[i].nota >= 6) {
                System.out.println("Aluno " + alunos[i].nome +" aprovado!!!");
            }
            else {
                System.out.println("Aluno " + alunos[i].nome +" reprovado! :(");
            }
            // se aprovado printar aprovado se nao printar reprovado


        }
    }
}

class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        //esteAtributoDaMinhaClasse recebe esteValorDeParametro
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
}

