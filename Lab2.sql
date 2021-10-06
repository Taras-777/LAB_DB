-- 1 Вивести моделі ПК із кількістю RAM більшою
-- за 64 Мб. Вивести: model, ram, price. Вихідні дані впорядкувати за
-- зростанням за стовпцем hd.
select model, ram, price from pc
where ram > ('64')
order by hd;

-- 2 БД «Фірма прий. вторсировини». З таблиці Outcome вивести всю
-- інформацію за березень місяць.
select * from outcome
where monthname(date) = 'March';

-- 3 БД «Комп. фірма». Виведіть усі можливі моделі ПК, їх виробників
-- та ціну (якщо вона вказана). Вивести: maker, model, price.
select distinct product.model, maker, price from product join pc on product.model = pc.model
where type = 'PC';

-- 4 БД «Комп. фірма». Знайти тих виробників ПК, усі моделі ПК яких є
-- в наявності в таблиці PC (використовувати вкладені підзапити та
-- оператори IN, ALL, ANY). Вивести maker.
select distinct maker from product
where model in (select model from pc);

-- 5 БД «Комп. фірма». Виведіть тих виробників ноутбуків, які також
-- випускають і принтери. Вивести maker.
select distinct maker
from product
where type = 'Laptop' and maker = any (select maker from product where type != 'Printer');

-- 6 БД «Аеропорт». Вивести дані для таблиці Trip з об’єднаними зна-
-- ченнями двох стовпців: town_from та town_to, з додатковими комента-
-- рями типу: 'from Rostov to Paris'.
select trip_no,ID_comp,plane,town_from as 'from',town_to as 'to',time_out,time_in from trip
where town_from = 'Rostov' and town_to = 'Paris';

-- 7 БД «Комп. фірма». Знайдіть ноутбуки, швидкість яких є меншою за
-- швидкість будь-якого з ПК. Вивести: type, model, speed.
select distinct product.type,laptop.model, laptop.speed from  laptop, pc, product
where laptop.speed < (select min(speed) from PC) and product.type = 'laptop';

-- 8 БД «Кораблі». Вкажіть назву та країну кораблів, що були потоплені
-- в битвах, але лише для тих кораблів, для яких ця інформація є відо-
-- мою. Вивести: ship, country. (Підказка: використовувати підзапити в
-- якості обчислювальних стовпців та перевірку на NULL)
SELECT ship, (SELECT country FROM Classes WhERE class = (SELECT class From ships WHERE name = ship))country FROM Outcomes 
WHERE result = 'sunk' AND (SELECT country FROM Classes WHERE class = (SELECT class FROM ships WHERE name=ship )) is not null;

-- 9. БД «Комп. фірма». Для таблиці Product отримати підсумковий набір
-- у вигляді таблиці зі стовпцями maker, laptop, у якій для кожного ви-
-- робника необхідно вказати, чи виробляє він ('yes'), чи ні ('no') відпо-
-- відний тип продукції. У першому випадку ('yes') додатково вказати
-- поруч у круглих дужках загальну кількість наявної (тобто, що знахо-
-- диться в таблиці Laptop) продукції, наприклад, 'yes(2)'. (Підказка:
-- використовувати підзапити в якості обчислювальних стовпців та
-- оператор CASE)
select maker, CASE when count(p.model) > 0 then concat('yes(', count(p.model), ')') else 'no' end as laptop from product
         left join printer p on product.model = p.model
group by maker;


-- 10 Перерахуйте назви головних кораблів, що є наявни-
-- ми в БД (врахувати також і кораблі з таблиці Outcomes). Вивести:
-- назва корабля, class. (Підказка: використовувати оператор UNION та
-- операцію EXISTS)
select `name`, class 
from (select `name`, class, ROW_NUMBER() OVER (PARTITION BY `name`) AS RowNumber
from(select `name`, class from Ships union select ship, null from Outcomes) T1) T2      
where T2.RowNumber = 1;