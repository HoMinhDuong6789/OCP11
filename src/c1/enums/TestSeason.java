package c1.enums;

enum Season {
    WINTER, SPRING, SUMMER, FAIL;
}

public class TestSeason {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s);
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);

        // Get an array of all of the values
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        // Other way to get enum
        Season s1 = Season.valueOf("WINTER");
        try {
            Season s2 = Season.valueOf("ABC");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Enum in switch
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
//            case Season.FAIL:
//                System.out.println("Time for school");
//                break;
//            case 0:
//                System.out.println("Get out the sled!");
//                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
}
