// Matheus Guilherme Madureira - RA: a2565919

import java.util.Scanner;
import java.io.IOException;

public class Leitura{

    Scanner scanner = new Scanner(System.in);

    public String scanString(String rotulo){

        System.out.println(rotulo);
        String returnScan = "";

        try{
            returnScan = scanner.nextLine(); // Usa-se o nextLine() para ler toda a String;
            return returnScan;
        } catch(Exception e){
            System.out.println("Erro na entrada de dados");
        }
        return "";    
    }
    
    public void encerrarScanner(){
        scanner.close();
    }
}