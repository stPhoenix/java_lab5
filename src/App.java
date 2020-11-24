import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        City kharkiv = new City("Kharkiv", 1000000);
        kharkiv.addInfo(kharkiv.new Infrastructure("maydan Nezaleznosti", 100));
        kharkiv.addInfo(kharkiv.new Infrastructure("vulyca Khmelnitskogo", 50));
        kharkiv.addInfo(kharkiv.new Infrastructure("prospect Konstitucii", 99));

        System.out.println("City: "+kharkiv.getName());
        System.out.println("Population: "+kharkiv.getPopulation());
        System.out.println("Infrastructure: "+Arrays.toString(kharkiv.getInfo()));


    }
}
