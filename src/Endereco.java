// Matheus Guilherme Madureira - RA: a2565919

public class Endereco {
    
    //_______________Atributos:_______________
    private String rua;
    private int num;
    private String cep;

    //_______________Método Construtor Default:_______________
    public Endereco(){
        rua = "";
        num = 0;
        cep = "";
    }

    //_______________Método Construtor Sobrecarregado:_______________
    public Endereco(String rua, int num, String cep){
        this.rua = rua;
        this.num = num;
        this.cep = cep;
    }

    //_______________Métodos setters():_______________
    public void setRua(String rua){
        this.rua = rua;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    //_______________Métodos getters():_______________
    public String getRua(){
        return rua;
    }

    public int getNum(){
        return num;
    }

    public String getCep(){
        return cep;
    }
}
