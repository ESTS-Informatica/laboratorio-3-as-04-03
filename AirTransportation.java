
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private static final double fee = 0.04;
    
    private String name;
    private int numberOfContainers;
    
    public AirTransportation() {
        super();
        setFees(fee);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name != null ? name : "";
    }
    
    public int getNumberOfContainers() {
        return numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers > 0 ? numberOfContainers : 0;
    }
}
