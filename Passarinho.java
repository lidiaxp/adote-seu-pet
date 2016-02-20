package Program;

public class Passarinho extends Animal{
    private boolean bicada;
    private boolean olhosDeAguia;
    private boolean comida;
    private boolean mascote;
    
    public Passarinho(String nome, String raca, double velocidade, int conhecimento, int coragem, int amor, boolean bicada, boolean olhosDeAguia, boolean comida, boolean mascote){
        super(nome, raca, velocidade, conhecimento, amor, coragem);
        this.bicada = bicada;
        this.olhosDeAguia = olhosDeAguia;
        this.comida = comida;
        this.mascote = mascote;
    }
    
    public boolean getBicada(){
        return bicada;
    }
    public boolean getOlhosDeAguia(){
        return olhosDeAguia;
    }
    public boolean getComida(){
        return comida;
    }
    public boolean getMascote(){
        return mascote;
    }
    
    @Override
    public void correr(){
        if(comida){
            super.setVelocidade(super.getVelocidade() + 1); 
            super.setAmor(super.getAmor() - 1); 
        } 
        if(!mascote){
            super.setVelocidade(super.getVelocidade() + 1);
            super.setAmor(super.getAmor() - 1);
        }
        if(olhosDeAguia){
            super.setVelocidade(super.getVelocidade() + 1);
            super.setAmor(super.getAmor() - 1);
        }
    }
    
    @Override
    public void estudar(){
        if(comida){
            super.setConhecimento(super.getConhecimento() + 2); 
            super.setAmor(super.getAmor() - 1); 
        } else {
            super.setConhecimento(super.getConhecimento() + 1); 
            super.setAmor(super.getAmor() - 1);
        }
        if(super.getConhecimento() > 10){
            comida = true;
        } else {
            comida = false;
        }
    }
    
    @Override
    public void coragiar(){    
        if(bicada||olhosDeAguia){
            super.setCoragem(super.getCoragem() + 2); 
            super.setAmor(super.getAmor() - 1);
        } else {
            super.setCoragem(super.getCoragem() + 1); 
            super.setAmor(super.getAmor() - 2);
        }
        if(bicada&&olhosDeAguia){
            super.setCoragem(super.getCoragem() + 3); 
            super.setAmor(super.getAmor() - 1);
        } 
        if(super.getCoragem() > 6){
            bicada = true;
        } else {
            bicada = false;
        }
        if(super.getCoragem() > 10){
            olhosDeAguia = true;
        } else {
            olhosDeAguia = false;
        }
    }
    
    @Override
    public void carinho(){
       super.setAmor(super.getAmor() + 1);
       if(super.getAmor()>10){
           mascote = true;
       } else {
           mascote = false;
       }
    }
}