package Program;

public class Namorar {
    private int somador1;
    private int somador2;
    private int auxiliar1;
    private int auxiliar2;
    
    public Namorar(Gato cat, Passarinho bird){
        zerar();
        gat(cat);
        passarin(bird);
    }
    public Namorar(Gato cat, Cachorro dog){
        zerar();
        gat(cat);
        doguin2(dog);
    }
    public Namorar(Cachorro dog, Passarinho bird){
        zerar();           
        doguin(dog);
        passarin(bird);
    }
    public Namorar(Cachorro dog, Cachorro dog2){
        zerar();            
        doguin(dog);
        doguin2(dog2);
    }
    public Namorar(Gato cat, Gato cat2){
        zerar();
        gat(cat);
        if(cat.getUnhas()){
            auxiliar2 += 5;
        }
        if(cat.getDomestico()){
            auxiliar2 += 10;
        }
        if(cat.getTedio() < 7){
            auxiliar2 += 7;
        }
        auxiliar2 += cat.getAmor();
        somador2 = (int)cat.getVelocidade()*3 + cat.getConhecimento()*2 + cat.getCoragem() + auxiliar2;
    }
    public Namorar(Passarinho bird, Passarinho bird2){
        zerar();
        if(bird.getComida()){
            auxiliar1 += 10;
        }
        if(bird.getOlhosDeAguia()){
            auxiliar1 += 10;
        }
        if(bird.getMascote()){
            auxiliar1 += 10;
        }
        auxiliar1 += bird.getAmor();
        somador1 = (int)bird.getVelocidade()*2 + bird.getConhecimento()*3 + bird.getCoragem() + auxiliar1;
        passarin(bird2);
    }
        
    public int vencedor(){
        if(somador1 > somador2){
            return 0;
        }else if (somador1 < somador2){
            return 1;
        } else {
            return 2;
        }
    }
    public void zerar(){
        somador1 = 0;
        somador2 = 0;
        auxiliar1 = 0;
        auxiliar2 = 0;
    }
        
    public void gat(Gato cat){
        if(cat.getUnhas()){
            auxiliar1 += 5;
        }
        if(cat.getDomestico()){
            auxiliar1 += 10;
        }
        if(cat.getTedio() < 7){
            auxiliar1 += 7;
        }
        auxiliar1 += cat.getAmor();
        somador1 = (int)cat.getVelocidade()*3 + cat.getConhecimento()*2 + cat.getCoragem() + auxiliar1;
    }
    public void passarin(Passarinho bird){
        if(bird.getComida()){
            auxiliar2 += 10;
        }
        if(bird.getOlhosDeAguia()){
            auxiliar2 += 10;
        }
        if(bird.getMascote()){
            auxiliar2 += 10;
        }
        auxiliar2 += bird.getAmor();
        somador2 = (int)bird.getVelocidade()*2 + bird.getConhecimento()*3 + bird.getCoragem() + auxiliar2;
    }
    public void doguin(Cachorro dog){
        if(dog.getFelicidade()){
            auxiliar1 += 10;
        }
        if(dog.getRaciocinio()){
            auxiliar1 += 10;
        }
        if(dog.getVoz()){
            auxiliar1 += 10;
        }
        auxiliar1 += dog.getAmor();
        somador1 = (int)dog.getVelocidade() + dog.getConhecimento()*2 + dog.getCoragem()*3 + auxiliar1;
    }
    public void doguin2(Cachorro dog){
        if(dog.getFelicidade()){
            auxiliar2 += 10;
        }
        if(dog.getRaciocinio()){
            auxiliar2 += 10;
        }
        if(dog.getVoz()){
            auxiliar2 += 10;
        }
        auxiliar2 += dog.getAmor();
        somador2 = (int)dog.getVelocidade() + dog.getConhecimento()*2 + dog.getCoragem()*3 + auxiliar2;
    }
}
