
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    private int packages;
    
    public Van(int packages, String licensePlate) {
        super();
        this.packages = packages > 0 ? packages : 0;
        setLicensePlate(licensePlate);
    }
    
    public int getNumberOfPackages() {
        return packages;
    }
    
    public void setNumberOfPackages(int packages) {
        this.packages = packages > 0 ? packages : 0;
    }
    
    @Override
    public String toString () {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(String.format("Numero de Pacotes: %s\n",getNumberOfPackages()));
        return builder.toString();
    }
}
