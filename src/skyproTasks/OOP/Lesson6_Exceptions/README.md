
## Задание 1

Вернемся к нашему приложению автогонок.

Добавьте в класс Transport метод «Пройти диагностику».

Переопределите данный метод для классов «Легковые автомобили»
и «Грузовые автомобили» — объекты данных типов могут проходить диагностику. 
Объекты класса «Автобусы» диагностику проходить не могут.
Необходимо создать собственное исключение, которое будет 
выбрасываться в случае если у водителя не указан тип водительских прав
или категория прав неверна. Вместе с исключением должно появляться сообщение “Необходимо указать тип прав!”.
Реализуйте обработку исключения с помощью одной из конструкций - try catch или try with resources.

Критерии оценки:
- В класс Transport добавлен метод «Пройти диагностику».
- Метод «Пройти диагностику» переопределен для класса «Легковые автомобили».
- Метод «Пройти диагностику» переопределен для класса «Грузовые автомобили».
- В случае если поле «Тип прав» не заполнено у класса «Водитель», выбрасывается исключение.