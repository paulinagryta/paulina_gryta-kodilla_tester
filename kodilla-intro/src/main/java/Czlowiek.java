public class Czlowiek {

    String name;
    double age;
    double height;

    public Czlowiek(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void checkWymiary() {
        if(this.name !=null)
            if (this.age > 30 && this.height > 160) {
            System.out.println(this.name + "  is older than 30 and higher than 160cm");
        } else {
            System.out.println(this.name + "  is 30 (or younger) or 160cm (or shorter)");
        }
    }

    }
