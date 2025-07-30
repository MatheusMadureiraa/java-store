// Matheus Guilherme Madureira - RA: a2565919

public class Livro extends Produto {

    //_______________Atributos:_______________
    private int numPaginas;
    private String autor;
    private String genero;

    //_______________Método Construtor Default:_______________
    public Livro(){
        super(); // Executa construtor da classe-mãe 'Produto'
        numPaginas = 0;
        autor = "";
        genero = "";
    }

    //_______________Método Construtor Sobrecarregado:_______________
    public Livro(String nome, double preco, int numPaginas, String autor, String genero){
        super(nome, preco);
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.genero = genero;
    }

    //_______________Métodos setters():_______________
    public void setNumPaginas(int numPag) throws LivroPagNegativaException{
        if (numPag > 0){
            numPaginas = numPag;
        }
        else{
            throw new LivroPagNegativaException();
        }
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    //_______________Métodos getters():_______________
    public int getNumPaginas(){
        return numPaginas;
    }

    public String getAutor(){
        return autor;
    }

    public String getGenero(){
        return genero;
    }
}