package io.github.geniusv.good.serivce;

import io.github.geniusv.dao.model.Good;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by GeniusV on 6/6/18.
 */
@Transactional
public interface GoodService {

    List<Good> selectGood();

    List<Good> selectGoodByPage(Long page);

    Long getPageNum();
}
