package commonpage.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateUtil {

    static Logger log = LogManager.getLogger(DateUtil.class.getName());

    /**
     * Description:This method is to get the Current System Date and Time
     * @param strFormat
     * @return CurrentSystemDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getCurrentDate(String strFormat) {
        String CurrentSystemDate="";
        try {
            DateFormat dateFormat = new SimpleDateFormat(strFormat);
            Date date = new Date();
            CurrentSystemDate =dateFormat.format(date);
        } catch (Exception e) {
            log.error(e);
            System.out.println("getCurrentDate" + e.getMessage());
        }
        System.out.println("getCurrentDate value is: "+CurrentSystemDate);
        return CurrentSystemDate;
    }

    /**
     * Description:This method is to get the Next Month Date from Current System Date and Time
     * @param strFormat
     * @return strNextMonthDateFromCurrent
     * Author Name:Bhaanu Reaka Balachandran
     * Date of Development:20-Sep-2019
     */
    public static String getNextMonthCurrentDate(String strFormat) {
        String strNextMonthDateFromCurrent="";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
            //Getting current date
            Calendar cal = Calendar.getInstance();
            //Displaying current date in the desired format
            System.out.println("getNextMonthCurrentDate Current Date: "+sdf.format(cal.getTime()));
            //Number of Days to add
            cal.add(Calendar.DAY_OF_MONTH, 30);
            //Date after adding the days to the current date
            strNextMonthDateFromCurrent = sdf.format(cal.getTime());
            //Displaying the new Date after addition of Days to current date
            System.out.println("Date after Addition: "+strNextMonthDateFromCurrent);
        } catch (Exception e) {
            log.error(e);
            System.out.println("getNextMonthCurrentDate" + e.getMessage());
        }
        System.out.println("getNextMonthCurrentDate value is: "+strNextMonthDateFromCurrent);
        return strNextMonthDateFromCurrent;
    }

    /**
     * Description:This method is to get the next month and next day value from the Current System Date and Time in a specified Format
     * @return ranNum
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getCurrentDateTime() {
        String ranNum = "";
        DateFormat formatter = new SimpleDateFormat("MMM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) + 1);
        try {
            ranNum = "_" + dformatter.format(dateParse.parse(date))
                    + formatter.format(monthParse.parse(month)) + "_"
                    + Integer.toString(cal.get(Calendar.HOUR_OF_DAY))
                    + Integer.toString(cal.get(Calendar.MINUTE));
        } catch (Exception e) {
            log.error(e);
            System.out.println("getCurrentDateTime" + e.getMessage());
        }
        return ranNum;
    }

    /**
     * Description:This method is to get the next month value from the Current System Date and Time in a specified Format
     * @return calDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getDate() {
        DateFormat formatter = new SimpleDateFormat("MM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE));
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            log.error(e);
            System.out.println("getDate" + e.getMessage());
        }
        String year = Integer.toString(cal.get(Calendar.YEAR));
        String calDate = month + "/" + date + "/" + year;
        //System.out.println("next month getDate value is: "+calDate);
        return calDate;
    }

    /**
     * Description:This method is to get the tommorrow's date value from the Current System Date and Time in a specified Format
     * @return CurrentSystemDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getTommorrowsDate() {
        DateFormat formatter = new SimpleDateFormat("MM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) + 1);
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            log.error(e);
            System.out.println("getTommorrowsDate" + e.getMessage());
        }
        String year = Integer.toString(cal.get(Calendar.YEAR));
        String calDate = month + "/" + date + "/" + year;
        return calDate;
    }

    /**
     * Description:This method is to get the tommorrow's date value from the Current System Date and Time in a specified Format
     * @return calDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getTommorrowsDateFne() {
        DateFormat formatter = new SimpleDateFormat("MMM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) + 1);
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            log.error(e);
            System.out.println("getTommorrowsDateFne" + e.getMessage());
        }
        String calDate = month + " " + date;
        return calDate;
    }

    /**
     * Description:This method is to get Day after tommorrow's date value from the Current System Date and Time in a specified Format
     * @return calDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getDayAfterTommorrowsDate() {
        DateFormat formatter = new SimpleDateFormat("MM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) + 2);
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            log.error(e);
            System.out.println("getDayAfterTommorrowsDate" + e.getMessage());
        }
        String year = Integer.toString(cal.get(Calendar.YEAR));
        String calDate = month + "/" + date + "/" + year;
        return calDate;
    }

    /**
     * Description:This method is to get Day after tommorrow's date value from the Current System Date and Time in a specified Format
     * @return calDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getDayAfterTommorrowsDateFne() {
        DateFormat formatter = new SimpleDateFormat("MMM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) + 2);
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            log.error(e);
            System.out.println("getDayAfterTommorrowsDateFne" + e.getMessage());
        }
        String calDate = month + " " + date;
        return calDate;
    }

    /**
     * Description:This method is to get Day after tommorrow's date value from the Current System Date and Time in a specified Format
     * @return calDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getDayToDayAfterTommorrowsDate() {
        DateFormat formatter = new SimpleDateFormat("MM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) + 3);
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            log.error(e);
            System.out.println("getDayToDayAfterTommorrowsDate" + e.getMessage());
        }
        String year = Integer.toString(cal.get(Calendar.YEAR));
        String calDate = month + "/" + date + "/" + year;
        return calDate;
    }

    /**
     * Description:This method is to get Third day value from the Current System Date and Time in a specified Format
     * @return calDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getDayToDayAfterTommorrowsDateFne() {
        DateFormat formatter = new SimpleDateFormat("MMM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) + 3);
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            log.error(e);
            System.out.println("getDayToDayAfterTommorrowsDateFne" + e.getMessage());
        }
        String calDate = month + " " + date;
        return calDate;
    }

    /**
     * Description:This method is to get TomorrowDate (or) DayAfterTomorrowDate (or) DayToDayAfterTomorrowDate based on the text(strdate) provided in getDate()
     * If no date is provided then fixedDate() method returns fixed static date
     * @param strdate
     * @return fixedDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getDate(String strdate) {
        if (strdate.equalsIgnoreCase("TomorrowDate"))
            return getTommorrowsDate();
        if (strdate.equalsIgnoreCase("DayAfterTomorrowDate"))
            return getDayAfterTommorrowsDate();
        if (strdate.equalsIgnoreCase("DayToDayAfterTomorrowDate"))
            return getDayToDayAfterTommorrowsDate();
        return fixedDate();
    }

    /**
     * Description:This method is to get TomorrowDate (or) DayAfterTomorrowDate (or) DayToDayAfterTomorrowDate based on the text(strdate) provided in getDateForFne()
     * If no date is provided then fixedDate() method returns fixed static date
     * @param strdate
     * @return fixedDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getDateForFne(String strdate) {
        if (strdate.equalsIgnoreCase("TomorrowDate"))
            return getTommorrowsDateFne();
        if (strdate.equalsIgnoreCase("DayAfterTomorrowDate"))
            return getDayAfterTommorrowsDateFne();
        if (strdate.equalsIgnoreCase("DayToDayAfterTomorrowDate"))
            return getDayToDayAfterTommorrowsDateFne();
        return fixedDate();
    }

    /**
     * Description:This method is to get Date as per "EST5EDT" TimeZone
     * @param time,timeZOne
     * @return strDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getTimeAsPerTimeZone(String time, String timeZOne) {
        String strDate="";
        try{
            time = time.split("Minutes")[1];
            DateFormat formatter = new SimpleDateFormat("hh:mm a");
            TimeZone tz = TimeZone.getTimeZone("EST5EDT");
            Calendar cal = new GregorianCalendar(tz);
            cal.add(Calendar.MINUTE, Integer.parseInt(time));
            formatter.setTimeZone(tz);
            strDate=formatter.format(cal.getTime());
        } catch (Exception e) {
            log.error(e);
            System.out.println("getTimeAsPerTimeZone" + e.getMessage());
        }
        return strDate;
    }

    /**
     * Description:This method is to get Static Date
     * @return fixedDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String fixedDate() {
        return "12/31/2025";
    }


    /**
     * Description:This method is to get Current time in a specified format
     * @return strDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getCurrentTime() {
        String strDate="";
        try{
            Date date = new Date();
            String strDateFormat = "HH:mm a";
            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
            strDate= (sdf.format(date));
        } catch (Exception e) {
            log.error(e);
            System.out.println("getCurrentTime" + e.getMessage());
        }
        return strDate;
    }

    /**
     * Description:This method is to get Past Date
     * @return strpastDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String getPastDate() {
        String strpastDate ="";
        try{
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DAY_OF_MONTH, -2);
            Date yesterday = cal.getTime();
            strpastDate = onlydateTypes(cal.getTime());
        } catch (Exception e) {
            log.error(e);
            System.out.println("getPastDate" + e.getMessage());
        }
        return strpastDate;
    }

    /**
     * Description:This method is to get only Day
     * @return date
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String onlydateTypes(Date day) {
        String date="";
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("d");
            date = formatter.format(day);
        } catch (Exception e) {
            log.error(e);
            System.out.println("getPastDate" + e.getMessage());
        }
        return date;
    }

    /**
     * Description:This method is to get date value (contains string "completed -") from the application and convert it to a specified format
     * @param element,strDateFormat
     * @return ActualDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static Date convertDateFormatForSorting(WebElement element, String strDateFormat) {
        Date ActualDate = null;
        try {
            String strActualDateFormat = element.getText().toLowerCase();
            if (strActualDateFormat.contains("completed - ")) {
                strActualDateFormat = strActualDateFormat.replace("completed - ", "");
            }
            if (strActualDateFormat.equals(" ")) {
                strActualDateFormat = "00/00/00 00:00:00 PM";
            }
            SimpleDateFormat format = new SimpleDateFormat(strDateFormat);
            ActualDate = format.parse(strActualDateFormat);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("convertDateFormatForSorting" + e.getMessage());
        }
        return ActualDate;
    }

    /**
     * Description:This method is to get date value from the application and convert it to a specified format
     * @param element,strDateFormat
     * @return dateFormat
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static String[] convertDateFormat(WebElement element, String strDateFormat) {
        String[] dateFormat = new String[2];
        try {
            String strActualDateFormat = element.getText();
            SimpleDateFormat format = new SimpleDateFormat(strDateFormat);
            Date date = format.parse(strActualDateFormat);
            String strFinalDateFormat = format.format(date);
            dateFormat[0] = strFinalDateFormat.toLowerCase().trim();
            dateFormat[1] = strActualDateFormat.toLowerCase().trim();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("convertDateFormat" + e.getMessage());
        }
        return dateFormat;
    }

    /**
     * Description:This method is to get date value from the application and convert it to a specified format
     *  and check date value has been modified to a specified format
     * @param element,strDateFormat
     * @return isVerified
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static boolean verifyDateFormat(WebElement element, String strDateFormat) {
        boolean isVerified = false;
        try {
            String strDate[] = convertDateFormat(element, strDateFormat);
            if (strDate[0].equals(strDate[1])) {
                isVerified = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("verifyDateFormat" + e.getMessage());
        }
        return isVerified;
    }

    /**
     * Description:This method is to convert each date value to a specified format from a list of date values
     * @param strActualDate,strDateFormat
     * @return ActualDate
     * Author Name:Sankar Ganesh
     * Date of Development:12-Aug-2019
     */
    public static Date convertListDateFormat(String strActualDate, String strDateFormat) {
        Date ActualDate = null;
        try {
            if (strActualDate.equals(" ")) {
                strActualDate = "00/00/00 00:00:00 PM";
            }
            SimpleDateFormat format = new SimpleDateFormat(strDateFormat);
            ActualDate = format.parse(strActualDate);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("convertListDateFormat" + e.getMessage());
        }
        return ActualDate;
    }

    public static String getPreviousDate() {
        DateFormat formatter = new SimpleDateFormat("MM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) - 1);
        try {
            month = formatter.format(monthParse.parse(month));
            date = dformatter.format(dateParse.parse(date));
        } catch (ParseException e) {
            log.error(e);
            System.out.println("getTommorrowsDate" + e.getMessage());
        }
        String year = Integer.toString(cal.get(Calendar.YEAR));
        String calDate = month + "/" + date + "/" + year;
        return calDate;
    }

}
