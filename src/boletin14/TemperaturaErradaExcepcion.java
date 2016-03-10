package boletin14;


/**
 *
 * @author julianlinux
 */
public class TemperaturaErradaExcepcion extends Exception {
       public TemperaturaErradaExcepcion(){
        super("Mensaje por defecto, la temperatura tiene que ser mayor a 80");
    }
    public TemperaturaErradaExcepcion(String mensaxe){
        super(mensaxe);
    }
}
    

