package Program;

public class Animal {
    private String nome;
    private String raca;
    private double velocidade;
    private int conhecimento;
    private int coragem;
    private int amor;
    
    public Animal(String nome, String raca, double velocidade, int conhecimento, int coragem, int amor){
        this.nome = nome;
        this.raca = raca;
        this.velocidade = velocidade;
        this.conhecimento = 3;
        this.coragem = 2;
        this.amor = 10;
    }
    
    public int morrer(){
        if(amor <= 0){
            return 0;
        }
        return 1;
    }
    
    public void correr(){
        velocidade +=1;
        amor -=1;
    }
    
    public void estudar(){
        conhecimento +=1;
        amor -=1;
    }
    
    public void coragiar(){
        coragem +=1;
        amor -=2;
    }
    
    public void carinho(){
        amor +=1;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
     public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
     public double getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
     public int getConhecimento(){
        return conhecimento;
    }
    public void setConhecimento(int conhecimento){
        this.conhecimento = conhecimento;
    }
    public int getCoragem(){
        return coragem;
    }
    public void setCoragem(int coragem){
        this.coragem = coragem;
    }
    public int getAmor(){
        return amor;
    }
    public void setAmor(int amor){
        this.amor = amor;
    }
}
