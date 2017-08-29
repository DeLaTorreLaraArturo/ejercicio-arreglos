 public class Grupo
 {
     private String nombreMateria;
     private Estudiante[] estudiantes;
     
     public Grupo(int totalEstudiantes, String nombreMateria)
     {
         estudiantes = new Estudiante[totalEstudiantes];
         this.nombreMateria = nombreMateria;
     }
     
     public void inscribir(Estudiante unEstudiante)
     {
         for(int i = 0; i < estudiantes.length; i++)
         {
             if(estudiantes[i] == null)
             {
                 estudiantes[i] = unEstudiante;
                 i = estudiantes.length;
             }    
         }
     }
 
     public void imprimeEstudiates()
     {
         for(int i = 0; i < estudiantes.length; i++)
         {
             if(estudiantes[i] != null)
             {
                 System.out.println(estudiantes[i].dimeDetalles());
             }
         }
     }
     
     //TAREA
     public void darDeBaja(int claveEstudiante)
     {
         //buscar el estudiante con la clave 
         //Asignar null
         for(int i = 0; i < estudiantes.length; i++)
         {
           if(estudiantes[i].dimeClave() == claveEstudiante)
           {
               estudiantes[i] = null;
               i = estudiantes.length;
           }
         }
         
     }
 }
