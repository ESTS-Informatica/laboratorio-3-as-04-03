
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Main
{
    public static void Main(String [] args) {
        ShippingCompany sc = new ShippingCompany("RELIABLE-MOVING");
        sc.add(new GroundTransportation("XX-AA-BB"));
        sc.add(new AirTransportation("Avião Balistico", 3));
        sc.add(new AirTransportation("Avião Normal", 51));
        sc.add(new Lorry(21, 2, "FF-54-XP"));
        sc.add(new Van(10 ,"DG-K8-C9"));
        System.out.println(sc.toString());
    }
}
