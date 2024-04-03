
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private static final double fee = 0.03;
    private String licensePlate;
    
    public GroundTransportation() {
        super();
        setFees(fee);
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate != null ? licensePlate : "";
    }
}
