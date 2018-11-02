package com.jbosak.familyserver.FamilyBackend.bootstrap;

import com.jbosak.familyserver.FamilyBackend.model.Child;
import com.jbosak.familyserver.FamilyBackend.model.Father;
import com.jbosak.familyserver.FamilyBackend.repositories.ChildRepository;
import com.jbosak.familyserver.FamilyBackend.repositories.FatherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ChildRepository childRepository;
    private FatherRepository fatherRepository;

    public DevBootstrap(ChildRepository childRepository, FatherRepository fatherRepository) {
        this.childRepository = childRepository;
        this.fatherRepository = fatherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        GregorianCalendar cal = new GregorianCalendar();
        int year = randBetween(1900, 2018);
        cal.set(cal.YEAR, year);
        int dayOfYear = randBetween(1, cal.getActualMaximum(cal.DAY_OF_YEAR));
        cal.set(cal.DAY_OF_YEAR, dayOfYear);
        Father john = new Father("John","Johny",654534543,cal.getTime());
        Child mark = new Child(john,"mark","Smith",5436435,cal.getGregorianChange(),Child.MALE);
        john.getChildren().add(mark);
        mark.setFather(john);
        fatherRepository.save(john);
        childRepository.save(mark);
    }
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
