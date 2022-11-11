package org.example.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.model.dto.ProductDto;
import org.example.model.param.ProductParam;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/")
    public String queryAll(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                           @RequestParam(value = "conditions",required = false,defaultValue ="") String conditions,
                           @RequestParam(value = "id",required = false,defaultValue = "0")int id,
                           Model model
    ){
        PageHelper.startPage(pageNum,2);
        List<ProductDto> productDtos = productService.queryAll(conditions,id);
        PageInfo<ProductDto> PageInfo = new PageInfo<>(productDtos);
        model.addAttribute("PageInfo",PageInfo);
        model.addAttribute("conditions",conditions);
        return "index";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/insert")
    public String insert(){
        return "add";
    }

    @PostMapping("/add")
    public String add(ProductParam productParam){
        productService.add(productParam);
        return "redirect:/";
    }
    @GetMapping("/zj/{id}")
    public String zj(@PathVariable("id") int id,Model model){
        model.addAttribute("zhij",productService.queryAll("",id));
        return"zj";
    }
    @GetMapping("/xg")
    public String xiugai(ProductParam productParam){
        productService.xiugai(productParam);
        return"redirect:/";
    }

}
