package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;


    public Alfabeto(String origen, String[] letras, String interpretancion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretancion;
    }


    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }


    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
        return this.getLetras().length;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        String cadena = "";
        for(String letrasi : this.letras) {
            cadena += letrasi + ", ";
        }
        return cadena.substring(0, cadena.length()-2);
    }
}
