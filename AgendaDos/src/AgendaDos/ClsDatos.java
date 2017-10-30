
package AgendaDos;

public class ClsDatos {
    /*Declaramos tres variables del tipo objeto ClsContacto las cuales van a 
    trabajar como apuntadores donde cola va a ser el ultimo objeto, inicial el primero
    y temp va a tener la informacion intermedia almacenada en memoria*/
   ClsContacto ObjetoInicial;
   ClsContacto ObjetoCola;
   ClsContacto ObjetoTemp;
   
   public ClsContacto llenarObjeto(String nombre, String apellido, String telefono, 
           ClsContacto anterior){
       /*Lo primero para llenar el objeto es pasarle por parametros los datos mas 
        un parametro de tipo Contacto que sera el objeto anterior*/
       ClsContacto Temp = new ClsContacto();
       /*Seguido declaro un objeto temporal el cual llenaremos con la informacion*/
       Temp.setNombre(nombre);
       Temp.setApellido(apellido);
       Temp.setTelefono(telefono);
       Temp.setAnterior(anterior);
       Temp.setSiguiente(null);
       /*llenamos el objeto temporal con los datos donde setSiguientete se va a 
        llenar siempre con el proximo contacto o sea null y setAnterior va a ser 
        siempre el anterior*/
       return Temp;
       /*por ultimo regresamos el objeto temp*/
   }
   public void guardar(String nombre, String apellido, String telefono){
       /*llenamos el objeto con los parametros solicitados en el form y luego 
        hacemos al validacion correspondiente*/
       if(ObjetoInicial==null){
           ObjetoInicial = llenarObjeto(nombre, apellido, telefono, null);
           ObjetoCola = ObjetoInicial;
           ObjetoTemp = ObjetoInicial;
           /*Si objetoInicial no existe lo que hacemos es que lo creamos con los
            datos de llenarObjeto el cual de indicamos a este que jale la informacion
            luego le decimos a objetoCola y a objetoTemp que sean iguales a ObjetoInicial
            esto para que existan dos copias identicas del objeto inicial.*/
       }else{
          ObjetoCola.setSiguiente(llenarObjeto(nombre, apellido, telefono, ObjetoCola));
          ObjetoCola = ObjetoCola.getSiguiente();
          /*Si el objetoInicial no es nulo o vacio, entonces le decimos que a
            ObjetoCola se le van a pasar los parametros de llenarObjeto mas el propio
            objetoCola y luego le vamos a pasar objetoCola a ObjetoCola para que sea 
            el objetoCola*/
       }
   }
   public ClsContacto siguinte(){
       if(ObjetoTemp.getSiguiente()==null){
           return ObjetoTemp;
       }else{
           ObjetoTemp = ObjetoTemp.getSiguiente();
           return ObjetoTemp;
       }
       /*aqui decimos que si objetoTemp.getSiguiente()==null o sea que si esta vacio
        regrese el objetoTemp y este objetoTemp que regresa es la copia del primer elemento
        que almacenamos en guardar, pero si no esta vacio entonces que nos devuelva
        lo que hay dentro del mismo*/
   }
   public ClsContacto anterior(){
       if(ObjetoTemp.getAnterior()==null){
           return ObjetoTemp;
       }else{
           ObjetoTemp = ObjetoTemp.getAnterior();
           return ObjetoTemp;
       }
       /*aqui decimos que si objetoTemp.getAnterior()==null o sea que si esta vacio
        regrese el objetoTemp y este objetoTemp que regresa es la copia del primer elemento
        que almacenamos en guardar, pero si no esta vacio entonces que nos devuelva
        lo que hay dentro del mismo*/
   }
   public ClsContacto primero(){
       return ObjetoInicial;
       /*Aqui le indicamos al primer objeto que va a devolver lo que este en 
        objetoInicial como el la primera informacion del form.*/
   }
   public ClsContacto utimo(){
       return ObjetoCola;
       /*Aqui le indicamos al ultimo objeto que va a devolver lo que este en 
        objetoCola como ultima informacion en el form.*/
   }
   
}
