package OO.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Vitor");
        Aluno aluno2 = new Aluno("Carlos");
        Aluno aluno3 = new Aluno("Jose");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Web");
        Curso curso3 = new Curso("React");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos) {
            System.out.println("Meu nome é " + aluno.nome);
            System.out.println("Estou matriculado no curso de " + curso1.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso encontrado = aluno1.obterCursoPorNome("Java");

        if (encontrado != null ) {
            System.out.println(encontrado.alunos);
        }

    }
}
