package a1_2201040080;

import java.util.Arrays;
import java.util.Random;

/**
 * @overview A program that performs the coffee tin game on a
 *           tin of beans and display result on the standard output.
 *
 */
public class CoffeeTinGame {
    /** constant value for the green bean */
    private static final char GREEN = 'G';
    /** constant value for the blue bean */
    private static final char BLUE = 'B';
    /** constant for removed beans */
    private static final char REMOVED = '-';
    /** the null character */
    private static final char NULL = '\u0000';

    /**
     * the main procedure
     * 
     * @effects
     *          initialise a coffee tin
     *          {@link TextIO#putf(String, Object...)}: print the tin content
     *          {@link @tinGame(char[])}: perform the coffee tin game on tin
     *          {@link TextIO#putf(String, Object...)}: print the tin content again
     *          if last bean is correct
     *          {@link TextIO#putf(String, Object...)}: print its colour
     *          else
     *          {@link TextIO#putf(String, Object...)}: print an error message
     */
    public static void main(String[] args) {
        // initialise some beans
        char[][] tins = {
                { BLUE, BLUE, BLUE, GREEN, GREEN },
                { BLUE, BLUE, BLUE, GREEN, GREEN, GREEN },
                { GREEN },
                { BLUE },
                { BLUE, GREEN }
        };

        for (int i = 0; i < tins.length; i++) {
            char[] tin = tins[i];

            // expected last bean
            // p0 = green parity /\
            // (p0=1 -> last=GREEN) /\ (p0=0 -> last=BLUE)
            // count number of greens
            int greens = 0;
            for (char bean : tin) {
                if (bean == GREEN)
                    greens++;
            }
            // expected last bean
            final char last = (greens % 2 == 1) ? GREEN : BLUE;

            // print the content of tin before the game
            System.out.printf("%nTIN (%d Gs): %s %n", greens, Arrays.toString(tin));

            // perform the game
            // get actual last bean
            char lastBean = tinGame(tin);
            // lastBean = last \/ lastBean != last

            // print the content of tin and last bean
            System.out.printf("tin after: %s %n", Arrays.toString(tin));

            // check if last bean as expected and print
            if (lastBean == last) {
                System.out.printf("last bean: %c%n", lastBean);
            } else {
                System.out.printf("Oops, wrong last bean: %c (expected: %c)%n", lastBean, last);
            }
        }
    }

    /**
     * Performs the coffee tin game to determine the colour of the last bean
     *
     * @requires tin is not null /\ tin.length > 0
     * @modifies tin
     * @effects
     * 
     *          <pre>
     *   take out two beans from tin
     *   if same colour
     *     throw both away, put one blue bean back
     *   else
     *     put green bean back
     *   let p0 = initial number of green beans
     *   if p0 = 1
     *     result = `G'
     *   else
     *     result = `B'
     *          </pre>
     */

     public static final char[] BeansBag = BeansBag();
     private static char[] BeansBag() {
         int totalLength = 30;
         char[] bag = new char[totalLength];
         int blueAndGreenBeans = totalLength / 3;
 
         for (int i = 0; i < totalLength; i++) {
             if (i < blueAndGreenBeans) {
                 bag[i] = BLUE;
             } else if (i < 2 * blueAndGreenBeans) {
                 bag[i] = GREEN;
             } else {
                 bag[i] = REMOVED;
             }
         }
         return bag;
     }
     

    public static int randInt(int n) {
        if (n <= 0) {
            System.out.println("Your input must be a positive integer");
            return -1;
        } else {
            Random randomBag = new Random();
            return randomBag.nextInt(n);
        }
    }

    public static char tinGame(char[] tin) {
        while (hasAtLeastTwoBeans(tin)) {
            char[] twoBeans = takeTwo(tin);
            char b1 = twoBeans[0];
            char b2 = twoBeans[1];
            updateTin(tin, b1, b2);
        }
        return anyBean(tin);
    }

    /**
     * @effects
     *          if tin has at least two beans
     *          return true
     *          else
     *          return false
     */
    public static boolean hasAtLeastTwoBeans(char[] tin) {
        int count = 0;
        for (char bean : tin) {
            if (bean != REMOVED) {
                count++;
            }

            if (count >= 2) // enough beans
                return true;
        }

        // not enough beans
        return false;
    }

    /**
     * @requires tin has at least 2 beans left
     * @modifies tin
     * @effects
     *          remove any two beans from tin and return them
     */
    private static char[] takeTwo(char[] tin) {
        char first = takeOne(tin);
        char second = takeOne(tin);

        return new char[] { first, second };
    }

    /**
     * @requires tin has at least one bean
     * @modifies tin
     * @effects
     *          remove any bean from tin and return it
     */

    public static char takeOne(char[] tin) {
        int count = 0;
        char bean;
        for (int i = 0; i < tin.length; i++) {
            if (tin[i] != REMOVED)
                count++;
        }
        if (count >= 1) {
            while (true) {
                int i = randInt(tin.length);
                bean = tin[i];
                if (bean != REMOVED) {
                    tin[i] = REMOVED;
                    return bean;
                }
            }
        }
        return '\0';
    }

    /**
     * @requires beansBag is not null /\ beansBag.length > 0
     * @modifies beansBag
     * @effects
     *          if there are beans of beanType in beansBag
     *          return any such bean
     *          else
     *          return '\u0000' (null character)
     */
    public static char getBean(char[] beansBag, char beanType) {
        int index = randInt(beansBag.length);
        char bean = beansBag[index];
        while (bean != beanType) {
            index = randInt(beansBag.length);
            bean = beansBag[index];
        }
        beansBag[index] = REMOVED;
        return bean;
    }

    /**
     * Procedure updateTin: performs lines 3-8, which takes as input the tin and two
     * beans and
     * updates tin accordingly. In addition, this procedure must use getBean to
     * obtain a desired
     * bean from BeansBag.
     * 
     * @param tin the tin of beans
     */
    public static void updateTin(char[] tin, char beanOne, char beanTwo) {
        if (beanOne == beanTwo) {
            char expectedBean = BLUE;
            putIn(tin, getBean(BeansBag, expectedBean));
        } else {
            char expectedBean = GREEN;
            putIn(tin, expectedBean);
        }
    }

    /**
     * @requires tin has vacant positions for new beans
     * @modifies tin
     * @effects
     *          place bean into any vacant position in tin
     */
    private static void putIn(char[] tin, char bean) {
        for (int i = 0; i < tin.length; i++) {
            if (tin[i] == REMOVED) {
                tin[i] = bean;
                break;
            }
        }
    }

    /**
     * @effects
     *          if there are beans in tin
     *          return any such bean
     *          else
     *          return '\u0000' (null character)
     */
    private static char anyBean(char[] tin) {
        for (char bean : tin) {
            if (bean != REMOVED) {
                return bean;
            }
        }
        return NULL;
    }
}
