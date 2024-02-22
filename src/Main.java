/**
 * @Class: Main
 * @Author: Savion Plater
 * @Course: ITEC2150 - 05, Spring 2024
 * @Written: February 13, 2024
 * Description: The program will be tasked on making baking different types of bread and pastries.
 */
class Bread {
    private String flour;
    private String water;
    private String salt;
    private String sugar;
    private String bakingPowder;
    private String yeast;
    private String breadName;
    private String state;
    private String recipe;

    public Bread() {
        this.breadName = "Regular Bread";
        this.flour = "Flour";
        this.water = "Water";
        this.salt = "Salt";
        this.sugar = "Sugar";
        this.bakingPowder = "Baking Powder";
        this.yeast = "Yeast";
        this.state = "Not Baked";
        this.recipe = "Combine flour, salt, water, sugar, baking powder, yeast, knead dough, let it rise, bake.";
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getIngredients() {
        return flour + ", " + water + ", " + salt + ", " + sugar + ", " + bakingPowder + ", " + yeast;
    }

    public void bake() {
        if (!state.equals("Baked")) {
            state = "Baked";
        }
    }

    @Override
    public String toString() {
        return "Bread Name: " + breadName + "  State:" + state + "  Basic Ingredients: " + getIngredients()  + "  Recipe: " + recipe ;
    }
}

class SourdoughBread extends Bread {
    private String sourdoughStarter;

    public SourdoughBread() {
        super();
        this.sourdoughStarter = "Sourdough Starter";
        setBreadName("Sourdough Bread");
        setRecipe("Combine flour, water, salt, sugar, " + sourdoughStarter +", knead dough, let it rise, bake.");
    }

}

class Pastry extends Bread {
    private String butter;
    private String eggs;

    public Pastry() {
        super();
        this.butter = "Butter";
        this.eggs = "Eggs";
        setBreadName("Pastry");
        setRecipe("Combine flour, " + butter +" , water, salt, sugar, " + eggs+" ,knead dough, shape, bake.");
    }

}

class RyeBread extends Bread {
    private String carawaySeeds;

    public RyeBread() {
        super();
        this.carawaySeeds = "Caraway Seeds";
        setBreadName("Rye Bread");
        setRecipe("Combine rye flour, water, salt, sugar, "+ carawaySeeds +", yeast, knead dough, let it rise, bake.");
    }


}

class Baguette extends Bread {
    private String oliveOil = "Olive Oil";

    public Baguette() {
        super();
        setBreadName("Baguette");
        setRecipe("Combine flour, water, salt, yeast, "+ oliveOil +", knead dough, let it rise, shape into baguette, bake.");
    }

}

class Ciabatta extends Bread {

    public Ciabatta() {
        super();
        String herbs = "Herbs";
        setBreadName("Ciabatta");
        setRecipe("Combine flour, water, salt, yeast, " + herbs +" , knead dough, let it rise, shape into ciabatta, bake.");
    }

}

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.bake();

        SourdoughBread sourdough = new SourdoughBread();
        sourdough.bake();

        Pastry pastry = new Pastry();
        pastry.bake();

        RyeBread rye = new RyeBread();
        rye.bake();

        Baguette baguette = new Baguette();
        baguette.bake();

        Ciabatta ciabatta = new Ciabatta();
        ciabatta.bake();

        System.out.println(bread);
        System.out.println(sourdough);
        System.out.println(pastry);
        System.out.println(rye);
        System.out.println(baguette);
        System.out.println(ciabatta);
    }
}

