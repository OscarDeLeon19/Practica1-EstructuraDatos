
package apuestas;


public class Apuesta {
   
    private String nombre = "";
    private double monto;
    private int[] orden;
    private int punteo;
    private boolean validacion;
    private String error;
    
    /**
     * Constructor de la clase Apuesta 
     * @param nombre El nombre del apostador
     * @param monto El monto que va a apostar
     * @param orden El orden de los caballos
     */
    public Apuesta(String nombre, double monto, int[] orden) {
        this.nombre = nombre;
        this.monto = monto;
        this.orden = orden;
    }
    /**
     * Constructor vacio
     */
    public Apuesta() {
    }
    /**
     * Devuelve la cadena que describe el error de la apuesta
     * @return El error
     */
    public String getError() {
        return error;
    }
    /**
     * Obtiene la cadena que describe el error de la apuesta 
     * @param error El error  
     */
    public void setError(String error) {
        this.error = error;
    }
    /**
     * Devuelve el punteo total obtenida por la apuesta
     * @return El puntoe de la apuesta
     */
    public int getPunteo() {
        return punteo;
    }
    /**
     * Obtiene el punteo total obtenida por la apuesta
     * @param punteo El punteo de la apuesta
     */
    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
    /**
     * Devuelve un parametro que determina si la apuesta es valida o no
     * @return La validacion de la apuesta
     */
    public boolean isValidacion() {
        return validacion;
    }
    /**
     * Obtiene un parametro que determina si la apuesta es valida o no
     * @param validacion La validacion de la apuesta
     */
    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }
    /**
     * Devuelve el nombre del apostador
     * @return El nombre del apostador
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene el nombre del apostador
     * @param nombre El nombre del apostador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve el monto apostado
     * @return El monto apostado 
     */
    public double getMonto() {
        return monto;
    }
    /**
     * Obtiene el monto apostado
     * @param monto El monto apostado 
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    /**
     * Devuelve el orden de llegada de los caballos
     * @return El orden de llegada de los caballos
     */
    public int[] getOrden() {
        return orden;
    }
    /**
     * Obtiene el orden de llegada de los caballos
     * @param orden El orden de llegada de los caballos
     */
    public void setOrden(int[] orden) {
        this.orden = orden;
    }
    /**
     * Aumenta el punteo de la apuesta
     * @param punteo El punteo que aumentara.
     */
    public void aumentarPunteo(int punteo){
        this.punteo += punteo;
    }
}
