package loiane.Aula36.labs2;

public class Curso {
    
    private String nome;
    private String horario;
    
    private int quantidadeDeAlunos = 0;
    private int quantidadeDeProfessores = 0;
    private double media;
    private Aluno[] alunos = new Aluno[quantidadeDeAlunos];
    private Professor[] professores = new Professor[quantidadeDeProfessores];
    
    public Curso(){}
    
    public Curso(String nome, String horario){
        this.nome = nome;
        this.horario = horario; 
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(Aluno[] alunos) {
        double somaDasMedias = 0;
        if(alunos != null){
            for(Aluno a: alunos){
                somaDasMedias += a.getMedia();
            }
            media = somaDasMedias / alunos.length;
        }
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        quantidadeDeAlunos++;
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        quantidadeDeProfessores++;
        this.professores = professores;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    @Override
    public String toString(){
        String info = "Nome do curso: "+ nome +"\n";
        
        if(professores != null){
            for(Professor p : professores){
                info += p.toString();
            }
        }
        
        if(alunos != null){
            for(Aluno a : alunos){
                info += a.toString();
            }
        }
        
      
        
        return info + "\n"+ "A media da turma foi: "+ media;
    }
    
}
