import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatExamples {
    
    public static void main(String[] args) {
        
        
        String pattern_YYYYMMDD ="yyyy-MM-dd"; 
        String pattern_YYYYMMDDHHmmss ="yyyy-MM-dd HH:mm:ss"; 
        SimpleDateFormat sdf_YYYYMMDD = new SimpleDateFormat(pattern_YYYYMMDD);
        SimpleDateFormat sdf_YYYYMMDDHHmmss = new SimpleDateFormat(pattern_YYYYMMDDHHmmss);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss");
        String strDate1 = "12/Mar/2004:13:25:45";
        String strDate2 = "2017-12-01 15:38:26";
        String strDate3 = "2018-01-05 11:15:13";
        
        //1.當前系統時間轉換（Date-->String）
        /* System.out.println(sdf_YYYYMMDD.format(new Date()));
        System.out.println(sdf_YYYYMMDDHHmmss.format(new Date())); */
        
        //2.字符串轉換為時間類型
        try {
            Date temp = sdf.parse(strDate1);
            System.out.println(temp);
            System.out.println(sdf_YYYYMMDDHHmmss.format(temp));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        //3.昨天/明天/上個月/下個月/去年/明年的日期
        /* Calendar yesDay = Calendar.getInstance();
        Calendar tomDay = Calendar.getInstance();
        Calendar lastMon = Calendar.getInstance();
        Calendar nextMon = Calendar.getInstance();
        Calendar lastYear = Calendar.getInstance();
        Calendar nextYear = Calendar.getInstance();
        yesDay.add(Calendar.DATE,-1);
        tomDay.add(Calendar.DATE,1);
        lastMon.add(Calendar.MONTH,-1);
        nextMon.add(Calendar.MONTH,1);
        lastYear.add(Calendar.YEAR,-1);
        nextYear.add(Calendar.YEAR,1);
        Date yesDayT = yesDay.getTime();
        Date tomDayT = tomDay.getTime();
        Date lastMonT = lastMon.getTime();
        Date nextMonT = nextMon.getTime();
        Date lastYearT = lastYear.getTime();
        Date nextYearT = nextYear.getTime();
        System.out.println(sdf_YYYYMMDDHHmmss.format(yesDayT));//昨天
        System.out.println(sdf_YYYYMMDDHHmmss.format(tomDayT));//明天
        System.out.println(sdf_YYYYMMDDHHmmss.format(lastMonT));//上個月
        System.out.println(sdf_YYYYMMDDHHmmss.format(nextMonT));//下個月
        System.out.println(sdf_YYYYMMDDHHmmss.format(lastYearT));//去年
        System.out.println(sdf_YYYYMMDDHHmmss.format(nextYearT));//明年
        
        //4、兩個日期相差天數
        try {
            //① 按24小時為一天算
            System.out.println(
                    (sdf_YYYYMMDDHHmmss.parse(strDate3).getTime() 
                            - sdf_YYYYMMDDHHmmss.parse(strDate2).getTime())/((1000*3600*24)));
            //② 忽略時間 只算日期
            System.out.println(
                    (sdf_YYYYMMDD.parse(strDate3).getTime() 
                            - sdf_YYYYMMDD.parse(strDate2).getTime())/((1000*3600*24)));
        } catch (ParseException e) {
            e.printStackTrace();
        } */
        
    }

}