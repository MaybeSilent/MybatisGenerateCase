package Mapper;

import Pojo.Statuses;
import Pojo.StatusesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusesMapper {
    int countByExample(StatusesExample example);

    int deleteByExample(StatusesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Statuses record);

    int insertSelective(Statuses record);

    List<Statuses> selectByExampleWithBLOBs(StatusesExample example);

    List<Statuses> selectByExample(StatusesExample example);

    Statuses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Statuses record, @Param("example") StatusesExample example);

    int updateByExampleWithBLOBs(@Param("record") Statuses record, @Param("example") StatusesExample example);

    int updateByExample(@Param("record") Statuses record, @Param("example") StatusesExample example);

    int updateByPrimaryKeySelective(Statuses record);

    int updateByPrimaryKeyWithBLOBs(Statuses record);

    int updateByPrimaryKey(Statuses record);
}