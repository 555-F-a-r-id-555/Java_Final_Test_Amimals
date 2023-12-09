### Итоговая контрольная работа

    Информация о проекте
    Необходимо организовать систему учета для питомника в котором живут
    домашние и вьючные животные.
    Как сдавать проект
    Для сдачи проекта необходимо создать отдельный общедоступный
    репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом
    репозитории, использовать пул реквесты на изменения. Программа должна
    запускаться и работать, ошибок при выполнении программы быть не должно.
    Программа, может использоваться в различных системах, поэтому необходимо
    разработать класс в виде конструктора

### Задание

    1. Используя команду cat в терминале операционной системы Linux, создать
    два файла Домашние животные (заполнив файл собаками, кошками,
    хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
    ослы), а затем объединить их. Просмотреть содержимое созданного файла.
    Переименовать файл, дав ему новое имя (Друзья человека).
    2. Создать директорию, переместить файл туда.
    3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
    из этого репозитория.
    4. Установить и удалить deb-пакет с помощью dpkg.
    5. Выложить историю команд в терминале ubuntu
    6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
    животные и вьючные животные, в составы которых в случае домашних
    животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
    войдут: Лошади, верблюды и ослы).
    7. В подключенном MySQL репозитории создать базу данных “Друзья
    человека”
    8. Создать таблицы с иерархией из диаграммы в БД
    9. Заполнить низкоуровневые таблицы именами(животных), командами
    которые они выполняют и датами рождения
    10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
    11.Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице
    12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.
    13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
    14. Написать программу, имитирующую работу реестра домашних животных.
    В программе должен быть реализован следующий функционал:
    14.1 Завести новое животное
    14.2 определять животное в правильный класс
    14.3 увидеть список команд, которое выполняет животное
    14.4 обучить животное новым командам
    14.5 Реализовать навигацию по меню
    15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
    значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
    животное” Сделайте так, чтобы с объектом такого типа можно было работать в
    блоке try-with-resources. Нужно бросить исключение, если работа с объектом
    типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
    считать в ресурсе try, если при заведения животного заполнены все поля.

------------------------------------------------

### Итоговая диаграмма классов, пункт 6 ---------------------------------->

[![Java_Final_test_animals](https://i.ibb.co/ZJTkm65/JAVA-ANIMALS7-drawio.png)](https://i.ibb.co/ZJTkm65/JAVA-ANIMALS7-drawio.png "Animals")

### SQL Диаграмма из DBeaver в соответствии с 1NF  ---------------------------------->

[![Java_Final_test_animals](https://i.ibb.co/pxKgzVD/Human-Friends.png)](https://i.ibb.co/pxKgzVD/Human-Friends.png "Animals")

### Диаграмма классов из IntelliJ IDEA  ---------------------------------->

[![Java_Final_test_animals](https://i.ibb.co/yyHcYsP/uml-diagram-animals.png)](https://i.ibb.co/yyHcYsP/uml-diagram-animals.png "Animals")

### SQL Диаграмма после ---------------------------------->

    Выполнение пунктов 10,11:
    10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу
    11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице

[![Java_Final_test_animals](https://i.ibb.co/PjdJ0RY/Human-Friends-Horse-And-Donkey-Combined-Animals-1-to-3-Years.png)](https://i.ibb.co/PjdJ0RY/Human-Friends-Horse-And-Donkey-Combined-Animals-1-to-3-Years.png "Animals")

### Устанавливаю LAMP на Ubuntu ---------------------------------->

    LAMP представляет собой набор серверных программ с открытым исходным кодом, который устанавливается на сервер как комплект софта, предназначенный для размещения веб-сайтов. Данная четырёхбуквенная аббревиатура обозначает, что:
        •    в операционной системе семейства Linux (L)
        •  I) разворачивается веб-сервер Apache (A)
        •  III ) и устанавливается система управления базами данных MySQL (M)
        •  II ) для создания веб-страниц на языке PHP (P).
--------------------------------------------

    I ) Установка Apache
    1) sudo apt update
    2) sudo apt install apache2

    II ) Установка PHP
    3) sudo apt install sudo apt install php-common php php-curl php-gd php-mbstring php-xml php-xmlrpc php-soap php-intl php-zip    
    4) php -v
            
    III ) Установка MySQL
    5) sudo apt install mysql-server
    6) mysql --version

----------------------------------------------

    IV) Установка phpMyAdmin
    качаем phpmyadmin-> https://www.phpmyadmin.net/
    перемещаем в папку  
    7) sudo mv /home/fred3/Downloads/phpMyAdmin.zip /var/www/html
    8) sudo unzip phpMyAdmin.zip
    9) cd /var/www/html  # Перейти в директорию, где находится phpMyAdmin  
    10) sudo mv phpMyAdmin-5.2.1-all-languages phpmyadmin # Переименовать phpMyAdmin в phpmyadmin

    11) sudo apt install php-mysqli

    12) sudo systemctl restart apache2
    13) sudo nano /etc/php/8.1/apache2/php.ini
    14) extension=mysqli.so # Найдите и раскомментируйте (если они закомментированы) строки, связанные с расширением mysqli 
    15) sudo systemctl restart apache2

    теперь, захожу через браузер в phpmyфвьшт для
    взаимодействия с mysql
    16) http://localhost/phpmyadmin/
    и тут возникает проблема с входом, у рута нет пароля 

---------------------------------------------

    V) Настройка MySQL
    17) sudo mysql

    Для входа в phpMyAdmin при помощи root, необходимо изменить метод аутентификации: от использования плагина auth_socket на метод, использующий пароль. Для этого нужно перейдя в командную строку MySQL,ввести: 

    18) mysql> SELECT user, authentication_string, plugin, host FROM mysql.user;
    19) mysql> ALTER USER 'root'@'localhost' IDENTIFIED WITH caching_sha2_password BY '123';
    20) mysql> SELECT user,authentication_string, plugin, host FROM mysql.user;

    теперь нужно проверить будет ли работать http://192.168.1.68/localhost на основном компе

     192.168.68 - это ip VM(Virtual Machine) hostname -I
---------------------------------------------

    Теперь нужно настроить подключение с основной машины к VM для работы в mysql через консоль , чтобы работало http://192.168.1.68:3306
    Это нужно для подключения JDBC-драйвера в java к нашей БД на VM.
    ----------------------------------------
    VI) Настройка подключения Mysql часть-2

    21) sudo nano /etc/mysql/mysql.conf.d/mysqld.cnf

    В файле конфигурации БД /etc/mysql/mysql.conf.d/mysqld.cnf в блоке [mysqld] прописываем строчку bind-address = 0.0.0.0 
    Здесь база данных будет слушать все ip адреса для удаленного подключения 

    Проверяем, если есть строка, содержащая skip-networking, закомментируйте ее, добавив # в начале строки. (у меня этой строки не было)

-------------------------------------------------

    VII ) Настройка брандмауэра

    22) Проверяем открыт или порт 3306 командой
    nmap -p 3306 192.168.1.68
    (,где 192.168.1.68 ip VM на которой настраиваем базу) 
    23) sudo apt install nmap

    В виртуальной машине  изначально используется iptables в качестве брандмауэра, приведенные ниже команды разрешат доступ с любого IP-адреса

    24) sudo iptables -I INPUT 1 -p tcp --dport 3306 -j ACCEPT

    Но это не безопасно, поэтому делаем команду с установкой конкретного ip с которого можно коннектится

    25)   iptables -I INPUT 1 -s 192.168.1.65 -p tcp --dport 3306 -j ACCEPT

    192.168.1.65 – ip основного компа, на котором установлена VM,
    можно узнать через ipconfig в windows.
    (этот ip может меняться после перезагрузки*)

    Обратите внимание на присутствие в строке цифры 1, это означает что это разрешение встанет в начало таблицы iptables в блоке Chain INPUT

    Проверить наличие строки можно командой

    27) iptables -nL —line-numbers
    --------------------------------------------
    28) sudo mkdir -p /etc/iptables
    29) sudo sh -c 'iptables-save > /etc/iptables/rules.v4'

------------------------------------------------

    VIII) Предоставляем доступ пользователю с основного компа к Mysql на VM

    30) mysql -u root -p123
    31) CREATE USER 'fred1'@'192.168.1.65' IDENTIFIED BY '123'; # правильно

    CREATE USER 'ip64'@'192.168.1.64' IDENTIFIED BY '123';

    32) GRANT ALL PRIVILEGES ON *.* TO 'fred1'@'192.168.1.65' WITH GRANT OPTION;

    GRANT ALL PRIVILEGES ON *.* TO 'ip64'@'192.168.1.64' WITH GRANT OPTION;

    33)exit
    34) sudo systemctl restart mysql
    35) sudo systemctl status mysql

    36) mysql -h 192.168.1.68 -u fred1 -p123
    37) mysql -h 192.168.1.68 -u ip64 -p123 (при повторном подключении изменился ip, поэтому я создал нового, на всякий случай)

    ура, наконец все работает ;)
    скриншоты в папке LAMP_MYSQL_PhpMyAdmin 

---------------------------------------

### Выполнение пунктов c 1 по 5 включительно

    1) clear
    2) cat > Pets <<EOF
        Dogs
        Cats
        Hamsters
        EOF
    3) pwd
    4) cat > Pets.txt <<EOF
        Dogs
        Cats
        Hamsters
        EOF
    5) cat > "Pack animals" <<EOF
        Horses
        Camels
        Donkeys
        EOF
    6) cat > "Pack animals.txt" <<EOF
        Horses
        Camels
        Donkeys
        EOF
    7) cat Pets "Pack animals" > All_animals
    8)  cat All_animals
    9)  cat Pets.txt "Pack animals.txt" > All_animals.txt
    10)  cat All_animals.txt

# -----------------------------------------------

    11)  mv All_animals "Human Friends"
    12)  mv All_animals.txt "Human Friends.txt"
    13)  ls
    14)  mkdir HumanFriends1
    15)  mv "Human Friends" HumanFriends1/
    16)  mkdir HumanFriends2
    17)  mv "Human Friends.txt" HumanFriends2/
    18)    ls
    19)  ls HumanFriends1
    20)  ls HumanFriends2
    21)  uname -a
    22)  sudo apt update
    23)  sudo apt install software-properties-common
    24)  sudo add-apt-repository 'deb <http://repo.mysql.com/apt/ubuntu/> 22.04 mysql-8.0'
    25)  sudo apt update
    26)  sudo apt install mysql-server
    27)  mysql --version

# -----------------------------

    28) sudo apt --fix-broken install
    29) wget <http://archive.ubuntu.com/ubuntu/pool/universe/h/htop/htop_2.2.0-1_amd64.deb>
    30) sudo apt install wget
    31) wget <http://archive.ubuntu.com/ubuntu/pool/main/n/nano/nano_5.8-1_amd64.deb>
    32) wget <https://download.geany.org/geany-1.38.1/geany_1.38.1_amd64.deb>
    33) sudo apt install ./teamviewer_amd64.deb
    34) sudo apt install -f
    35) systemctl status teamviewerd.service
    36) teamviewer
    37) sudo dpkg -i teamviewer_amd64.deb
    38) sudo apt install ./teamviewer_amd64.deb

# -------------------------------------------

    39) sudo dpkg –i ./nginx_1.14.0-0ubuntu1.6_all.deb
    40) wget <http://archive.ubuntu.com/ubuntu/pool/main/a/apache2/apache2_2.4.48-3+ubuntu18.04.1+deb.sury.org+1_amd64.deb>
    41) wget <http://archive.ubuntu.com/ubuntu/pool/main/a/apache2/apache2-bin_2.4.52-1ubuntu4_amd64.deb>

# ------------------------------------------

    42) pwd
    43) ls
    44) sudo dpkg -i apache2-bin_2.4.52-1ubuntu4_amd64.deb
    45) sudo apt-get update
    46) sudo apt-get install -f
    47) sudo dpkg -i apache2-bin_2.4.52-1ubuntu4_amd64.deb
    48) sudo rm /var/lib/dpkg/lock-frontend
    49) sudo rm /var/lib/dpkg/lock
    50) sudo dpkg -i apache2-bin_2.4.52-1ubuntu4_amd64.deb
    51) sudo systemctl status apache2
    52) sudo dpkg -P apache2-bin_2.4.52-1ubuntu4_amd64.deb
    53) sudo dpkg -P apache2-bin
    54) dpkg -l | grep apache2-bin
    55) dpkg -l
    56) history

Скриншоты в папке LINUX

### Выполнение пункта 7

     В подключенном MySQL репозитории создать базу данных “Human
    Friends”

    Заходим в Windows PowerShell
    1) ipconfig # проверяем не изменился ли ip основного компа
    2) mysql -h 192.168.1.68 -u ip64 -p123 # подключаемся к репозиторию
    3) mysql> show databases; -- просматриваем список БД
    Подключение уже установлено.

    Дальнейшие действия делать не обязательно, это для самопроверки.
    Проверяем в браузере
    4) http://192.168.1.68:3306/
    тоже самое, только через phpMyAdmin
    user:root
    password:123
    5)http://192.168.1.68/phpmyadmin/

    теперь подключим DBeaver или Workbench(для проверки), для создания и редактирования БД 
    6)URL: jdbc:mysql://192.168.1.68:3306/
    user:ip64
    password:123
    В Свойствах драйвера, устанавливаем:
    allowPublicKeyRetrieval: True (поумолчанию false)
    Тестируем соединение. Все ОК

    Для работы БД подключаем IntelliJ IDEA Ultimate, с помощью JDBC - драйвера
    Драйвер скачается автоматически.

    7) В разделе Databases (справа, верхний угол):
    Name:@192.168.1.68
    Host:192.168.1.68 Port:3306
    User:ip64
    Password:123
    URL: jdbc:mysql://192.168.1.68:3306/
    Test Connection MySql 8.0.35 
    Apply->OK Соединение установлено.

    8) нужно еще добавить запись в pom.xml:
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.26</version> <!-- Укажите актуальную версию -->
        </dependency>
    </dependencies>

    Только после этого все будет работать корректно

[![Java_Final_test_animals](https://i.ibb.co/WxF7Mgn/17.png)](https://i.ibb.co/WxF7Mgn/17.png "connection to Mysql")

[![Java_Final_test_animals](https://i.ibb.co/Dz8TWxr/25.png)](https://i.ibb.co/Dz8TWxr/25.png "connection to Mysql")

# ---------------------------------------

    теперь создадим БД HumanFriends
    9) -- Создание базы данных "HumanFriends"
    CREATE DATABASE IF NOT EXISTS HumanFriends3;

    остальные команды описаны в файле: 01_createNewDbAndTables.sql
    который находится в папке mysql_commands

### Выполнение пунктов c 8 по 12 включительно

    1)Пункт 8 и 9 : 01_createNewDbAndTables.sql
    При создании таблиц учитываем NF:
    NF1 гласит: Все графы должны содержать только одно значение,
    Для уникальных идентификаторов должен быть PRIMARY KEY (первичный ключ)
    В таблице не должно быть повторяющихся столбцов

    В связи с этим,список команд для каждго животного нужно вынести в отдельную таблицу и с помощью FOREIGN KEY (внешних ключей) их связать
    При том будут 2 связывающии таблицы: Pets_Commands_Relationship и PackAnimals_Commands_Relationship. 

    Пункт 10 (Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.):
    2) 02_deleteCamelsAndCreateAnimals1to3years.sql
    Удаление придется выполнять их нескольких таблиц: PackAnimals_Commands_Relationship и
    PackAnimals
    Заполнять будем с помощью SELECT и объединять UNION ALL.

    Пункт 11 (Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице):
    3) 02_deleteCamelsAndCreateAnimals1to3years.sql
    Для заполнения таблицы Combined_Animals_1_to_3_Years , осуществим два запроса к таблицам Pets и PackAnimals
    возраст вычислим вот так:
    CONCAT(
        FLOOR(DATEDIFF(NOW(), BirthDate) / 365), ' год ',
        FLOOR((DATEDIFF(NOW(), BirthDate) % 365) / 30.44), ' месяцев ',
        ROUND(DATEDIFF(NOW(), BirthDate) % 30.44), ' дней'
    ) AS AgeDescription

    Пункт 12( Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.)
    4) 03_combineAll.sql
    До того как объединить таблицы: Pets и PackAnimals, нужно создать дополнительный столбец commands и в него добавить весь список коменд 
    Объединяем в таблицу - Animals

    и наконец, оставляем одну таблицу 
    и удаляем все остальные (такого пункта нет):
    5)04_deleteAll.sql
    этого делать не обязательно,удаляем все лишние таблицы кроме Animals

   В результате мы получаем:

[![Java_Final_test_animals](https://i.ibb.co/ZVfKHyx/20.png)](https://i.ibb.co/ZVfKHyx/20.png "connection to Mysql")
