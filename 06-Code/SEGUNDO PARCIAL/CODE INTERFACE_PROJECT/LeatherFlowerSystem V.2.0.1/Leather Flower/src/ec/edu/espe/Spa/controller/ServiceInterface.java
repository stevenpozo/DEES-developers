
package ec.edu.espe.Spa.controller;

/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public interface ServiceInterface {
    
    public boolean Email(String email);   
    public Boolean Validar_CampoHora(String Hora);    
    public int getInteger(String valor);
}
