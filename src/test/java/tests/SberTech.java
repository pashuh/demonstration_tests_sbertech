package tests;


import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import steps.StepsForSberTech;


@Owner("pashuh")
@Link(name = "SberTech", url = "https://sbertech.ru/")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SberTech extends TestBase {
    StepsForSberTech steps = new StepsForSberTech();
    String vacancies = "QA";

    @Test
    @Tag("job_search")
    @DisplayName("Проверка вакансий в результате поиска по запросу 'QA'")
    @Order(1)
    public void sberTechTest1() {
        steps.openPage();
        steps.clickVacancies();
        steps.goswitchTo(1);
        steps.setValueVacansies(vacancies);
        steps.clickSearch();
        steps.findVac(vacancies);
    }

    @Test
    @Tag("job_search")
    @DisplayName("*Проверка вакансий в результате поиска по запросу 'QA' в ПАО Сбербанк в г. Москва*")
    @Order(2)
    public void sberTechTest2() {
        steps.openPage();
        steps.clickVacancies();
        steps.goswitchTo(2);
        steps.clickPAO();
        steps.clickAO();
        steps.setValueVacansies(vacancies);
        steps.setValueCityMoscow();
        steps.clickSearch();
        steps.findVac(vacancies);
        steps.findCity();
        steps.findCompany();
    }


    @Test
    @Tag("viewing_programs")
    @DisplayName("Проверка наличия образовательной программы Магистратуры 'Data Engineering' на кафедре СберТеха в МФТИ")
    @Order(3)
    public void sberTechTest3() {
        steps.openPage();
        steps.goToPrograms();
        steps.openMIPT();
        steps.goswitchTo(3);
        steps.goToMagistracy();
        steps.findDataE();
    }


    @Test
    @Tag("application")
    @DisplayName("Проверка возможности заполнение заявки в Sberseasons")
    @Order(4)
    public void sberTechTest4() {
        steps.openPage();
        steps.goToPrograms();
        steps.openSberseasons();
        steps.goswitchTo(4);
        steps.setFIO();
        steps.setMail();
        steps.setCityOmsk();
        steps.setPhone();
    }

    @Test
    @Tag("viewing_commands")
    @DisplayName("Проверка наличия команды 'Департамент образовательных цифровых платформ' в SberTech")
    @Order(5)
    public void sberTechTest5() {
        steps.openPage();
        steps.commandsSberTech();
        steps.depEducation();
        steps.finddepEducation();
    }
}
