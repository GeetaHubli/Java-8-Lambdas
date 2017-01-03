package com.allstate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MainTest {


    @Test
    public void testSearchByLocationForListOfOffice(){

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office("ASPLBang", "Bangalore", 1000));
        officeList.add(new Office("ASPLPune", "Pune", 800));
        officeList.add(new Office("AllstateANA", "ANA", 4000));
        officeList.add(new Office("AllstateANI", "Belfast, Northern Ireland", 3000));
        officeList.add(new Office("ASPL", "Belfast, Northern Ireland", 1000));
        officeList.add(new Office("ASPL", "Belfast, Northern Ireland", 5));
        officeList.add(new Office("ASPL", "delhi", 4));

        OfficeList offices = new OfficeList(officeList);

        List<Office> belfastOfficeList = offices.searchOfficeByLocation("Belfast, Northern Ireland");
        assertNotNull(belfastOfficeList);
    }
    @Test
    public void testNoOfEmployeeLessThanTen(){

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office("ASPLBang", "Bangalore", 1000));
        officeList.add(new Office("ASPLPune", "Pune", 800));
        officeList.add(new Office("AllstateANA", "ANA", 4000));
        officeList.add(new Office("AllstateANI", "Belfast, Northern Ireland", 3000));
        officeList.add(new Office("ASPL", "Belfast, Northern Ireland", 1000));
        officeList.add(new Office("ASPL", "Belfast, Northern Ireland", 5));
        officeList.add(new Office("ASPL", "delhi", 4));

        OfficeList offices = new OfficeList(officeList);

        List<Office> noofemployeelessthenten = offices.searchByNoOfEmployee();
        assertNotNull(noofemployeelessthenten);
        assertEquals(noofemployeelessthenten.size(),2);
    }

    @Test
    public void testNoOfEmployeeMoreThanHundred(){

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office("ASPLBang", "Bangalore", 1000));
        officeList.add(new Office("ASPLPune", "Pune", 800));
        officeList.add(new Office("AllstateANA", "ANA", 4000));
        officeList.add(new Office("AllstateANI", "Belfast, Northern Ireland", 3000));
        officeList.add(new Office("ASPL", "Belfast, Northern Ireland", 1000));
        officeList.add(new Office("ASPL", "Belfast, Northern Ireland", 5));
        officeList.add(new Office("ASPL", "delhi", 4));

        OfficeList offices = new OfficeList(officeList);

        List<Office> noofemployeemorethanhundred = offices.searchByNoOfEmployeeMoreThanHundred();
        assertNotNull(noofemployeemorethanhundred);
        assertEquals(noofemployeemorethanhundred.size(),5);
    }

    @Test
    public void testSearchByOfficeName(){

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office("ASPLBang", "Bangalore", 1000));
        officeList.add(new Office("ASPLPune", "Pune", 800));
        officeList.add(new Office("AllstateANA", "ANA", 4000));
        officeList.add(new Office("AllstateANI", "Belfast, Northern Ireland", 3000));
        officeList.add(new Office("ASPL", "Belfast, Northern Ireland", 1000));
        officeList.add(new Office("Northland", "Belfast, Northern Ireland", 5));
        officeList.add(new Office("Northland", "delhi", 4));

        OfficeList offices = new OfficeList(officeList);

        List<Office> officeByName = offices.searchByOfficeName("Northland");
        assertNotNull(officeByName);
        assertEquals(officeByName.get(0).getName(),"Northland");
    }

    @Test
    public void testSearchByOfficeNameBetweenAtoK(){

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office("ASPLBang", "Bangalore", 1000));
        officeList.add(new Office("ASPLPune", "Pune", 800));
        officeList.add(new Office("z-AllstateANA", "ANA", 4000));
        officeList.add(new Office("k-AllstateANI", "Belfast, Northern Ireland", 3000));
        officeList.add(new Office("p-ASPL", "Belfast, Northern Ireland", 1000));
        officeList.add(new Office("Northland", "Belfast, Northern Ireland", 5));
        officeList.add(new Office("m-Northland", "delhi", 4));

        OfficeList offices = new OfficeList(officeList);

        List<Office> officeByName = offices.searchByOfficeNameBetweenAtoK();
        assertNotNull(officeByName);
        assertEquals(officeByName.size(),3);
    }

    @Test
    public void testSearchByOfficeNameByVowel(){

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office("ASPLBang", "Bangalore", 1000));
        officeList.add(new Office("o-ASPLPune", "Pune", 800));
        officeList.add(new Office("z-AllstateANA", "ANA", 4000));
        officeList.add(new Office("k-AllstateANI", "Belfast, Northern Ireland", 3000));
        officeList.add(new Office("p-ASPL", "Belfast, Northern Ireland", 1000));
        officeList.add(new Office("Northland", "Belfast, Northern Ireland", 5));
        officeList.add(new Office("m-Northland", "delhi", 4));

        OfficeList offices = new OfficeList(officeList);

        List<Office> officeByName = offices.searchByOfficeNameByVowel();
        assertNotNull(officeByName);
        assertEquals(officeByName.size(),5);

    }
}