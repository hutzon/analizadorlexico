
package dao;

import java.io.File;

/**
 *
 * @author Charly Ponce
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
