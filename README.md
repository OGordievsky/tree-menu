# ShowTreeMenu application
<br/>
<br/>Приложение выводит на собранную через Thymeleaf HTML страницу 
<br/>со всеми категориями из базы данных.
<br/>По локальному адресу: <a href="http://localhost:8080">localhost:8080</a> 
<br/>
<br/>Проект реализует следующие особенности:

* <a href="https://github.com/OGordievsky/tree-menu/tree/kotlin">Kotlin</a> версия
* <a href="https://github.com/OGordievsky/tree-menu/tree/java">Java</a> версия
* MVC структура
* Древовидное меню в Thymeleaf
* Использование рекурсии Thymeleaf при помощи фрагментов

<br/><b>Внимание!</b>
<br/>Обнаружены и исправлены уязвимости в pom.xml зависимостях:
<br/>jackson-databind
<br/>snakeyaml


<br/>Перед тем как запустить проект:
<br/>Убедитесь что на компьютере <a href="https://www.oracle.com/java/technologies/javase/17-0-4-relnotes.html">установлена Java 17</a>
<br/>И <a href="https://git-scm.com/book/en/v2/Getting-Started-Installing-Git">установлен Git</a>
<br/>
<br/><b>Как запустить приложение?</b>
<ul>
<li> Запуск через консоль:</li>
<br/>1. Последовательно введите в консоли команды:
<br/><code>mkdir c:\projects\ShowTreeMenu </code>
<br/><code>cd c:\projects\ShowTreeMenu </code>
<br/><code>git clone https://github.com/OGordievsky/tree-menu </code>
<br/><code>cd c:\projects\ShowTreeMenu\releases </code>
<br/><code>java -Dfile.encoding=utf-8 -jar tree-menu-0.0.3.jar</code>
<br/>
<br/>
<li> Запуск из IntelliJIDEA или другой Java IDE </li> 
<br/>1. Перейдите в свою директорию с проектами "projects"
<br/>2. В этой директории введите консольную команду: <code>git clone https://github.com/OGordievsky/tree-menu </code>
<br/>3. Откроюте любимую среду разработки
<br/>4. И сделайте следующие шаги:<b> Файл -> Открыть -> :\projects\tree-menu</b>
<br/>5. Найдите главный класс "TreeMenuApplication" into: \tree-menu\src\main\java\com\example\treemenu\TreeMenuApplication.java
<br/>6. Нажмите правой кнопкой мыши по TreeMenuApplication.java выберите [Пуск] (зелёный "Play" треугольник)
<br/>
<br/>
<li> Простой запуск в ОС </li> 
<br/>1. Нажмите ->  <a href="https://github.com/OGordievsky/tree-menu/raw/java/releases/Application.zip">"Загрузить"</a> после этого начнётся загрузка архива:
<br/>2. Распакуйте Application.zip внутрь директории проекта.
<br/>3. Двойной щелчок по RunPort8080.bat
<br/>
</ul>
<br/>Приятного использования