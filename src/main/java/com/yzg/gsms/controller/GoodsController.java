package com.yzg.gsms.controller;

import com.github.pagehelper.util.StringUtil;
import com.yzg.gsms.common.ResultMessage;
import com.yzg.gsms.entity.Goods;
import com.yzg.gsms.service.GoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@ResponseBody
@RequestMapping("/goods")
@RestController
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @PostMapping("/add")
    public ResultMessage add(@RequestBody Goods goods){
        if(goods == null){
            return new ResultMessage(0,"数据不能为空",null);
        }

        goodsService.add(goods);

        return new ResultMessage(1,"添加成功",goods);
    }

    @GetMapping("/get")
    public ResultMessage get(@RequestParam(value = "id") String id){
        if(StringUtil.isEmpty(id)){
            return new ResultMessage(0,"数据不能为空",null);
        }

        Goods goods = goodsService.get(id);

        return new ResultMessage(1,"查询成功",goods);
    }

    @PostMapping("/update")
    public ResultMessage update(@RequestBody Goods goods){
        if(goods == null){
            return new ResultMessage(0,"数据不能为空",null);
        }

        goodsService.update(goods);

        return new ResultMessage(1,"修改成功",goods);
    }

    @PostMapping("/delete")
    public ResultMessage delete(@RequestParam(value = "id") String id){
        if(StringUtil.isEmpty(id)){
            return new ResultMessage(0,"数据不能为空",null);
        }

        Goods goods = goodsService.get(id);
        if(goods == null){
            return new ResultMessage(0,"数据不存在",id);
        }

        goodsService.delete(id);

        return new ResultMessage(1,"删除成功",id);
    }

    @PostMapping("/logicalDelete")
    public ResultMessage logicalDelete(@RequestBody Goods goods){
        if(goods == null){
            return new ResultMessage(0,"数据不能为空",null);
        }

        goodsService.logicalDelete(goods);

        return new ResultMessage(1,"删除成功",goods);
    }
}
