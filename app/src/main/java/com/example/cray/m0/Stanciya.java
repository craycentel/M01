package com.example.cray.m0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Cray on 29.10.2016.
 */
public class Stanciya {
    String name;
    List<Date> arrayList;
    public Stanciya (String name, List array){
        this.name = name;
        this.arrayList = array;
    }
    public String getMinut(){
        Date currentTime = new Date();
        Date yearStartTime = this.arrayList.get(0);
        currentTime.setYear(yearStartTime.getYear());
        int currentTimeMonth = (yearStartTime.getMonth());
        currentTime.setMonth(currentTimeMonth);
        currentTime.setDate(yearStartTime.getDate());
        int i=-1;
        Iterator<Date> iterator = this.arrayList.iterator();
        boolean falag=true;
        while (iterator.hasNext() && (falag))        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Date dat = iterator.next();
            i++;
            falag =(dat.before(currentTime));
            if (!falag)
            {
                String str = new SimpleDateFormat("hh:mm").format(dat);
                //          System.out.println("Отправление:"+str);
            }
        }
        yearStartTime = this.arrayList.get(i);
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 60 * 1000;  //сколько миллисекунд в одних сутках
        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        //    System.out.println("Minut: " + dayCount+ this.arrayList.get(i));
        return ("До отправления: " + dayCount+" минут "+"\nОтправление в "+ new SimpleDateFormat("hh:mm").format(this.arrayList.get(i)));
    }
}
