package com.SH.Mapper;

//import com.SH.Bean.Link_V_VC;
import com.SH.Bean.Vocaloid;
import com.SH.Bean.team;

import java.util.HashMap;
import java.util.List;

public interface IVocaloidMapper {

//    List<Vocaloid> selectOFO();
    List<Vocaloid> selectROFO(HashMap<String,Object> hashMap);
    List<team> selectOFM(HashMap<String,Object> hashMap);
     List<Vocaloid>   selectLazyLoadingCard(int name);
}
