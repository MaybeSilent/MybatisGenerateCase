package Mapper;

import Pojo.StatusReplies;
import Pojo.StatusRepliesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusRepliesMapper {
    int countByExample(StatusRepliesExample example);

    int deleteByExample(StatusRepliesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatusReplies record);

    int insertSelective(StatusReplies record);

    List<StatusReplies> selectByExampleWithBLOBs(StatusRepliesExample example);

    List<StatusReplies> selectByExample(StatusRepliesExample example);

    StatusReplies selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatusReplies record, @Param("example") StatusRepliesExample example);

    int updateByExampleWithBLOBs(@Param("record") StatusReplies record, @Param("example") StatusRepliesExample example);

    int updateByExample(@Param("record") StatusReplies record, @Param("example") StatusRepliesExample example);

    int updateByPrimaryKeySelective(StatusReplies record);

    int updateByPrimaryKeyWithBLOBs(StatusReplies record);

    int updateByPrimaryKey(StatusReplies record);
}