// Matheus Guilherme Madureira - RA: a2565919

public class Fornecedor {

    //_______________Atributos:_______________
    private static int idProximo = 1; // variavel para atribuir valor ao proximo ID automaticamente

    private String nomeFornecedor;
    private String cnpj;
    private int idFornecedor;
    private Endereco enderFornecedor;

    //_______________Método Construtor Default:_______________
    public Fornecedor(){
        nomeFornecedor = "";
        cnpj = "";
        idFornecedor = idProximo++;
        enderFornecedor = new Endereco();
    }

    //_______________Método Construtor Sobrecarregado:_______________
    public Fornecedor(String nomeFornecedor, String cnpj, Endereco ender){
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.idFornecedor = idProximo++;
        this.enderFornecedor = enderFornecedor;
    }

    //_______________Métodos setters():_______________
    public void setNomeFornecedor(String nomeFornecedor){
        this.nomeFornecedor = nomeFornecedor;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void setEnderFornecedor(Endereco enderFornecedor){
        this.enderFornecedor = enderFornecedor;
    }  

    //_______________Métodos getters():_______________
    public String getNomeFornecedor(){
        return nomeFornecedor;
    }

    public String getCnpj(){
        return cnpj;
    }

    public int getIdFornecedor(){
        return idFornecedor;
    }

    public Endereco getEnderFornecedor(){
        return enderFornecedor;
    }
}
