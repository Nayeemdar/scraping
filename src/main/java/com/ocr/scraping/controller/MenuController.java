package com.ocr.scraping.controller;

import com.ocr.scraping.model.OCRResult;
import com.ocr.scraping.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/perform-ocr")
    public OCRResult performOCR(@RequestParam("menuImage") MultipartFile menuImage) {
        return menuService.performOCR(menuImage);
    }
}
