package com.qiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.qiu.entity.FoodStalls;
import com.qiu.dao.FoodStallsMapper;
import java.util.List;

@Controller
public class AdminFoodStallsController {

    private final FoodStallsMapper foodStallsMapper;

    public AdminFoodStallsController(FoodStallsMapper foodStallsMapper) {
        this.foodStallsMapper = foodStallsMapper;
    }

    @GetMapping("/admin_foodstalls")
    public String showAdminFoodStalls(Model model) {
        // 获取所有档口数据
        List<FoodStalls> foodStalls = foodStallsMapper.getAllFoodStalls();
        model.addAttribute("foodStalls", foodStalls);
        return "admin_foodstalls";
    }

    @GetMapping("/fix_foodstall/{id}")
    public String showFixFoodStallForm(@PathVariable Long id, Model model) {
        // 根据id获取要修改的档口数据
        FoodStalls foodStalls = foodStallsMapper.getFoodStallsById(id);
        model.addAttribute("foodStalls", foodStalls);
        return "fix_foodstall";
    }

    @PostMapping("/fix_foodstall/{id}")
    public String fixFoodStall(@PathVariable Long id, FoodStalls updatedFoodStalls, RedirectAttributes redirectAttributes) {
        // 设置要更新的档口的ID
        updatedFoodStalls.setFoodStallsID(Math.toIntExact(id));

        // 调用更新方法
        int affectedRows = foodStallsMapper.updateFoodStalls(updatedFoodStalls);

        if (affectedRows > 0) {
            redirectAttributes.addFlashAttribute("message", "档口修改成功！");
        } else {
            redirectAttributes.addFlashAttribute("error", "档口修改失败！");
        }

        return "redirect:/admin_foodstalls";
    }
}
