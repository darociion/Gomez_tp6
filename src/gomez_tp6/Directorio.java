package gomez_tp6;

import java.util.*;

/**
 *
 * @author jon gomez
 */
public class Directorio {
    private Map<Long, Cliente> guiaTelefonica;

    public Directorio() {
        this.guiaTelefonica = new TreeMap<>();
    }

    public Map<Long, Cliente> getGuiaTelefonica() {
        return guiaTelefonica;
    }

    public void setGuiaTelefonica(Map<Long, Cliente> guiaTelefonica) {
        this.guiaTelefonica = guiaTelefonica;
    }
    
    public boolean agregarCliente(long telefono, Cliente cliente) {
        if(!this.guiaTelefonica.containsKey(telefono)){
            this.guiaTelefonica.put(telefono, cliente);
            return true;
        }
        else
            return false;
    }
    
    public Cliente buscarCliente(long telefono){
        return (this.guiaTelefonica.containsKey(telefono))?this.guiaTelefonica.get(telefono):null;
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        HashSet<Long> listaTelefonos = new HashSet<>();
        
        this.guiaTelefonica.entrySet().forEach(guia -> {
            Cliente c = guia.getValue();
            if(c.getApellido().equals(apellido)){
                listaTelefonos.add(guia.getKey());
            }
        });
        
        return listaTelefonos;
    }
    
    public Set<Cliente> buscarClientes(String ciudad) {
        HashSet<Cliente> listClientes = new HashSet<>();
        Collection clientes = this.guiaTelefonica.values();
        Iterator it = clientes.iterator();
        
        while(it.hasNext()){
            Cliente c = (Cliente)it.next();
            if(c.getCiudad().equals(ciudad)) {
                listClientes.add(c);
            }
        }
        
        return listClientes;
    }
    
    public void borrarCliente(long dni) {
        Collection clientes = this.guiaTelefonica.values();
        Iterator it = clientes.iterator();
        
        while(it.hasNext()){
            Cliente c = (Cliente)it.next();
            if(c.getDni() == dni){
                it.remove();
            }
        }
    }
}
