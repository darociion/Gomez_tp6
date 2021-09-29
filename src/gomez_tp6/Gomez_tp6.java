package gomez_tp6;

/**
 *
 * @author jon gomez
 */
public class Gomez_tp6 {

    public static void main(String[] args) {
        //Creo a 5 clientes
        Cliente c1 = new Cliente(20111222,"Juan","Perez","Villa Mercedes","Buenos Aires 160");
        Cliente c2 = new Cliente(20222333,"Roberto","Guzman","San Luis","Las Heras 1890");
        Cliente c3 = new Cliente(20333444,"Esteban","Aguero","Villa Mercedes","Lavalle 2050");
        Cliente c4 = new Cliente(20444555,"Esteban","Fernandez","San Luis","Mitre 572");
        Cliente c5 = new Cliente(20555666,"Armando","Barreda","Merlo","Poeta Aguero 75");
        
        //Creo un Directorio
        Directorio d = new Directorio();
        
        //Agrego los clientes al directorio
        d.agregarCliente(265700000, c1);
        d.agregarCliente(266400000, c2);
        d.agregarCliente(266400001, c2);
        d.agregarCliente(265700001, c3);
        d.agregarCliente(266400003, c4);
        d.agregarCliente(266400002, c5);
        
        //Busco un cliente por numero de telefono
        System.out.println(d.buscarCliente(265700000));
        
        //Busco a todos los clientes que sean de San Luis
        System.out.println(d.buscarClientes("San Luis"));
        
        //Borro un cliente ingresando su DNI
        d.borrarCliente(20111222);
        //Compruebo que el cliente ya no existe en el directorio
        System.out.println(d.buscarCliente(265700000));
        
        //Busco los numeros de telefonos que pertenezcan al siguiente apellido
        System.out.println(d.buscarTelefono("Guzman"));
    }
    
}
