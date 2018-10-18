package Mapper;

import Pojo.SaleComments;
import Pojo.SaleCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleCommentsMapper {
    int countByExample(SaleCommentsExample example);

    int deleteByExample(SaleCommentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SaleComments record);

    int insertSelective(SaleComments record);

    List<SaleComments> selectByExampleWithBLOBs(SaleCommentsExample example);

    List<SaleComments> selectByExample(SaleCommentsExample example);

    SaleComments selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SaleComments record, @Param("example") SaleCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") SaleComments record, @Param("example") SaleCommentsExample example);

    int updateByExample(@Param("record") SaleComments record, @Param("example") SaleCommentsExample example);

    int updateByPrimaryKeySelective(SaleComments record);

    int updateByPrimaryKeyWithBLOBs(SaleComments record);

    int updateByPrimaryKey(SaleComments record);
}