package tests;


import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.StepsForRabotaSber;


@Owner("pashuh")
@Link(name = "SberTech", url = "https://sbertech.ru/")
public class RabotaSber extends TestBase {
    StepsForRabotaSber steps = new StepsForRabotaSber();
    String vacancies = "QA";

    @Test
    @Tag("job_search")
    @DisplayName("Проверка вакансий в результате поиска по запросу 'QA'")
    public void sberTechTest1() {
        steps.openPage();
        steps.clickCookies();
        steps.clickVacancies();
        steps.goswitchTo(1);
        steps.setValueVacansies(vacancies);
        steps.clickSearch();
        steps.findVac(vacancies);
    }

    @Test
    @Tag("job_search")
    @DisplayName("*Проверка вакансий в результате поиска по запросу 'QA' в ПАО Сбербанк в г. Москва*")
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
    public void sberTechTest5() {
        steps.openPage();
        steps.commandsSberTech();
        steps.depEducation();
        steps.finddepEducation();
    }
}
