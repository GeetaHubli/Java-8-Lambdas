package com.allstate;

import java.util.List;
import java.util.stream.Collectors;

public class OfficeList {

    List<Office> officeList;


    public OfficeList(List<Office> officeList) {
        this.officeList = officeList;
    }

    public List<Office> getOfficeList() {
        return officeList;
    }

    public List<Office> searchOfficeByLocation(String location){

        List<Office> locationBasedOfficeList = officeList
                .stream()
                .filter(office -> office.getLocation()==location)
                .collect(Collectors.toList());

        return locationBasedOfficeList;
    }

    public List<Office> searchByNoOfEmployee(){

        List<Office> noofemployeebasedlist = officeList
                .stream()
                .filter(office -> office.getNumberOfEmployees() < 10)
                .collect(Collectors.toList());

        return noofemployeebasedlist;
    }

    @Override
    public String toString() {
        return "OfficeList{" +
                "officeList=" + officeList +
                '}';
    }

    public List<Office> searchByNoOfEmployeeMoreThanHundred() {

        List<Office> noofemployeebasedlist = officeList
                .stream()
                .filter(office -> office.getNumberOfEmployees() > 100)
                .collect(Collectors.toList());

        return noofemployeebasedlist;
    }

    public List<Office> searchByOfficeName(String officeName) {
        List<Office> locationBasedOfficeList = officeList
                .stream()
                .filter(office -> office.getName()==officeName)
                .collect(Collectors.toList());

        return locationBasedOfficeList;
    }

    public List<Office> searchByOfficeNameBetweenAtoK() {

        List<Office> officesByNamesBetweenAtoK = officeList
                .stream()
                .filter(office -> office.getName().substring(0,1).matches("^[A-Ka-k]$"))
                .collect(Collectors.toList());
           return officesByNamesBetweenAtoK;
    }

    public List<Office> searchByOfficeNameByVowel() {
        List<Office> officesByNamesByVowel = officeList
                .stream()
                .filter(office -> (office.getName().substring(0,1).matches("^[AEIOUaeiou]$")) || office.getNumberOfEmployees() > 15)
                .collect(Collectors.toList());
        return officesByNamesByVowel;
    }
}
