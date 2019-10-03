package com.tao.data.me;

import com.tao.pojo.sys.SimpleMap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TagMapperMe {
    List<SimpleMap> list(SimpleMap map);
}
