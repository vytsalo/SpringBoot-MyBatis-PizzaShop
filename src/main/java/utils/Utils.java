package utils;

import entities.Person;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by vasilevvs on 20.03.2020.
 */
public class Utils {

    public final String names[]={"","","","","",""};

    //or in every method use the getRandomFullNamPart
    public static String getRandomName() {
        //String names[]={"","","","","",""};
        String names[] = {"Arnold", "Gerald", "Harold",
                "Helga", "Bob", "Lila"};

        return names[new Random().nextInt(names.length - 1)];
    }

    public static String getRandomSurname() {
        //String names[]={"","","","","",""};
        String adjectiveSurnames[] = {"Stinky", "Enormous", "Striped",
                "Colorful", "Bright", "Wild"};

        return adjectiveSurnames[new Random().nextInt(adjectiveSurnames.length - 1)];
    }

    //getRandomFullNameParts(array[of strings]) where to random
    public static String getRandomPatronymic() {
        //String names[]={"","","","","",""};
        String vegetablePatronymics[] = {"Tomato", "Potato", "Cucumber",
                "Corn", "Onion", "Cabbage"};

        return vegetablePatronymics[new Random().nextInt(vegetablePatronymics.length - 1)];
    }

    //поправить
    public static Date getRandomDate() {

        Calendar startCalendar = new GregorianCalendar(1950,0,0);
        Date startDate =  startCalendar.getTime();

        Calendar endCalendar = new GregorianCalendar(2000,11,31);
        Date endDate =  endCalendar.getTime();

        return getDateBetween(startDate,endDate);
    }

    public static String getRandomPhone() {

        return "8(9" + (new Random().nextInt(89) + 10) + ") "
                + (new Random().nextInt(899) + 100) + "-"
                + (new Random().nextInt(8999) + 1000);

    }

    public static String getRandomEmail() {
        return "randomEmail";
    }

    public static Person fillRandomRecord(Person p){
        p.setName(getRandomName());
        p.setSurname(getRandomSurname());
        p.setPatronymic(getRandomPatronymic());
        p.setDateOfBirth(getRandomDate());
        p.setPhone(getRandomPhone());
        p.setEmail(getRandomEmail());
        return p;
    }

    public static String getFormattedDate(Date date){
        return new SimpleDateFormat("dd.MM.YYYY").format(date);
    }

    public static Date getDateBetween(Date startDate, Date endDate) {
        long startMillis = startDate.getTime();
        long endMillis = endDate.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }


}