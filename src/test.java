import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 * @author by Wangshuo5 on 2018/5/2
 */
public class test {
//    public static boolean isDurTracPeriod(long obj){
////        1525255012934
//        Calendar cd =Calendar.getInstance();
//        cd.setTimeInMillis(obj);
//        return cd.get(Calendar.HOUR)>=9 && cd.get(Calendar.HOUR)<=15;
//
//    }

    public static boolean isDurTracPeriod(long obj,int beginHour, int beginMinute, int endHour, int endMinute) {

        Calendar cd = Calendar.getInstance();
        cd.setTimeInMillis(obj);
        Calendar cdBegin = (Calendar) cd.clone();
        cdBegin.set(Calendar.HOUR_OF_DAY, beginHour);
        cdBegin.set(Calendar.MINUTE, beginMinute);
        cdBegin.set(Calendar.SECOND, 0);
        cdBegin.set(Calendar.MILLISECOND, 0);

        Calendar cdEnd = (Calendar) cdBegin.clone();
        cdEnd.set(Calendar.HOUR_OF_DAY, endHour);
        cdEnd.set(Calendar.MINUTE, endMinute);


        return (cd.compareTo(cdBegin) == 1 ? true : false) && (cdEnd.compareTo(cd) == 1 ? true : false);
    }
    public static void main(String[] args) {
        /*System.out.println(System.currentTimeMillis());
        System.out.println(Calendar.getInstance().getTimeInMillis());*/

//       System.out.println(test.isDurTracPeriod(1525255012934L));
//        Calendar cd =Calendar.getInstance();
//        cd.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
//        System.out.println(cd.get(Calendar.DATE));
////        System.out.println(cd.get(Calendar.));

        Map<String,Object> a =new HashMap<>();
        a.put("start",1);
        a.put("end",false);
//        System.out.println(test.isDurTracPeriod(1525255012934L,9,15,15,0));

        for (Map.Entry<String,Object> entry : a.entrySet()) {

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

       /* Calendar cd = Calendar.getInstance();
        cd.setTimeInMillis(1525255012934L);
        Calendar cd1 = (Calendar) cd.clone();
        cd1.set(Calendar.HOUR_OF_DAY,9);
        cd1.set(Calendar.MINUTE,15);
        System.out.println(cd1.getTime());
        System.out.println(cd);*/

    }
}
