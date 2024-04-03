
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private static final double FEE = 3.0;
    private String licensePlate;
    
    public GroundTransportation() {
        super();
        setFees(FEE);
    }
    
     public GroundTransportation(String licensePlate) {
        this();
        setLicensePlate(licensePlate);
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate != null ? licensePlate : "";
    }
    
    @Override
    public double getPriceWithFees() {     
        return getPrice() * (1.0 + (this.getFees() * 0.01));
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(String.format("Matricula: %s\n", getLicensePlate()));
        return builder.toString();
    }
}
