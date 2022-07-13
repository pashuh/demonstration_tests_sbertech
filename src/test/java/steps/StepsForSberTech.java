package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StepsForSberTech {
    @Step("Открываем страницу SberTech")
    public void openPage() {
        open("https://sbertech.ru/");
        $(".min-h-screen.flex.flex-col").shouldHave(text("СберТех"));
    }


    @Step("Кликнуть в хедере 'Вакансии'")
    public void clickVacancies() {
        $(".flex.justify-between.align-baseline.w-full").$("[target=_blank]").click();
        sleep(7000);
    }

    @Step("Перейти на открывшуюся вкладку в браузере")
    public void goswitchTo(int number) {
        switchTo().window(number);
    }

    @Step("Ввести QA в поле 'Какую работу ищешь'")
    public void setValueVacansies(String vacancies) {
        $("[placeholder='Какую работу ищешь?']").setValue(vacancies);
    }

    @Step("Кликнуть 'Найти'")
    public void clickSearch() {
        $("[type=submit]").click();
    }

    @Step("Проверяем наличие искомых вакансий")
    public void findVac(String vacancies) {
        $$("[class='e14jyz651 css-kqyu1g e1j1p76k0']").find(Condition.text(vacancies)).shouldBe(Condition.visible);
    }

    @Step("Проставляем/отключаем вакансии ПАО Сбербанк")
    public void clickPAO() {
        $(".css-1qh51lz.eotq4q00").$(byText("ПАО Сбербанк")).click();
    }

    @Step("Проставляем/отключаем вакансии АО Сбербанк-Технологии")
    public void clickAO() {
        $(".css-1qh51lz.eotq4q00").$(byText("АО Сбербанк-Технологии")).click();
    }

    @Step("Вводим город для поиска вакансий")
    public void setValueCityMoscow() {
        $("[placeholder='Населенный пункт']").setValue("Москва");
        sleep(7000);
        $("[role=presentation]").$(byText("Город Москва")).click();
    }

    @Step("Проверяем в найденных вакансиях выбранный город")
    public void findCity() {
        $$(".css-elfudn").find(Condition.text("Город Москва")).shouldHave(Condition.visible);
    }

    @Step("Проверяем в найденных вакансиях компанию")
    public void findCompany() {
        $$(".css-elfudn").find(Condition.text("ПАО Сбербанк")).shouldHave(Condition.visible);
    }

    @Step("Переходим к программам в вузах")
    public void goToPrograms() {
        $(".flex.justify-between.align-baseline.w-full").$("[href='/streams']").click();
    }

    @Step("Открываем Sberseasons")
    public void openSberseasons() {
        $("[href='https://sbergraduate.ru/sberseasons-moscow/']").click();
    }

    @Step("Заполняем заявку личными данными")
    public void setFIO() {
        $(".hero-sberseasons").$("[name='surname']").setValue("Тест");
        $(".hero-sberseasons").$("[name='name']").setValue("Один");
        $(".hero-sberseasons").$("[name='patronymic']").setValue("Два");
    }

    @Step("Вводим Email")
    public void setMail() {
        $(".hero-sberseasons").$("[name='email']").setValue("test@mail.com");
    }

    @Step("Выбираем город Омск")
    public void setCityOmsk() {
        $(".hero-sberseasons").$(".select__item.is-empty").click();
        $("#select__popup").$(byText("Омск")).click();
//       sleep(2000);
    }

    @Step("Вводим номер телефона")
    public void setPhone() {
        $(".hero-sberseasons").$("[name='phone']").setValue("79993331122");
    }

    @Step("Переходим к командам SberTech")
    public void commandsSberTech() {
        $(".flex.justify-between.align-baseline.w-full").$("[href='/team']").click();
    }

    @Step("Выбираем команду Департамент образовательных цифровых платформ")
    public void depEducation() {
        $(byText("Показать еще")).click();
        $(".justify-start").$(byText("Департамент образовательных цифровых платформ")).click();
    }

    @Step("Проверяем наличие команды Департамент образовательных цифровых платформ")
    public void finddepEducation() {
        $(".text-h4").shouldHave(Condition.text("Департамент образовательных цифровых платформ"));
    }

    @Step("Открываем МФТИ")
    public void openMIPT() {
        $(".grid.grid-cols-12.gap-4").$("[href='/mipt']").click();
    }

    @Step("Открываем программу 'Магистратура'")
    public void goToMagistracy() {
        $(".justify-start").$(byText("Магистратура")).click();
    }

    @Step("Проверяем наличие направления 'Data Engineering'")
    public void findDataE() {
        $("[class='col-span-12 md:col-span-7 lg:col-span-8 mt-[11px]']").shouldHave(text("Data Engineering"));
    }
}
