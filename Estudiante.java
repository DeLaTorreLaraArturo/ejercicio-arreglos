public class Estudiante
{
    private String nom;
    private int cla;
    
    public Estudiante(String nombre, int clave)
    {
        nom = nombre;
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
}
