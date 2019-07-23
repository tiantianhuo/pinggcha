package cn.pincha.dao;

import cn.pincha.domain.Pinchaxiang;
import cn.pincha.domain.Registerdeductmarks;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface registerdeductmarksdao {
 //  List<Pinchaxiang> findAll();
//    void delete(String id);
   void insert(Registerdeductmarks registerdeductmarks);
   List<Pinchaxiang> findone (String id);
}
