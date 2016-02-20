package Program;

public class Luta {
    private int somador1;
    private int somador2;
    private int auxiliar1;
    private int auxiliar2;
    
    public Luta(Gato cat, Passarinho bird){
        zerar();
        gat(cat);
        passarin(bird);
    }
    public Luta(Gato cat, Cachorro dog){
        zerar();
        gat(cat);
        doguin2(dog);
    }
    public Luta(Cachorro dog, Passarinho bird){
        zerar();
        doguin(dog);
        passarin(bird);
    }
    public Luta(Cachorro dog, Cachorro dog2){
        zerar();
        doguin(dog);
        doguin2(dog2);
    }
    public Luta(Gato cat, Gato cat2){
        zerar();
        gat(cat);
        if(cat2.getArranhao()){
            auxiliar2 += 10;
        }
        if(cat2.getUnhas()){
            auxiliar2 += 5;
        }
        if(cat2.getDomestico()){
            auxiliar2 -= 7;
        }
        somador2 = (int)cat2.getVelocidade()*2 + cat2.getConhecimento() + cat2.getCoragem() + auxiliar2;
    }
    public Luta(Passarinho bird, Passarinho bird2){
        zerar();
        if(bird.getBicada()){
            auxiliar1 += 6;
        }
        if(bird.getOlhosDeAguia()){
            auxiliar1 += 10;
        }
        if(bird.getMascote()){
            auxiliar1 -= 7;
        }
        somador1 = (int)bird.getVelocidade() + bird.getConhecimento()*2 + bird.getCoragem() + auxiliar1;
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
        if(cat.getArranhao()){
            auxiliar1 += 10;
        }
        if(cat.getUnhas()){
            auxiliar1 += 5;
        }
        if(cat.getDomestico()){
            auxiliar1 -= 7;
        }
        somador1 = (int)cat.getVelocidade()*2 + cat.getConhecimento() + cat.getCoragem() + auxiliar1;
    }
    public void passarin(Passarinho bird2){
        if(bird2.getBicada()){
            auxiliar2 += 6;
        }
        if(bird2.getOlhosDeAguia()){
            auxiliar2 += 10;
        }
        if(bird2.getMascote()){
            auxiliar2 -= 7;
        }
        somador2 = (int)bird2.getVelocidade() + bird2.getConhecimento()*2 + bird2.getCoragem() + auxiliar2;
    }
    public void doguin(Cachorro dog){
        if(dog.getMordidaForte()){
            auxiliar1 += 10;
        }
        if(dog.getVoz()){
            auxiliar1 += 5;
        }
        if(dog.getRaciocinio()){
            auxiliar1 += 10;
        }
        somador1 = (int)dog.getVelocidade() + dog.getConhecimento() + dog.getCoragem()*2 + auxiliar1;
    }
    public void doguin2(Cachorro dog){
        if(dog.getMordidaForte()){
            auxiliar2 += 10;
        }
        if(dog.getVoz()){
            auxiliar2 += 5;
        }
        if(dog.getRaciocinio()){
            auxiliar2 += 10;
        }
        somador2 = (int)dog.getVelocidade() + dog.getConhecimento() + dog.getCoragem()*2 + auxiliar2;
    }
}