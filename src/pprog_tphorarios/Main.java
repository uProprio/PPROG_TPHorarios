/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog_tphorarios;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author 1081320
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
//        int nLinhas = detNumAlunos();
        lerNumerosNomes();
        
        
    }

    private static int detNumAlunos() throws Exception {
        Scanner fi = new Scanner(new File("Alunos.txt"));
        int c = 0;
        while (fi.hasNextLine()) {
            fi.nextLine();
            c++;
        }

        fi.close();
        return c;
    }

    private static void lerNumerosNomes() throws Exception {
        Scanner fi = new Scanner(new File("Alunos.txt"));
        String[] partes;
        String linha;
//        int i = 0;
        while (fi.hasNextLine()) {
            fi.nextLine();
            linha = fi.nextLine();
            partes = linha.split(";");
            for (int j = 0; j < partes.length; j++) {
                System.out.println(partes[j]);
            }
            
//            i++;
        }
        fi.close();
    }
}
