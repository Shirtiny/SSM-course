
import com.SH.Bean.Singer;
import com.SH.Bean.Vocaloid;
import com.SH.Mapper.IVocaloidMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.CORBA.OBJ_ADAPTER;


import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {


    public static void SelectAll() throws IOException {//查询表内全部信息
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloidList = mapper.selectAll();
        System.out.println("查询：\n"+vocaloidList);
        session.close();
    }

    public static void SelectMultiple(Vocaloid vocaloids) throws IOException {//在表内查询出多个结果
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloid = mapper.selectMultiple(vocaloids);
        System.out.println(vocaloid);
        session.close();
    }

    public static void SelectAllOrder(String s) throws IOException {//查询并按照给定字段排序
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloidList = mapper.selectAllOrder(s);
        System.out.println(vocaloidList);
        session.close();

    }
public static void SelectAllInner(Vocaloid vocaloid) throws IOException {//嵌套，让Vocaloid包括了singer，singer包括了id和name

    Reader reader = Resources.getResourceAsReader("conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
    List<Vocaloid> vocaloidList = mapper.selectAllInner(vocaloid);
    System.out.println(vocaloidList);
    session.close();
}


public static void SelectMultiple_HashMap(HashMap<String,Object> hashMap) throws IOException {//使用hashmap输入参数查询多个，输出用的resultMap
    Reader reader = Resources.getResourceAsReader("conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
    List<Vocaloid> vocaloidList = mapper.selectMultiple_HashMap(hashMap);
    System.out.println(vocaloidList);
    session.close();
}

public static void SelectMultiple_AllHashMap(HashMap<String, Object> hashMap) throws IOException {//使用hashmap输入参数查询多个，输入用的也是hashmap
    Reader reader = Resources.getResourceAsReader("conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
    List<HashMap> hashMapList = mapper.selectMultiple_AllHashMap(hashMap);
    System.out.println(hashMapList);
    session.close();

}


public static void SelectAll_HashMap() throws IOException {//使用hashmap查询全部v家成员
    Reader reader = Resources.getResourceAsReader("conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
    List<HashMap> hashMapList = mapper.selectAll_HashMap();
    System.out.println(hashMapList);//这样打印会倒序
    session.close();

}

public static void InsertOne_HashMap(HashMap<String,Object> hashMap) throws IOException {//增加一个成员，用hashmap输入
    Reader reader = Resources.getResourceAsReader("conf.xml");
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession session = sessionFactory.openSession();
    IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
    mapper.insertOne_HashMap(hashMap);
    session.commit();
    System.out.println("增加一个");
    session.close();
}

    public static void DeleteOne_HashMap(HashMap<String,Object> hashMap) throws IOException {//删除一个成员，用hashmap输入
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        mapper.deleteOne_HashMap(hashMap);
        session.commit();
        System.out.println("删除一个");
        session.close();
    }

    public static void UpdateOne_HashMap(HashMap<String,Object> hashMap) throws IOException {//修改一个成员，用hashmap输入
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        mapper.updateOne_HashMap(hashMap);
        session.commit();
        System.out.println("修改一个");
        session.close();
    }
    public static void SelectAll_RtHp() throws IOException {//查询全部成员，用resultType + hashmap返回
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloidList = mapper.selectAll_RtHp();
        System.out.println("查询：\n"+vocaloidList);
        session.close();
    }


    public static void SelectWithSQL(HashMap<String,Object> hashMap) throws IOException {//动态Sql查询
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloidList = mapper.selectWithSQL(hashMap);
        System.out.println("动态SQL查询： \n"+vocaloidList);
        session.close();

    }

    public static void SelectForeach(Singer singer) throws IOException {//输入参数为数组
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloidList = mapper.selectForeach(singer);
        System.out.println("遍历输入数组查询： \n"+vocaloidList);
        session.close();

    }

    public static void SelectForeachArray(int[] ids) throws IOException {//输入参数为普通数组
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
//       int[] ids= new int[]{1, 3, 5};
        List<Vocaloid> vocaloidList = mapper.selectForeachArray(ids);
        System.out.println("遍历输入普通数组查询： \n"+vocaloidList);
        session.close();

    }

    public static void SelectForeachArrayList(List<Integer> list) throws IOException {//输入参数为集合
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloidList = mapper.selectForeachArrayList(list);
        System.out.println("遍历输入普通数组查询： \n"+vocaloidList);
        session.close();

    }

    public static void SelectForeachObjectList(Vocaloid[] list) throws IOException {//输入参数为集合
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IVocaloidMapper mapper = session.getMapper(IVocaloidMapper.class);
        List<Vocaloid> vocaloidList = mapper.selectForeachObjectList(list);
        System.out.println("遍历输入对象数组查询： \n"+vocaloidList);
        session.close();

    }

    public static void main(String[] args) throws IOException {
        SelectAll();

//           Vocaloid vocaloid=new Vocaloid();
////          vocaloid.setId(1);//只写了id=? or name like '%?%'
//             vocaloid.setName("miku");
////         vocaloid.setSex(true);//sql语句不知道怎么写4个值的or查询
////         vocaloid.setColor("yellow");//sql语句不知道怎么写4个值的or查询
//      SelectMultiple(vocaloid);




//        SelectAllOrder("id");//根据id排序，顺序逆序在Mapper的sql里改desc
//        SelectAllOrder("name");//根据name排序
//        SelectAllOrder("sex");//根据sex排序，sex在sql里设置的是男1女0
//            SelectAllOrder("color");//根据color排序

//
//       Vocaloid vocaloidInner =new Vocaloid();
//        Singer singer=new Singer(0,"m");
//       vocaloidInner.setSinger(singer);
//        SelectAllInner(vocaloidInner);//Bean中有嵌套

//        HashMap map=new HashMap();
//        map.put("id",2);
//        map.put("name","c");
//        SelectMultiple_HashMap(map);//使用hashmap输入，resultmap输出


//        HashMap hashMaps=new HashMap();
//        hashMaps.put("id",1);
//        hashMaps.put("name","c");
//        SelectMultiple_AllHashMap(hashMaps);//使用hashmap输入，也使用hashmap输出，结果倒序，解决方法应该是改下打印，具体没看
////        SelectAll_HashMap();//打印倒序

//        HashMap hashMapI=new HashMap();
//        hashMapI.put("id",9);
//        hashMapI.put("name","智障");
//        hashMapI.put("sex",false);
//        hashMapI.put("color","blue");
//        InsertOne_HashMap(hashMapI);//增加一个成员，sex的类型从false转换为了0，即使配置中参数没有说明类型de转换方向
//        SelectAll();
//
//
//
//
//        HashMap hashMapU=new HashMap();
//        hashMapU.put("id",9);
//        hashMapU.put("name","我是DIO哒");
//        hashMapU.put("sex",true);
//        hashMapU.put("color","yellow");
//        UpdateOne_HashMap(hashMapU);//修改一个成员
//        SelectAll();
//
//
//
//
//        HashMap hashMapD=new HashMap();
//        hashMapD.put("id",9);
//        DeleteOne_HashMap(hashMapD);//删除一个成员
//        SelectAll();
//        SelectAll_HashMap();//查询全部成员（固定字段），返回值为resultType+hashmap，倒序,返回一行数据时候，用hashmap.get("x")获取对应值，多行不知道


//        HashMap<String,Object> hashMapSQL=new HashMap<String, Object>();
//        hashMapSQL.put("id",2);
//        hashMapSQL.put("name","r");
//        hashMapSQL.put("color","yellow");
//        hashMapSQL.put("sex",false);
//        SelectWithSQL(hashMapSQL);


//        Singer singerF=new Singer();
//        List<Integer> idlist=new ArrayList<Integer>();
//        idlist.add(1);
//        idlist.add(2);
//////        idlist.add(3);
//        singerF.setIds(idlist);
//        SelectForeach(singerF);

//        List<Integer> list=new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        SelectForeachArrayList(list);


        Vocaloid vocaloid1=new Vocaloid();
        Vocaloid vocaloid2=new Vocaloid();
        Vocaloid vocaloid3=new Vocaloid();
        vocaloid1.setId(1);
        vocaloid2.setId(2);
        vocaloid3.setId(3);

        Vocaloid[] vocaloids=new Vocaloid[]{vocaloid1,vocaloid2,vocaloid3};
        SelectForeachObjectList(vocaloids);
    }
}
