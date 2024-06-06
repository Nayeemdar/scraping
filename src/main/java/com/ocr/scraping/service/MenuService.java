package com.ocr.scraping.service;


import com.ocr.scraping.model.OCRResult;
import org.springframework.web.multipart.MultipartFile;

public interface MenuService {

    OCRResult performOCR(MultipartFile menuImage);

}
