public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int result = service.calculate(666,20);
        System.out.println("Начислено миль: " + result);


    }
}