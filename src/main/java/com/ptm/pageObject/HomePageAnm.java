package com.ptm.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class HomePageAnm extends PageObject {

    private final By ComprasBtn = By.xpath("//button[contains(text(), ' Compras') and contains(@class, 'rounded hover')]\n");

    public By getComprasBtn() {
        return ComprasBtn;
    }

}
