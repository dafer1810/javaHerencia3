
package herenciajava;

public class HerenciaJava {
    
    public static void main (String [] args){
        //Crear objeto de la Clase Padre
        Humano adulto= new Humano();
        adulto.setNombre("Freddy");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        
        System.out.println();
        
        //Crear objeto de la Clase Hija
        Hombre padre=new Hombre();
        padre.setNombre("Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        System.out.println();
        
        //Crear objeto de la Clase Hija ->Mujer
        Mujer madre=new Mujer();
        madre.setNombre("Fernanda");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
        
        
        
        
        
        
    }
    
}
