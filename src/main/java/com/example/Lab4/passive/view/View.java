package com.example.Lab4.passive.view;

import com.example.Lab4.passive.controller.*;
import com.example.Lab4.passive.controller.impl.*;
import com.example.Lab4.passive.model.entities.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    private static final String KEY_EXIT = "Q";

    private static final String ERROR_NO_SUCH_OPTION = "No such option found. Try again.";

    private static final String TEXT_SELECT_MENU_OPTION = "Please choose menu option: ";
    private static final String TEXT_GO_BACK = "Go back or quit";

    private static Scanner input = new Scanner(System.in, "UTF-8");

    public View() {
    }

    public void show() {
        showTablesMenu();
    }

    private void showTablesMenu() {
        Map<String, String> tablesMenu = generateTablesMenu();
        Map<String, Printable> tablesMenuMethods = generateTablesMenuMethods();
        showMenuFromMaps(tablesMenu, tablesMenuMethods);
    }

    private Map<String, String> generateTablesMenu() {
        Map<String, String> tablesMenu = new LinkedHashMap<String, String>();
        tablesMenu.put("1", "Table: Sportsman");
        tablesMenu.put("2", "Table: Coach");
        tablesMenu.put("3", "Table: Nutritionist");
        tablesMenu.put("4", "Table: Supplements");
        tablesMenu.put("5", "Table: First meal");
        tablesMenu.put("6", "Table: Second meal");
        tablesMenu.put("7", "Table: ThirdMeal");
        tablesMenu.put("8", "Table: Diet type");
        return tablesMenu;
    }

    private Map<String, Printable> generateTablesMenuMethods() {
        Map<String, Printable> tableMenuMethods = new LinkedHashMap<String, Printable>();
        tableMenuMethods.put("1", this::showSportsmanMenu);
        tableMenuMethods.put("2", this::showCoachMenu);
        tableMenuMethods.put("3", this::showNutritionistMenu);
        tableMenuMethods.put("4", this::showSupplementsMenu);
        tableMenuMethods.put("5", this::showFirstMealMenu);
        tableMenuMethods.put("6", this::showSecondMealMenu);
        tableMenuMethods.put("7", this::showThirdMealMenu);
        tableMenuMethods.put("8", this::showDietTypeMenu);

        return tableMenuMethods;
    }

    private void showSportsmanMenu() {
        Map<String, String> menu = generateSportsmanMenu();
        Map<String, Printable> menuMethods = generateSportsmanMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }


    private void showCoachMenu() {
        Map<String, String> menu = generateCoachMenu();
        Map<String, Printable> menuMethods = generateCoachMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showNutritionistMenu() {
        Map<String, String> menu = generateNutritionistMenu();
        Map<String, Printable> menuMethods = generateNutritionistMenuMethods();
        showMenuFromMaps(menu, menuMethods);

    }

    private void showSupplementsMenu() {
        Map<String, String> menu = generateSupplementsMenu();
        Map<String, Printable> menuMethods = generateSupplementsMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showFirstMealMenu() {
        Map<String, String> menu = generateFirstMealMenu();
        Map<String, Printable> menuMethods = generateFirstMealMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showSecondMealMenu() {
        Map<String, String> menu = generateSecondMealMenu();
        Map<String, Printable> menuMethods = generateSecondMealMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showThirdMealMenu() {
        Map<String, String> menu = generateThirdMealMenu();
        Map<String, Printable> menuMethods = generateThirdMealMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showDietTypeMenu() {
        Map<String, String> menu = generateDietTypeMenu();
        Map<String, Printable> menuMethods = generateDietTypeMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }


    private Map<String, String> generateSportsmanMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all cities");
        menu.put("2", "Select sportsman");
        menu.put("3", "Create sportsman");
        menu.put("4", "Update sportsman");
        menu.put("5", "Delete sportsman");
        return menu;
    }


    private Map<String, String> generateCoachMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all countries");
        menu.put("2", "Select coach");
        menu.put("3", "Create coach");
        menu.put("4", "Update coach");
        menu.put("5", "Delete coach");
        return menu;
    }


    private Map<String, String> generateNutritionistMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all nutritionist");
        menu.put("2", "Select nutritionist");
        menu.put("3", "Create nutritionist");
        menu.put("4", "Update nutritionist");
        menu.put("5", "Delete nutritionist");
        return menu;
    }

    private Map<String, String> generateSupplementsMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all supplements");
        menu.put("2", "Select supplements");
        menu.put("3", "Create supplements");
        menu.put("4", "Update supplements");
        menu.put("5", "Delete supplements");
        return menu;
    }

    private Map<String, String> generateFirstMealMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all first meal");
        menu.put("2", "Select first meal");
        menu.put("3", "Create first meal");
        menu.put("4", "Update first meal");
        menu.put("5", "Delete first meal");
        return menu;
    }

    private Map<String, String> generateSecondMealMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all second meal");
        menu.put("2", "Select second meal");
        menu.put("3", "Create second meal");
        menu.put("4", "Update second meal");
        menu.put("5", "Delete second meal");
        return menu;
    }

    private Map<String, String> generateThirdMealMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all third meal");
        menu.put("2", "Select third meal");
        menu.put("3", "Create third meal");
        menu.put("4", "Update third meal");
        menu.put("5", "Delete third meal");
        return menu;
    }

    private Map<String, String> generateDietTypeMenu() {
        Map<String, String> menu = new LinkedHashMap<String, String>();
        menu.put("1", "Select all diet types");
        menu.put("2", "Select diet type");
        menu.put("3", "Create diet type");
        menu.put("4", "Update diet type");
        menu.put("5", "Delete diet type");
        return menu;
    }

    private Map<String, Printable> generateSportsmanMenuMethods() {
        Controller<SportsmanEntity, Integer> SportsmanController = new SportsmanControllerImpl();
        Formatter<SportsmanEntity, Integer> formatter = new Formatter<>(SportsmanEntity.class);
        ViewOperations<SportsmanEntity, Integer> SportsmanOperation = new ViewOperations<>(SportsmanController, formatter,
                SportsmanEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", SportsmanOperation::findAll);
        menuMethods.put("2", SportsmanOperation::findById);
        menuMethods.put("3", SportsmanOperation::create);
        menuMethods.put("4", SportsmanOperation::update);
        menuMethods.put("5", SportsmanOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateCoachMenuMethods() {
        Controller<CoachEntity, Integer> coachController = new CoachControllerImpl();
        Formatter<CoachEntity, Integer> formatter = new Formatter<>(CoachEntity.class);
        ViewOperations<CoachEntity, Integer> coachOperation = new ViewOperations<>(coachController, formatter,
                CoachEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", coachOperation::findAll);
        menuMethods.put("2", coachOperation::findById);
        menuMethods.put("3", coachOperation::create);
        menuMethods.put("4", coachOperation::update);
        menuMethods.put("5", coachOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateNutritionistMenuMethods() {
        Controller<NutritionistEntity, Integer> NutritionistController = new NutritionistControllerImpl();
        Formatter<NutritionistEntity, Integer> formatter = new Formatter<>(NutritionistEntity.class);
        ViewOperations<NutritionistEntity, Integer> NutritionistOperation = new ViewOperations<>(NutritionistController, formatter,
                NutritionistEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", NutritionistOperation::findAll);
        menuMethods.put("2", NutritionistOperation::findById);
        menuMethods.put("3", NutritionistOperation::create);
        menuMethods.put("4", NutritionistOperation::update);
        menuMethods.put("5", NutritionistOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateSupplementsMenuMethods() {
        Controller<SupplementsEntity, Integer> SupplementsController = new SupplementsControllerImpl();
        Formatter<SupplementsEntity, Integer> formatter = new Formatter<>(SupplementsEntity.class);
        ViewOperations<SupplementsEntity, Integer> SupplementsOperation = new ViewOperations<>(SupplementsController,
                formatter, SupplementsEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", SupplementsOperation::findAll);
        menuMethods.put("2", SupplementsOperation::findById);
        menuMethods.put("3", SupplementsOperation::create);
        menuMethods.put("4", SupplementsOperation::update);
        menuMethods.put("5", SupplementsOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateFirstMealMenuMethods() {
        Controller<FirstMealEntity, Integer> FirstMealController = new FirstMealTypeControllerImpl();
        Formatter<FirstMealEntity, Integer> formatter = new Formatter<>(FirstMealEntity.class);
        ViewOperations<FirstMealEntity, Integer> FirstMealOperation = new ViewOperations<>(FirstMealController,
                formatter, FirstMealEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", FirstMealOperation::findAll);
        menuMethods.put("2", FirstMealOperation::findById);
        menuMethods.put("3", FirstMealOperation::create);
        menuMethods.put("4", FirstMealOperation::update);
        menuMethods.put("5", FirstMealOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateSecondMealMenuMethods() {
        Controller<SecondMealEntity, Integer> SecondMealController = new SecondMealControllerImpl();
        Formatter<SecondMealEntity, Integer> formatter = new Formatter<>(SecondMealEntity.class);
        ViewOperations<SecondMealEntity, Integer> SecondMealOperation = new ViewOperations<>(SecondMealController, formatter,
                SecondMealEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", SecondMealOperation::findAll);
        menuMethods.put("2", SecondMealOperation::findById);
        menuMethods.put("3", SecondMealOperation::create);
        menuMethods.put("4", SecondMealOperation::update);
        menuMethods.put("5", SecondMealOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateThirdMealMenuMethods() {
        Controller<ThirdMealEntity, Integer> ThirdMealController = new ThirdMealControllerImpl();
        Formatter<ThirdMealEntity, Integer> formatter = new Formatter<>(ThirdMealEntity.class);
        ViewOperations<ThirdMealEntity, Integer> ThirdMealOperation = new ViewOperations<>(ThirdMealController, formatter, ThirdMealEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", ThirdMealOperation::findAll);
        menuMethods.put("2", ThirdMealOperation::findById);
        menuMethods.put("3", ThirdMealOperation::create);
        menuMethods.put("4", ThirdMealOperation::update);
        menuMethods.put("5", ThirdMealOperation::delete);
        return menuMethods;
    }


    private Map<String, Printable> generateDietTypeMenuMethods() {
        Controller<DietTypeEntity, Integer> DietTypeController = new DietTypeControllerImpl();
        Formatter<DietTypeEntity, Integer> formatter = new Formatter<>(DietTypeEntity.class);
        ViewOperations<DietTypeEntity, Integer> DietTypeOperation = new ViewOperations<>(DietTypeController, formatter,
                DietTypeEntity.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<String, Printable>();
        menuMethods.put("1", DietTypeOperation::findAll);
        menuMethods.put("2", DietTypeOperation::findById);
        menuMethods.put("3", DietTypeOperation::create);
        menuMethods.put("4", DietTypeOperation::update);
        menuMethods.put("5", DietTypeOperation::delete);
        return menuMethods;
    }


    private void showMenuFromMaps(Map<String, String> keyName, Map<String, Printable> keyMethod) {
        String keyMenu;
        do {
            printMenu(keyName);
            System.out.println(TEXT_SELECT_MENU_OPTION);
            keyMenu = input.nextLine().toUpperCase();
            Printable method = keyMethod.get(keyMenu);
            if (method != null) {
                method.print();
            } else if (!keyMenu.equals(KEY_EXIT)) {
                System.out.println(ERROR_NO_SUCH_OPTION);
            }
        } while (!keyMenu.equals(KEY_EXIT));
    }

    private void printMenu(Map<String, String> keyName) {
        for (String key : keyName.keySet()) {
            System.out.format("%3s - %s%n", key, keyName.get(key));
        }
        System.out.format("%3s - %s%n", KEY_EXIT, TEXT_GO_BACK);
    }
}
