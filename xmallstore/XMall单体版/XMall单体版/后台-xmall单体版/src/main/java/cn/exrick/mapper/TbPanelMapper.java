package cn.exrick.mapper;

import cn.exrick.pojo.TbPanel;
import cn.exrick.pojo.TbPanelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPanelMapper {
    long countByExample(TbPanelExample example);

    int deleteByExample(TbPanelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPanel record);

    int insertSelective(TbPanel record);

    List<TbPanel> selectByExample(TbPanelExample example);

    TbPanel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPanel record, @Param("example") TbPanelExample example);

    int updateByExample(@Param("record") TbPanel record, @Param("example") TbPanelExample example);

    int updateByPrimaryKeySelective(TbPanel record);

    int updateByPrimaryKey(TbPanel record);
}