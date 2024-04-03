import java.util.HashSet;
import java.util.ArrayList;
/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;
    
    public ShippingCompany(String name) {
        this.name = name != null ? name : "";
        inService = new ArrayList<Transport> ();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name != null)  {
             this.name = name;   
        }
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Transport t : this) {
            builder.append(t.toString());
        }
        return builder.toString();
    }
    
    public Transport getTransportation (String id) {
        for(Transport t:this) {
            if(t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }
    
    public void makeTransportation(String id, String origin, String destination, double price) {
        if(id == null) return;
        
        Transport t = getTransportation(id);
        
        if(t!= null && t.isAvailable()) {
            t.setOrigin(origin);
                t.setDestination(destination);
                t.setPrice(price);
                inService.add(t);
                this.remove(t);
        }
    }
    
    
}
