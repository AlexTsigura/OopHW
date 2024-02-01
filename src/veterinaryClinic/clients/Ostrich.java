package veterinaryClinic.clients;



import java.time.LocalDate;



public class Ostrich extends Animal implements Goable{
    public Ostrich(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Ostrich(){
        super();
    }
    @Override
    public void eat() {
        System.out.println("Страус ест");
    }
    @Override
    public String getType() {
        return "Ostrich";
    }

    @Override
    public void go() {
        System.out.println(this.getType() + " " + this.getNickName() + " идет");
    }

    @Override
    public double getRunSpeed() {
        return 50;
    }
}

