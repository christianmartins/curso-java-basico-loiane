
package loiane.Aula36.labs2;

public class Teste {

    public static void main(String[] args){
        
        Curso curso = new Curso("Ads", "Noite");   
        Professor[] professores = new Professor[1];
        professores[0] = new Professor("Moacir", "TI", "moacir@casescript.com");  
        curso.setProfessores(professores);
        Aluno[] alunos = new Aluno[1];
        
        
        String nomeDoAluno = "Chris";
        String matriculaDoAluno = "Chris";
        double[] notasDoAluno = {10,6,7,8};
        
        alunos[0] = new Aluno(nomeDoAluno, matriculaDoAluno, notasDoAluno);
        curso.setAlunos(alunos);
        curso.setMedia(alunos);
        
//        alunos[0] = new Aluno();
//        alunos[0].setNome("Chris");
//        alunos[0].setMatricula("123456");
//        double[] notas = {10,6,7,8};
//        alunos[0].setNotas(notas);
//        alunos[0].setMedia(notas);
//        
//        curso.setAlunos(alunos);
//        curso.setMedia(alunos);
        System.out.println(curso.toString());
        
    
    }
    
}
