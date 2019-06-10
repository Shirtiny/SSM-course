package com.SH.Mapper;

import com.SH.Bean.Singer;
import com.SH.Bean.Vocaloid;

import java.util.HashMap;
import java.util.List;

public interface IVocaloidMapper {
    List<Vocaloid> selectAll();
    List<Vocaloid> selectMultiple(Vocaloid vocaloid);
    List<Vocaloid> selectAllOrder(String s);
    List<Vocaloid> selectAllInner(Vocaloid vocaloid);
    List<Vocaloid> selectMultiple_HashMap(HashMap<String,Object> hashMap);
    List<HashMap> selectMultiple_AllHashMap(HashMap<String,Object> hashMap);
    List<HashMap> selectAll_HashMap();
    void insertOne_HashMap(HashMap<String,Object> hashMap);
    void deleteOne_HashMap(HashMap<String,Object> hashMap);
    void updateOne_HashMap(HashMap<String,Object> hashMap);
    List<Vocaloid> selectAll_RtHp();

    List<Vocaloid> selectWithSQL(HashMap<String,Object> hashMap);
    List<Vocaloid> selectForeach(Singer singer);
    List<Vocaloid> selectForeachArray(int[] ids);
    List<Vocaloid> selectForeachArrayList(List<Integer> list);
    List<Vocaloid> selectForeachObjectList(Vocaloid[] list);
}
