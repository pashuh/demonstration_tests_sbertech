# ������ �� ������������� ������������ ����� �������

## :page_with_curl:	����������

> :heavy_check_mark: [���������� � �����������](#technologist-����������-�-�����������)
>
> :heavy_check_mark: [����������� ��������](#bookmark_tabs-�����������-��������)
>
> :heavy_check_mark: [������ ������ �� ���������](#computer-������-������-��-���������)
>
> :heavy_check_mark: [������ ������ � Jenkins](#-������-������-�-jenkins)
>
> :heavy_check_mark: [����� � ����������� ������������ � Allure Report](#-�����-�-�����������-������������-�-allure-report)
>
>
> :heavy_check_mark: [����������� � Telegram � �������������� ����](#-�����������-�-telegram-�-��������������-����)
>
> :heavy_check_mark: [������ ������� ����� � Selenoid](#-������-�������-�����-�-selenoid)

## :technologist: ���������� � �����������

<p  align="center"

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Selenoid" src="images/logo/Selenoid.svg"></code>
<code><img width="5%" title="Selenide" src="images/logo/Selenide.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/logo/Junit5.svg"></code>
<code><img width="5%" title="GitHub" src="images/logo/GitHub.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></code>
<code><img width="5%" title="Jira" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>

> *� ������ ������� ��������� �������� �� <code><strong>*Java*</strong></code> � �������������� ���������� <code><strong>*Selenide*</strong></code> ��� UI-������.*
>
>*��� ������ ������� ������������ <code><strong>*Gradle*</strong></code>.*
>
>*<code><strong>*JUnit 5*</strong></code> ������������ ��� ��������� ��� ���������� ������������.*
>
>*������ ������ ����������� �� <code><strong>*Jenkins*</strong></code>.*
>
>*<code><strong>*Selenoid*</strong></code> ������������ ��� ������� ��������� � �����������  <code><strong>*Docker*</strong></code>.*
>
>*<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> ������������ ��� ������������ ����������� ������������.*


## :bookmark_tabs: ����������� ��������

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; UI

> - [x] *�������� �������� �� �������� ����������� �������� '������'*
>- [x] *�������� ������ � �������*
>- [x] *�������� ������� '� ��������'*
>- [x] *�������� �������� �� �������� ������� �� ������� '�������'*
>- [x] *�������� ������ ������� ��������*
>- [x] *�������� ������� '�������'*
>- [x] *�������� ������ ������*
>- [x] *�������� ���������� �������� �� �����*
>- [x] *�������� ��������� ������� ��������*

## :computer: ������ ������ �� ���������

### ��������� ������ ������

```bash
gradle clean testSberTech
```

### ��������� ������ ������

```bash
gradle
clean
testSberTech
-Dremote=${ADDRESS}
-Dbrowser=${BROWSER}
-Dversion=${BROWSER_VERSION}
-Dresolution=${RESOLUTION}
```

### ��������� ������

> <code>REMOTE</code> � ����� ���������� �������, �� ������� ����� ����������� �����.
>
> <code>BROWSER</code> � �������, � ������� ����� ����������� ����� (_�� ��������� - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> � ������ ��������, � ������� ����� ����������� ����� (_�� ��������� - <code>100</code>_).
>
> <code>RESOLUTION</code> � ������ ���� ��������, � ������� ����� ����������� ����� (_�� ��������� - <code>1920x1080</code>_).

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> ������ ������ � [Jenkins](https://jenkins.autotests.cloud/job/AUTO-638/)

*��� ������� ������ ���������� ������� �������� ���������� � ������ ������ <code><strong>*�������*</strong></code>.*

<p align="center">
  <img src="images/screens/Jenkins.png" alt="job" width="800">
</p>

*����� ���������� ������, � ����� <code><strong>*������� ������*</strong></code> �������� ������ ������ ��������
������ <img width="2%" title="Allure Report" src="images/logo/Allure.svg"><code><strong>*Allure
Report*</strong></code>, ������� �� ��������, ��������� �������� � �������������� html-�������.*

<p align="center">
  <img src="images/screens/Jenkins2.png" alt="job" width="1000">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> ����� � ����������� ������������ � [Allure Report](https://jenkins.autotests.cloud/job/AUTO-638/8/allure/)

### :pushpin: ����� ����������

*������� �������� Allure-������ �������� ��������� �������������� �����:*

> - [x] <code><strong>*ALLURE REPORT*</strong></code> - ���������� ���� � ����� ����������� �����, ����� ���������� ���������� ������, � ����� ��������� � ��������� �������� � ���������� ��������, ������� � ����������� � �������� ���������� ������
>- [x] <code><strong>*TREND*</strong></code> - ���������� ����� ����������� ������ �� ������ � ������
>- [x] <code><strong>*SUITES*</strong></code> - ���������� ������������� ����������� ������ �� �������� �������
>- [x] <code><strong>*ENVIRONMENT*</strong></code> - ���������� �������� ���������, �� ������� ����������� ����� (� ������ ������ ���������� �� ������)
>- [x] <code><strong>*CATEGORIES*</strong></code> - ���������� ������������� ��������� ��������� ������ �� ����� ��������
>- [x] <code><strong>*FEATURES BY STORIES*</strong></code> - ���������� ������������� ������ �� �����������, ������� ��� ���������
>- [x] <code><strong>*EXECUTORS*</strong></code> - ���������� ����������� ������� ������ (������ �� ������ � Jenkins)

<p align="center">
  <img src="images/screens/Alure_Report3.png" alt="Allure Report" width="900">
</p>



## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> ����������� � Telegram � �������������� ����

> ����� ���������� ������ ����������� ���, ��������� � <code>Telegram</code>, ������������� ������������ � ���������� ��������� � ������� � ������� ������.

<p align="center">
<img title="Telegram Notifications" src="images/screens/Telegram.png">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> ������ ������� ����� � Selenoid

> � ������� ����� � ������ ����������� �����.
<p align="center">
  <img title="Selenoid Video" src="images/gif/test.gif">
</p>

