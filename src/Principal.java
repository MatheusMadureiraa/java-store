// Matheus Guilherme Madureira - RA: a2565919

import java.io.IOException;

public class Principal{

    
    static boolean continuarLoop = true;
    public static void main(String args[]){
        
        int opc = 0;
        Leitura l = new Leitura();
        
        do{
            System.out.println("\n---------- CADASTRAR NOVO PRODUTO ----------\n");
            System.out.println("1- Funko pop; \n2- Livro/Manga; \n3- Caneca; \n0- Sair;\n");
            try{
                opc = Integer.parseInt(l.scanString("Digite uma das opcoes de cadastro:"));
            }
            catch(NumberFormatException e){
                System.out.println("O valor deve ser um inteiro\n");
                opc = -1; //entrar no default abaixo e iniciar o 'do-while' novamente
            }  
            System.out.println("\n");
            switch (opc) {
                case 1:
                    cadastrarFunko(l);
                    break;
                case 2:
                    cadastrarLivro(l);
                    break;
                case 3:
                    cadastrarCaneca(l);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;    
                default: 
                    System.out.println("O valor deve estar entre as opcoes disponiveis \nTente novamente");
                    break;
            }
        }while(opc!=0);
    }

        public static void cadastrarFunko(Leitura l){ // recebe 'Leitura l' como parametro para fazer a entrada de dados
            Funko f1 = new Funko();
            boolean continuarLoop = true;

            while(continuarLoop){
                try{
                    f1.setNome(l.scanString("Nome para cadastro do funko no sistema:"));
                    continuarLoop = false;
                }
                catch(Exception e){
                    System.out.println("\nErro ao capturar o nome escolhido, certifique-se de colocar apenas characteres\n");
                }
            }

            continuarLoop = true;
            while(continuarLoop){
                try{
                    f1.setPersonagem(l.scanString("Nome do personagem/pessoa: "));
                    continuarLoop = false;
                }
                catch(Exception e){
                    System.out.println("\nErro ao capturar o nome do personagem, certifique-se de colocar apenas characteres\n");
                }
            }
            
            continuarLoop = true;
            while(continuarLoop){
                try{
                    f1.setNumSerie(Integer.parseInt(l.scanString("Numero de serie do '" +f1.getPersonagem()+ "'")));
                    continuarLoop = false;
                }
                catch(NegNumSerieException numex){
                    numex.printNegNumSerie();
                    f1 = numex.corrigirNegNumSerie(f1);
                    continuarLoop = false;
                }
                catch (NumberFormatException ex){
                    System.out.println("\nErro: O numero de serie deve ser um numero inteiro\n");
                }
            }

            continuarLoop = true;
            while(continuarLoop){
                try{
                    f1.setEdicaoEspecial(Boolean.parseBoolean(l.scanString("Eh de edicao especial ou limitada? (true/false)")));
                    continuarLoop = false;
                }
                catch (Exception e){
                    System.out.println("\nErro: Deve-se escrever apenas true ou false para edicao especial\n");
                }
            }

            continuarLoop = true;
            while(continuarLoop){
                try{
                    f1.setAltura(Float.parseFloat(l.scanString("Altura do funko:")));
                    continuarLoop = false;
                }
                catch (NumberFormatException nfe){
                    System.out.println("\nErro: A altura deve ser numeros reais ou inteiros\n");
                }
            }    

            continuarLoop = true;
            while(continuarLoop){
                try{
                    f1.setPreco(Double.parseDouble(l.scanString("Preco:")));
                    continuarLoop = false;
                }    
                catch (PrecoNegativoExc pne){
                    pne.printPrecoNegativo();
                }
                catch (NumberFormatException nfe){
                    System.out.println("\nErro: O preco deve ser numeros reais ou inteiros\n");
                }
            }    

            System.out.println("\n");
            System.out.println("Nome do produto: " +f1.getNome());
            System.out.println("Personagem: " +f1.getPersonagem());
            System.out.println("Numero de serie: " +f1.getNumSerie());
            System.out.println("Faz parte de edicao limitada? " +f1.getEdicaoEspecial());
            System.out.println("Altura: " +f1.getAltura());
            System.out.println("Preco: " +f1.getPreco());
            System.out.println("ID '" +f1.getNome()+ "': "+ f1.getId());
        }

        public static void cadastrarLivro(Leitura l){ // recebe 'Leitura l' como parametro para fazer a entrada de dados
            Livro lv1 = new Livro();
            
            boolean continuarLoop = true;
            while(continuarLoop){
                try{
                    lv1.setNome(l.scanString("Digite o nome do livro para cadastrar no sistema: "));
                    continuarLoop = false;
                }
                catch(Exception e){
                    System.out.println("\nErro ao capturar o nome do livro, certifique-se de colocar apenas characteres\n");
                }
            }    

            continuarLoop = true;
            while(continuarLoop){
                try{
                    lv1.setGenero(l.scanString("Genero do livro: "));
                    continuarLoop = false;
                }
                catch(Exception e){
                    System.out.println("\nErro ao capturar o genero do livro, certifique-se de colocar apenas characteres\n");
                }
            }

            continuarLoop = true;
            while(continuarLoop){
                try{
                    lv1.setNumPaginas(Integer.parseInt(l.scanString("Numero de paginas: ")));
                    continuarLoop = false;
                }
                catch(LivroPagNegativaException livroExc){
                    livroExc.printLivroPagNegativa();
                    lv1 = livroExc.corrigirLivroPagNegativa(lv1);
                    continuarLoop = false;
                }
                catch(NumberFormatException nfe){
                    System.out.println("\nErro: O numero de paginas deve ser um inteiro positivo!\n");
                }
            }

            continuarLoop = true;
            while(continuarLoop){
                try{
                    lv1.setAutor(l.scanString("Nome do autor: "));
                    continuarLoop = false;
                }
                catch(Exception e){
                    System.out.println("\nErro ao capturar o nome do autor, certifique-se de colocar apenas characteres\n");
                }    
            }  
            continuarLoop = true;
            while(continuarLoop){  
                try{
                    lv1.setPreco(Double.parseDouble(l.scanString("Preco do livro '" + lv1.getNome() + "':")));
                    continuarLoop = false;
                }
                catch (PrecoNegativoExc pne){
                    pne.printPrecoNegativo();
                }
                catch(NumberFormatException nfe){
                    System.out.println("\nErro ao capturar o preco, deve ser um numero decimal ou inteiro\n");
                }
            }

            System.out.println("\n");
            System.out.println("Nome do produto: " +lv1.getNome());
            System.out.println("Genero: " +lv1.getGenero());
            System.out.println("Numero de paginas: " +lv1.getNumPaginas());
            System.out.println("Nome do autor: " +lv1.getAutor());
            System.out.println("Preco:" +lv1.getPreco());
            System.out.println("ID '" +lv1.getNome()+ "': "+ lv1.getId());
        }

        public static void cadastrarCaneca(Leitura l){ // recebe 'Leitura l' como parametro para fazer a entrada de dados
            Caneca c1 = new Caneca();

            continuarLoop = true;
            while(continuarLoop){  
                try{
                    c1.setNome(l.scanString("Digite o nome da caneca para cadastrar no sistema: "));
                    continuarLoop = false;
                } 
                catch(Exception ioe){
                    System.out.println("\nErro: digite um nome válido para a caneca\n");
                }
            }

            continuarLoop = true;
            while(continuarLoop){  
                try{
                    c1.setVolume(Double.parseDouble(l.scanString("Volume da caneca (em ml): ")));
                    continuarLoop = false;
                } 
                catch(VolumeCanecaPequenoExc volumePeq){
                    volumePeq.printVolumeCanecaPequeno();
                    c1 = volumePeq.corrigirVolCaneca(c1);
                    continuarLoop = false;
                }
                catch(Exception ioe){
                    System.out.println("\nErro: o volume deve ser um valor decimal!\n");
                }
            }

            continuarLoop = true;
            while(continuarLoop){  
                try{
                    c1.setMaterial(l.scanString("Material da caneca (vidro, plastico, etc): "));
                    continuarLoop = false;
                } 
                catch(Exception ioe){
                    System.out.println("\nErro: Digite um material valido!\n");
                }
            }    
            
            continuarLoop = true;
            while(continuarLoop){  
                try{
                    c1.setPreco(Double.parseDouble(l.scanString("Preco da caneca '" +c1.getNome() + "':")));
                    continuarLoop = false;
                }
                catch (PrecoNegativoExc pne){
                    pne.printPrecoNegativo();
                }
                catch(NumberFormatException nfe){
                    System.out.println("\nErro ao capturar o preco, deve ser um numero decimal ou inteiro\n");
                }
            }          

            System.out.println("\n");
            System.out.println("Nome da caneca: " +c1.getNome());
            System.out.println("Volume: " +c1.getVolume() +"ml");
            System.out.println("Material: " +c1.getMaterial());
            System.out.println("Preco: " +c1.getPreco());
            System.out.println("ID '" +c1.getNome()+ "': " +c1.getId());
        }
}
  