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

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

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
gradle clean test
```

### ��������� ������ ������

```bash
gradle clean test 
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### ��������� ������

> <code>REMOTE_URL</code> � ����� ���������� �������, �� ������� ����� ����������� �����.
>
> <code>BROWSER</code> � �������, � ������� ����� ����������� ����� (_�� ��������� - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> � ������ ��������, � ������� ����� ����������� ����� (_�� ��������� - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> � ������ ���� ��������, � ������� ����� ����������� ����� (_�� ��������� - <code>1920x1080</code>_).

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

## <img width="4%" title="Allure TestOPS" src="images/logo/Allure_TO.svg"> ���������� � [Allure TestOps](https://allure.autotests.cloud/launch/10145)

### :pushpin: �������� �������

<p align="center">
  <img src="images/screens/Alure_TO.png" alt="dashboards" width="900">
</p>

### :pushpin: ����-�����

<p align="center">
  <img src="images/screens/Alure_TO3.png" alt="test cases" width="900">
</p>

## <img width="4%" title="Jira" src="images/logo/Jira.svg"> ���������� � [Jira](https://jira.autotests.cloud/browse/AUTO-638)

<p align="center">
  <img src="images/screens/Jira.png" alt="jira" width="1000">
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

