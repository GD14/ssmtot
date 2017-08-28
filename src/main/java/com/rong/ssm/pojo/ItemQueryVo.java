package com.rong.ssm.pojo;

import java.util.List;

/**
 * Created by GD14 on 2017/8/26.
 */
public class ItemQueryVo {
    private Item    item;
    private ItemCustom itemCustom;

    private List<ItemCustom> customLists;

    public Item getItem() {
        return item;
    }

    public List<ItemCustom> getCustomLists() {
        return customLists;
    }

    public void setCustomLists(List<ItemCustom> customLists) {
        this.customLists = customLists;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ItemCustom getItemCustom() {
        return itemCustom;
    }

    public void setItemCustom(ItemCustom itemCustom) {
        this.itemCustom = itemCustom;
    }
}
