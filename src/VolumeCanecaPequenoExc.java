public class VolumeCanecaPequenoExc extends Exception{
    
    Leitura l = new Leitura();
    public void printVolumeCanecaPequeno(){
        System.out.println("\nErro: O volume da caneca eh muito pequeno ou negativo, tente novamente\n");
    }

    public Caneca corrigirVolCaneca(Caneca c){
        try{
            c.setVolume(Double.parseDouble(l.scanString("Volume da caneca (em ml): ")));
        } 
        catch(VolumeCanecaPequenoExc volumePeq){
            volumePeq.printVolumeCanecaPequeno();
            c = volumePeq.corrigirVolCaneca(c);
        }
        catch(Exception ioe){
            System.out.println("\nErro: o volume deve ser um valor decimal!\n");
            corrigirVolCaneca(c);
        }
        return c;
    }
}
