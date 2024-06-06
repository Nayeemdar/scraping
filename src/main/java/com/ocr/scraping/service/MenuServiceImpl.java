package com.ocr.scraping.service;

import com.ocr.scraping.model.OCRResult;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class MenuServiceImpl implements MenuService {

    @Override
    public OCRResult performOCR(MultipartFile menuImage) {
        OCRResult ocrResult = new OCRResult();
        try {
            File imageFile = convertMultiPartToFile(menuImage);
            ITesseract tesseract = new Tesseract();
            tesseract.setDatapath("path/to/tessdata");
            String extractedText = tesseract.doOCR(imageFile);
            ocrResult.setExtractedText(extractedText);
        } catch (Exception e) {
            e.printStackTrace();
            // Handle OCR exception
        }
        return ocrResult;
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        file.transferTo(convFile);
        return convFile;
    }
}