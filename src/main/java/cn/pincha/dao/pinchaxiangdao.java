package cn.pincha.dao;

import cn.pincha.domain.Pinchaxiang;
import cn.pincha.domain.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface pinchaxiangdao {
   List<Pinchaxiang> findAll();
//    void delete(String id);
  //  void insert(Register register);
}
