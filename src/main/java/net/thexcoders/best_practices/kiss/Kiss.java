package net.thexcoders.best_practices.kiss;

public class Kiss {

    static class WeekDays{
        private static final String[] days = new String[]
                {"Lun", "Mar", "Mer", "Jeu", "Ven", "Sam", "Dim"};

        public static String weekDays(int day) {
            if (day < 1 || day > 7) {
                return null;
            }
            return days[day - 1];
        }
    }


}
