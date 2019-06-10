package com.SH.Bean;

import org.springframework.stereotype.Component;

import java.util.*;
@Component("list")
public class ListType {
    List<String> ListStudents;
    String[] ArrayStudents;
    Set<String> SetStudents;
    Map<String,Object> MapStudents;
    Properties PropertiesStudents;

    public ListType() {}
    public ListType(List<String> listStudents, String[] arrayStudents, Set<String> setStudents, Map<String, Object> mapStudents, Properties propertiesStudents) {
        ListStudents = listStudents;
        ArrayStudents = arrayStudents;
        SetStudents = setStudents;
        MapStudents = mapStudents;
        PropertiesStudents = propertiesStudents;
    }

    public List<String> getListStudents() {
        return ListStudents;
    }

    public void setListStudents(List<String> listStudents) {
        ListStudents = listStudents;
    }

    public String[] getArrayStudents() {
        return ArrayStudents;
    }

    public void setArrayStudents(String[] arrayStudents) {
        ArrayStudents = arrayStudents;
    }

    public Set<String> getSetStudents() {
        return SetStudents;
    }

    public void setSetStudents(Set<String> setStudents) {
        SetStudents = setStudents;
    }

    public Map<String, Object> getMapStudents() {
        return MapStudents;
    }

    public void setMapStudents(Map<String, Object> mapStudents) {
        MapStudents = mapStudents;
    }

    public Properties getPropertiesStudents() {
        return PropertiesStudents;
    }

    public void setPropertiesStudents(Properties propertiesStudents) {
        PropertiesStudents = propertiesStudents;
    }

    @Override
    public String toString() {
        return "ListType{" +
                "ListStudents=" + ListStudents +
                ", \n ArrayStudents=" + Arrays.toString(ArrayStudents) +
                ", \n SetStudents=" + SetStudents +
                ", \n MapStudents=" + MapStudents +
                ", \n PropertiesStudents=" + PropertiesStudents +
                '}';
    }
}
