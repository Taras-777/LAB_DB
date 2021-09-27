insert into khomyn_db.first_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("oat flakes",150,351,17,9,62);
insert into khomyn_db.first_meal (name, weight,calories, proteins,fat,carbohydrates) value ("banana",75,94,1,0.2,22);
insert into khomyn_db.first_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("milk",200,53,6,4,10);
insert into khomyn_db.first_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("egg",160,152,32,20,3);
insert into khomyn_db.first_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("nut",25,691,7,34,11);

insert into khomyn_db.second_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("apple",100,57,0.37,0.4,13);
insert into khomyn_db.second_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("chicken fillet",200,151,58,6,0);
insert into khomyn_db.second_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("carrot",200,35,2,0.44,14);
insert into khomyn_db.second_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("buckwheat",150,92,5,0.85,27);
insert into khomyn_db.second_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("avocado",100,248,2,23,6);

insert into khomyn_db.third_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("lentils",100,73,5,0.2,14);
insert into khomyn_db.third_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("cabbage",200,73,4,0.2,10);
insert into khomyn_db.third_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("fish",200,68,30,0.14,0);
insert into khomyn_db.third_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("asparagus",200,50,4,2,14);
insert into khomyn_db.third_meal ( name, weight,calories, proteins,fat,carbohydrates) value ("orange",350,50,1.5,0.44,22);

insert into khomyn_db.supplements(protein, collagen, amino_acids, creatine, bcaa) value (110,14,4,4,6);
insert into khomyn_db.supplements(protein, collagen, amino_acids, creatine, bcaa) value (50,0,8,1,6);
insert into khomyn_db.supplements(protein, collagen, amino_acids, creatine, bcaa) value (41,1,47,9,1);
insert into khomyn_db.supplements(protein, collagen, amino_acids, creatine, bcaa) value (200,16,54,7,1);
insert into khomyn_db.supplements(protein, collagen, amino_acids, creatine, bcaa) value (155,1,4,4,11);

insert into khomyn_db.first_meal_supl (first_meal_id, supplements_id) value (1,2);
insert into khomyn_db.first_meal_supl (first_meal_id, supplements_id) value (2,3);
insert into khomyn_db.first_meal_supl (first_meal_id, supplements_id) value (3,4);
insert into khomyn_db.first_meal_supl (first_meal_id, supplements_id) value (4,5);
insert into khomyn_db.first_meal_supl (first_meal_id, supplements_id) value (5,1);

insert into khomyn_db.second_meal_supl (second_meal_id, supplements_id) value (1,4);
insert into khomyn_db.second_meal_supl (second_meal_id, supplements_id) value (2,5);
insert into khomyn_db.second_meal_supl (second_meal_id, supplements_id) value (3,1);
insert into khomyn_db.second_meal_supl (second_meal_id, supplements_id) value (4,2);
insert into khomyn_db.second_meal_supl (second_meal_id, supplements_id) value (5,3);

insert into khomyn_db.third_meal_supl (third_meal_id, supplements_id) value (1,1);
insert into khomyn_db.third_meal_supl (third_meal_id, supplements_id) value (2,5);
insert into khomyn_db.third_meal_supl (third_meal_id, supplements_id) value (3,3);
insert into khomyn_db.third_meal_supl (third_meal_id, supplements_id) value (4,2);
insert into khomyn_db.third_meal_supl (third_meal_id, supplements_id) value (5,4);

insert into khomyn_db.diet (first_meal_supl_id, second_meal_supl_id, third_meal_supl_id) value(1,2,3);
insert into khomyn_db.diet (first_meal_supl_id, second_meal_supl_id, third_meal_supl_id) value(1,2,2);
insert into khomyn_db.diet (first_meal_supl_id, second_meal_supl_id, third_meal_supl_id) value(3,2,1);
insert into khomyn_db.diet (first_meal_supl_id, second_meal_supl_id, third_meal_supl_id) value(2,3,1);
insert into khomyn_db.diet (first_meal_supl_id, second_meal_supl_id, third_meal_supl_id) value(2,1,3);

insert into khomyn_db.nutritionist (full_name, reviews, license, diet_id) value("Dwight Monahan", 10, 1,1);
insert into khomyn_db.nutritionist (full_name, reviews, license, diet_id) value("Dr. Ramiro Hartmann", 9,0,3);
insert into khomyn_db.nutritionist (full_name, reviews, license, diet_id) value("Kali Labadie", 9.5,1,5);
insert into khomyn_db.nutritionist (full_name, reviews, license, diet_id) value("Bryon Jenkins", 7,1,4);
insert into khomyn_db.nutritionist (full_name, reviews, license, diet_id) value("Russell Koch",8.8,0,2);

insert into khomyn_db.sportsman (full_name, weight, height, type_of_sport, nutritionist_id) value ("Emilie Bashirian", 80, 177,"karate",1);
insert into khomyn_db.sportsman (full_name, weight, height, type_of_sport, nutritionist_id) value ("Natalie Powlowski", 75,160, "box",5);
insert into khomyn_db.sportsman (full_name, weight, height, type_of_sport, nutritionist_id) value ("Irving Parker",60, 145, "swimming",3);
insert into khomyn_db.sportsman (full_name, weight, height, type_of_sport, nutritionist_id) value ("Jonathan Rau",100, 197,"football", 4);
insert into khomyn_db.sportsman (full_name, weight, height, type_of_sport, nutritionist_id) value ("Javier Goodwin",77, 160, "muai thai", 2);

insert into khomyn_db.coach (sportsman_id,full_name, license,reviews ) value (1, "Trent Wiegand", 1,7);
insert into khomyn_db.coach (sportsman_id,full_name, license,reviews ) value (2,"Kacey Schoen",0,10);
insert into khomyn_db.coach (sportsman_id,full_name, license,reviews ) value (3, "Kolby Brakus",1,8.8);
insert into khomyn_db.coach (sportsman_id,full_name, license,reviews ) value (4, "Llewellyn Borer",1,8);
insert into khomyn_db.coach (sportsman_id,full_name, license,reviews ) value (5,"Wallace Schumm",0,5.5);

insert into khomyn_db.history_of_competitions(sportsman_id,date,venue,award,number_of_participants) value (1, "2020:10:02", "Lviv", 2, 55);
insert into khomyn_db.history_of_competitions(sportsman_id,date,venue,award,number_of_participants) value (1, "2015:03:12", "Kuiv", 5, 15);
insert into khomyn_db.history_of_competitions(sportsman_id,date,venue,award,number_of_participants) value (1, "2018:04:22", "Kharkiv", 1, 25);
insert into khomyn_db.history_of_competitions(sportsman_id,date,venue,award,number_of_participants) value (1, "2017:11:25", "Odessa", 3, 18);
insert into khomyn_db.history_of_competitions(sportsman_id,date,venue,award,number_of_participants) value (1, "2020:12:01", "Kyiv", 5, 10);

insert into khomyn_db.scheduled_competitions(sportsman_id,date,venue,number_of_participants) value (1, "2023:10:02", "Odessa",10);
insert into khomyn_db.scheduled_competitions(sportsman_id,date,venue,number_of_participants) value (2, "2021:03:12", "Kyiv",15);
insert into khomyn_db.scheduled_competitions(sportsman_id,date,venue,number_of_participants) value (3, "2022:04:22", "Lviv",10);
insert into khomyn_db.scheduled_competitions(sportsman_id,date,venue,number_of_participants) value (4, "2024:11:25", "Kherson", 50);
insert into khomyn_db.scheduled_competitions(sportsman_id,date,venue,number_of_participants) value (5,"2022:12:01", "Lviv",16);