package com.rong.ssm.service;

import com.rong.ssm.mapper.ItemMapperCustom;
import com.rong.ssm.pojo.ItemCustom;
import com.rong.ssm.pojo.ItemQueryVo;

import java.util.List;

/**
 * Created by GD14 on 2017/8/26.
 */
public interface ItemService {
    public List<ItemCustom> findItemList(ItemQueryVo itemQueryVo) throws Exception;
    public ItemCustom getItemById(Integer id) throws Exception;
    public void updateItem(Integer id,ItemCustom itemCustom) throws Exception;
}
