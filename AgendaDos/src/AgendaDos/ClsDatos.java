
package AgendaDos;

public class ClsDatos {
   ClsContacto ObjetoInicial;
   ClsContacto ObjetoCola;
   ClsContacto ObjetoTemp;
   
   public ClsContacto llenarObjeto(String nombre, String apellido, String telefono, 
           ClsContacto anterior){
       
       ClsContacto Temp = new ClsContacto();
       
       Temp.setNombre(nombre);
       Temp.setApellido(apellido);
       Temp.setTelefono(telefono);
       Temp.setAnterior(anterior);
       Temp.setSiguiente(null);
       
       return Temp;
   }
   public void guardar(String nombre, String apellido, String telefono){
       if(ObjetoInicial==null){
           ObjetoInicial = llenarObjeto(nombre, apellido, telefono, null);
           ObjetoCola = ObjetoInicial;
           ObjetoTemp = ObjetoInicial;
       }else{
          ObjetoCola.setSiguiente(llenarObjeto(nombre, apellido, telefono, ObjetoCola));
          ObjetoCola = ObjetoCola.getSiguiente();
       }
   }
   public ClsContacto siguinte(){
       if(ObjetoTemp.getSiguiente()==null){
           return ObjetoTemp;
       }else{
           ObjetoTemp = ObjetoTemp.getSiguiente();
           return ObjetoTemp;
       }
   }
   public ClsContacto anterior(){
       if(ObjetoTemp.getAnterior()==null){
           return ObjetoTemp;
       }else{
           ObjetoTemp = ObjetoTemp.getAnterior();
           return ObjetoTemp;
       }
   }
   public ClsContacto primero(){
       return ObjetoInicial;
   }
   public ClsContacto utimo(){
       return ObjetoCola;
   }
   
}
