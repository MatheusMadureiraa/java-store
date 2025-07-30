public class LivroPagNegativaException extends Exception{
    
    Leitura l = new Leitura();

    public void printLivroPagNegativa(){
        System.out.println("\nErro:O livro nao pode ter menos de uma pagina\n");
    }

    public Livro corrigirLivroPagNegativa(Livro l1){
            try{
                l1.setNumPaginas(Integer.parseInt(l.scanString("Digite o numero de paginas novamete: ")));
            }
            catch(LivroPagNegativaException livroExc){
                livroExc.printLivroPagNegativa();
                livroExc.corrigirLivroPagNegativa(l1);
            }
            catch(NumberFormatException nfe){
                System.out.println("\nErro: O numero de paginas deve ser um inteiro positivo!\n");
                corrigirLivroPagNegativa(l1);
            } 
        return l1;
    } 
}
