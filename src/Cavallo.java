/*
* Questa classe è il nostro primo thread e consentira la simulazione di un cavallo in corsa, parallelamente con altri della stessa specie
* @author Bogdan
* @version 1.0
 */
public class Cavallo extends Thread{
    private String name;
    private int distanza;
    int incremento = 5;
    public Cavallo(String name, int distanza){
        super();
        this.name = name;
        this.distanza = distanza;
    }

    public int getDistanza() {
        return distanza;
    }

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }

    @Override
    public void run() {
        System.out.println("Cavallo " + name + " comincia il suo galoppo");
        for (int i = 1; i <= distanza; i+=incremento) {
            if (distanza - i < 5 && distanza - i != 0){
                incremento = distanza-i;
            }
            System.out.println(name + " cavalca - passo " + i);
        }
    }
}