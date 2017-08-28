package com.rong.ssm.controller;

import com.rong.ssm.pojo.ItemCustom;
import com.rong.ssm.pojo.ItemQueryVo;
import com.rong.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by GD14 on 2017/8/26.
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;
    @RequestMapping("/listItem")
    public ModelAndView listItem(HttpServletRequest request, ItemQueryVo itemQueryVo) throws Exception{
        List<ItemCustom> itemList= itemService.findItemList(itemQueryVo);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemList",itemList);
        modelAndView.setViewName("item/itemsList");
        return modelAndView;
    }
    @RequestMapping("/editItem")
    public String editItem(Model model,@RequestParam(value = "id") Integer item_id) throws Exception{

        ItemCustom itemCustom=itemService.getItemById(item_id);
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.addObject("itemCustom",itemCustom);
//        modelAndView.setViewName("item/editItems");
        model.addAttribute("itemCustom",itemCustom);
        return "item/editItems";
    }



    @RequestMapping("/editItemSubmit")
    public String editItemSubmit(Model model, HttpServletRequest request, Integer id,
                                 @Validated  ItemCustom itemCustom, BindingResult bindingResult) throws Exception{

        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors= bindingResult.getAllErrors();

            for(ObjectError objectError:allErrors){
                System.out.println(objectError.getDefaultMessage());
            }
            model.addAttribute("allErrors",allErrors);
            return "item/editItems";
        }
        itemService.updateItem(id,itemCustom);

//       return  "redirect:/item/listItem";

        return  "forward:listItem";
    }

    @RequestMapping("/deleteItems")
    public String deleteItems(Integer[] ids){

        return "success";
    }

    @RequestMapping("/batchEditItems")
    public ModelAndView batchEditItems(ItemQueryVo itemQueryVo) throws  Exception{
        List<ItemCustom> itemList= itemService.findItemList(itemQueryVo);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemList",itemList);
        modelAndView.setViewName("item/batchEditItems");
        return modelAndView;
    }

    @RequestMapping("/batchSubmit")
    public String batchSubmit(ItemQueryVo itemQueryVo) throws  Exception{
        return "success";
    }
}
