public class MadhavaApproximationOfPi
{
    public static double MadhavaApproximationOfPiSeries(int numberOfTerms)
    {
        double MadhavaApproximationOfPi = 0.0;
        for(int i = 1; i <= numberOfTerms; i++)
        {
            double numerator = Math.pow(-1, (i-1));
            int denominator = (2 * i) -1;
            MadhavaApproximationOfPi += numerator/denominator;
        }
        return MadhavaApproximationOfPi * 4.0;
    }

    public static void main(String[] args)
    {
        System.out.println("Madhava's Approximation Of Pi");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("The Madhava–Leibniz series approximation for pi was originally discovered by Indian mathematician Madhava of Sangamagrama in the 14th–15th century, later independently rediscovered by mathematicians James Gregory in 1671 and Gottfried Wilhelm Leibniz in 1673.");
        System.out.println("The series approximation is represented by the quotient of raising -1 to one less than the index 'nth' power, dividing it by 1 subtracted from the product of 2 times n.");
        System.out.println("This series approximation represents one-fourth of pi.");
        System.out.println("In ASCII art...");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                                                                         ..                           ");
        System.out.println("                                                       **                              .//,                            ,,(@/.                         ");
        System.out.println("                 (@@(%&(./&(,/@(.                   ./#*                      .,/%(.     ,((    ((#@@@&@,                *@/.                         ");
        System.out.println("                 (%   .*%%*   .&*                  ./%.                      ..,(@#.      ,(#,   *((../&,  ,,,,,,,,,,.   *@/.                         ");
        System.out.println("                 ./%#((,.*(%##(,                   /#/                         ./&#.      .*@*   (#. *###*             ,*(@(*,                        ");
        System.out.println("                                                   (#*     .,,,,,,,,,,,,,,.    ./&#.       .&(,  ..                                                   ");
        System.out.println("         ,***************************,             (#,     .,,,,,.........     .*&#.       .&(,                                                       ");
        System.out.println("         ,(@@@#.              .,*(#&@%*            *(/                       ..,/&#*,.    .*@/.                                                       ");
        System.out.println("           ,%@@@(,                   ,&,           .(&.                      ,.     .,.   ,(#,                                                        ");
        System.out.println("             *%@@&(                                 .*&*                                 *#(                                                          ");
        System.out.println("              ./&@@&/.                                .,,                               ,,.                                                           ");
        System.out.println("                ./&@@#*                                                                                                                               ");
        System.out.println("                  ,(@@@(,                      ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.                   ");
        System.out.println("                    *%&(.                      ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.                   ");
        System.out.println("                  .*%/.                                                                                                                               ");
        System.out.println("                 (%/.                                       .*/*.                                                  **.                                ");
        System.out.println("              .(#*                    ,/,                 #(,  *%@/.                                           ***/@(.                                ");
        System.out.println("            ,##,                   .*##.                 .((*  ./@(, .*/* ,/(*,                                  .*@(.                                ");
        System.out.println("         .*#&#(//////////((((###%%&@@%.                       .(&%,.,%/(@#*. /%(                                 .*@(.                                ");
        System.out.println("         *//////////////////////////*,                      .(#/,.,.  *#%.  .##*        .*////////////*.         .*@(.                                ");
        System.out.println("                                                          .#%,,,,/*,  #%*  ,(%**%*.                              .*@/.                                ");
        System.out.println("                                ,(&@(.                   ,(#######,  ,(/    ,#&#,                              ,(%&&&&%/.                             ");
        System.out.println("          ,((&@@%*                .&(.                                                                                                                ");
        System.out.println("         .*/#*..&/  ...........   .&(.                                                                                                                ");
        System.out.println("          *%, ,(*// ...........   .&(.                                                                                                                ");
        System.out.println("          .,   .,.              .,,,,,,                                                                                                               ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Listed below are partial summations of the Madhava–Leibniz series approximation for pi (multiplying calculated results of one-fourth of pi by four) by the number of terms in the series:");
        System.out.println();
        for(int i = 0; i <= 100000; i += 100)
        {
            System.out.println("Approximation of pi using " + i + " terms in the series: " + MadhavaApproximationOfPiSeries(i));
        }

    }
}
