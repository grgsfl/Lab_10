package Lab_10;

interface aAnimal {
    public boolean run(double runDistance);
    public boolean swim(double swimDistance);
    public boolean jump(double jumpDistance);

}
public abstract class Animal implements aAnimal{
    String name;
    double runPredel;
    double swimPredel;
    double jumpPredel;

    public Animal(String name, double runPredel, double swimPredel, double jumpPredel) {
        this.name = name;
        this.runPredel = runPredel;
        this.swimPredel = swimPredel;
        this.jumpPredel = jumpPredel;
    }

    @Override
    public boolean run(double runDistance) {
        return runDistance <= runPredel;
    }

    @Override
    public boolean swim(double swimDistance) {
        return swimDistance <= swimPredel;
    }

    @Override
    public boolean jump(double jumpDistance) {
        return jumpDistance <= jumpPredel;
    }
}
