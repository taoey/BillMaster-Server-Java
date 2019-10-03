package com.tao.modules.tag;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tao.data.me.TagMapperMe;
import com.tao.modules.common.service.CommonService;
import com.tao.pojo.sys.GridPage;
import com.tao.pojo.sys.SimpleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements CommonService {

    @Autowired
    private TagMapperMe tagMapperMe;

    @Override
    public boolean exist(SimpleMap map) {
        return false;
    }

    @Override
    public GridPage list(SimpleMap map) {
        GridPage result = new GridPage();
        Page<Object> page = PageHelper.startPage(map.getPageNum(), map.getPageSize());
        List<SimpleMap> rows = tagMapperMe.list(map);
        long total = page.getTotal();

        result.setTotal(total);
        result.setRows(rows);

        return result;
    }

    @Override
    public SimpleMap getOne(SimpleMap map) {
        return null;
    }

    @Override
    public void saveData(SimpleMap map) {

    }

    @Override
    public void updateDate(SimpleMap map) {

    }
}
