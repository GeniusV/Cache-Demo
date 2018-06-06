package io.github.geniusv.good.serivce;

import io.github.geniusv.dao.mapper.GoodMapper;
import io.github.geniusv.dao.model.Good;
import io.github.geniusv.dao.model.GoodExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GeniusV on 6/6/18.
 */

@Service
public class SimpleGoodService implements GoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public List<Good> selectGood() {
        return goodMapper.selectByExample(new GoodExample());
    }

    @Override
    public List<Good> selectGoodByPage(Long page) {
        List<Long> idList = goodMapper.selectPrimaryKeyLimitedByExample(page , 15L, new GoodExample());
        List<Good> res = new ArrayList<>();
        for (Long id : idList) {
            res.add(goodMapper.selectByPrimaryKey(id));
        }
        return res;
    }

    @Override
    public Long getPageNum() {
        Long ct = goodMapper.countByExample(new GoodExample());
        Long page = ct / 15;
        if (ct % 15 != 0) {
            return page + 1;
        }
        return page;
    }

    public GoodMapper getGoodMapper() {
        return goodMapper;
    }

    public void setGoodMapper(GoodMapper goodMapper) {
        this.goodMapper = goodMapper;
    }
}
