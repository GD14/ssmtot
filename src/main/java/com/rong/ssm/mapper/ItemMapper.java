package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Item;

/**
 * Created by GD14 on 2017/8/26.
 */
public interface ItemMapper {
    public Item findItemById(int id);
    public void updateItemById(Item item);
}
