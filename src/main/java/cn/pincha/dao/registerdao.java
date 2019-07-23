package cn.pincha.dao;

import cn.pincha.domain.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface registerdao {
//    List<Register> findall();
//    void delete(String id);
    void insert(Register register);
}
