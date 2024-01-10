package lab4;

public class Dog {
    private String nume;
    private String rasă;

    public Dog(String nume, String rasă) {
        this.nume = nume;
        this.rasă = rasă;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setRasă(String rasă) {
        this.rasă = rasă;
    }

    public String getNume() {
        return nume;
    }

    public String getRasă() {
        return rasă;
    }

    public static void main(String[] args) {

        Dog câine1 = new Dog("Max", "Labrador");
        Dog câine2 = new Dog("Rex", "Ciobănesc german");

        System.out.println("Câinele 1: " + câine1.getNume() + " (" + câine1.getRasă() + ")");
        System.out.println("Câinele 2: " + câine2.getNume() + " (" + câine2.getRasă() + ")");


        câine1.setNume("Rocky");
        câine2.setRasă("Hybrid");

        System.out.println("După actualizare:");
        System.out.println("Câinele 1: " + câine1.getNume() + " (" + câine1.getRasă() + ")");
        System.out.println("Câinele 2: " + câine2.getNume() + " (" + câine2.getRasă() + ")");
    }
}
