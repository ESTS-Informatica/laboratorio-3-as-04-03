
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPallets, int trailers, String licensePlate) {
        super();
        this.numberOfPallets = numberOfPallets > 0 ? numberOfPallets : 0;
        this.trailers = trailers > 0 ? trailers : 0;
        setLicensePlate(licensePlate);
    }
    
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets > 0 ? numberOfPallets : 0;
    }
    
    public int getNumberOfTrailers(){
        return trailers;
    }
    
    public void setNumberOfTrailers(int trailers){
        this.trailers = trailers > 0 ? trailers : 0;
    }
    
    @Override
    public String toString () {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(String.format("Numero de Paletes: %s\n",getNumberOfPallets()));
        builder.append(String.format("Numero de Trailers: %s\n",getNumberOfTrailers()));
        return builder.toString();
    }
}
