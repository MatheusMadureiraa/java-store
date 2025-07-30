// Matheus Guilherme Madureira - RA: a2565919

public abstract class Produto{
    
    //_______________Atributos:_______________
    private static int idProximo = 1; // variavel para atribuir valor ao proximo ID automaticamente

    private String nome;
    private int id;
    private double preco;

    //_______________Método Construtor Default:_______________
    public Produto() {
        nome = "";
        id = idProximo++;
        preco = 0;
    }
    
    //_______________Método Construtor Sobrecarregado:_______________
    public Produto(String nome, double preco){
        this.nome = nome;
        this.id = idProximo++;
        this.preco = preco;
    }

    //_______________Métodos setters():_______________
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco) throws PrecoNegativoExc{
        if (preco > 0 || preco == 0){
            this.preco = preco;
        } else{
            throw new PrecoNegativoExc();
        }
    }

    //_______________Métodos getters():_______________
    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public double getPreco(){
        return preco;
    }
}