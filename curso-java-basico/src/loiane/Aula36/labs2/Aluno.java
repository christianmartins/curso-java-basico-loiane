package loiane.Aula36.labs2;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[4];
    private double media;
    
    public Aluno(){}
    
    public Aluno(String nome, String matricula, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
        setNotas(notas);
        setMedia(notas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    @Override
    public String toString(){
        String info = "\n----- Alunos -----\n" 
               +"Nome do Aluno : "+ nome +"\n";
        
        for(int i = 0; i < notas.length; i++){
           info += "Notas "+ (i+1) +": "+ notas[i] +"\n";  
        }
        
        String status;
        if(media >= 7)
            status = "aprovado";
        else
            status = "reprovado";
        
        return info + "Media final do aluno: "+ media + "\n"+ "Status: " + status +"\n";
    }
    
    public void setMedia(double[] notas){
        double somaDasNotas = 0;
        
        for(double n : notas){
            somaDasNotas += n;
        }
        media = somaDasNotas / (notas.length); 
    }
    
    public double getMedia(){
        return media;
    }
}
