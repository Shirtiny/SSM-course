import com.SH.Bean.Vocaloid_Card;
import com.SH.Mapper.IteamMapper;
import org.apache.log4j.Logger;
import com.SH.Bean.Vocaloid;
import com.SH.Bean.team;
import com.SH.Mapper.IVocaloidMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.smartcardio.Card;
import java.io.IOException;
import java.io.Reader;

import java.util.HashMap;
import java.util.List;

public class Test {




//    public static void selectOFO() throws IOException {
////        Reader reader = Resources.getResourceAsReader("conf.xml");
////        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
////        SqlSession session = sessionFactory.openSession();
////        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
////        List<Vocaloid> link = mapper.selectOFO();
////        System.out.println(link);
////        session.close();
////    }

    public static void selectROFO(HashMap<String,Object> hashMap) throws IOException {//一对一
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> link = mapper.selectROFO(hashMap);
        System.out.println(link);
        session.close();
    }

    public static void selectOFM(HashMap<String,Object> hashMap) throws IOException {//一对多
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<team> teams = mapper.selectOFM(hashMap);
        System.out.println(teams);
        session.close();
    }

    public static void selectLazyLoadingCard(int name) throws IOException {//延迟加载，Card
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloids = mapper.selectLazyLoadingCard(name);
        for (Vocaloid v:vocaloids){
            System.out.println("查询到成员："+v.getName()+" ,"+v.getId());
            Vocaloid_Card card=v.getCard();
            System.out.println("查询到成员卡："+card.getCard_name());
        }


        session.close();

    }

    public static void selectTeam(int id) throws IOException {//延迟加载team
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IteamMapper mapper = session.getMapper(IteamMapper.class);
        List<team> teamList = mapper.selectTeam(id);
        for (team t:teamList){
            System.out.println("【查询出队伍】："+t);
            List<Vocaloid> vocaloids = t.getVocaloids();
            for (Vocaloid v:vocaloids){
                System.out.println("【查询出队伍中的成员】："+v);
                Vocaloid_Card card = v.getCard();
                System.out.println("【查询出成员的资料卡】："+card.getCard_name()+","+card.getFavorite());
            }
        }
        session.close();

    }

    public static void main(String[] args) throws IOException {

//        HashMap<String,Object> hashMapROFO=new HashMap<String, Object>();
////        hashMapROFO.put("id",1);
//        hashMapROFO.put("name","k");
//        selectROFO(hashMapROFO);


//        HashMap<String,Object> hashMapPFM =new HashMap<String, Object>();
//        hashMapPFM.put("team_id",2);
//        selectOFM(hashMapPFM);
//
//
//        selectLazyLoadingCard(1);

        selectTeam(1);
    }
}
