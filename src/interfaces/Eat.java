package interfaces;

interface Father {
    void property();
}

interface Mother {
    void talent();
}


class Eat implements Father, Mother {

    @Override
    public void property() {
        System.out.println("Inherited property from Father");
    }

    @Override
    public void talent() {
        System.out.println("Inherited talent from Mother");
    }

    public static void main(String[] args) {
        Eat c = new Eat();
        c.property();
        c.talent();
    }
}