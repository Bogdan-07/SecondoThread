/*
* Questa classe è il nostro primo thread e consentira la simulazione di un cavallo in corsa, parallelamente con altri della stessa specie
* @author Bogdan
* @version 1.0
 */
public class Cavallo extends Thread{
    private String name;
    private int lentezza;
    public Cavallo(String name, int lentezza){
        super();
        this.name = name;
        this.lentezza = lentezza;
    }

    public int getLentezza() {
        return lentezza;
    }

    public void setLentezza(int lentezza) {
        this.lentezza = lentezza;
    }

    @Override
    public void run() {
        System.out.println("Cavallo " + name + " comincia il suo galoppo");
        for (int i = 1; i <= 10; i++) {
            try {
                sleep(lentezza);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " cavalca - passo " + i);

        }
    }
}
