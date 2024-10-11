
package aluno;


public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Jorge", 2676);

        System.out.println("Nome: "+ aluno.getNome());
        System.out.println("Matricula: "+ aluno.getMatricula());

        aluno.calcularMedia();

    }

}
