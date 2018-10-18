package Mapper;

import Pojo.Sales;
import Pojo.SalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesMapper {
    int countByExample(SalesExample example);

    int deleteByExample(SalesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sales record);

    int insertSelective(Sales record);

    List<Sales> selectByExampleWithBLOBs(SalesExample example);

    List<Sales> selectByExample(SalesExample example);

    Sales selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sales record, @Param("example") SalesExample example);

    int updateByExampleWithBLOBs(@Param("record") Sales record, @Param("example") SalesExample example);

    int updateByExample(@Param("record") Sales record, @Param("example") SalesExample example);

    int updateByPrimaryKeySelective(Sales record);

    int updateByPrimaryKeyWithBLOBs(Sales record);

    int updateByPrimaryKey(Sales record);
}