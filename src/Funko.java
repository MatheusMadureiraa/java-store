// Matheus Guilherme Madureira - RA: a2565919

public class Funko extends Produto{
    
    //_______________Atributos:_______________
    private String personagem;
    private int numSerie;
    private float altura;
    private boolean edicaoEspecial;

    //_______________Método Construtor Default:_______________
    public Funko(){
        super(); // Executa construtor da classe-mãe 'Produto'
        personagem = "";
        numSerie = 0;
        altura = 0;
        edicaoEspecial = false;
    }

    //_______________Método Construtor Sobrecarregado:_______________
    public Funko(String nome, double preco, String personagem, int numSerie, float altura, boolean edicaoEspecial){
        super(nome, preco);
        this.personagem = personagem;
        this.numSerie = numSerie;
        this.altura = altura;
        this.edicaoEspecial = edicaoEspecial;
    }

    //_______________Métodos setters():_______________
    public void setPersonagem(String personagem){
        this.personagem = personagem;
    }

    public void setNumSerie(int numSerie) throws NegNumSerieException{
        if (numSerie > 0){
            this.numSerie = numSerie;
        }
        else{
            throw new NegNumSerieException();
        }
    }
 
    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setEdicaoEspecial(boolean edicaoEspecial) {
            this.edicaoEspecial = edicaoEspecial;
    }

    //_______________Métodos getters():_______________
    public String getPersonagem(){
        return personagem;
    }

    public int getNumSerie(){
        return numSerie;
    }

    public double getAltura(){
        return altura;
    }

    public boolean getEdicaoEspecial(){
        return edicaoEspecial;
    }

}