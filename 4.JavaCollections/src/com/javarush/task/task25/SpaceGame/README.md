# Задание 19
Поставь width & height побольше и можно играть!
Наслаждаемся игрой :)



# Задание 18
Надо закончить метод draw()
Поступим по аналогии с методом move - сегодня я напишу его сам.



# Задание 17
И еще немного:

Напиши метод createUfo()
Если список НЛО пуст - создай один корабль в центре сверху.

Напиши метод checkBombs()
Надо проверить - не пересеклись между собой какая-нибудь бомба и корабль.
Если пересеклись - корабль и бомба умирают  - die()
Если бомба упала за границу экрана y> height бомба тоже умирает.

Напиши метод checkRockets()
Надо проверить - не пересеклись между собой какая-нибудь ракета и НЛО
Если пересеклись - ракета и нло умирают  - die()
Если ракета улетела за границу экрана y<0, ракета тоже умирает.

Напиши метод removeDead()
В это методе удали из списков ufos, rockets, bombs все мертвые объекты (isAlive() == false



# Задание 16
Надо еще закончить класс Space

Напиши метод getAllItems
Метод должен возвращать один общий список всех объектов типа BaseObject

Напиши метод moveAllItems
Метод должен двигать все объекты по одному разу.
Надо:
а) получить список всех объектов типа BaseObject
б) вызвать у каждого из них метод move()



# Задание 15
Теперь напиши класс Ufo.
Он чуть сложнее класса Bomb и проще SpaceShip.
Тебе понадобятся методы draw(), move(), fire()

Метод  draw() сделай по аналогии с SpaceShip.

Метод move() надо сделать так:
а) корабль перемещается по случайной траектории
Подсказка:
          double dx = Math.random() * 2 - 1;  //-1..1
          double dy = Math.random() * 2 - 1;  //-1..1
б) корабль не опускается в нижнюю половину экрана
y <= height/2
в) Один раз за 10 ходов корабль должен стрелять - вызывать метод fire

Метод fire()
Корабль сбрасывает одну бомбу по середине.
Сделать аналогично классу SpaceShip



# Задание 14
Теперь перейдем к методам draw, move
В методе move() надо:
а) увеличить x на dx
б) проверить, не вылез ли корабль за границы космоса [0, Space.game.getWidth()]
Учти, что ширина корабля равна двум его радиусам.

Метод draw я напишу сам - просто объяви пустой метод.

Еще нам понадобится метод fire(), ведь корабль умеет стрелять.
Этот метод вызывается, когда надо произвести выстрел.
В этом методе надо
а) создать две ракеты
б) установить им координаты левого края корабля и правого края корабля (пушки корабля находятся оп краям)
в) добавить эти ракеты в список ракет объекта game.

Его можно получить так:
Space.game.getRockets()



# Задание 13
Теперь займемся кораблем.
Для сложности сделаем так: если пользователь нажал кнопку влево, то корабль начинает все время двигаться влево.
Если нажал кнопку вправо - все время в право до упора.
Поэтому заведем специальную переменную dx, которая будет хранить направление движения корабля.
если dx = 1, корабль каждый ход идет на 1 вправо
если dx = -1, корабль каждый ход идет на 1 влево
Надо:
а) добавь в класс SpaceShip переменную dx (double, по умолчанию равна 0)
б) метод moveLeft(), устанавливает dx равной -1
в) метод moveRight(), устанавливает dx равной 1
г) добавь конструктор, можно такой:
Радиус корабля будет равен 3. Корабль большой - это вам не ракета и не бомба.
public SpaceShip(int x, int y)
{
    super(x, y, 3);
}



# Задание 12
Теперь напишем класс Rocket.
Практически совпадает с классом Bomb.
Только
а) Ракета летит вверх (т.е. y уменьшается на 1)
б) Рисуем не букву "B", а букву "R"



# Задание 11
Теперь напишем класс Bomb. Тут все просто.
Bomb унаследован от BaseObject.
Надо:
а) написать конструктор
Конструктор Bomb должен выглядеть примерно так:
public Bomb(double x, double y)
{
    super(x, y, 1);
}
x и y переданные в конструктор Bomb мы передаем дальше в конструктор BaseObject с помощью super
Где так же указываем радиус "бомбы" равный 1.

б) написать метод move()
тут все просто - бомба падает вниз  - просто увеличиваем y на 1

в) метод draw(Canvas canvas))
тут тоже не очень сложная логика
Давай просто ставить точку с координатами (x,y) и "цветом" c
canvas.setPoint(x,y,'B');

г) Создай в классе Space нашу игру public static Space game;


# Задание 10
Еще Canvas понадобится два метода, напиши их.
а) метод clear()
Этот метод будет очищать матрицу, чтобы на ней снова можно было рисовать.
Например заменить все символы матрицы на пробелы.

б) метод print()
Этот метод отрисовывает матрицу на экран.
Тут уже ты должен сам разобраться: вывести набор символов не так уж и сложно.
Не забудь добавить пару пустых строк в конце, чтобы матрицы выведенные в разное время не слипались.



# Задание 9
Что мы будем делать с Canvas?
Мы будем рисовать на нем (в его матрице).
Поэтому нам понадобятся два метода
public void setPoint(double x, double y, char c)
public void drawMatrix(double x, double y, int[][] matrix, char c)

Первый метод - setPoint будет "ставить точку в координатах x,y цветом c".
В методе надо:
а) округлить x и y до целых чисел
б) занести в matrix[y][x] значение с
в) ничего не делать, если x<0 или y<0 или y>matrix.length или x>matrix[0].length

Второй метод - drawMatrix копирует переданную ему картинку (матрицу) в матрицу Canvas.
И не просто копирует, а начиная с координат x, y
В методе надо:
а) с помощью двух вложенных циклов пройтись по всем ячейкам переданной картинки
б) если значение ячейки matrix[i][j] не равно 0, то покрасить в матрице объекта Canvas точку (x+j, y+i) в цвет c:
 setPoint(x+j, y+i, c)



# Задание 8
Теперь займемся классом Canvas.
Он у нас будет содержать матрицу, куда мы будем рисовать.
У матрицы есть ширина и высота.
А еще будем в ней хранить не числа(int), а символы (char).
Надо:
а) Добавить в класс две переменные width и height
б) Добавить в класс переменную matrix (char[][])
в) Добавь геттеры для них
г) В конструкторе проинициализируй матрицу



# Задание 7
Но и это еще не все.
Классу BaseObject нужны еще методы.
Пока это будут пустые методы draw() и move().
Классы-наследники должны будут переопределить их у себя и реализовать необходимую функциональность.

Еще добавь метод die() - объект умирает (isAlive=false)

А еще нам нужно будет определять попала бомба в корабль или ракета в НЛО.
Это будем делать так:
Создадим специальный метод: public boolean isIntersec(BaseObject o)
Он будет определять - "пересеклись" объекты или нет. Если пересеклись - возвращать true, если нет - false.

Т.к. объекты мы условно считаем кругами, то предлагаю такую формулу взаимодействия
Если центр круга одного объекта попал в круг другого, то будем считать, что они столкнулись.
Или еще проще:
дистанция_между_объектами < max (радиус_первого_объекта, радиус_второго_объекта)



# Задание 6
Теперь перейдем к классу BaseObject.
Я хочу сделать несколько предложений.

Во-первых для простоты считать все объекты у нас в космосе круглыми.
Нет, отрисовывать их мы будем фигурными, как и раньше.
А вот при расчетах из взаимодействия исходить из того, что они круглые.
Так - гораздо проще.

Во-вторых. Пусть координаты объектов и радиус будут вещественными числами.
Это придаст плавность движениям и точность всем вычислениям.
А при отрисовке мы будем их округлять

Надо:
а) Добавь в класс BaseObject  переменные x(double), y (double), radius (double), геттеры и сеттеры для них.
б) Добавить логическую переменную isAlive (жив объект или уже нет)
в) Добавить геттеры (isAlive()-метод для isAlive-переменной)
г) Добавить конструктор BaseObject(double x, double y, double radius)
д) Проследить, чтобы в конструкторе isAlive устанавливался в true (мертворожденные нам ни к чему)
е) Надо пройтись по все классам-наследникам и поправить у них конструкторы
Если вы пользуйтесь Intellij IDEA - Alt+Insert вам в помощь



# Задание 5
Чего не хватает классу Space?
Правильно - методов run() и draw().
run управляет всей логикой игры, если ты помнишь.
А draw отвечает за отрисовку очередного "кадра".

А еще нам пригодится метод sleep(int ms)
Создай их.



# Задание 4
Для чего нам нужен класс Space?
Чтобы хранить в себе все объекты и управлять их взаимодействием.
А какие параметры должны у него быть?
width (ширина), height (высота).
А еще?
а) ship (космический корабль),
б) список для хранения всех НЛО -  ufos (ArrayList<Ufo>)
в) список для хранения всех ракет -  rockets (ArrayList<Rocket>)
г) список для хранения всех бомб -  bombs (ArrayList<Bomb>)

Задание:
Добавь все эти переменные к классу Space.
Инициализируй коллекции.
И не забудь добавить переменным getter'ы, а для ship еще и setter!

А что должен содержать конструктор?
Достаточно будет width и height

# Задание 3
У нас будут бомбы и ракеты.
Значит нам нужны классы Bomb(бомба) и Rocket(ракета).
Создай их.

У наших объектов будет много общего.
Они будут перемещаться по космосу и отрисовываться.
Значит у них у всех будут координаты и размер.
А еще методы move() - для перемещения и draw() для отрисовки.

Есть интересное предложение: давай введем один базовый класс для все объектов.
Пусть это будет класс BaseObject.
А классы Ufo, SpaceShip, Rocket, Bomb от него наследуются.
Создай класс BaseObject и добавь его родителем к классам Ufo,SpaceShip, Rocket, Bomb

Еще нам понадобится класс Canvas
Он будет ответственным за "отрисовку" объектов.
С помощью его они будут отрисовывать себя.
Вернее даже на нем.
Создай и этот класс.



# Задание 2
Так. Чего на не хватает?
Метода main, конечно.
Вот с него и начнем.
Добавь метод main в класс Space



# Задание 1
Давай напишем новую компьютерную игрушку.
У нас будет космический корабль, который стреляет ракетами в НЛО.
А НЛО в свою очередь сбрасывает на корабль бомбы.
Ну и, конечно, все дело происходит в космосе.

Нам понадобятся классы: Space(космос), SpaceShip(космический корабль) и Ufo(НЛО)
Создай классы: Space, SpaceShip, Ufo