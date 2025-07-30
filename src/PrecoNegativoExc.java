public class PrecoNegativoExc extends Exception{
    
    Leitura l = new Leitura();

    public void printPrecoNegativo(){
        System.out.println("\nO preco do produto deve ser um numero positivo!\n");
    }
}
