public class Estudiante
{
    private String nom;
    private int cla;
    
    public Estudiante(String nombre, int clave)
    {
        nom = nombre;
        cla = clave;
    }
    
    public String dimeDetalles()
    {
        return "Nombre: " + nom + ", Clave: " + cla;
    }
    
    public int dimeClave()
    {
        return cla;
    }
}
