package net.thexcoders.best_practices.kiss;

public class NoKiss {

    // picking the hard way and sophisticating the use of the functions when it can be simplified

    public static String weekDays(int day) {
        switch (day) {
            case 1:
                return "Lun";
            case 2:
                return "Mar";
            case 3:
                return "Mer";
            case 4:
                return "Jeu";
            case 5:
                return "Ven";
            case 6:
                return "Sam";
            case 7:
                return "Dim";
            default:
                return null;
        }
    }
}
