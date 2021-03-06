package cn.hkfdt.xiaot.mybatis.mapper.ltschina;

import cn.hkfdt.xiaot.mybatis.model.ltschina.TRecord;
import cn.hkfdt.xiaot.mybatis.model.ltschina.TRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TRecordMapper {
    int countByExample(TRecordExample example);

    int deleteByExample(TRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(TRecord record);

    int insertSelective(TRecord record);

    List<TRecord> selectByExampleWithRowbounds(TRecordExample example, RowBounds rowBounds);

    List<TRecord> selectByExample(TRecordExample example);

    TRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") TRecord record, @Param("example") TRecordExample example);

    int updateByExample(@Param("record") TRecord record, @Param("example") TRecordExample example);

    int updateByPrimaryKeySelective(TRecord record);

    int updateByPrimaryKey(TRecord record);
}