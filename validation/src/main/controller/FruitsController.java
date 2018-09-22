package controller;

import entity.Fruit;
import groups.FruitsGroup1;
import groups.FruitsGroup2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//标识是一个控制器，可以被处理器适配器找到
@Controller
public class FruitsController {

    //@RequestMapping实现将queryList方法和url进行映射，一个方法对应一个url
    //一般建议将url设置和方法写一样
    @RequestMapping(value="/queryList")
    public String queryList(Model model, @Validated(value = FruitsGroup2.class) Fruit fruit, BindingResult bindingResult) {
        List<ObjectError> allErrors = null;
        if(bindingResult.hasErrors()){
            allErrors = bindingResult.getAllErrors();
            for(ObjectError objectError:allErrors){
                System.out.println(objectError.getDefaultMessage());
            }
        }
        model.addAttribute("allErrors",allErrors);
        return "/fruitsList";
    }
}
