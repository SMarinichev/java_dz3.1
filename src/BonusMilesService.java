public class BonusMilesService {
    public int calculate(int ticketPrice, int bonusMiles) {

        int bonus = ticketPrice / bonusMiles;
        return bonus;
    }
}
