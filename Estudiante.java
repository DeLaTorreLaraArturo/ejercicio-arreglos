/**
 * @author Arturo De La Torre Lara
 * @version 30 deAgosto del 2017
 */
public class Estudiante
{
    private String nom;
    private String apell;
    private int cla;
    
    public Estudiante(String nombre, String apellido, int clave)
    {
        nom = nombre;
        apell = apellido;
        cla = clave;
    }
    
    /**
     * @return Regresa el nombre y la clave del alumno
    **/
    public String dimeDetalles()
    {
        return "Nombre: " + nom + ", Clave: " + cla;
    }
    
    /**
     * @return Regresa solamente la clave del alumno
    **/
    public int dimeClave()
    {
        return cla;
    }
    
    /**
     * @return Regresa solament el nombre del alumno
     */
    public String dimeNombre()
    {
        return nom;
    }
    
    /**
     * @return Regresa solamente el apellido del alumno
     */
    public String dimeApellido()
    {
        return apell;
    }
}
