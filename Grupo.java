 public class Grupo
 {
     private String nombreMateria;
     private Estudiante[] estudiantes;
     
     public Grupo(int totalEstudiantes, String nombreMateria)
     {
         estudiantes = new Estudiante[totalEstudiantes];
         this.nombreMateria = nombreMateria;
     }
     
     /**
        Inscribe un estudiante nuevo en el grupo.
        @param unEstudiante Es el objeto estudiante a inscribir en el grupo
        @return Regresa verdadero(true) si el estudiante fue inscrito o falso(false) en caso de que no sea incrito
     **/
     public boolean inscribir(Estudiante unEstudiante)
     {   
         int existe = this.buscaEstudiante(unEstudiante.dimeClave());
         
         if(existe != -1)
         {
             return false; //El estudiante ya esta inscrito
         }
         
         int posDisponible =  this.buscaEspacioDisponible();
         
         if(posDisponible == -1)
         {
             return false; //El arreglo esta lleno
         }
         
         estudiantes[posDisponible] = unEstudiante;//Inscribe al estudiantes
         return true;//El estudiante fue inscrito
     }
     
     //TAREA
     public boolean darDeBaja(int claveEstudiante)
     {
         int existe = this.buscaEstudiante(claveEstudiante);
         
         if(existe != -1)
         {
             estudiantes[existe] = null;
             return true;
         }
         return false;
     }
     
     /**Busca un estudiante por medeio de su clave 
        la cavle del estudiante a buscar es un parametro "claveEstudiante"
        regresa la posicion del estudiante en el arreglo 0/1 si no esta
     **/
     public int buscaEstudiante(int claveEstudiante)
     {
         for(int i = 0; i < estudiantes.length; i++)
         {
             if(estudiantes[i] != null){
               if(estudiantes[i].dimeClave() == claveEstudiante)
               {
                 return i;
               }
            }
         }
         
         return -1;
     }
     
     /**
      *  busca un espacio disponible en el arreglo
      *  @return regresa l aprimer posicion null dentro del arreglo o -1 si esta lleno.
     **/
     private int buscaEspacioDisponible()
     {
          for(int i = 0; i < estudiantes.length; i++)
         {
             if(estudiantes[i] == null)
             {
                 return i;
             }    
         }
         return -1;
     }
 }
