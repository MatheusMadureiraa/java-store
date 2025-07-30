public class NegNumSerieException extends Exception{

    Leitura l = new Leitura();

    public void printNegNumSerie(){
        System.out.println("O numero de serie do funko-pop deve conter apenas numeros inteiros positivos!\n");
    }

    public Funko corrigirNegNumSerie(Funko f1){
        try{
            f1.setNumSerie(Integer.parseInt(l.scanString("Digite o numero de serie novamente do '" +f1.getPersonagem()+ "'")));
            }
            catch(NegNumSerieException numex){
                numex.printNegNumSerie();
                f1 = numex.corrigirNegNumSerie(f1);
            }
            catch (NumberFormatException ex){
                System.out.println("Erro: Verifique os valores numericos (numero de serie, altura, preco). Eles devem ser numeros.");
                corrigirNegNumSerie(f1);
            }
        return f1;
    } 
}
