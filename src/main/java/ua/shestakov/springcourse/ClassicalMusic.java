package ua.shestakov.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){};

    public static  ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    };
    @Override
    public String getSong() {
        return "bohemian rapsody";
    }
    public void doMyInit(){
        System.out.println("Do My initialization");
    }

    public void doMyDestroy(){
        System.out.println("Do My destraction");
    }

}
