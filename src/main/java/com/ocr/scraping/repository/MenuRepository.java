package com.ocr.scraping.repository;

import com.ocr.scraping.model.MenuImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuImage, Long> {
}
