package view;

import controller.impl.*;
import model.entities.*;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    private final SportsmanController sportsmanController;
    private final NutritionistController nutritionistController;
    private final DietController dietController;
    private final CoachController coachController;
    private final SupplementsController supplementsController;
    private final FirstMealController firstMealController;
    private final SecondMealController secondMealController;
    private final ThirdMealController thirdMealController;

    private final Map<String, Printable> menu = new LinkedHashMap<>();

    public View(){
        sportsmanController = new SportsmanController();
        nutritionistController = new NutritionistController();
        dietController = new DietController();
        coachController = new CoachController();
        supplementsController = new SupplementsController();
        firstMealController = new FirstMealController();
        secondMealController = new SecondMealController();
        thirdMealController = new ThirdMealController();

        menu.put("11", this::getAllCities);
        menu.put("12", this::getSportsmanById);
        menu.put("13", this::createSportsman);
        menu.put("14", this::updateSportsman);
        menu.put("15", this::deleteSportsman);

        menu.put("21", this::getAllCountries);
        menu.put("22", this::getNutritionistById);
        menu.put("23", this::createNutritionist);
        menu.put("24", this::updateNutritionist);
        menu.put("25", this::deleteNutritionist);

        menu.put("31", this::getAllDiets);
        menu.put("32", this::getDietById);
        menu.put("33", this::createDiet);
        menu.put("34", this::updateDiet);
        menu.put("35", this ::deleteDiet);

        menu.put("41", this::getAllCoachs);
        menu.put("42", this::getCoachById);
        menu.put("43", this::createCoach);
        menu.put("44", this::updateCoach);
        menu.put("45", this::deleteCoach);

        menu.put("51", this::getAllSupplements);
        menu.put("52", this::getSupplementsById);
        menu.put("53", this::createSupplements);
        menu.put("54", this::updateSupplements);
        menu.put("55", this::deleteSupplements);

        menu.put("61", this::getAllFirstMeals);
        menu.put("62", this::getFirstMealById);
        menu.put("63", this::createFirstMeal);
        menu.put("64", this::updateFirstMeal);
        menu.put("65", this::deleteFirstMeal);

        menu.put("71", this::getAllSecondMeals);
        menu.put("72",this::getSecondMealById);
        menu.put("73", this::createSecondMeal);
        menu.put("74", this::updateSecondMeal);
        menu.put("75", this::deleteSecondMeal);

        menu.put("81", this::getAllThirdMeal);
        menu.put("82", this::getThirdMealById);
        menu.put("83", this::createThirdMeal);
        menu.put("84", this::updateThirdMeal);
        menu.put("85", this::deleteThirdMeal);


    }
    public void displayMenu() {
        System.out.println("=======================================================================");
        System.out.println("                 Enter XY to choose the option, where:");
        System.out.println("=======================================================================");
        System.out.println("X - entity number:                 |       Y - CRUD number:");
        System.out.println("  1 - Sportsman                    |         1 - GET ALL");
        System.out.println("  2 - Nutritionist                 |         2 - GET ONE");
        System.out.println("  3 - Diet                         |         3 - CREATE");
        System.out.println("  4 - Coach                        |         4 - UPDATE");
        System.out.println("  5 - Supplements                  |         5 - DELETE");
        System.out.println("  6 - First Meal                   |                     ");
        System.out.println("  7 - SecondMeal                   |                     ");
        System.out.println("  8 - ThirdMeal                    |                     ");

        System.out.println("=======================================================================");
    }
    // --- CITIES ---
    private void getAllCities(){
        System.out.println("\n[Sportsman / GET]");
        System.out.println(sportsmanController.findAll() + "\n");
    }
    private void getSportsmanById(){
        System.out.println("\n [Sportsman / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(sportsmanController.findOne(id) + "\n");
    }
    private Sportsman getSportsmanInputs(){
        System.out.println("Enter full name  : ");
        String full_name = scanner.next();
        System.out.println("Enter weight  : ");
        Integer weight = scanner.nextInt();
        System.out.println("Enter height  : ");
        Integer height = scanner.nextInt();
        System.out.println("Enter type of sport : ");
        String type_of_sports = scanner.next();
        System.out.println("Enter nutritionist id : ");
        Integer nutritionist_id = scanner.nextInt();

        return new Sportsman(0, full_name,weight, height, type_of_sports, nutritionist_id);
    }
    private void createSportsman(){
        System.out.println("\n[Sportsman / CREATE]");
        Sportsman sportsman = getSportsmanInputs();
        sportsmanController.create(sportsman);
        System.out.println("Sportsman successfully created\n");
    }
    private void updateSportsman(){
        System.out.println("\n[Sportsman / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Sportsman sportsman = getSportsmanInputs();
        sportsman.setId(id);
        sportsmanController.update(sportsman.getId(), sportsman);

        System.out.println("Sportsman with ID=" + id + " successfully updated");
    }
    private void deleteSportsman(){
        System.out.println("[Sportsman / DELETE] Enter ID: ");
        int id = scanner.nextInt();

        sportsmanController.delete(id);
        System.out.println("Sportsman with ID=" + id + " successfully deleted");
    }
    // --- COUNTRIES ---
    private void getAllCountries(){
        System.out.println("\n[Nutritionist / GET]");
        System.out.println(nutritionistController.findAll() + "\n");
    }
    private void getNutritionistById(){
        System.out.println("\n [Nutritionist / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(nutritionistController.findOne(id) + "\n");
    }
    private Nutritionist getNutritionistInputs(){
        System.out.println("\n Enter nutritionist name: ");
        String nutritionistName = scanner.next();
        System.out.println("\n Enter reviews: ");
        String reviews = scanner.next();
        System.out.println("\n Enter diet id: ");
        Integer diet_id = scanner.nextInt();
        return new Nutritionist(0, nutritionistName,reviews,diet_id);
    }
    private void createNutritionist(){
        System.out.println("\n[Nutritionist / CREATE]");
        Nutritionist nutritionist = getNutritionistInputs();
        nutritionistController.create(nutritionist);
        System.out.println("Nutritionist successfully created\n");
    }
    private void updateNutritionist(){
        System.out.println("\n[Nutritionist / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Nutritionist nutritionist = getNutritionistInputs();
        nutritionist.setId(id);
        nutritionistController.update(nutritionist.getId(), nutritionist);

        System.out.println("Nutritionist with ID=" + id + " successfully updated");
    }
    private void deleteNutritionist(){
        System.out.println("[Nutritionist / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        nutritionistController.delete(id);
        System.out.println("Nutritionist with ID=" + id + " successfully deleted");
    }
    //  --- Diet ---
    private void getAllDiets(){
        System.out.println("\n[Diet / GET]");
        System.out.println(dietController.findAll() + "\n");
    }
    private void getDietById(){
        System.out.println("\n [Diet / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(dietController.findOne(id) + "\n");
    }
    private Diet getDietInputs(){
        System.out.println("\n Enter first meal supplements id: ");
        Integer first_meal_supl_id = scanner.nextInt();
        System.out.println("\n Enter second meal supplements id: ");
        Integer second_meal_supl_id = scanner.nextInt();
        System.out.println("\n Enter third meal supplements id: ");
        Integer third_meal_supl_id = scanner.nextInt();

        return new Diet(0, first_meal_supl_id, second_meal_supl_id, third_meal_supl_id);
    }
    private void createDiet(){
        System.out.println("\n[Diet / CREATE]");
        Diet diet = getDietInputs();
        dietController.create(diet);
        System.out.println("Diet successfully created\n");
    }
    private void updateDiet(){
        System.out.println("\n[Diet / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Diet diet = getDietInputs();
        diet.setId(id);
        dietController.update(diet.getId(), diet);

        System.out.println("Diet with ID=" + id + " successfully updated");
    }
    private void deleteDiet(){
        System.out.println("[Diet / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        dietController.delete(id);
        System.out.println("Diet with ID=" + id + " successfully deleted");
    }
    // --- Coach ---
    private void getAllCoachs(){
        System.out.println("\n[Coach / GET]");
        System.out.println(coachController.findAll() + "\n");
    }
    private void getCoachById(){
        System.out.println("\n [Coach / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(coachController.findOne(id) + "\n");
    }

    private Coach getCoachInputs(){
        System.out.println("\n Enter coach name: ");
        String coachName = scanner.next();
        System.out.println("\n Enter coach rate : (from 1 to 10) ");
        Integer coachRate = scanner.nextInt();
        System.out.println("\n Enter sportsman id :");
        Integer sportsman_id = scanner.nextInt();

        return new Coach(0, coachName, coachRate,sportsman_id);
    }
    private void createCoach(){
        System.out.println("\n[Coach / CREATE]");
        Coach coach = getCoachInputs();
        coachController.create(coach);
        System.out.println("Coach successfully created\n");
    }
    private void updateCoach(){
        System.out.println("\n[Coach / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Coach coach = getCoachInputs();
        coach.setId(id);
        coachController.update(coach.getId(), coach);

        System.out.println("Coach with ID=" + id + " successfully updated");
    }
    private void deleteCoach(){
        System.out.println("[Coach / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        coachController.delete(id);
        System.out.println("Coach with ID=" + id + " successfully deleted");
    }
    // --- Supplements ---
    private void getAllSupplements(){
        System.out.println("\n[Supplements / GET]");
        System.out.println(supplementsController.findAll() + "\n");
    }
    private void getSupplementsById(){
        System.out.println("\n [Supplements / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(supplementsController.findOne(id) + "\n");
    }
    private Supplements getSupplementsInputs(){
        System.out.println("\n Enter protein : ");
        Integer protein = scanner.nextInt();
        System.out.println("\n Enter collagen : ");
        Integer collagen = scanner.nextInt();
        System.out.println("\n Enter amino acids : ");
        Integer amino_acids = scanner.nextInt();
        System.out.println("\n Enter creatine : ");
        Integer creatine = scanner.nextInt();
        System.out.println("\n Enter bcaa : ");
        Integer bcaa = scanner.nextInt();


        return new Supplements(0, protein,collagen,amino_acids,creatine,bcaa);
    }
    private void createSupplements(){
        System.out.println("\n[Supplements / CREATE]");
        Supplements supplements = getSupplementsInputs();
        supplementsController.create(supplements);
        System.out.println("Supplements successfully created\n");
    }
    private void updateSupplements(){
        System.out.println("\n[Supplements / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Supplements paymentType = getSupplementsInputs();
        paymentType.setId(id);
        supplementsController.update(paymentType.getId(), paymentType);

        System.out.println("Supplements with ID=" + id + " successfully updated");
    }
    private void deleteSupplements(){
        System.out.println("[Supplements / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        supplementsController.delete(id);
        System.out.println("Supplements with ID=" + id + " successfully deleted");
    }

    // --- First Meal ---
    private void getAllFirstMeals(){
        System.out.println("\n[FirstMeal / GET]");
        System.out.println(firstMealController.findAll() + "\n");
    }
    private void getFirstMealById(){
        System.out.println("\n [FirstMeal / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(firstMealController.findOne(id) + "\n");
    }
    private FirstMeal getFirstMealInputs(){
        System.out.println("\n Enter  name : ");
        String sportsmanName = scanner.next();
        System.out.println("\n Enter weight : ");
        Integer weight = scanner.nextInt();
        System.out.println("\n Enter calories : ");
        Integer calories = scanner.nextInt();
        System.out.println("\n Enter proteins : ");
        Integer proteins = scanner.nextInt();
        System.out.println("\n Enter fat : ");
        Integer fat = scanner.nextInt();
        System.out.println("\n Enter carbohydrates : ");
        Integer carbohydrates = scanner.nextInt();

        return new FirstMeal(0, sportsmanName,weight,calories,proteins,fat,carbohydrates);
    }
    private void createFirstMeal(){
        System.out.println("\n[FirstMeal / CREATE]");
        FirstMeal firstMeal = getFirstMealInputs();
        firstMealController.create(firstMeal);
        System.out.println("FirstMeal successfully created\n");
    }
    private void updateFirstMeal(){
        System.out.println("\n[ FirstMeal / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        FirstMeal firstMeal = getFirstMealInputs();
        firstMeal.setId(id);
        firstMealController.update(firstMeal.getId(), firstMeal);

        System.out.println("FirstMeal with ID=" + id + " successfully updated");
    }
    private void deleteFirstMeal(){
        System.out.println("[FirstMeal / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        firstMealController.delete(id);
        System.out.println("FirstMeal with ID=" + id + " successfully deleted");
    }

    // --- SecondMeal ---
    private void getAllSecondMeals(){
        System.out.println("\n[SecondMeal / GET]");
        System.out.println(secondMealController.findAll() + "\n");
    }
    private void getSecondMealById(){
        System.out.println("\n [SecondMeal / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(secondMealController.findOne(id) + "\n");
    }
    private SecondMeal getSecondMealInputs(){
        System.out.println("\n Enter name : ");
        String sportsmanName = scanner.next();
        System.out.println("\n Enter weight : ");
        Integer weight = scanner.nextInt();
        System.out.println("\n Enter calories : ");
        Integer calories = scanner.nextInt();
        System.out.println("\n Enter proteins : ");
        Integer proteins = scanner.nextInt();
        System.out.println("\n Enter fat : ");
        Integer fat = scanner.nextInt();
        System.out.println("\n Enter carbohydrates : ");
        Integer carbohydrates = scanner.nextInt();

        return new SecondMeal(0, sportsmanName,weight,calories,proteins,fat,carbohydrates);
    }

    private void createSecondMeal(){
        System.out.println("\n[SecondMeal / CREATE]");
        SecondMeal secondMeal = getSecondMealInputs();
        secondMealController.create(secondMeal);
        System.out.println("SecondMeal successfully created\n");
    }
    private void updateSecondMeal(){
        System.out.println("\n[SecondMeal / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        SecondMeal secondMeal = getSecondMealInputs();
        secondMeal.setId(id);
        secondMealController.update(secondMeal.getId(), secondMeal);

        System.out.println("SecondMeal with ID=" + id + " successfully updated");
    }
    private void deleteSecondMeal(){
        System.out.println("[SecondMeal / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        secondMealController.delete(id);
        System.out.println("SecondMeal with ID=" + id + " successfully deleted");
    }

    // --- ThirdMeal ---
    private void getAllThirdMeal(){
        System.out.println("\n[ThirdMeal / GET]");
        System.out.println(thirdMealController.findAll() + "\n");
    }
    private void getThirdMealById(){
        System.out.println("\n [ThirdMeal / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(thirdMealController.findOne(id) + "\n");
    }

    private ThirdMeal getThirdMealInputs(){
        System.out.println("\n Enter name : ");
        String sportsmanName = scanner.next();
        System.out.println("\n Enter weight : ");
        Integer weight = scanner.nextInt();
        System.out.println("\n Enter calories : ");
        Integer calories = scanner.nextInt();
        System.out.println("\n Enter proteins : ");
        Integer proteins = scanner.nextInt();
        System.out.println("\n Enter fat : ");
        Integer fat = scanner.nextInt();
        System.out.println("\n Enter carbohydrates : ");
        Integer carbohydrates = scanner.nextInt();

        return new ThirdMeal(0, sportsmanName,weight,calories,proteins,fat,carbohydrates);
    }
    private void createThirdMeal(){
        System.out.println("\n[ThirdMeal / CREATE]");
        ThirdMeal thirdMeal = getThirdMealInputs();
        thirdMealController.create(thirdMeal);
        System.out.println("ThirdMeal successfully created\n");
    }
    private void updateThirdMeal(){
        System.out.println("\n[ThirdMeal / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        ThirdMeal thirdMeal = getThirdMealInputs();
        thirdMeal.setId(id);
        thirdMealController.update(thirdMeal.getId(), thirdMeal);

        System.out.println("ThirdMeal with ID=" + id + " successfully updated");
    }
    private void deleteThirdMeal(){
        System.out.println("[ThirdMeal / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        thirdMealController.delete(id);
        System.out.println("ThirdMeal with ID=" + id + " successfully deleted");
    }

    public final void show() {
        String input;
        displayMenu();
        System.out.println("\nChoose your fighter:\n");
        do {
            try {
                input = scanner.next();
                menu.get(input).print();
            } catch (Exception ignored) {
            }
        } while (scanner.hasNext());
    }
}