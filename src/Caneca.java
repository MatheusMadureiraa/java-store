// Matheus Guilherme Madureira - RA: a2565919

public class Caneca extends Produto{

    //_______________Atributos:_______________
    private double volume;
    private String material;

    //_______________Método Construtor Default:_______________
    public Caneca(){
        super(); // Executa construtor da classe-mãe 'Produto'
        volume = 0.00;
        material = "";
    }

    //_______________Método Construtor Sobrecarregado:_______________
    public Caneca(String nome, double preco, float volume, String material){
        super(nome, preco);
        this.volume = volume;
        this.material = material;
    }

    //_______________Métodos setters():_______________
    public void setVolume(double volume) throws VolumeCanecaPequenoExc{
        if(volume > 20 || volume == 20){
            this.volume = volume;
        }else{
            throw new VolumeCanecaPequenoExc();
        }
    }

    public void setMaterial(String material){
        this.material = material;
    }

    //_______________Métodos getters():_______________
    public Double getVolume(){
        return volume;
    }
    
    public String getMaterial(){
        return material;
    }
}