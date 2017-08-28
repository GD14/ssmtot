package com.rong.ssm.service.Impl;

import com.rong.ssm.mapper.ItemMapper;
import com.rong.ssm.mapper.ItemMapperCustom;
import com.rong.ssm.mapper.UserMapper;
import com.rong.ssm.pojo.Item;
import com.rong.ssm.pojo.ItemCustom;
import com.rong.ssm.pojo.ItemQueryVo;
import com.rong.ssm.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by GD14 on 2017/8/26.
 */

public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapperCustom itemMapperCustom;

    @Autowired
    private ItemMapper itemMapper;
    public List<ItemCustom> findItemList(ItemQueryVo itemQueryVo) throws Exception {
        return itemMapperCustom.findItemList(itemQueryVo);
    }

    public ItemCustom getItemById(Integer id) throws Exception {
        Item item= itemMapper.findItemById(id);
        ItemCustom itemCustom=new ItemCustom();
        BeanUtils.copyProperties(item,itemCustom);
        return  itemCustom;
    }

    public void updateItem(Integer id, ItemCustom itemCustom) throws Exception {
        itemCustom.setId(id);
        itemMapper.updateItemById(itemCustom);
    }

    public ItemMapper getItemMapper() {
        return itemMapper;
    }

    public void setItemMapper(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

    public ItemMapperCustom getItemMapperCustom() {
        return itemMapperCustom;
    }

    public void setItemMapperCustom(ItemMapperCustom itemMapperCustom) {
        this.itemMapperCustom = itemMapperCustom;
    }
}
