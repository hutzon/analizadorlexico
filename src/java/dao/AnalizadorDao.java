
package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Descripcion;

/**
 *
 * @author OTTONIEL CAMPOS
 */
public class AnalizadorDao {
       
    public String analizarCadena(String cadena){
       String descripcion="";
        
        
       
       //Metodo
         // TODO add your handling code here:
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(cadena);
            escribir.close();
        } catch (FileNotFoundException ex) {
           System.err.println("Error "+ex);
        }
        
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "     FIN";
                    descripcion = resultado;
                    return descripcion;
                }
                switch (tokens) {
                    case ERROR:
                        resultado += "Simbolo no definido \n\r";
                        break;
                    case Identificador: case Numero: case Reservadas:
                        resultado += lexer.lexeme + " ==>: " + tokens + "\n";
                        break;
                    default:
                        resultado += "Token ==>: " + tokens + " \n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error "+ex);
        } catch (IOException ex) {
            System.err.println("Error "+ex);
        }
       

        return descripcion;
   }
}
