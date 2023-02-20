# Построй дерево (5)

Добавлять в дерево элементы мы можем, теперь займись удалением:
необходимо реализовать метод remove(Object o) для удаления элемента дерева, имя которого было получено в качестве параметра.

Если переданный объект не является строкой, метод должен бросить UnsupportedOperationException.
Если в дереве присутствует несколько элементов с переданным именем - можешь удалить только первый найденный.

Не забывай сверять поведение своего дерева с картинкой:
https://cdn.javarush.com/images/system/30700d64-c8c1-4c32-a8d2-85bc078ddde7/original.jpeg

Что будет, если удалить из дерева элементы &quot;3&quot;, &quot;4&quot;, &quot;5&quot; и &quot;6&quot;, а затем попытаться добавить новый елемент?
В таком случае элементы &quot;1&quot; и &quot;2&quot; должны восстановить возможность иметь потомков (возможно, придется внести изменения в метод add()).


Требования:
1.	После удаления последнего добавленного элемента из дерева с помощью метода remove, метод size должен возвращать N-1.
2.	После удаления второго элемента добавленного в дерево, метод size должен возвращать N/2 + 1 (для случаев где N &gt; 2 и является степенью двойки), N - размер дерева до удаления.
3.	Если переданный объект не является строкой, метод remove() должен бросить UnsupportedOperationException.
4.	Если ни один элемент не способен иметь потомков, необходимо восстановить такую возможность.


# Построй дерево (4)

Любое дерево начинается с корня, поэтому не забудь в класс CustomTree добавить поле root типа Entry&lt;String&gt; c модификатором доступа по умолчанию.
Инициируй его в конструкторе CustomTree, имя (elementName) не важно.

Итак, основа дерева создана, пора тебе поработать немного самому.
Вспомним как должно выглядеть наше дерево.

Элементы дерева должны следовать так как показано на картинке:
http://info.javarush.ru/uploads/images/00/04/89/2014/03/21/ee9a9b.jpg

Необходимо написать методы, которые бы позволили создать такую структуру дерева и проводить операции над ней.
Тебе необходимо:
1) переопределить метод add(String s) - добавляет элементы дерева, в качестве параметра принимает имя элемента(elementName), искать место для вставки начинаем слева направо.
2) переопределить метод size() - возвращает текущее количество элементов в дереве.
3) реализовать метод getParent(String s) - возвращает имя родителя элемента дерева, имя которого было полученного в качестве параметра.

Если необходимо, можешь вводить дополнительные методы и поля, не указанные в задании.



# Построй дерево (3)

Класс описывающий дерево мы создали, теперь нужен класс описывающий тип элементов дерева:
1) В классе CustomTree создай вложенный статический параметризированный класс Entry&lt;T&gt; с модификатором доступа по умолчанию.
2) Обеспечь поддержку этим классом интерфейса Serializable.
3) Создай такие поля (модификатор доступа по умолчанию):
- String elementName;
- boolean availableToAddLeftChildren, availableToAddRightChildren;
- Entry&lt;T&gt; parent, leftChild, rightChild;
- при необходимости, можешь создавать и другие поля;
4) Реализуй публичный конструктор с одним параметром типа String:
- установи поле elementName равным полученному параметру;
- установи поле availableToAddLeftChildren равным true;
- установи поле availableToAddRightChildren равным true;
5) Реализуй публичный метод boolean isAvailableToAddChildren, возвращающий дизъюнкцию полей availableToAddLeftChildren и availableToAddRightChildren.



# Построй дерево (2)

Несмотря на то что наше дерево является потомком класса AbstractList, это не список в привычном понимании.
В частности нам недоступны принимающие в качестве параметра индекс элемента.
Такие методы необходимо переопределить и бросить новое исключение типа UnsupportedOperationException.

Вот их список:
public String get(int index)
public String set(int index, String element)
public void add(int index, String element)
public String remove(int index)
public List&lt;String&gt; subList(int fromIndex, int toIndex)
protected void removeRange(int fromIndex, int toIndex)
public boolean addAll(int index, Collection&lt;? extends String&gt; c)



# Построй дерево (1)

Амиго, похоже ты уже достаточно окреп. Самое время проверить свои навыки в большой задаче!
Сегодня реализуем свое дерево немного нестандартным способом(на базе AbstractList).
Вводную информацию можешь получить используя свой любимый поисковик и текст ниже.

Элементы дерева должны следовать так как показано на картинке:
http://info.javarush.ru/uploads/images/00/04/89/2014/03/21/ee9a9b.jpg

Для начала сделаем наше дерево потомком класса AbstractList с параметром типа String, а также
реализуем интерфейсы Cloneable и Serializable.

Реализацию методов get(int index) и size() пока оставь стандартной.