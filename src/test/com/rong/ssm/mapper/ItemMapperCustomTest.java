package com.rong.ssm.mapper;

import com.rong.ssm.pojo.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by GD14 on 2017/8/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring.xml")
public class ItemMapperCustomTest {

    @Autowired
    private ItemMapperCustom itemMapperCustom;
    @Autowired
    private  ItemMapper itemMapper;
    @Test
    public void test() throws  Exception{
//        itemMapperCustom.findItemList(null);
        Item a=new Item();
        a.setPrice(1333);
        a.setId(1);
        a.setName("水电费");
        itemMapper.updateItemById(a);
    }

    public ItemMapperCustom getItemMapperCustom() {
        return itemMapperCustom;
    }

    public void setItemMapperCustom(ItemMapperCustom itemMapperCustom) {
        this.itemMapperCustom = itemMapperCustom;
    }
}