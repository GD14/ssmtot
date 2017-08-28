package com.rong.ssm.mapper;

import com.rong.ssm.pojo.ItemCustom;
import com.rong.ssm.pojo.ItemQueryVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by GD14 on 2017/8/26.
 */
@Repository
public interface ItemMapperCustom {
    public List<ItemCustom> findItemList(ItemQueryVo itemQueryVo) throws Exception;
}
