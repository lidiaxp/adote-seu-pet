package Program;

public class Gato extends Animal{
    private boolean arranhao;
    private boolean unhas;
    private boolean domestico;
    private int tedio;
    
    public Gato(String nome, String raca, double velocidade, int conhecimento, int coragem, int amor, boolean arranhao, boolean unhas, boolean domestico, int tedio){
        super(nome, raca, velocidade, conhecimento, amor, coragem);
        this.arranhao = arranhao;
        this.unhas = unhas;
        this.domestico = domestico;
        this.tedio = tedio;
    }
    
    public boolean getArranhao(){
        return arranhao;
    }
    public boolean getUnhas(){
        return unhas;
    }
    public boolean getDomestico(){
        return domestico;
    }
    public int getTedio(){
        return tedio;
    }
    
    @Override
    public void correr(){
        if(!domestico){
            super.setVelocidade(super.getVelocidade() + 2); 
            super.setAmor(super.getAmor() - 1); 
        } else {
            super.setVelocidade(super.getVelocidade() + 1); 
            super.setAmor(super.getAmor() - 1);
        }
        if(tedio >7){
            super.setVelocidade(super.getVelocidade() + 1);
        }
    }
    
    @Override
    public void estudar(){
        if(domestico){
            super.setConhecimento(super.getConhecimento() + 2); 
            super.setAmor(super.getAmor() - 1); 
        } else {
            super.setConhecimento(super.getConhecimento() + 1); 
            super.setAmor(super.getAmor() - 1);
        }
        if(super.getConhecimento() > 15){
            domestico = true;
        } else {
            domestico = false;
        }
    }
    
    @Override
    public void coragiar(){    
        if(arranhao||unhas){
            super.setCoragem(super.getCoragem() + 2); 
            super.setAmor(super.getAmor() - 1);
        } else {
            super.setCoragem(super.getCoragem() + 1); 
            super.setAmor(super.getAmor() - 2);
        }
        if(arranhao&&unhas){
            super.setCoragem(super.getCoragem() + 3); 
            super.setAmor(super.getAmor() - 1);
        } 
        if(super.getCoragem() > 5){
            unhas = true;
        } else {
            unhas = false;
        }
        if(super.getCoragem() > 10){
            arranhao = true;
        } else {
            arranhao = false;
        }
        tedio++;
    }
    
    @Override
    public void carinho(){
       super.setAmor(super.getAmor() + 1);
       if(super.getAmor()>10){
           domestico = true;
       } else {
           domestico = false;
       }
       tedio--;
    }
}
