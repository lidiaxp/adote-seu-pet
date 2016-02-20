package Program;

public class Cachorro extends Animal{
    private boolean mordidaForte;
    private boolean felicidade;
    private boolean raciocinio;
    private boolean voz;
    
    public Cachorro(String nome, String raca, double velocidade, int conhecimento, int coragem, int amor, boolean mordida, boolean felicidade, boolean raciocinio, boolean voz){
        super(nome, raca, velocidade, conhecimento, amor, coragem);
        this.mordidaForte = mordidaForte;
        this.felicidade = felicidade;
        this.raciocinio = raciocinio;
        this.voz = voz;
    }
    
    public boolean getMordidaForte(){
        return mordidaForte;
    }
    public boolean getFelicidade(){
        return felicidade;
    }
    public boolean getRaciocinio(){
        return raciocinio;
    }
    public boolean getVoz(){
        return voz;
    }
    
    @Override
    public void correr(){
        if(felicidade){
            super.setVelocidade(super.getVelocidade() + 3); 
            super.setAmor(super.getAmor() - 1); 
        } else {
            super.setVelocidade(super.getVelocidade() + 1); 
            super.setAmor(super.getAmor() - 1);
        }
    }
    
    @Override
    public void estudar(){
        if(raciocinio){
            super.setConhecimento(super.getConhecimento() + 2); 
            super.setAmor(super.getAmor() - 1); 
        } else {
            super.setConhecimento(super.getConhecimento() + 1); 
            super.setAmor(super.getAmor() - 1);
        }
        if(super.getConhecimento() > 10){
            raciocinio = true;
        } else {
            raciocinio = false;
        }
    }
    
    @Override
    public void coragiar(){    
        if(mordidaForte||voz){
            super.setCoragem(super.getCoragem() + 2); 
            super.setAmor(super.getAmor() - 1);
        } else {
            super.setCoragem(super.getCoragem() + 1); 
            super.setAmor(super.getAmor() - 2);
        }
        if(mordidaForte&&voz){
            super.setCoragem(super.getCoragem() + 3); 
            super.setAmor(super.getAmor() - 1);
        } 
        if(super.getCoragem() > 5){
            voz = true;
        } else {
            voz = false;
        }
        if(super.getCoragem() > 10){
            mordidaForte = true;
        } else {
            mordidaForte = false;
        }
    }
    
    @Override
    public void carinho(){
       super.setAmor(super.getAmor() + 1);
       if(super.getAmor()>10){
           felicidade = true;
       } else {
           felicidade = false;
       }
    }
}