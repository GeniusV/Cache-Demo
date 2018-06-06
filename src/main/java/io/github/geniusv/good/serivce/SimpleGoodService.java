package io.github.geniusv.good.serivce;

import io.github.geniusv.dao.mapper.GoodMapper;
import io.github.geniusv.dao.model.Good;
import io.github.geniusv.dao.model.GoodExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public GoodMapper getGoodMapper() {
        return goodMapper;
    }

    public void setGoodMapper(GoodMapper goodMapper) {
        this.goodMapper = goodMapper;
    }
}
